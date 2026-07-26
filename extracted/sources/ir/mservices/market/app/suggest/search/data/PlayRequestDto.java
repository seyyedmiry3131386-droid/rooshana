package ir.mservices.market.app.suggest.search.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayRequestDto implements RequestDTO {

    @vo7("htmlDetails")
    private final String htmlDetails;

    @vo7("page")
    private final int page;

    @vo7("query")
    private final String query;

    public PlayRequestDto(String str, String str2, int i) {
        js3.p(str, "htmlDetails");
        js3.p(str2, "query");
        this.htmlDetails = str;
        this.query = str2;
        this.page = i;
    }

    public final String getHtmlDetails() {
        return this.htmlDetails;
    }

    public final int getPage() {
        return this.page;
    }

    public final String getQuery() {
        return this.query;
    }
}
