package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class of7 extends k79 {
    public lf7 b;

    @Override // defpackage.k79
    public final void d() {
        lf7 lf7Var = this.b;
        if (lf7Var != null && !lf7Var.j) {
            lf7Var.e.a.t("Closing scope " + this.b);
            lf7Var.a();
        }
        this.b = null;
    }
}
