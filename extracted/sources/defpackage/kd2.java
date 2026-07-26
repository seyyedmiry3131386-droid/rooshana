package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class kd2 implements me9 {
    public final int a;

    public kd2(int i) {
        this.a = i;
    }

    @Override // defpackage.me9
    public final int a(el4 el4Var) {
        return 0;
    }

    @Override // defpackage.me9
    public final int b(el4 el4Var) {
        return this.a;
    }

    @Override // defpackage.me9
    public final int c(el4 el4Var, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // defpackage.me9
    public final int d(el4 el4Var, LayoutDirection layoutDirection) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd2) && this.a == ((kd2) obj).a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return dw1.k(this.a, ", right=0, bottom=0)", new StringBuilder("Insets(left=0, top="));
    }
}
