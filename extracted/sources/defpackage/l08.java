package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class l08 extends f58 implements q08, wb5, u48 {
    public k08 b;

    @Override // defpackage.e58
    public final g58 a() {
        return this.b;
    }

    @Override // defpackage.f58, defpackage.e58
    public final g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        if (((k08) g58Var2).c == ((k08) g58Var3).c) {
            return g58Var2;
        }
        return null;
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.b = (k08) g58Var;
    }

    @Override // defpackage.q08
    public final t08 e() {
        return th0.t;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((k08) g08.u(this.b, this)).c;
    }

    public final void i(float f) {
        c08 c08VarJ;
        k08 k08Var = (k08) g08.h(this.b);
        if (k08Var.c == f) {
            return;
        }
        k08 k08Var2 = this.b;
        synchronized (g08.c) {
            c08VarJ = g08.j();
            ((k08) g08.p(k08Var2, this, c08VarJ, k08Var)).c = f;
        }
        g08.o(c08VarJ, this);
    }

    @Override // defpackage.wb5
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((k08) g08.h(this.b)).c + ")@" + hashCode();
    }
}
