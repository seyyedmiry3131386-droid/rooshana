package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class s16 extends m91 {
    public final Method n;
    public final int o;
    public final l51 p;

    public s16(Method method, int i, l51 l51Var) {
        this.n = method;
        this.o = i;
        this.p = l51Var;
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        int i = this.o;
        Method method = this.n;
        if (obj == null) {
            throw rq4.K(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            e57Var.k = (b57) this.p.i(obj);
        } catch (IOException e) {
            throw rq4.L(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
