package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qo3 extends gx4 implements fs8 {
    public me9 o;
    public me9 p;

    public qo3() {
        kd2 kd2Var = s7.i;
        this.o = kd2Var;
        this.p = kd2Var;
    }

    public abstract qx8 C0(me9 me9Var);

    public void D0() {
        this.p = C0(this.o);
        cc7.H(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new po3(this, 0));
    }

    @Override // defpackage.fs8
    public final Object l() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.gx4
    public void s0() {
        cc7.F(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new po3(this, 1));
        D0();
    }

    @Override // defpackage.gx4
    public void u0() {
        this.p = this.o;
        cc7.H(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new po3(this, 0));
    }

    @Override // defpackage.gx4
    public final void w0() {
        this.o = s7.i;
    }
}
