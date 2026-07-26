package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import io.sentry.android.core.t0;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class hv8 extends ev8 {
    public final Class i;
    public final Constructor j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;

    public hv8() throws NoSuchMethodException {
        Method methodV;
        Constructor<?> constructor;
        Method methodU;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodU = u(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodV = v(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            t0.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodV = null;
            constructor = null;
            methodU = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.i = cls;
        this.j = constructor;
        this.k = methodU;
        this.l = method;
        this.m = method2;
        this.n = method3;
        this.o = methodV;
    }

    public static Method u(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // defpackage.ev8, defpackage.h27
    public final Typeface b(Context context, hi2 hi2Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.k;
        if (method == null) {
            t0.m("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.b(context, hi2Var, resources, i);
        }
        try {
            objNewInstance = this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            ii2[] ii2VarArr = hi2Var.a;
            int length = ii2VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    ii2 ii2Var = ii2VarArr[i2];
                    Context context2 = context;
                    if (r(context2, objNewInstance, ii2Var.a, ii2Var.e, ii2Var.b, ii2Var.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(ii2Var.d))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.n.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (t(objNewInstance)) {
                    return s(objNewInstance);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    @Override // defpackage.ev8, defpackage.h27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface c(android.content.Context r18, defpackage.hj2[] r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv8.c(android.content.Context, hj2[], int):android.graphics.Typeface");
    }

    @Override // defpackage.h27
    public final Typeface f(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.k;
        if (method == null) {
            t0.m("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.f(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!r(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.n.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (t(objNewInstance)) {
                return s(objNewInstance);
            }
        }
        return null;
    }

    public final boolean r(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface s(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.i, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.o.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean t(Object obj) {
        try {
            return ((Boolean) this.m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method v(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
