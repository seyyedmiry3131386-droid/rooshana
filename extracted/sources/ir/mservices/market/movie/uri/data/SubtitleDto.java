package ir.mservices.market.movie.uri.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleDto implements Serializable {

    @vo7("ext")
    private final String ext;

    @vo7("setAsDefault")
    private final Boolean setAsDefault;

    @vo7("title")
    private final String title;

    @vo7("url")
    private final String url;

    public SubtitleDto(String str, String str2, String str3, Boolean bool) {
        js3.p(str, "title");
        js3.p(str2, "url");
        js3.p(str3, "ext");
        this.title = str;
        this.url = str2;
        this.ext = str3;
        this.setAsDefault = bool;
    }

    public final String getExt() {
        return this.ext;
    }

    public final Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }
}
