package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class mf7 extends r implements f71 {
    public final g51 d;

    public mf7(g51 g51Var, w61 w61Var) {
        super(w61Var, true);
        this.d = g51Var;
    }

    @Override // kotlinx.coroutines.c
    public final boolean U() {
        return true;
    }

    @Override // defpackage.f71
    public final f71 getCallerFrame() {
        g51 g51Var = this.d;
        if (g51Var instanceof f71) {
            return (f71) g51Var;
        }
        return null;
    }

    @Override // kotlinx.coroutines.c
    public void q(Object obj) {
        dy3.K(ok4.I(this.d), js3.P(obj));
    }

    @Override // kotlinx.coroutines.c
    public void r(Object obj) {
        this.d.resumeWith(js3.P(obj));
    }

    public void n0() {
    }
}
