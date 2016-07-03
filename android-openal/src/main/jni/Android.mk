LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE     := openal
SRCDIR := $(LOCAL_PATH)/src

LOCAL_C_INCLUDES := $(LOCAL_PATH)/include $(LOCAL_PATH)/include/AL

LOCAL_SRC_FILES := $(wildcard $(SRCDIR)/*.c) \
                   $(wildcard $(SRCDIR)/OpenAL32/*.c) \
				   $(wildcard $(SRCDIR)/Alc/*.c) \
				   $(wildcard $(SRCDIR)/Alc/backends/*.c) \
				   $(wildcard $(SRCDIR)/Alc/effects/*.c) \
				   $(wildcard $(SRCDIR)/common/*.c)

LOCAL_CFLAGS     := -DAL_ALEXT_PROTOTYPES -std=c11
LOCAL_LDLIBS     := -llog -Wl,-s -lOpenSLES

include $(BUILD_SHARED_LIBRARY)

MY_LOCAL_PATH := $(LOCAL_PATH)
