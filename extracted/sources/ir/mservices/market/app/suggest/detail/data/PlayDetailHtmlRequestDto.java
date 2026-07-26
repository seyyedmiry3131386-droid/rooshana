package ir.mservices.market.app.suggest.detail.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayDetailHtmlRequestDto implements RequestDTO {

    @vo7("htmlDetails")
    private final String htmlDetails;

    public PlayDetailHtmlRequestDto(String str) {
        js3.p(str, "htmlDetails");
        this.htmlDetails = str;
    }

    public final String getHtmlDetails() {
        return this.htmlDetails;
    }
}
