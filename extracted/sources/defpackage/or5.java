package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or5 extends fz1 {
    public final oi4 x;
    public final float y;

    public or5(oi4 oi4Var, float f) {
        super(0);
        this.x = oi4Var;
        this.y = f;
    }

    @Override // defpackage.fz1
    public final boolean m() {
        return true;
    }

    @Override // defpackage.fz1
    public final void o(float f, float f2, float f3, us7 us7Var) {
        this.x.o(f, f2 - this.y, f3, us7Var);
    }
}
