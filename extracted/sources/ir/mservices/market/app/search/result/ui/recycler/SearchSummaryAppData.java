package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.vb7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchSummaryAppData extends SearchApplicationData implements MyketRecyclerData, wo2 {
    public static final int j = js6.search_app_desc_card;
    public final SearchSpecialAppDTO i;

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchSummaryAppData(SearchSpecialAppDTO searchSpecialAppDTO, String str, vb7 vb7Var, pv6 pv6Var) {
        js3.p(searchSpecialAppDTO, "app");
        js3.p(str, "itemType");
        js3.p(pv6Var, "installStateFlow");
        ApplicationDTO application = searchSpecialAppDTO.getApplication();
        js3.o(application, "getApplication(...)");
        super(application, searchSpecialAppDTO.getDownloadSummary(), searchSpecialAppDTO.getBgColor(), str, vb7Var, pv6Var);
        this.i = searchSpecialAppDTO;
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }
}
