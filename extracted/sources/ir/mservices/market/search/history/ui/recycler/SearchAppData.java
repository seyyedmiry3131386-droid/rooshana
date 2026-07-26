package ir.mservices.market.search.history.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.SearchSuggestionsAppDto;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAppData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.holder_search_app;
    public final SearchSuggestionsAppDto a;

    public SearchAppData(SearchSuggestionsAppDto searchSuggestionsAppDto) {
        this.a = searchSuggestionsAppDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !SearchAppData.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.a, ((SearchAppData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String uniqueId = this.a.getUniqueId();
        js3.o(uniqueId, "getUniqueId(...)");
        return uniqueId;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
