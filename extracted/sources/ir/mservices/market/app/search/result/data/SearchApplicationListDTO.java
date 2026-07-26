package ir.mservices.market.app.search.result.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchApplicationListDTO implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("googlePlaySearch")
    private final boolean googlePlaySearch;

    @vo7("googleSearchConfigDto")
    private final GoogleSearchConfigDto googleSearchConfig;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("items")
    private final List<SearchItemDto> items;

    public SearchApplicationListDTO(boolean z, List<SearchItemDto> list, boolean z2, List<String> list2, GoogleSearchConfigDto googleSearchConfigDto) {
        js3.p(list, "items");
        this.eol = z;
        this.items = list;
        this.googlePlaySearch = z2;
        this.ignoreConditions = list2;
        this.googleSearchConfig = googleSearchConfigDto;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final boolean getGooglePlaySearch() {
        return this.googlePlaySearch;
    }

    public final GoogleSearchConfigDto getGoogleSearchConfig() {
        return this.googleSearchConfig;
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    public final List<SearchItemDto> getItems() {
        return this.items;
    }
}
