package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp1 implements m37 {
    public final dp2 a;
    public yp1 b;

    public xp1(dp2 dp2Var) {
        this.a = dp2Var;
    }

    @Override // defpackage.m37
    public final void c() {
        yp1 yp1Var = this.b;
        if (yp1Var != null) {
            yp1Var.a();
        }
        this.b = null;
    }

    @Override // defpackage.m37
    public final void e() {
        this.b = (yp1) this.a.invoke(zk8.g);
    }

    @Override // defpackage.m37
    public final void a() {
    }
}
