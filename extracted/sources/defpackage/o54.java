package defpackage;

import com.sun.jna.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o54 implements InvocationHandler {
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public final uh5 a;
    public final HashMap b;
    public final WeakHashMap c = new WeakHashMap();

    static {
        try {
            d = Object.class.getMethod("toString", null);
            e = Object.class.getMethod("hashCode", null);
            f = Object.class.getMethod("equals", Object.class);
        } catch (Exception unused) {
            throw new Error("Error retrieving Object.toString() method");
        }
    }

    public o54(String str, Class cls, Map map) {
        if (str != null && "".equals(str.trim())) {
            throw new IllegalArgumentException(o40.y("Invalid library name \"", str, "\""));
        }
        if (!cls.isInterface()) {
            StringBuilder sbE = bl4.E(str, " does not implement an interface: ");
            sbE.append(cls.getName());
            throw new IllegalArgumentException(sbE.toString());
        }
        HashMap map2 = new HashMap(map);
        this.b = map2;
        int i = wd.class.isAssignableFrom(cls) ? 63 : 0;
        if (map2.get("calling-convention") == null) {
            map2.put("calling-convention", Integer.valueOf(i));
        }
        if (map2.get("classloader") == null) {
            map2.put("classloader", cls.getClassLoader());
        }
        this.a = uh5.e(map2, str);
        if (map2.get("invocation-mapper") != null) {
            throw new ClassCastException();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        n54 n54Var;
        if (d.equals(method)) {
            return "Proxy interface to " + this.a;
        }
        if (e.equals(method)) {
            return Integer.valueOf(hashCode());
        }
        if (f.equals(method)) {
            Object obj2 = objArr[0];
            if (obj2 == null || !Proxy.isProxyClass(obj2.getClass())) {
                return Boolean.FALSE;
            }
            boolean z = Proxy.getInvocationHandler(obj2) == this;
            d77 d77Var = Function.g;
            return z ? Boolean.TRUE : Boolean.FALSE;
        }
        n54 n54Var2 = (n54) this.c.get(method);
        if (n54Var2 == null) {
            synchronized (this.c) {
                try {
                    n54Var2 = (n54) this.c.get(method);
                    if (n54Var2 == null) {
                        if (n27.b(method)) {
                            n54Var = new n54(n27.a(method));
                        } else {
                            boolean zD = Function.g.d(method);
                            Function functionD = this.a.d(method.getName(), method);
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            HashMap map = new HashMap(this.b);
                            map.put("invoking-method", method);
                            n54Var = new n54(functionD, parameterTypes, zD, map);
                        }
                        this.c.put(method, n54Var);
                        n54Var2 = n54Var;
                    }
                } finally {
                }
            }
        }
        Object obj3 = n54Var2.c;
        if (obj3 != null) {
            return n27.i.invoke(n27.h.invoke(obj3, obj), objArr);
        }
        if (n54Var2.b) {
            objArr = Function.O(objArr);
        }
        return n54Var2.a.P(method, n54Var2.e, method.getReturnType(), objArr, n54Var2.d);
    }
}
