package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class wi implements me9 {
    public final int a;
    public final String b;
    public final wb5 c = g.h(no3.e);
    public final wb5 d = g.h(Boolean.TRUE);

    public wi(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.me9
    public final int a(el4 el4Var) {
        return e().d;
    }

    @Override // defpackage.me9
    public final int b(el4 el4Var) {
        return e().b;
    }

    @Override // defpackage.me9
    public final int c(el4 el4Var, LayoutDirection layoutDirection) {
        return e().c;
    }

    @Override // defpackage.me9
    public final int d(el4 el4Var, LayoutDirection layoutDirection) {
        return e().a;
    }

    public final no3 e() {
        return (no3) ((s08) this.c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wi) {
            return this.a == ((wi) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        ((s08) this.d).setValue(Boolean.valueOf(z));
    }

    public final void g(lf9 lf9Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            ((s08) this.c).setValue(lf9Var.a.g(i2));
            f(lf9Var.a.q(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return dw1.q(sb, e().d, ')');
    }
}
