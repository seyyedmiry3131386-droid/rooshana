package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class du2 extends ep7 {
    public qu2 l;

    @Override // defpackage.ep7
    public final boolean g() {
        return b() == 0 || (b() + 1800000) - System.currentTimeMillis() <= 0;
    }

    @Override // defpackage.ep7
    public final void h() {
        qu2 qu2Var = this.l;
        if (qu2Var != null) {
            qu2Var.b(new ql4(22, this), 20000L);
        } else {
            js3.V("googleUtils");
            throw null;
        }
    }
}
