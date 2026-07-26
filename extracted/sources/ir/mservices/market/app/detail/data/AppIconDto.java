package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppIconDto implements Serializable {

    @vo7("highResUrl")
    private final String highResUrl;

    @vo7("url")
    private final String url;

    public AppIconDto(String str, String str2) {
        js3.p(str, "url");
        this.url = str;
        this.highResUrl = str2;
    }

    public final String getHighResUrl() {
        return this.highResUrl;
    }

    public final String getUrl() {
        return this.url;
    }
}
