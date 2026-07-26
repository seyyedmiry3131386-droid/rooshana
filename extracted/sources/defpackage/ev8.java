package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.android.core.t0;
import io.sentry.config.a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ev8 extends h27 {
    public static Class d = null;
    public static Constructor e = null;
    public static Method f = null;
    public static Method g = null;
    public static boolean h = false;

    public static boolean p(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        q();
        try {
            try {
                return ((Boolean) f.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
        }
    }

    public static void q() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (h) {
            return;
        }
        h = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            t0.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        e = constructor;
        d = cls;
        f = method2;
        g = method;
    }

    @Override // defpackage.h27
    public Typeface b(Context context, hi2 hi2Var, Resources resources, int i) throws NoSuchMethodException {
        q();
        try {
            Object objNewInstance = e.newInstance(null);
            for (ii2 ii2Var : hi2Var.a) {
                File fileH = j27.h(context);
                if (fileH == null) {
                    return null;
                }
                try {
                    if (!j27.b(fileH, resources, ii2Var.f)) {
                        return null;
                    }
                    if (!p(objNewInstance, fileH.getPath(), ii2Var.b, ii2Var.c)) {
                        return null;
                    }
                    fileH.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileH.delete();
                }
            }
            q();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) d, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) g.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.h27
    public Typeface c(Context context, hj2[] hj2VarArr, int i) {
        String str;
        if (hj2VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(h(hj2VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                    FileInputStream fileInputStreamH = a.h(new FileInputStream(fileDescriptor), fileDescriptor);
                    try {
                        Typeface typefaceE = e(context, fileInputStreamH);
                        fileInputStreamH.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceE;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
