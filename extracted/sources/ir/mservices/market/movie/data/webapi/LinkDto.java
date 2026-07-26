package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkDto implements Serializable {

    @vo7("callToAction")
    private final String callToAction;

    @vo7("chrome")
    private final boolean chrome;

    @vo7("clickCallback")
    private final String clickCallback;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("subTitle")
    private final String subTitle;

    @vo7("title")
    private final String title;

    @vo7("url")
    private final String uri;

    public LinkDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        js3.p(str, "uri");
        js3.p(str2, "callToAction");
        js3.p(str3, "clickCallback");
        js3.p(str4, "title");
        js3.p(str5, "subTitle");
        js3.p(str6, "iconUrl");
        this.uri = str;
        this.callToAction = str2;
        this.clickCallback = str3;
        this.title = str4;
        this.subTitle = str5;
        this.iconUrl = str6;
        this.chrome = z;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final boolean getChrome() {
        return this.chrome;
    }

    public final String getClickCallback() {
        return this.clickCallback;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }
}
