package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c48 implements g51, f71 {
    public final g51 a;
    public final w61 b;

    public c48(g51 g51Var, w61 w61Var) {
        this.a = g51Var;
        this.b = w61Var;
    }

    @Override // defpackage.f71
    public final f71 getCallerFrame() {
        g51 g51Var = this.a;
        if (g51Var instanceof f71) {
            return (f71) g51Var;
        }
        return null;
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.b;
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
