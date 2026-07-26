package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rg6 extends jk2 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public rg6(bm8 bm8Var, jp4 jp4Var) {
        super(bm8Var);
        this.g = jp4Var;
    }

    @Override // defpackage.jk2, defpackage.bm8
    public yl8 f(int i, yl8 yl8Var, boolean z) {
        switch (this.f) {
            case 0:
                bm8 bm8Var = this.e;
                yl8 yl8VarF = bm8Var.f(i, yl8Var, z);
                if (bm8Var.m(yl8VarF.c, (am8) this.g, 0L).a()) {
                    yl8VarF.i(yl8Var.a, yl8Var.b, yl8Var.c, yl8Var.d, yl8Var.e, bb.f, true);
                } else {
                    yl8VarF.f = true;
                }
                return yl8VarF;
            default:
                return super.f(i, yl8Var, z);
        }
    }

    @Override // defpackage.jk2, defpackage.bm8
    public am8 m(int i, am8 am8Var, long j) {
        switch (this.f) {
            case 1:
                super.m(i, am8Var, j);
                jp4 jp4Var = (jp4) this.g;
                am8Var.c = jp4Var;
                fp4 fp4Var = jp4Var.b;
                am8Var.getClass();
                return am8Var;
            default:
                return super.m(i, am8Var, j);
        }
    }

    public rg6(bm8 bm8Var) {
        super(bm8Var);
        this.g = new am8();
    }
}
