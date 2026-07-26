package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class w71 extends ok4 {
    public final pd j;

    public w71(ab0 ab0Var) {
        this.j = ab0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w71) && js3.i(this.j, ((w71) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // defpackage.ok4
    public final int k(int i, LayoutDirection layoutDirection, b96 b96Var) {
        return this.j.a(b96Var.a, i, layoutDirection);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.j + ')';
    }
}
