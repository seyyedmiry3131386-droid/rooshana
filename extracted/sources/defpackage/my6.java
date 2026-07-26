package defpackage;

import androidx.compose.runtime.InvalidationResult;

/* JADX INFO: loaded from: classes.dex */
public final class my6 {
    public ny6 a;
    public int b;
    public ge c;
    public qp2 d;
    public int e;
    public ib5 f;
    public rb5 g;

    public my6(ny6 ny6Var) {
        this.a = ny6Var;
    }

    public static boolean a(ck1 ck1Var, rb5 rb5Var) {
        js3.n(ck1Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        t08 t08Var = ck1Var.c;
        if (t08Var == null) {
            t08Var = th0.t;
        }
        return !t08Var.l(ck1Var.i().f, rb5Var.g(ck1Var));
    }

    public final boolean b() {
        if (this.a != null) {
            ge geVar = this.c;
            if (geVar != null ? geVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final InvalidationResult c(Object obj) {
        InvalidationResult invalidationResultC;
        ny6 ny6Var = this.a;
        return (ny6Var == null || (invalidationResultC = ny6Var.c(this, obj)) == null) ? InvalidationResult.a : invalidationResultC;
    }

    public final void d() {
        ny6 ny6Var = this.a;
        if (ny6Var != null) {
            ny6Var.a();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void e(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
