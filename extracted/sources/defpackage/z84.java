package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z84 extends k {
    public final x84 a = new x84();
    public final int b;
    public boolean c;

    public z84(int i) {
        this.b = i;
    }

    @Override // defpackage.k
    public final boolean b(vc0 vc0Var) {
        if (!this.c) {
            return true;
        }
        vc0 vc0Var2 = (vc0) this.a.a;
        if (!(vc0Var2 instanceof m84)) {
            return true;
        }
        ((m84) vc0Var2).f = false;
        return true;
    }

    @Override // defpackage.k
    public final vc0 d() {
        return this.a;
    }

    @Override // defpackage.k
    public final boolean e() {
        return true;
    }

    @Override // defpackage.k
    public final wc0 g(yq1 yq1Var) {
        if (yq1Var.h) {
            if (this.a.b == null) {
                return null;
            }
            vc0 vc0VarD = yq1Var.h().d();
            this.c = (vc0VarD instanceof k16) || (vc0VarD instanceof x84);
            return wc0.a(yq1Var.e);
        }
        int i = yq1Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new wc0(-1, yq1Var.c + i2, false);
        }
        return null;
    }
}
