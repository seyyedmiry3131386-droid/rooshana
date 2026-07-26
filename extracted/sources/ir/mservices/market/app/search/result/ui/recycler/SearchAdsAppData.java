package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.vb7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAdsAppData extends SearchApplicationData implements MyketRecyclerData, wo2 {
    public static final int k = js6.search_ads_app;
    public final SearchSpecialAppDTO i;
    public final String j;

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchAdsAppData(SearchSpecialAppDTO searchSpecialAppDTO, String str, vb7 vb7Var, pv6 pv6Var) {
        js3.p(searchSpecialAppDTO, "app");
        js3.p(str, "itemType");
        js3.p(pv6Var, "installStateFlow");
        ApplicationDTO application = searchSpecialAppDTO.getApplication();
        js3.o(application, "getApplication(...)");
        super(application, searchSpecialAppDTO.getDownloadSummary(), searchSpecialAppDTO.getBgColor(), str, vb7Var, pv6Var);
        this.i = searchSpecialAppDTO;
        long j = is3.p + 1;
        is3.p = j;
        this.j = String.valueOf(j);
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return k;
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData, ir.mservices.market.app.common.recycler.AppData
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchAdsAppData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.search.result.ui.recycler.SearchAdsAppData");
        return js3.i(this.i, ((SearchAdsAppData) obj).i);
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData, ir.mservices.market.app.common.recycler.AppData, defpackage.g32
    public final String getUniqueId() {
        return this.j;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData, ir.mservices.market.app.common.recycler.AppData
    public final int hashCode() {
        return this.i.hashCode();
    }
}
