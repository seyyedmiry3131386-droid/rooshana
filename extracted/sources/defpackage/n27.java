package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n27 {
    public static final Logger a = Logger.getLogger(n27.class.getName());
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;
    public static final Method j;
    public static Constructor k;

    static {
        Class clsC = c("java.lang.invoke.MethodHandles");
        Class clsC2 = c("java.lang.invoke.MethodHandle");
        Class clsC3 = c("java.lang.invoke.MethodHandles$Lookup");
        Class clsC4 = c("java.lang.invoke.MethodType");
        b = d(Method.class, "isDefault", new Class[0]);
        c = d(clsC, "lookup", new Class[0]);
        d = d(clsC3, "in", Class.class);
        f = d(clsC3, "unreflectSpecial", Method.class, Class.class);
        g = d(clsC3, "findSpecial", Class.class, String.class, clsC4, Class.class);
        h = d(clsC2, "bindTo", Object.class);
        i = d(clsC2, "invokeWithArguments", Object[].class);
        e = d(clsC, "privateLookupIn", Class.class, clsC3);
        j = d(clsC4, "methodType", Class.class, Class[].class);
    }

    public static Object a(Method method) throws IllegalAccessException, InvocationTargetException {
        Constructor constructor = null;
        Object objInvoke = c.invoke(null, null);
        try {
            return g.invoke(e.invoke(null, method.getDeclaringClass(), objInvoke), method.getDeclaringClass(), method.getName(), j.invoke(null, method.getReturnType(), method.getParameterTypes()), method.getDeclaringClass());
        } catch (Exception unused) {
            if (k == null) {
                Class clsC = c("java.lang.invoke.MethodHandles$Lookup");
                Class<?>[] clsArr = {Class.class};
                Logger logger = a;
                if (clsC == null) {
                    logger.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{clsC, Arrays.toString(clsArr)});
                } else {
                    try {
                        Constructor declaredConstructor = clsC.getDeclaredConstructor(clsArr);
                        declaredConstructor.setAccessible(true);
                        constructor = declaredConstructor;
                    } catch (Exception unused2) {
                        logger.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{clsC, Arrays.toString(clsArr)});
                    }
                }
                k = constructor;
            }
            return f.invoke(d.invoke(k.newInstance(method.getDeclaringClass()), method.getDeclaringClass()), method, method.getDeclaringClass());
        }
    }

    public static boolean b(Method method) {
        Method method2 = b;
        if (method2 == null) {
            return false;
        }
        try {
            return ((Boolean) method2.invoke(method, null)).booleanValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            a.log(Level.FINE, "Failed to lookup class: ".concat(str), (Throwable) e2);
            return null;
        }
    }

    public static Method d(Class cls, String str, Class... clsArr) {
        Logger logger = a;
        if (cls == null) {
            logger.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Exception unused) {
            logger.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
    }
}
