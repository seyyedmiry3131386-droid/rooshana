package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import io.sentry.android.core.t0;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fv8 extends h27 {
    public static final Class d;
    public static final Constructor e;
    public static final Method f;
    public static final Method g;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            t0.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        e = constructor;
        d = cls;
        f = method2;
        g = method;
    }

    public static boolean p(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) d, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) g.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.h27
    public final Typeface b(Context context, hi2 hi2Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStreamG;
        try {
            objNewInstance = e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (ii2 ii2Var : hi2Var.a) {
                int i2 = ii2Var.f;
                File fileH = j27.h(context);
                if (fileH != null) {
                    try {
                        if (j27.b(fileH, resources, i2)) {
                            try {
                                fileInputStreamG = a.g(fileH, new FileInputStream(fileH));
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStreamG.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStreamG.close();
                                if (map != null && p(objNewInstance, map, ii2Var.e, ii2Var.b, ii2Var.c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileH.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return q(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.h27
    public final Typeface c(Context context, hj2[] hj2VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i2 = 0;
            fw7 fw7Var = new fw7(0);
            int length = hj2VarArr.length;
            while (true) {
                if (i2 < length) {
                    hj2 hj2Var = hj2VarArr[i2];
                    Uri uri = hj2Var.a;
                    ByteBuffer byteBufferJ = (ByteBuffer) fw7Var.get(uri);
                    if (byteBufferJ == null) {
                        byteBufferJ = j27.j(context, uri);
                        fw7Var.put(uri, byteBufferJ);
                    }
                    if (byteBufferJ == null || !p(objNewInstance, byteBufferJ, hj2Var.b, hj2Var.c, hj2Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface typefaceQ = q(objNewInstance);
                    if (typefaceQ != null) {
                        return Typeface.create(typefaceQ, i);
                    }
                }
            }
        }
        return null;
    }
}
