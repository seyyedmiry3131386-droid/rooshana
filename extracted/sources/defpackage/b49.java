package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b49 {
    public final c35 a;
    public dl b;
    public dl c;
    public dl d;
    public final float e;

    public b49(c35 c35Var) {
        this.a = c35Var;
        c35Var.getClass();
        this.e = 0.0f;
    }

    public final dl a(long j, dl dlVar, dl dlVar2) {
        if (this.c == null) {
            this.c = dlVar.c();
        }
        dl dlVar3 = this.c;
        if (dlVar3 == null) {
            js3.V("velocityVector");
            throw null;
        }
        int iB = dlVar3.b();
        for (int i = 0; i < iB; i++) {
            dl dlVar4 = this.c;
            if (dlVar4 == null) {
                js3.V("velocityVector");
                throw null;
            }
            dlVar.getClass();
            long j2 = j / 1000000;
            yd2 yd2VarA = ((yi) this.a.b).a(dlVar2.a(i));
            long j3 = yd2VarA.c;
            dlVar4.e(i, (((Math.signum(yd2VarA.a) * ig.a(j3 > 0 ? j2 / j3 : 1.0f).b) * yd2VarA.b) / j3) * 1000.0f);
        }
        dl dlVar5 = this.c;
        if (dlVar5 != null) {
            return dlVar5;
        }
        js3.V("velocityVector");
        throw null;
    }
}
