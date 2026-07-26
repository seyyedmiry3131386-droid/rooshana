package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.a55;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieRecommendationFilter extends GeneralFilter {
    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        a55 a55Var = myketRecyclerData instanceof a55 ? (a55) myketRecyclerData : null;
        if (a55Var != null ? a55Var.a().b : false) {
            return true;
        }
        Filter filter = this.a;
        return filter != null ? filter.u(myketRecyclerData) : false;
    }
}
