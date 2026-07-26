package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bi5 implements c24 {
    public final ps0 a;
    public final bp2 b;
    public ai5 c;

    public bi5(ps0 ps0Var, bp2 bp2Var) {
        this.a = ps0Var;
        this.b = bp2Var;
    }

    @Override // defpackage.c24
    public final Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ai5 ai5Var = this.c;
        if (ai5Var != null) {
            return ai5Var;
        }
        Bundle bundle = (Bundle) this.b.invoke();
        wv wvVar = ci5.b;
        ps0 ps0Var = this.a;
        Method method = (Method) wvVar.get(ps0Var);
        if (method == null) {
            method = yh0.u(ps0Var).getMethod("fromBundle", (Class[]) Arrays.copyOf(ci5.a, 1));
            wvVar.put(ps0Var, method);
            js3.o(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundle);
        js3.n(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        ai5 ai5Var2 = (ai5) objInvoke;
        this.c = ai5Var2;
        return ai5Var2;
    }

    @Override // defpackage.c24
    public final boolean isInitialized() {
        return this.c != null;
    }
}
