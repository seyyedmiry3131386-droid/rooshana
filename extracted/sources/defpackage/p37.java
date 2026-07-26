package defpackage;

import androidx.compose.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public final class p37 extends s implements z61 {
    public final /* synthetic */ h01 b;
    public final /* synthetic */ m c;

    /* JADX WARN: Illegal instructions before constructor call */
    public p37(h01 h01Var, m mVar) {
        fz1 fz1Var = fz1.f;
        this.b = h01Var;
        this.c = mVar;
        super(fz1Var);
    }

    @Override // defpackage.z61
    public final void y(w61 w61Var, Throwable th) throws Throwable {
        h01 h01Var = this.b;
        m mVar = this.c;
        c26.P(th, new d(h01Var, mVar, 17));
        w61 w61Var2 = mVar.b;
        fz1 fz1Var = fz1.f;
        z61 z61Var = (z61) w61Var2.r0(fz1Var);
        if (z61Var != null) {
            z61Var.y(w61Var, th);
            return;
        }
        z61 z61Var2 = (z61) mVar.a.r0(fz1Var);
        if (z61Var2 == null) {
            throw th;
        }
        z61Var2.y(w61Var, th);
    }
}
