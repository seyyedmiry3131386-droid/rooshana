package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n08 extends f58 implements q08, wb5, u48 {
    public m08 b;

    @Override // defpackage.e58
    public final g58 a() {
        return this.b;
    }

    @Override // defpackage.f58, defpackage.e58
    public final g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        if (((m08) g58Var2).c == ((m08) g58Var3).c) {
            return g58Var2;
        }
        return null;
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.b = (m08) g58Var;
    }

    @Override // defpackage.q08
    public final t08 e() {
        return th0.t;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((m08) g08.u(this.b, this)).c;
    }

    public final void i(int i) {
        c08 c08VarJ;
        m08 m08Var = (m08) g08.h(this.b);
        if (m08Var.c != i) {
            m08 m08Var2 = this.b;
            synchronized (g08.c) {
                c08VarJ = g08.j();
                ((m08) g08.p(m08Var2, this, c08VarJ, m08Var)).c = i;
            }
            g08.o(c08VarJ, this);
        }
    }

    @Override // defpackage.wb5
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((m08) g08.h(this.b)).c + ")@" + hashCode();
    }
}
