package defpackage;

import androidx.compose.foundation.relocation.a;

/* JADX INFO: loaded from: classes.dex */
final class sg0 extends mx4 {
    public final a b;

    public sg0(a aVar) {
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sg0) {
            return js3.i(this.b, ((sg0) obj).b);
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        tg0 tg0Var = new tg0();
        tg0Var.o = this.b;
        return tg0Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        tg0 tg0Var = (tg0) gx4Var;
        a aVar = tg0Var.o;
        if (aVar instanceof a) {
            aVar.a.k(tg0Var);
        }
        a aVar2 = this.b;
        if (aVar2 instanceof a) {
            aVar2.a.b(tg0Var);
        }
        tg0Var.o = aVar2;
    }
}
