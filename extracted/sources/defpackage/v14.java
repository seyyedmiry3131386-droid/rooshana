package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class v14 implements v98 {
    public final za5 a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Object c;

    public v14(g gVar, Object obj) {
        this.b = gVar;
        this.c = obj;
        int[] iArr = yq3.a;
        this.a = new za5();
    }

    @Override // defpackage.v98
    public final void a() {
        g.c(this.b, this.c);
    }

    @Override // defpackage.v98
    public final int b() {
        h hVar = (h) this.b.j.g(this.c);
        if (hVar != null) {
            return ((zb5) ((kb5) hVar.q()).b).c;
        }
        return 0;
    }

    @Override // defpackage.v98
    public final void c(int i, long j) {
        g gVar = this.b;
        h hVar = (h) gVar.j.g(this.c);
        if (hVar == null || !hVar.U()) {
            return;
        }
        int i2 = ((zb5) ((kb5) hVar.q()).b).c;
        if (i < 0 || i >= i2) {
            rn3.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (hVar.V()) {
            rn3.a("Pre-measure called on node that is not placed");
        }
        h hVar2 = gVar.a;
        hVar2.s = true;
        ((AndroidComposeView) m14.a(hVar)).u((h) ((kb5) hVar.q()).get(i), j);
        hVar2.s = false;
        this.a.a(i);
    }

    @Override // defpackage.v98
    public final void d(lj6 lj6Var) {
        z4 z4Var;
        gx4 gx4Var;
        h hVar = (h) this.b.j.g(this.c);
        if (hVar == null || (z4Var = hVar.H) == null || (gx4Var = (gx4) z4Var.g) == null) {
            return;
        }
        cc7.H(gx4Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", lj6Var);
    }
}
