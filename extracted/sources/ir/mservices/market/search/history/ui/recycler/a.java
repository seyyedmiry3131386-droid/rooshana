package ir.mservices.market.search.history.ui.recycler;

import android.view.View;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d16;
import defpackage.hi7;
import defpackage.js3;
import defpackage.l06;
import defpackage.n35;
import defpackage.pq6;
import defpackage.rj7;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.views.HorizontalRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ir.mservices.market.version2.ui.recycler.a {
    public hi7 K;
    public n35 L;

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new rj7(this.K);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void t(SearchHistoryHorizontalTagsData searchHistoryHorizontalTagsData) {
        js3.p(searchHistoryHorizontalTagsData, "data");
        super.t(searchHistoryHorizontalTagsData);
        n35 n35Var = this.L;
        HorizontalRecyclerView horizontalRecyclerView = this.y;
        if (n35Var != null) {
            horizontalRecyclerView.g0(n35Var);
        }
        n35 n35Var2 = new n35(searchHistoryHorizontalTagsData, this, 2);
        horizontalRecyclerView.j(n35Var2);
        this.L = n35Var2;
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new SearchHistoryHorizontalTagsViewHolder$onBindView$4(this, searchHistoryHorizontalTagsData, null), 3);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final d16 x(NestedRecyclerData nestedRecyclerData) {
        js3.p((SearchHistoryHorizontalTagsData) nestedRecyclerData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_m);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int i = dimensionPixelSize / 2;
        return new d16(0, 0, dimensionPixelSize2, dimensionPixelSize2, i, i, 1, true, this.x);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((SearchHistoryHorizontalTagsData) nestedRecyclerData, "data");
        return null;
    }
}
