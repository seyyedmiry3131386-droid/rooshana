package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class d40 extends mx4 {
    public c40 b;
    public hx0 c;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new c40(this);
    }

    public final int hashCode() {
        return 234;
    }

    @Override // defpackage.mx4
    public final /* bridge */ /* synthetic */ void j(gx4 gx4Var) {
    }

    public final Object k(ContinuationImpl continuationImpl) throws Throwable {
        hx0 hx0VarB = this.c;
        if (hx0VarB == null) {
            hx0VarB = ct2.b();
            this.c = hx0VarB;
            c40 c40Var = this.b;
            if (c40Var != null && c40Var.n) {
                c40Var.o = m91.D(c40Var, new m(c40Var, c40Var.p, 5));
            }
        }
        Object objS = hx0VarB.s(continuationImpl);
        return objS == CoroutineSingletons.a ? objS : tx8.a;
    }
}
