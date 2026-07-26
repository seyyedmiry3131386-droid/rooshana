package defpackage;

import com.sun.jna.Function;
import com.sun.jna.Pointer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ml0 implements InvocationHandler {
    public final Function a;
    public final HashMap b;

    public ml0(Pointer pointer, int i, HashMap map) {
        this.b = map;
        this.a = new Function(pointer, i, (String) map.get("string-encoding"));
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean zEquals = o54.d.equals(method);
        HashMap map = this.b;
        Function function = this.a;
        if (zEquals) {
            Class clsB = nl0.b(((Method) map.get("invoking-method")).getDeclaringClass());
            StringBuilder sbE = bl4.E("Proxy interface to " + function, " (");
            sbE.append(clsB.getName());
            sbE.append(")");
            return sbE.toString();
        }
        if (o54.e.equals(method)) {
            return Integer.valueOf(hashCode());
        }
        if (o54.f.equals(method)) {
            Object obj2 = objArr[0];
            if (obj2 == null || !Proxy.isProxyClass(obj2.getClass())) {
                return Boolean.FALSE;
            }
            boolean z = Proxy.getInvocationHandler(obj2) == this;
            d77 d77Var = Function.g;
            return z ? Boolean.TRUE : Boolean.FALSE;
        }
        if (Function.g.d(method)) {
            objArr = Function.O(objArr);
        }
        Object[] objArr2 = objArr;
        Class<?> returnType = method.getReturnType();
        function.getClass();
        Method method2 = (Method) map.get("invoking-method");
        return function.P(method2, method2 != null ? method2.getParameterTypes() : null, returnType, objArr2, map);
    }
}
