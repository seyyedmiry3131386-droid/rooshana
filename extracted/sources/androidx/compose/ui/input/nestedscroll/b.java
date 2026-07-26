package androidx.compose.ui.input.nestedscroll;

import defpackage.gx4;
import defpackage.hm5;
import defpackage.js3;
import defpackage.mx4;

/* JADX INFO: loaded from: classes.dex */
final class b extends mx4 {
    public final hm5 b;
    public final a c;

    public b(hm5 hm5Var, a aVar) {
        this.b = hm5Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return js3.i(bVar.b, this.b) && js3.i(bVar.c, this.c);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new d(this.b, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        a aVar = this.c;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        d dVar = (d) gx4Var;
        dVar.o = this.b;
        a aVar = dVar.p;
        if (aVar.a == dVar) {
            aVar.a = null;
        }
        a aVar2 = this.c;
        if (aVar2 == null) {
            dVar.p = new a();
        } else if (!aVar2.equals(aVar)) {
            dVar.p = aVar2;
        }
        if (dVar.n) {
            a aVar3 = dVar.p;
            aVar3.a = dVar;
            aVar3.b = null;
            dVar.q = null;
            aVar3.c = new NestedScrollNode$updateDispatcherFields$1(dVar);
            aVar3.d = dVar.o0();
        }
    }
}
