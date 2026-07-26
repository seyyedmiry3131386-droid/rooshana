package ir.mservices.market.common.ext.data;

import defpackage.f88;
import defpackage.m88;
import defpackage.vo7;
import defpackage.wp1;
import defpackage.yd1;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtensionPointDto extends HomeItemDTO implements Serializable, DisplayMode {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_APP = "ext-app";
    public static final String TYPE_APP_LIST = "ext-app-list";
    public static final String TYPE_APP_REVIEW_LIST = "ext-app-review-list";
    public static final String TYPE_BANNER_LIST = "ext-banner-list";
    public static final String TYPE_BANNER_LIST_NO_TITLE = "ext-banner-list-no-title";
    public static final String TYPE_HEADER = "ext-header";
    public static final String TYPE_MOVIE_LIST = "ext-movie-list";
    public static final String TYPE_MOVIE_LIST_BACKGROUND = "ext-movie-list-background";
    public static final String TYPE_REEL_LIST = "ext-reel-list";
    public static final String TYPE_UPDATE_APP_LIST = "ext-update-app-list";

    @vo7("displayMode")
    private final String displayMode;

    @vo7("span")
    private final Integer span;

    @vo7("type")
    private final String type;

    @vo7("url")
    private final String url;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public ExtensionPointDto(String str, String str2, Integer num, String str3) {
        this.url = str;
        this.type = str2;
        this.span = num;
        this.displayMode = str3;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public int getHorizontalType() {
        if (m88.T(this.type, TYPE_APP_REVIEW_LIST, true)) {
            return 1;
        }
        return wp1.a(this);
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public String getMode() {
        String str = this.displayMode;
        if (str == null) {
            return "Vertical";
        }
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "Vertical" : str;
    }

    public final Integer getSpan() {
        return this.span;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isDigested() {
        return wp1.b(this);
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isMulti() {
        return wp1.c(this);
    }
}
