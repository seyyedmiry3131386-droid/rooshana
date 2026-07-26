package defpackage;

import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class cb3 extends eb3 {
    public final /* synthetic */ int K = 1;
    public final og5 L;
    public final Object M;

    public cb3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, s82 s82Var) {
        super(view, graphicUtils$Dimension, z);
        this.L = og5Var;
        this.M = s82Var;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                K((HomeBannerAppsData) nestedRecyclerData);
                break;
            default:
                HomeBannerAppsData homeBannerAppsData = (HomeBannerAppsData) nestedRecyclerData;
                js3.p(homeBannerAppsData, "data");
                super.s(homeBannerAppsData);
                ab3 ab3VarJ = J();
                og5 og5Var = this.L;
                js3.p(og5Var, "<set-?>");
                ab3VarJ.p = og5Var;
                ab3 ab3VarJ2 = J();
                og5 og5Var2 = (og5) this.M;
                js3.p(og5Var2, "<set-?>");
                ab3VarJ2.q = og5Var2;
                break;
        }
    }

    public void K(HomeBannerAppsData homeBannerAppsData) {
        js3.p(homeBannerAppsData, "data");
        super.s(homeBannerAppsData);
        ab3 ab3VarJ = J();
        og5 og5Var = this.L;
        js3.p(og5Var, "<set-?>");
        ab3VarJ.n = og5Var;
        ab3 ab3VarJ2 = J();
        s82 s82Var = (s82) this.M;
        js3.p(s82Var, "<set-?>");
        ab3VarJ2.m = s82Var;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        switch (this.K) {
            case 0:
                K((HomeBannerAppsData) myketRecyclerData);
                break;
            default:
                HomeBannerAppsData homeBannerAppsData = (HomeBannerAppsData) myketRecyclerData;
                js3.p(homeBannerAppsData, "data");
                super.s(homeBannerAppsData);
                ab3 ab3VarJ = J();
                og5 og5Var = this.L;
                js3.p(og5Var, "<set-?>");
                ab3VarJ.p = og5Var;
                ab3 ab3VarJ2 = J();
                og5 og5Var2 = (og5) this.M;
                js3.p(og5Var2, "<set-?>");
                ab3VarJ2.q = og5Var2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2) {
        super(view, graphicUtils$Dimension, z);
        js3.p(og5Var2, "onAppClickListener");
        this.L = og5Var;
        this.M = og5Var2;
    }
}
