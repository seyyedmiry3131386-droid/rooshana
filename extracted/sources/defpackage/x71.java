package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class x71 extends ok4 {
    public final bb0 j;

    public x71(bb0 bb0Var) {
        this.j = bb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x71) && js3.i(this.j, ((x71) obj).j);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.j.a);
    }

    @Override // defpackage.ok4
    public final int k(int i, LayoutDirection layoutDirection, b96 b96Var) {
        return this.j.a(b96Var.b, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.j + ')';
    }
}
