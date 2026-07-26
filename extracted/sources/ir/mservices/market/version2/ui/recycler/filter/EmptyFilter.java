package ir.mservices.market.version2.ui.recycler.filter;

import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class EmptyFilter extends GeneralFilter {
    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        Filter filter = this.a;
        return filter != null && filter.u(myketRecyclerData);
    }
}
