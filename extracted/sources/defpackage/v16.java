package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class v16 extends m91 {
    public final /* synthetic */ int n;
    public final Method o;
    public final int p;

    public /* synthetic */ v16(Method method, int i, int i2) {
        this.n = i2;
        this.o = method;
        this.p = i;
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        switch (this.n) {
            case 0:
                by2 by2Var = (by2) obj;
                if (by2Var == null) {
                    throw rq4.K(this.o, this.p, "Headers parameter must not be null.", new Object[0]);
                }
                ay2 ay2Var = e57Var.f;
                ay2Var.getClass();
                int size = by2Var.size();
                for (int i = 0; i < size; i++) {
                    ry7.j(ay2Var, by2Var.c(i), by2Var.f(i));
                }
                return;
            default:
                if (obj == null) {
                    throw rq4.K(this.o, this.p, "@Url parameter is null.", new Object[0]);
                }
                e57Var.c = obj.toString();
                return;
        }
    }
}
