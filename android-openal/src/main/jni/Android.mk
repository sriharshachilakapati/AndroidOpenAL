LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := openal
SRCDIR := $(LOCAL_PATH)/src

LOCAL_C_INCLUDES := $(LOCAL_PATH)/include $(LOCAL_PATH)/include/AL

# Specify the source files using wild-cards over the directories.
LOCAL_SRC_FILES := $(wildcard $(SRCDIR)/*.c) \
                   $(wildcard $(SRCDIR)/OpenAL32/*.c) \
                   $(wildcard $(SRCDIR)/Alc/*.c) \
                   $(wildcard $(SRCDIR)/Alc/backends/*.c) \
                   $(wildcard $(SRCDIR)/Alc/effects/*.c) \
                   $(wildcard $(SRCDIR)/common/*.c)

# Do not include specific mixer backends unless needed by the ABI
LOCAL_SRC_FILES := $(filter-out $(SRCDIR)/Alc/mixer_inc.c, $(LOCAL_SRC_FILES))
LOCAL_SRC_FILES := $(filter-out $(SRCDIR)/Alc/mixer_neon.c, $(LOCAL_SRC_FILES))
LOCAL_SRC_FILES := $(filter-out $(SRCDIR)/Alc/mixer_sse.c, $(LOCAL_SRC_FILES))
LOCAL_SRC_FILES := $(filter-out $(SRCDIR)/Alc/mixer_sse2.c, $(LOCAL_SRC_FILES))
LOCAL_SRC_FILES := $(filter-out $(SRCDIR)/Alc/mixer_sse3.c, $(LOCAL_SRC_FILES))
LOCAL_SRC_FILES := $(filter-out $(SRCDIR)/Alc/mixer_sse41.c, $(LOCAL_SRC_FILES))

# Configuration specific for ARMEABI CPUs on Android. These are 32-bit.
ifeq ($(TARGET_ARCH_ABI), armeabi)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DARMEABI
endif

# Configuration specific for ARMEABI V7A CPUs. These are 32-bit.
ifeq ($(TARGET_ARCH_ABI), armeabi-v7a)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DARMEABI_V7A
endif

# Configuration specific for ARMEABI V8A CPUs. These are 64-bit.
# These include NEON extension.
ifeq ($(TARGET_ARCH_ABI), arm64-v8a)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DARM64_V8A
    LOCAL_SRC_FILES := $(LOCAL_SRC_FILES) \
                       $(SRCDIR)/Alc/mixer_neon.c

    LOCAL_ARM_NEON := true
endif

# Configuration specific for MIPS CPUs. These are 32-bit.
ifeq ($(TARGET_ARCH_ABI), mips)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DMIPS
endif

# Configuration specific for MIPS64 CPUs. These are 64-bit.
ifeq ($(TARGET_ARCH_ABI), mips64)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DMIPS64
endif

# Configuration specific for x86 CPUs, which are 32-bit.
# These CPUs have NEON support and also SSE instruction sets
# from SSE to SSE3.
ifeq ($(TARGET_ARCH_ABI), x86)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DX86
    LOCAL_SRC_FILES := $(LOCAL_SRC_FILES) \
                       $(SRCDIR)/Alc/mixer_neon.c \
                       $(SRCDIR)/Alc/mixer_sse.c \
                       $(SRCDIR)/Alc/mixer_sse2.c \
                       $(SRCDIR)/Alc/mixer_sse3.c

    LOCAL_ARM_NEON := true
endif

# Configuration specific for x86_64 CPUs, which are 64-bit.
# These CPUs have NEON support and also SSE instruction sets
# from SSE to SSE41.
ifeq ($(TARGET_ARCH_ABI), x86_64)
    LOCAL_CFLAGS := -DAL_ALEXT_PROTOTYPES -std=c11 -DX86_64
    LOCAL_SRC_FILES := $(LOCAL_SRC_FILES) \
                       $(SRCDIR)/Alc/mixer_neon.c \
                       $(SRCDIR)/Alc/mixer_sse.c \
                       $(SRCDIR)/Alc/mixer_sse2.c \
                       $(SRCDIR)/Alc/mixer_sse3.c \
                       $(SRCDIR)/Alc/mixer_sse41.c

    LOCAL_ARM_NEON := true
endif

# Link with support for log and OpenSLES libraries.
LOCAL_LDLIBS := -llog -Wl,-s -lOpenSLES

include $(BUILD_SHARED_LIBRARY)

MY_LOCAL_PATH := $(LOCAL_PATH)
