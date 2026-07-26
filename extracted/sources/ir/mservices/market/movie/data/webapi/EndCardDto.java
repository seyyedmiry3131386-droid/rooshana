package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class EndCardDto implements Serializable {

    @vo7("clickCallback")
    private final String clickCallback;

    @vo7("dismissCallback")
    private final String dismissCallback;

    @vo7("duration")
    private final Integer duration;

    @vo7("url")
    private final String url;

    @vo7("viewCallback")
    private final String viewCallback;

    public EndCardDto(String str, Integer num, String str2, String str3, String str4) {
        js3.p(str2, "viewCallback");
        js3.p(str3, "clickCallback");
        js3.p(str4, "dismissCallback");
        this.url = str;
        this.duration = num;
        this.viewCallback = str2;
        this.clickCallback = str3;
        this.dismissCallback = str4;
    }

    public final String getClickCallback() {
        return this.clickCallback;
    }

    public final String getDismissCallback() {
        return this.dismissCallback;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViewCallback() {
        return this.viewCallback;
    }
}
