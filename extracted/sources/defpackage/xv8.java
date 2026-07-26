package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: loaded from: classes.dex */
public final class xv8 implements InvocationHandler {
    public static final ImmutableMap b;
    public final wv8 a;

    static {
        j0 j0VarA = ImmutableMap.a();
        for (Method method : wv8.class.getMethods()) {
            if (method.getDeclaringClass().equals(wv8.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                j0VarA.c(method.getName(), method);
            }
        }
        b = j0VarA.a(false);
    }

    public xv8(wv8 wv8Var) {
        this.a = wv8Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Method method2 = (Method) b.get(name);
        if (method2 == null) {
            throw new UnsupportedOperationException(name);
        }
        try {
            return method2.invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
