package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class rx8 extends mx4 {
    public final kd2 b;
    public final dp2 c;

    public rx8(kd2 kd2Var, dp2 dp2Var) {
        this.b = kd2Var;
        this.c = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rx8) {
            return ((rx8) obj).b.equals(this.b);
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        sx8 sx8Var = new sx8();
        sx8Var.q = this.b;
        return sx8Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        sx8 sx8Var = (sx8) gx4Var;
        kd2 kd2Var = sx8Var.q;
        kd2 kd2Var2 = this.b;
        if (kd2Var2.equals(kd2Var)) {
            return;
        }
        sx8Var.q = kd2Var2;
        sx8Var.D0();
    }
}
