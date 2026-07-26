package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class p08 extends f58 implements q08, wb5, u48 {
    public o08 b;

    @Override // defpackage.e58
    public final g58 a() {
        return this.b;
    }

    @Override // defpackage.f58, defpackage.e58
    public final g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        if (((o08) g58Var2).c == ((o08) g58Var3).c) {
            return g58Var2;
        }
        return null;
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.b = (o08) g58Var;
    }

    @Override // defpackage.q08
    public final t08 e() {
        return th0.t;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((o08) g08.u(this.b, this)).c;
    }

    public final void i(long j) {
        c08 c08VarJ;
        o08 o08Var = (o08) g08.h(this.b);
        if (o08Var.c != j) {
            o08 o08Var2 = this.b;
            synchronized (g08.c) {
                c08VarJ = g08.j();
                ((o08) g08.p(o08Var2, this, c08VarJ, o08Var)).c = j;
            }
            g08.o(c08VarJ, this);
        }
    }

    @Override // defpackage.wb5
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((o08) g08.h(this.b)).c + ")@" + hashCode();
    }
}
