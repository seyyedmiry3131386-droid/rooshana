package ir.mservices.market.app.search.result.ui.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.d16;
import defpackage.f70;
import defpackage.f88;
import defpackage.jq;
import defpackage.js3;
import defpackage.k50;
import defpackage.ml9;
import defpackage.og5;
import defpackage.ox5;
import defpackage.pq6;
import defpackage.rr6;
import defpackage.t61;
import defpackage.uz6;
import defpackage.v50;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends a {
    public static final /* synthetic */ int R = 0;
    public final f70 G;
    public k50 H;
    public d04 I;
    public RecyclerView J;
    public ox5 K;
    public d16 L;
    public uz6 M;
    public final MyketGridLayoutManager N;
    public int O;
    public final int P;
    public final int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, ml9 ml9Var, og5 og5Var, GraphicUtils$Dimension graphicUtils$Dimension, ir.mservices.market.app.search.result.ui.a aVar, int i) {
        super(view, ml9Var, og5Var);
        aVar = (i & 128) != 0 ? null : aVar;
        js3.p(graphicUtils$Dimension, "dimension");
        this.G = aVar;
        view.getContext();
        MyketGridLayoutManager myketGridLayoutManager = new MyketGridLayoutManager(1, 0);
        myketGridLayoutManager.Q = A();
        this.N = myketGridLayoutManager;
        this.P = view.getResources().getDimensionPixelSize(pq6.space_8);
        this.Q = t61.e(view.getResources(), pq6.horizontal_space_outer, 2, graphicUtils$Dimension.a);
        new ArrayList();
    }

    public abstract PaddingLayoutManager$Padding A();

    public final RecyclerView B() {
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            return recyclerView;
        }
        js3.V("recyclerView");
        throw null;
    }

    public abstract ArrayList C(BaseSearchScreenshotData baseSearchScreenshotData, int i);

    @Override // ir.mservices.market.app.search.result.ui.recycler.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void s(BaseSearchScreenshotData baseSearchScreenshotData) {
        js3.p(baseSearchScreenshotData, "data");
        super.s(baseSearchScreenshotData);
        this.K = new ox5(baseSearchScreenshotData.d(), baseSearchScreenshotData.e(), this.G, new v50(this, baseSearchScreenshotData, 0), new v50(this, baseSearchScreenshotData, 1));
        RecyclerView recyclerViewB = B();
        recyclerViewB.setAdapter(this.K);
        k layoutManager = recyclerViewB.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.g0(baseSearchScreenshotData.j);
        }
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new BaseAppScreenShotViewHolder$onAttach$4(null, this, baseSearchScreenshotData), 3);
        if (!f88.n0(baseSearchScreenshotData.e())) {
            bt2.G(cc7.q(view), null, null, new BaseAppScreenShotViewHolder$onAttach$5(null, this, baseSearchScreenshotData), 3);
        }
        uz6 jqVar = this.M;
        if (jqVar == null) {
            jqVar = new jq(1);
            B().j(jqVar);
        }
        this.M = jqVar;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void t(BaseSearchScreenshotData baseSearchScreenshotData) {
        js3.p(baseSearchScreenshotData, "app");
        super.t(baseSearchScreenshotData);
        int i = rr6.recycler_view;
        View view = this.a;
        View viewFindViewById = view.findViewById(i);
        js3.o(viewFindViewById, "findViewById(...)");
        this.J = (RecyclerView) viewFindViewById;
        this.O = view.getResources().getDimensionPixelSize(pq6.screenshot_height);
        B().getLayoutParams().height = this.O;
        B().setVerticalScrollBarEnabled(false);
        B().setHorizontalScrollBarEnabled(false);
        RecyclerView recyclerViewB = B();
        recyclerViewB.setNestedScrollingEnabled(false);
        recyclerViewB.setLayoutManager(this.N);
        uz6 uz6Var = this.M;
        if (uz6Var != null) {
            B().g0(uz6Var);
        }
        uz6 jqVar = this.M;
        if (jqVar == null) {
            jqVar = new jq(1);
            B().j(jqVar);
        }
        this.M = jqVar;
        d16 d16Var = this.L;
        if (d16Var != null) {
            B().f0(d16Var);
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
            int i2 = this.P / 2;
            d04 d04Var = this.I;
            if (d04Var == null) {
                js3.V("languageHelper");
                throw null;
            }
            d16 d16Var2 = new d16(0, dimensionPixelSize, i2, i2, 1, true, d04Var.f());
            B().i(d16Var2);
            this.L = d16Var2;
        }
    }

    public final void F() {
        View childAt = B().getChildAt(0);
        if (childAt != null) {
            o oVarN = B().N(childAt);
            h hVar = oVarN instanceof h ? (h) oVarN : null;
            if (hVar != null) {
                hVar.x();
            }
        }
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        BaseSearchScreenshotData baseSearchScreenshotData = (BaseSearchScreenshotData) myketRecyclerData;
        js3.p(baseSearchScreenshotData, "data");
        k layoutManager = B().getLayoutManager();
        baseSearchScreenshotData.j = layoutManager != null ? layoutManager.h0() : null;
        uz6 uz6Var = this.M;
        if (uz6Var != null) {
            B().g0(uz6Var);
            this.M = null;
        }
        F();
        this.K = null;
        B().setAdapter(null);
    }
}
