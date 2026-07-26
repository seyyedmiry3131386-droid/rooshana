package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.fm3;
import defpackage.pv1;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class IncompatibleFilter extends GeneralFilter {
    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        pv1 pv1VarA;
        if ((myketRecyclerData instanceof fm3) && (pv1VarA = ((fm3) myketRecyclerData).a()) != null && pv1VarA.b) {
            return true;
        }
        Filter filter = this.a;
        return filter != null && filter.u(myketRecyclerData);
    }
}
