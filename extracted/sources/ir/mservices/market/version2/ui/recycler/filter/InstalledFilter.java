package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.dp3;
import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class InstalledFilter extends GeneralFilter {
    public transient dp3 b;

    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        Filter filter;
        return (myketRecyclerData instanceof HomeExtensionReviewData ? this.b.G(((HomeExtensionReviewData) myketRecyclerData).a.getPackageName()) ^ true : false) || ((filter = this.a) != null && filter.u(myketRecyclerData));
    }
}
