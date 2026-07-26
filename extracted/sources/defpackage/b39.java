package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class b39 implements me9 {
    public final String a;
    public final wb5 b;

    public b39(wo3 wo3Var, String str) {
        this.a = str;
        this.b = g.h(wo3Var);
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

    public final wo3 e() {
        return (wo3) ((s08) this.b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b39) {
            return js3.i(e(), ((b39) obj).e());
        }
        return false;
    }

    public final void f(wo3 wo3Var) {
        ((s08) this.b).setValue(wo3Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return dw1.q(sb, e().d, ')');
    }
}
