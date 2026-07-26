package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm7 implements rp2 {
    public final /* synthetic */ um3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ v97 d;
    public final /* synthetic */ bp2 e;

    public pm7(um3 um3Var, boolean z, boolean z2, v97 v97Var, bp2 bp2Var) {
        this.a = um3Var;
        this.b = z;
        this.c = z2;
        this.d = v97Var;
        this.e = bp2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        ((Number) obj3).intValue();
        qz0Var.a0(-1525724089);
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = o40.r(qz0Var);
        }
        ab5 ab5Var = (ab5) objM;
        hx4 hx4VarD = qm3.a(ex4.b, ab5Var, this.a).d(new om7(this.b, ab5Var, null, this.c, this.d, this.e));
        qz0Var.q(false);
        return hx4VarD;
    }
}
