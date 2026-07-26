package defpackage;

import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class bb3 extends eb3 {
    public final og5 K;

    public bb3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var) {
        super(view, graphicUtils$Dimension, z);
        this.K = og5Var;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        HomeBannerAppsData homeBannerAppsData = (HomeBannerAppsData) nestedRecyclerData;
        js3.p(homeBannerAppsData, "data");
        super.s(homeBannerAppsData);
        ab3 ab3VarJ = J();
        og5 og5Var = this.K;
        js3.p(og5Var, "<set-?>");
        ab3VarJ.n = og5Var;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        HomeBannerAppsData homeBannerAppsData = (HomeBannerAppsData) myketRecyclerData;
        js3.p(homeBannerAppsData, "data");
        super.s(homeBannerAppsData);
        ab3 ab3VarJ = J();
        og5 og5Var = this.K;
        js3.p(og5Var, "<set-?>");
        ab3VarJ.n = og5Var;
    }
}
