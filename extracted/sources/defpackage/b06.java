package defpackage;

import androidx.paging.n;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes.dex */
public final class b06 implements dp2 {
    public boolean a = true;
    public final /* synthetic */ a b;

    public b06(a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        aw0 aw0Var = (aw0) obj;
        js3.p(aw0Var, "loadStates");
        if (this.a) {
            this.a = false;
        } else if (aw0Var.d.a instanceof ia4) {
            a aVar = this.b;
            n.x(aVar);
            aVar.B(this);
        }
        return tx8.a;
    }
}
