package defpackage;

import com.sun.jna.FromNativeConverter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ll0 implements kl0 {
    public final Method b;
    public final FromNativeConverter[] c;
    public final /* synthetic */ nl0 d;

    public ll0(nl0 nl0Var, Method method) {
        this.d = nl0Var;
        this.b = method;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> returnType = method.getReturnType();
        this.c = new FromNativeConverter[parameterTypes.length];
        if (vh5.class.isAssignableFrom(returnType)) {
            wh5.b(returnType);
        }
        for (int i = 0; i < this.c.length; i++) {
            if (vh5.class.isAssignableFrom(parameterTypes[i])) {
                this.c[i] = new wh5(parameterTypes[i]);
            }
        }
        if (method.isAccessible()) {
            return;
        }
        try {
            method.setAccessible(true);
        } catch (SecurityException unused) {
            throw new IllegalArgumentException("Callback method is inaccessible, make sure the interface is public: " + method);
        }
    }
}
