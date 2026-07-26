package defpackage;

import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeVideoListData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class ic3 extends e70 {
    public final s82 N;

    public ic3(s82 s82Var, og5 og5Var, og5 og5Var2, View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z, og5Var, og5Var2);
        this.N = s82Var;
    }

    @Override // defpackage.e70, ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(HomeVideoListData homeVideoListData) {
        js3.p(homeVideoListData, "data");
        super.s(homeVideoListData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.home.VideoListDataAdapter");
        s82 s82Var = this.N;
        js3.p(s82Var, "<set-?>");
        ((o59) l06Var).m = s82Var;
    }
}
