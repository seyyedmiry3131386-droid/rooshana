package defpackage;

import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.app.home.ui.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kb3 implements og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb3 b;

    public /* synthetic */ kb3(lb3 lb3Var, int i) {
        this.a = i;
        this.b = lb3Var;
    }

    @Override // defpackage.og5
    public final void m(View view, qg5 qg5Var, Object obj) {
        b bVar = (b) qg5Var;
        HomeExtensionReviewData homeExtensionReviewData = (HomeExtensionReviewData) obj;
        switch (this.a) {
            case 0:
                js3.p(view, "view");
                js3.p(bVar, "viewHolder");
                js3.p(homeExtensionReviewData, "recyclerData");
                og5 og5Var = this.b.K;
                if (og5Var != null) {
                    og5Var.m(view, bVar, homeExtensionReviewData);
                }
                break;
            case 1:
                js3.p(view, "view");
                js3.p(bVar, "viewHolder");
                js3.p(homeExtensionReviewData, "recyclerData");
                og5 og5Var2 = this.b.L;
                if (og5Var2 != null) {
                    og5Var2.m(view, bVar, homeExtensionReviewData);
                }
                break;
            default:
                js3.p(view, "view");
                js3.p(bVar, "viewHolder");
                js3.p(homeExtensionReviewData, "recyclerData");
                og5 og5Var3 = this.b.M;
                if (og5Var3 != null) {
                    og5Var3.m(view, bVar, homeExtensionReviewData);
                }
                break;
        }
    }
}
