package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryData;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.mservices.market.views.HorizontalRecyclerView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class wc3 extends a {
    public final og5 K;
    public final og5 L;
    public final og5 M;
    public final og5 N;
    public i13 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        this.K = og5Var;
        this.L = og5Var2;
        this.M = og5Var3;
        this.N = og5Var4;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new vc3(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(HorizontalSummaryData horizontalSummaryData) {
        js3.p(horizontalSummaryData, "data");
        super.s(horizontalSummaryData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var = this.K;
        js3.p(og5Var, "<set-?>");
        ((vc3) l06Var).m = og5Var;
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var2 = this.L;
        js3.p(og5Var2, "<set-?>");
        ((vc3) l06Var2).n = og5Var2;
        l06 l06Var3 = this.C;
        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var3 = this.M;
        js3.p(og5Var3, "<set-?>");
        ((vc3) l06Var3).o = og5Var3;
        l06 l06Var4 = this.C;
        js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryAdapter");
        og5 og5Var4 = this.N;
        js3.p(og5Var4, "<set-?>");
        ((vc3) l06Var4).p = og5Var4;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void t(HorizontalSummaryData horizontalSummaryData) {
        js3.p(horizontalSummaryData, "data");
        super.t(horizontalSummaryData);
        View view = this.a;
        boolean zN0 = yq2.n0(view.getContext());
        HorizontalRecyclerView horizontalRecyclerView = this.y;
        if (!zN0 && horizontalSummaryData.g && horizontalSummaryData.h == AppDownloadFlowStatus.g) {
            i13 i13Var = this.O;
            if (i13Var == null) {
                js3.V("binding");
                throw null;
            }
            i13Var.v.setBackgroundColor(sj8.b().N);
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = sj8.b().l;
            ea7Var.d = view.getResources().getDimensionPixelSize(pq6.default_curve_layouts_radius);
            ea7Var.b();
            ea7Var.e = view.getResources().getDimensionPixelSize(pq6.default_curve_layouts_radius);
            ea7Var.b();
            ea7Var.g = 0;
            ea7Var.b();
            ea7Var.f = 0;
            ea7Var.b();
            ea7Var.h = 0;
            horizontalRecyclerView.setBackground(ea7Var.a());
        } else {
            i13 i13Var2 = this.O;
            if (i13Var2 == null) {
                js3.V("binding");
                throw null;
            }
            i13Var2.v.setBackgroundColor(sj8.b().l);
        }
        horizontalRecyclerView.setVerticalScrollBarEnabled(false);
        horizontalRecyclerView.setHorizontalFadingEdgeEnabled(false);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof i13) {
            this.O = (i13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((HorizontalSummaryData) nestedRecyclerData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_m);
        return new PaddingLayoutManager$Padding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }
}
