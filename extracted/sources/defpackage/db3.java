package defpackage;

import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class db3 extends eb3 {
    public final og5 K;
    public final s82 L;
    public final og5 M;

    public db3(s82 s82Var, og5 og5Var, og5 og5Var2, View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z);
        this.K = og5Var;
        this.L = s82Var;
        this.M = og5Var2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void s(HomeBannerAppsData homeBannerAppsData) {
        js3.p(homeBannerAppsData, "data");
        super.s(homeBannerAppsData);
        ab3 ab3VarJ = J();
        og5 og5Var = this.K;
        js3.p(og5Var, "<set-?>");
        ab3VarJ.p = og5Var;
        ab3 ab3VarJ2 = J();
        og5 og5Var2 = this.M;
        js3.p(og5Var2, "<set-?>");
        ab3VarJ2.q = og5Var2;
        ab3 ab3VarJ3 = J();
        s82 s82Var = this.L;
        js3.p(s82Var, "<set-?>");
        ab3VarJ3.o = s82Var;
    }
}
