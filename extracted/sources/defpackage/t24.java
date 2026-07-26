package defpackage;

import androidx.compose.ui.node.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t24 extends gx4 implements gv1 {
    public v24 o;

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        ArrayList arrayList = (ArrayList) this.o.h;
        if (arrayList.size() <= 0) {
            iVar.a();
        } else {
            dw1.x(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t24) && js3.i(this.o, ((t24) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // defpackage.gx4
    public final void s0() {
        this.o.getClass();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.o + ')';
    }

    @Override // defpackage.gx4
    public final void u0() {
        v24 v24Var = this.o;
        v24Var.d();
        v24Var.b = null;
    }
}
