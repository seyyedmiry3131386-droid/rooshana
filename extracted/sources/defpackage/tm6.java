package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tm6 implements js4 {
    public final wa1 a;
    public final ts5 b;
    public final wv8 c;
    public final fv d;
    public final int e;

    public tm6(wa1 wa1Var, pe1 pe1Var) {
        ts5 ts5Var = new ts5(9, pe1Var);
        wv8 wv8Var = new wv8(20);
        fv fvVar = new fv(12);
        this.a = wa1Var;
        this.b = ts5Var;
        this.c = wv8Var;
        this.d = fvVar;
        this.e = 1048576;
    }

    @Override // defpackage.js4
    public final js4 a(av avVar) {
        return this;
    }

    @Override // defpackage.js4
    public final js4 b(boolean z) {
        return this;
    }

    @Override // defpackage.js4
    public final js4 c() {
        return this;
    }

    @Override // defpackage.js4
    public final x70 d(jp4 jp4Var) {
        jp4Var.b.getClass();
        return new um6(jp4Var, this.a, this.b, this.c.u(jp4Var), this.d, this.e, null);
    }
}
