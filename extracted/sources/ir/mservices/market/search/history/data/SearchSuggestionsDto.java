package ir.mservices.market.search.history.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.SearchSuggestionsAppDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchSuggestionsDto implements Serializable {

    @vo7("apps")
    private final List<SearchSuggestionsAppDto> apps;

    @vo7("terms")
    private final List<String> terms;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSuggestionsDto(List<? extends SearchSuggestionsAppDto> list, List<String> list2) {
        js3.p(list2, "terms");
        this.apps = list;
        this.terms = list2;
    }

    public final List<SearchSuggestionsAppDto> getApps() {
        return this.apps;
    }

    public final List<String> getTerms() {
        return this.terms;
    }
}
