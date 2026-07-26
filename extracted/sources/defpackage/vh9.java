package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh9 implements v40 {
    public final /* synthetic */ ku2 a;

    public vh9(ku2 ku2Var) {
        this.a = ku2Var;
    }

    @Override // defpackage.v40
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        ku2 ku2Var = this.a;
        ku2Var.m.sendMessage(ku2Var.m.obtainMessage(1, boolValueOf));
    }
}
