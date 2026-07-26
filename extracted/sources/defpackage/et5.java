package defpackage;

import androidx.compose.ui.layout.i;

/* JADX INFO: loaded from: classes.dex */
final class et5 extends mx4 {
    public final bp2 b;

    public et5(bp2 bp2Var) {
        this.b = bp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && et5.class == obj.getClass() && this.b == ((et5) obj).b;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new i(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + dw1.g(1.0f, ((int) 0) * 31, 961);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        i iVar = (i) gx4Var;
        iVar.getClass();
        iVar.o = this.b;
        j37 j37Var = iVar.s;
        if (j37Var != null) {
            iVar.C0(j37Var);
        }
    }
}
