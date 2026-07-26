package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tg9 extends yz0 {
    public final x70 k;

    public tg9(x70 x70Var) {
        this.k = x70Var;
    }

    public final void A() {
        x(null, this.k);
    }

    public void B() {
        A();
    }

    @Override // defpackage.x70
    public final bm8 g() {
        return this.k.g();
    }

    @Override // defpackage.x70
    public final jp4 h() {
        return this.k.h();
    }

    @Override // defpackage.x70
    public final boolean i() {
        return this.k.i();
    }

    @Override // defpackage.x70
    public final void l(fq8 fq8Var) {
        this.j = fq8Var;
        this.i = j29.p(null);
        B();
    }

    @Override // defpackage.x70
    public void s(jp4 jp4Var) {
        this.k.s(jp4Var);
    }

    @Override // defpackage.yz0
    public final ks4 t(Object obj, ks4 ks4Var) {
        return y(ks4Var);
    }

    @Override // defpackage.yz0
    public final long u(long j, Object obj) {
        return j;
    }

    @Override // defpackage.yz0
    public final int v(int i, Object obj) {
        return i;
    }

    @Override // defpackage.yz0
    public final void w(Object obj, x70 x70Var, bm8 bm8Var) {
        z(bm8Var);
    }

    public abstract void z(bm8 bm8Var);

    public ks4 y(ks4 ks4Var) {
        return ks4Var;
    }
}
