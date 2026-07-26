package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px9 extends xe1 {
    public final yr9 e;

    public /* synthetic */ px9(yr9 yr9Var) {
        super(false, (String) null, (Exception) null);
        this.e = yr9Var;
    }

    @Override // defpackage.xe1
    public final void y() {
        try {
            this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
