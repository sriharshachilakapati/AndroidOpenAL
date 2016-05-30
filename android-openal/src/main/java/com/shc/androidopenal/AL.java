package com.shc.androidopenal;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class AL implements ALConstants
{
    public static void alEnable(int capability)
    {
        ALJNI.alEnable(capability);
    }

    public static void alDisable(int capability)
    {
        ALJNI.alDisable(capability);
    }

    public static char alIsEnabled(int capability)
    {
        return ALJNI.alIsEnabled(capability);
    }

    public static String alGetString(int param)
    {
        return ALJNI.alGetString(param);
    }

    public static void alGetBooleanv(int param, String data)
    {
        ALJNI.alGetBooleanv(param, data);
    }

    public static void alGetIntegerv(int param, IntBuffer data)
    {
        ALJNI.alGetIntegerv(param, Util.getAddress(data, 0));
    }

    public static void alGetFloatv(int param, FloatBuffer data)
    {
        ALJNI.alGetFloatv(param, Util.getAddress(data, 0));
    }

    public static void alGetDoublev(int param, DoubleBuffer data)
    {
        ALJNI.alGetDoublev(param, Util.getAddress(data, 0));
    }

    public static char alGetBoolean(int param)
    {
        return ALJNI.alGetBoolean(param);
    }

    public static int alGetInteger(int param)
    {
        return ALJNI.alGetInteger(param);
    }

    public static float alGetFloat(int param)
    {
        return ALJNI.alGetFloat(param);
    }

    public static double alGetDouble(int param)
    {
        return ALJNI.alGetDouble(param);
    }

    public static int alGetError()
    {
        return ALJNI.alGetError();
    }

    public static char alIsExtensionPresent(String extname)
    {
        return ALJNI.alIsExtensionPresent(extname);
    }

    public static long alGetProcAddress(String fname)
    {
        return ALJNI.alGetProcAddress(fname);
    }

    public static int alGetEnumValue(String ename)
    {
        return ALJNI.alGetEnumValue(ename);
    }

    public static void alListenerf(int param, float value)
    {
        ALJNI.alListenerf(param, value);
    }

    public static void alListener3f(int param, float value1, float value2, float value3)
    {
        ALJNI.alListener3f(param, value1, value2, value3);
    }

    public static void alListenerfv(int param, FloatBuffer values)
    {
        ALJNI.alListenerfv(param, Util.getAddress(values, 0));
    }

    public static void alListeneri(int param, int value)
    {
        ALJNI.alListeneri(param, value);
    }

    public static void alListener3i(int param, int value1, int value2, int value3)
    {
        ALJNI.alListener3i(param, value1, value2, value3);
    }

    public static void alListeneriv(int param, IntBuffer values)
    {
        ALJNI.alListeneriv(param, Util.getAddress(values, 0));
    }

    public static void alGetListenerf(int param, FloatBuffer value)
    {
        ALJNI.alGetListenerf(param, Util.getAddress(value, 0));
    }

    public static void alGetListener3f(int param, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3)
    {
        ALJNI.alGetListener3f(param, Util.getAddress(value1, 0), Util.getAddress(value2, 0), Util.getAddress(value3, 0));
    }

    public static void alGetListenerfv(int param, FloatBuffer values)
    {
        ALJNI.alGetListenerfv(param, Util.getAddress(values, 0));
    }

    public static void alGetListeneri(int param, IntBuffer value)
    {
        ALJNI.alGetListeneri(param, Util.getAddress(value, 0));
    }

    public static void alGetListener3i(int param, IntBuffer value1, IntBuffer value2, IntBuffer value3)
    {
        ALJNI.alGetListener3i(param, Util.getAddress(value1, 0), Util.getAddress(value2, 0), Util.getAddress(value3, 0));
    }

    public static void alGetListeneriv(int param, IntBuffer values)
    {
        ALJNI.alGetListeneriv(param, Util.getAddress(values, 0));
    }

    public static void alGenSources(int n, IntBuffer sources)
    {
        ALJNI.alGenSources(n, Util.getAddress(sources, 0));
    }

    public static void alDeleteSources(int n, IntBuffer sources)
    {
        ALJNI.alDeleteSources(n, Util.getAddress(sources, 0));
    }

    public static char alIsSource(long sid)
    {
        return ALJNI.alIsSource(sid);
    }

    public static void alSourcef(long sid, int param, float value)
    {
        ALJNI.alSourcef(sid, param, value);
    }

    public static void alSource3f(long sid, int param, float value1, float value2, float value3)
    {
        ALJNI.alSource3f(sid, param, value1, value2, value3);
    }

    public static void alSourcefv(long sid, int param, FloatBuffer values)
    {
        ALJNI.alSourcefv(sid, param, Util.getAddress(values, 0));
    }

    public static void alSourcei(long sid, int param, int value)
    {
        ALJNI.alSourcei(sid, param, value);
    }

    public static void alSource3i(long sid, int param, int value1, int value2, int value3)
    {
        ALJNI.alSource3i(sid, param, value1, value2, value3);
    }

    public static void alSourceiv(long sid, int param, IntBuffer values)
    {
        ALJNI.alSourceiv(sid, param, Util.getAddress(values, 0));
    }

    public static void alGetSourcef(long sid, int param, FloatBuffer value)
    {
        ALJNI.alGetSourcef(sid, param, Util.getAddress(value, 0));
    }

    public static void alGetSource3f(long sid, int param, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3)
    {
        ALJNI.alGetSource3f(sid, param, Util.getAddress(value1, 0), Util.getAddress(value2, 0), Util.getAddress(value3, 0));
    }

    public static void alGetSourcefv(long sid, int param, FloatBuffer values)
    {
        ALJNI.alGetSourcefv(sid, param, Util.getAddress(values, 0));
    }

    public static void alGetSourcei(long sid, int param, IntBuffer value)
    {
        ALJNI.alGetSourcei(sid, param, Util.getAddress(value, 0));
    }

    public static void alGetSource3i(long sid, int param, IntBuffer value1, IntBuffer value2, IntBuffer value3)
    {
        ALJNI.alGetSource3i(sid, param, Util.getAddress(value1, 0), Util.getAddress(value1, 0), Util.getAddress(value1, 0));
    }

    public static void alGetSourceiv(long sid, int param, IntBuffer values)
    {
        ALJNI.alGetSourceiv(sid, param, Util.getAddress(values, 0));
    }

    public static void alSourcePlayv(int ns, IntBuffer sids)
    {
        ALJNI.alSourcePlayv(ns, Util.getAddress(sids, 0));
    }

    public static void alSourceStopv(int ns, IntBuffer sids)
    {
        ALJNI.alSourceStopv(ns, Util.getAddress(sids, 0));
    }

    public static void alSourceRewindv(int ns, IntBuffer sids)
    {
        ALJNI.alSourceRewindv(ns, Util.getAddress(sids, 0));
    }

    public static void alSourcePausev(int ns, IntBuffer sids)
    {
        ALJNI.alSourcePausev(ns, Util.getAddress(sids, 0));
    }

    public static void alSourcePlay(long sid)
    {
        ALJNI.alSourcePlay(sid);
    }

    public static void alSourceStop(long sid)
    {
        ALJNI.alSourceStop(sid);
    }

    public static void alSourceRewind(long sid)
    {
        ALJNI.alSourceRewind(sid);
    }

    public static void alSourcePause(long sid)
    {
        ALJNI.alSourcePause(sid);
    }

    public static void alSourceQueueBuffers(long sid, int numEntries, IntBuffer bids)
    {
        ALJNI.alSourceQueueBuffers(sid, numEntries, Util.getAddress(bids, 0));
    }

    public static void alSourceUnqueueBuffers(long sid, int numEntries, IntBuffer bids)
    {
        ALJNI.alSourceUnqueueBuffers(sid, numEntries, Util.getAddress(bids, 0));
    }

    public static void alGenBuffers(int n, IntBuffer buffers)
    {
        ALJNI.alGenBuffers(n, Util.getAddress(buffers, 0));
    }

    public static void alDeleteBuffers(int n, IntBuffer buffers)
    {
        ALJNI.alDeleteBuffers(n, Util.getAddress(buffers, 0));
    }

    public static char alIsBuffer(long bid)
    {
        return ALJNI.alIsBuffer(bid);
    }

    public static void alBufferData(long bid, int format, Buffer data, int size, int freq)
    {
        ALJNI.alBufferData(bid, format, Util.getAddress(data, 0), size, freq);
    }

    public static void alBufferf(long bid, int param, float value)
    {
        ALJNI.alBufferf(bid, param, value);
    }

    public static void alBuffer3f(long bid, int param, float value1, float value2, float value3)
    {
        ALJNI.alBuffer3f(bid, param, value1, value2, value3);
    }

    public static void alBufferfv(long bid, int param, FloatBuffer values)
    {
        ALJNI.alBufferfv(bid, param, Util.getAddress(values, 0));
    }

    public static void alBufferi(long bid, int param, int value)
    {
        ALJNI.alBufferi(bid, param, value);
    }

    public static void alBuffer3i(long bid, int param, int value1, int value2, int value3)
    {
        ALJNI.alBuffer3i(bid, param, value1, value2, value3);
    }

    public static void alBufferiv(long bid, int param, IntBuffer values)
    {
        ALJNI.alBufferiv(bid, param, Util.getAddress(values, 0));
    }

    public static void alGetBufferf(long bid, int param, FloatBuffer value)
    {
        ALJNI.alGetBufferf(bid, param, Util.getAddress(value, 0));
    }

    public static void alGetBuffer3f(long bid, int param, FloatBuffer value1, FloatBuffer value2, FloatBuffer value3)
    {
        ALJNI.alGetBuffer3f(bid, param, Util.getAddress(value1, 0), Util.getAddress(value2, 0), Util.getAddress(value3, 0));
    }

    public static void alGetBufferfv(long bid, int param, FloatBuffer values)
    {
        ALJNI.alGetBufferfv(bid, param, Util.getAddress(values, 0));
    }

    public static void alGetBufferi(long bid, int param, IntBuffer value)
    {
        ALJNI.alGetBufferi(bid, param, Util.getAddress(value, 0));
    }

    public static void alGetBuffer3i(long bid, int param, IntBuffer value1, IntBuffer value2, IntBuffer value3)
    {
        ALJNI.alGetBuffer3i(bid, param, Util.getAddress(value1, 0), Util.getAddress(value2, 0), Util.getAddress(value3, 0));
    }

    public static void alGetBufferiv(long bid, int param, IntBuffer values)
    {
        ALJNI.alGetBufferiv(bid, param, Util.getAddress(values, 0));
    }

    public static void alDopplerFactor(float value)
    {
        ALJNI.alDopplerFactor(value);
    }

    public static void alDopplerVelocity(float value)
    {
        ALJNI.alDopplerVelocity(value);
    }

    public static void alSpeedOfSound(float value)
    {
        ALJNI.alSpeedOfSound(value);
    }

    public static void alDistanceModel(int distanceModel)
    {
        ALJNI.alDistanceModel(distanceModel);
    }
}
