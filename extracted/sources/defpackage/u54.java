package defpackage;

import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class u54 {
    public final i64 a;
    public final Lifecycle$State b;
    public final pp1 c;
    public final wx0 d;

    public u54(i64 i64Var, Lifecycle$State lifecycle$State, pp1 pp1Var, wt3 wt3Var) {
        js3.p(pp1Var, "dispatchQueue");
        this.a = i64Var;
        this.b = lifecycle$State;
        this.c = pp1Var;
        wx0 wx0Var = new wx0(this, wt3Var, 2);
        this.d = wx0Var;
        if (i64Var.d != Lifecycle$State.a) {
            i64Var.a(wx0Var);
        } else {
            wt3Var.g(null);
            a();
        }
    }

    public final void a() {
        this.a.f(this.d);
        pp1 pp1Var = this.c;
        pp1Var.b = true;
        pp1Var.a();
    }
}
