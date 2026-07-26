package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.rv6;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiSelectFilter extends GeneralFilter {
    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        rv6 rv6Var;
        MultiSelectRecyclerData multiSelectRecyclerData = myketRecyclerData instanceof MultiSelectRecyclerData ? (MultiSelectRecyclerData) myketRecyclerData : null;
        if ((multiSelectRecyclerData == null || (rv6Var = multiSelectRecyclerData.c) == null) ? false : ((Boolean) rv6Var.a.getValue()).booleanValue()) {
            return true;
        }
        Filter filter = this.a;
        return filter != null ? filter.u(myketRecyclerData) : false;
    }
}
