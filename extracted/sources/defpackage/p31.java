package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p31 implements InvocationHandler {
    public final ps0 a;
    public final dp2 b;

    public p31(ps0 ps0Var, dp2 dp2Var) {
        this.a = ps0Var;
        this.b = dp2Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        js3.p(obj, "obj");
        js3.p(method, "method");
        boolean zI = js3.i(method.getName(), "accept");
        dp2 dp2Var = this.b;
        if (zI && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            ps0 ps0Var = this.a;
            if (ps0Var.e(obj2)) {
                js3.n(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                dp2Var.invoke(obj2);
                return tx8.a;
            }
            throw new ClassCastException("Value cannot be cast to " + ps0Var.b());
        }
        if (js3.i(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (js3.i(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(dp2Var.hashCode());
        }
        if (js3.i(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return dp2Var.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
