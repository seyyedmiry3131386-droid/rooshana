package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class qx8 implements me9 {
    public final me9 a;
    public final me9 b;

    public qx8(me9 me9Var, me9 me9Var2) {
        this.a = me9Var;
        this.b = me9Var2;
    }

    @Override // defpackage.me9
    public final int a(el4 el4Var) {
        return Math.max(this.a.a(el4Var), this.b.a(el4Var));
    }

    @Override // defpackage.me9
    public final int b(el4 el4Var) {
        return Math.max(this.a.b(el4Var), this.b.b(el4Var));
    }

    @Override // defpackage.me9
    public final int c(el4 el4Var, LayoutDirection layoutDirection) {
        return Math.max(this.a.c(el4Var, layoutDirection), this.b.c(el4Var, layoutDirection));
    }

    @Override // defpackage.me9
    public final int d(el4 el4Var, LayoutDirection layoutDirection) {
        return Math.max(this.a.d(el4Var, layoutDirection), this.b.d(el4Var, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx8)) {
            return false;
        }
        qx8 qx8Var = (qx8) obj;
        return js3.i(qx8Var.a, this.a) && js3.i(qx8Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
