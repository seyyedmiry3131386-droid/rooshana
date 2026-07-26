package androidx.compose.animation;

import defpackage.br9;
import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;

/* JADX INFO: loaded from: classes.dex */
final class m extends mx4 {
    public final l b;

    public m(l lVar) {
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && js3.i(this.b, ((m) obj).b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        n nVar = new n();
        nVar.o = this.b;
        return nVar;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        n nVar = (n) gx4Var;
        l lVar = nVar.o;
        l lVar2 = this.b;
        if (!js3.i(lVar2, lVar)) {
            br9.G(nVar, lVar2.b);
        }
        nVar.o = lVar2;
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.b + ')';
    }
}
