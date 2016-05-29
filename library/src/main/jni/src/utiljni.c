#include <jni.h>

JNIEXPORT jlong JNICALL Java_com_shc_androidopenal_Util_getAddress(JNIEnv* env, jclass klass, jobject buffer, jint offset)
{
    unsigned char *data = (unsigned char*) (*env)->GetDirectBufferAddress(env, buffer);
    return (jlong) &data[offset];
}
