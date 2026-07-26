package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareModelDto implements Serializable {

    @vo7("title")
    private final String title;

    @vo7("url")
    private final String url;

    public ShareModelDto(String str, String str2) {
        js3.p(str, "url");
        js3.p(str2, "title");
        this.url = str;
        this.title = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }
}
