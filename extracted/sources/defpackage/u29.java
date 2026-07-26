package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class u29 {
    public dp2 a;

    public abstract void a(hv1 hv1Var);

    public dp2 b() {
        return this.a;
    }

    public final void c() {
        dp2 dp2VarB = b();
        if (dp2VarB != null) {
            dp2VarB.invoke(this);
        }
    }

    public void d(dp2 dp2Var) {
        this.a = dp2Var;
    }
}
