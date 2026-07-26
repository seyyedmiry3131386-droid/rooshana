package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c40 extends gx4 {
    public bl8 o;
    public final /* synthetic */ d40 p;

    public c40(d40 d40Var) {
        this.p = d40Var;
    }

    @Override // defpackage.gx4
    public final void s0() {
        d40 d40Var = this.p;
        d40Var.b = this;
        if (d40Var.c != null) {
            this.o = m91.D(this, new m(this, d40Var, 5));
        }
    }

    @Override // defpackage.gx4
    public final void u0() {
        d40 d40Var = this.p;
        if (d40Var.b == this) {
            d40Var.b = null;
        }
        bl8 bl8Var = this.o;
        if (bl8Var != null) {
            bl8Var.b();
        }
        this.o = null;
    }
}
