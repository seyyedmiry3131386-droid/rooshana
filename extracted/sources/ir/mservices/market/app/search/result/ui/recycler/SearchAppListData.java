package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.to2;
import defpackage.wo2;
import ir.mservices.market.app.common.recycler.HomeNestedAppsRowData;
import ir.mservices.market.version2.webapi.responsedto.SearchAppListDto;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAppListData extends HomeNestedAppsRowData implements wo2, to2 {
    public final SearchAppListDto q;

    public SearchAppListData(SearchAppListDto searchAppListDto, bz6 bz6Var, dp2 dp2Var) {
        super(searchAppListDto, bz6Var, dp2Var);
        this.q = searchAppListDto;
    }
}
