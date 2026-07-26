package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zn9 extends r11 {
    public final r11 a;
    public final /* synthetic */ bo9 b;

    public zn9(bo9 bo9Var, r11 r11Var) {
        this.b = bo9Var;
        this.a = r11Var;
    }

    @Override // defpackage.r11
    public final void onBandwidthChanged(String str, g50 g50Var) {
        this.a.onBandwidthChanged(str, g50Var);
    }

    @Override // defpackage.r11
    public final void onConnectionInitiated(String str, q11 q11Var) {
        if (q11Var.c) {
            this.b.g(str);
        }
        this.a.onConnectionInitiated(str, q11Var);
    }

    @Override // defpackage.r11
    public final void onConnectionResult(String str, w11 w11Var) {
        if (!w11Var.a.u()) {
            this.b.h(str);
        }
        this.a.onConnectionResult(str, w11Var);
    }

    @Override // defpackage.r11
    public final void onDisconnected(String str) {
        this.b.h(str);
        this.a.onDisconnected(str);
    }
}
