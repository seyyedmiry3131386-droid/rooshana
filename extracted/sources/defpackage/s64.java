package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class s64 implements me9 {
    public final me9 a;
    public final int b;

    public s64(me9 me9Var, int i) {
        this.a = me9Var;
        this.b = i;
    }

    @Override // defpackage.me9
    public final int a(el4 el4Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(el4Var);
        }
        return 0;
    }

    @Override // defpackage.me9
    public final int b(el4 el4Var) {
        return this.a.b(el4Var);
    }

    @Override // defpackage.me9
    public final int c(el4 el4Var, LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        return 0;
    }

    @Override // defpackage.me9
    public final int d(el4 el4Var, LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s64)) {
            return false;
        }
        s64 s64Var = (s64) obj;
        return js3.i(this.a, s64Var.a) && this.b == s64Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = xa7.d;
        if ((i & i2) == i2) {
            xa7.h(sb3, "Start");
        }
        int i3 = xa7.f;
        if ((i & i3) == i3) {
            xa7.h(sb3, "Left");
        }
        xa7.h(sb3, "Top");
        int i4 = xa7.e;
        if ((i & i4) == i4) {
            xa7.h(sb3, "End");
        }
        int i5 = xa7.g;
        if ((i & i5) == i5) {
            xa7.h(sb3, "Right");
        }
        if ((i & 32) == 32) {
            xa7.h(sb3, "Bottom");
        }
        String string = sb3.toString();
        js3.o(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
