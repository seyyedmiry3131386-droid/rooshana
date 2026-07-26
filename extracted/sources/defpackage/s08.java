package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s08 extends f58 implements q08 {
    public final t08 b;
    public r08 c;

    public s08(Object obj, t08 t08Var) {
        this.b = t08Var;
        c08 c08VarJ = g08.j();
        r08 r08Var = new r08(c08VarJ.g(), obj);
        if (!(c08VarJ instanceof vt2)) {
            r08Var.b = new r08(1, obj);
        }
        this.c = r08Var;
    }

    @Override // defpackage.e58
    public final g58 a() {
        return this.c;
    }

    @Override // defpackage.f58, defpackage.e58
    public final g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        if (this.b.l(((r08) g58Var2).c, ((r08) g58Var3).c)) {
            return g58Var2;
        }
        return null;
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.c = (r08) g58Var;
    }

    @Override // defpackage.q08
    public final t08 e() {
        return this.b;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return ((r08) g08.u(this.c, this)).c;
    }

    @Override // defpackage.wb5
    public final void setValue(Object obj) {
        c08 c08VarJ;
        r08 r08Var = (r08) g08.h(this.c);
        if (this.b.l(r08Var.c, obj)) {
            return;
        }
        r08 r08Var2 = this.c;
        synchronized (g08.c) {
            c08VarJ = g08.j();
            ((r08) g08.p(r08Var2, this, c08VarJ, r08Var)).c = obj;
        }
        g08.o(c08VarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((r08) g08.h(this.c)).c + ")@" + hashCode();
    }
}
