package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import j$.util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class nl0 extends WeakReference {
    public static final WeakHashMap d = new WeakHashMap();
    public static final WeakHashMap e;
    public static final Map f;
    public static final Method g;
    public static final WeakHashMap h;
    public Pointer a;
    public Pointer b;
    public final kl0 c;

    static {
        new WeakHashMap();
        e = new WeakHashMap();
        new WeakHashMap();
        f = DesugarCollections.synchronizedMap(new WeakHashMap());
        try {
            g = kl0.class.getMethod("a", Object[].class);
            h = new WeakHashMap();
        } catch (Exception unused) {
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
    }

    public nl0(Callback callback, int i) {
        super(callback);
        if (Native.i(callback.getClass()).get("type-mapper") != null) {
            throw new ClassCastException();
        }
        m96.g();
        String str = (String) Native.i(callback.getClass()).get("string-encoding");
        String strG = str == null ? Native.g() : str;
        if (callback instanceof kl0) {
            this.c = (kl0) callback;
        } else {
            this.c = new ll0(this, d(b(callback.getClass())));
        }
        Class<?>[] parameterTypes = ((ll0) this.c).b.getParameterTypes();
        Class<?> returnType = ((ll0) this.c).b.getReturnType();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            Class<?> clsF = f(parameterTypes[i2]);
            parameterTypes[i2] = clsF;
            if (!g(clsF)) {
                throw new IllegalArgumentException("Callback argument " + parameterTypes[i2] + " requires custom type conversion");
            }
        }
        Class clsF2 = f(returnType);
        if (!g(clsF2)) {
            throw new IllegalArgumentException(bl4.t(clsF2, "Callback return type ", " requires custom type conversion"));
        }
        long jCreateNativeCallback = Native.createNativeCallback(this.c, g, parameterTypes, clsF2, i, 0, strG);
        this.a = jCreateNativeCallback != 0 ? new Pointer(jCreateNativeCallback) : null;
        f.put(this, new WeakReference(this));
    }

    public static Class b(Class cls) {
        if (!Callback.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(cls.getName().concat(" is not derived from com.sun.jna.Callback"));
        }
        if (!cls.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int i = 0;
            while (true) {
                if (i >= interfaces.length) {
                    break;
                }
                if (Callback.class.isAssignableFrom(interfaces[i])) {
                    try {
                        d(interfaces[i]);
                        return interfaces[i];
                    } catch (IllegalArgumentException unused) {
                        return Callback.class.isAssignableFrom(cls.getSuperclass()) ? b(cls.getSuperclass()) : cls;
                    }
                }
                i++;
            }
        } else {
            return cls;
        }
    }

    public static Callback c(Class cls, Pointer pointer) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("Callback type must be an interface");
        }
        WeakHashMap weakHashMap = d;
        WeakHashMap weakHashMap2 = e;
        synchronized (weakHashMap2) {
            try {
                Reference reference = (Reference) weakHashMap2.get(pointer);
                if (reference == null) {
                    int i = wd.class.isAssignableFrom(cls) ? 63 : 0;
                    HashMap map = new HashMap(Native.i(cls));
                    map.put("invoking-method", d(cls));
                    Callback callback = (Callback) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ml0(pointer, i, map));
                    weakHashMap.remove(callback);
                    weakHashMap2.put(pointer, new WeakReference(callback));
                    return callback;
                }
                Callback callback2 = (Callback) reference.get();
                if (callback2 != null && !cls.isAssignableFrom(callback2.getClass())) {
                    throw new IllegalStateException("Pointer " + pointer + " already mapped to " + callback2 + ".\nNative code may be re-using a default function pointer, in which case you may need to use a common Callback class wherever the function pointer is reused.");
                }
                return callback2;
            } finally {
            }
        }
    }

    public static Method d(Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Method[] methods = cls.getMethods();
        HashSet hashSet = new HashSet(Arrays.asList(declaredMethods));
        hashSet.retainAll(Arrays.asList(methods));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (Callback.a.contains(((Method) it.next()).getName())) {
                it.remove();
            }
        }
        Method[] methodArr = (Method[]) hashSet.toArray(new Method[0]);
        if (methodArr.length == 1) {
            Method method = methodArr[0];
            if (method.getParameterTypes().length <= 256) {
                return method;
            }
            throw new UnsupportedOperationException("Method signature exceeds the maximum parameter count: " + method);
        }
        for (Method method2 : methodArr) {
            if ("callback".equals(method2.getName())) {
                if (method2.getParameterTypes().length <= 256) {
                    return method2;
                }
                throw new UnsupportedOperationException("Method signature exceeds the maximum parameter count: " + method2);
            }
        }
        throw new IllegalArgumentException("Callback must implement a single public method, or one public method named 'callback'");
    }

    public static Pointer e(Callback callback) {
        Pointer pointer;
        Function function = null;
        if (callback == null) {
            return null;
        }
        if (Proxy.isProxyClass(callback.getClass())) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(callback);
            if (invocationHandler instanceof ml0) {
                function = ((ml0) invocationHandler).a;
            }
        }
        if (function != null) {
            return function;
        }
        Map mapI = Native.i(callback.getClass());
        int iIntValue = mapI.containsKey("calling-convention") ? ((Integer) mapI.get("calling-convention")).intValue() : 0;
        WeakHashMap weakHashMap = d;
        WeakHashMap weakHashMap2 = e;
        synchronized (weakHashMap2) {
            try {
                nl0 nl0Var = (nl0) weakHashMap.get(callback);
                if (nl0Var == null) {
                    nl0Var = new nl0(callback, iIntValue);
                    weakHashMap.put(callback, nl0Var);
                    if (nl0Var.b == null) {
                        nl0Var.b = nl0Var.a.g(0L);
                    }
                    weakHashMap2.put(nl0Var.b, new WeakReference(callback));
                    if (h.containsKey(callback)) {
                        nl0Var.a.y(1, Native.i);
                    }
                }
                if (nl0Var.b == null) {
                    nl0Var.b = nl0Var.a.g(0L);
                }
                pointer = nl0Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pointer;
    }

    public static Class f(Class cls) {
        if (f98.class.isAssignableFrom(cls)) {
            f98.validate(cls);
            if (!z88.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        } else {
            if (vh5.class.isAssignableFrom(cls)) {
                return wh5.b(cls).b;
            }
            if (cls == String.class || cls == fc9.class || cls == String[].class || cls == fc9[].class || Callback.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        }
        return cls;
    }

    public static boolean g(Class cls) {
        if (cls == Void.TYPE || cls == Void.class || cls == Boolean.TYPE || cls == Boolean.class || cls == Byte.TYPE || cls == Byte.class || cls == Short.TYPE || cls == Short.class || cls == Character.TYPE || cls == Character.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class || cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class) {
            return true;
        }
        return (z88.class.isAssignableFrom(cls) && f98.class.isAssignableFrom(cls)) || Pointer.class.isAssignableFrom(cls);
    }

    public final synchronized void a() {
        try {
            Pointer pointer = this.a;
            if (pointer != null) {
                try {
                    Native.freeNativeCallback(pointer.a);
                    this.a.a = 0L;
                    this.a = null;
                    f.remove(this);
                } catch (Throwable th) {
                    this.a.a = 0L;
                    this.a = null;
                    f.remove(this);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void finalize() {
        a();
    }
}
