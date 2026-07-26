package ir.mservices.market.app.search.result.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleSearchConfigDto implements Serializable {

    @vo7("initUrl")
    private final String initUrl;

    @vo7("webViewEnable")
    private final boolean webViewEnable;

    public GoogleSearchConfigDto(boolean z, String str) {
        js3.p(str, "initUrl");
        this.webViewEnable = z;
        this.initUrl = str;
    }

    public final String getInitUrl() {
        return this.initUrl;
    }

    public final boolean getWebViewEnable() {
        return this.webViewEnable;
    }
}
