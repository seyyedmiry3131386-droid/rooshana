package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.app.home.ui.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final class yb3 extends l06 {
    public kb3 m;
    public kb3 n;
    public kb3 o;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == HomeExtensionReviewData.e) {
            return new b(this.l, view);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        if (e(i) == HomeExtensionReviewData.e) {
            b bVar = (b) qg5Var;
            kb3 kb3Var = this.o;
            if (kb3Var == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            bVar.y = kb3Var;
            kb3 kb3Var2 = this.m;
            if (kb3Var2 == null) {
                js3.V("onReviewClickListener");
                throw null;
            }
            bVar.z = kb3Var2;
            kb3 kb3Var3 = this.n;
            if (kb3Var3 == null) {
                js3.V("onRatingClickListener");
                throw null;
            }
            bVar.A = kb3Var3;
        }
        super.l(qg5Var, i);
    }
}
