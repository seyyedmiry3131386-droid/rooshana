package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o79 implements c24 {
    public final ps0 a;
    public final bp2 b;
    public final bp2 c;
    public final bp2 d;
    public k79 e;

    public o79(ps0 ps0Var, bp2 bp2Var, bp2 bp2Var2, bp2 bp2Var3) {
        this.a = ps0Var;
        this.b = bp2Var;
        this.c = bp2Var2;
        this.d = bp2Var3;
    }

    @Override // defpackage.c24
    public final Object getValue() {
        k79 k79Var = this.e;
        if (k79Var != null) {
            return k79Var;
        }
        u79 u79Var = (u79) this.b.invoke();
        q79 q79Var = (q79) this.c.invoke();
        l71 l71Var = (l71) this.d.invoke();
        js3.p(u79Var, "store");
        js3.p(q79Var, "factory");
        js3.p(l71Var, "extras");
        o77 o77Var = new o77(u79Var, q79Var, l71Var);
        ps0 ps0Var = this.a;
        String strB = ps0Var.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        k79 k79VarU = o77Var.u(ps0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.e = k79VarU;
        return k79VarU;
    }

    @Override // defpackage.c24
    public final boolean isInitialized() {
        return this.e != null;
    }
}
