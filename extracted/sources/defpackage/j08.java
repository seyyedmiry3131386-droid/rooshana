package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j08 extends f58 implements u48, wb5, q08 {
    public i08 b;

    @Override // defpackage.e58
    public final g58 a() {
        return this.b;
    }

    @Override // defpackage.f58, defpackage.e58
    public final g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        if (((i08) g58Var2).c == ((i08) g58Var3).c) {
            return g58Var2;
        }
        return null;
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.b = (i08) g58Var;
    }

    @Override // defpackage.q08
    public final t08 e() {
        return th0.t;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return Double.valueOf(((i08) g08.u(this.b, this)).c);
    }

    @Override // defpackage.wb5
    public final void setValue(Object obj) {
        c08 c08VarJ;
        double dDoubleValue = ((Number) obj).doubleValue();
        i08 i08Var = (i08) g08.h(this.b);
        if (i08Var.c == dDoubleValue) {
            return;
        }
        i08 i08Var2 = this.b;
        synchronized (g08.c) {
            c08VarJ = g08.j();
            ((i08) g08.p(i08Var2, this, c08VarJ, i08Var)).c = dDoubleValue;
        }
        g08.o(c08VarJ, this);
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((i08) g08.h(this.b)).c + ")@" + hashCode();
    }
}
