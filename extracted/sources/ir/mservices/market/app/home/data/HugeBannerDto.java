package ir.mservices.market.app.home.data;

import defpackage.f88;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class HugeBannerDto implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final String DISPLAY_SIZE_LARGE = "large";
    public static final String DISPLAY_SIZE_SMALL = "small";

    @vo7("displayMode")
    private String _displaySize;

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("app")
    private final ApplicationDTO app;

    @vo7("appBg")
    private final String appBg;

    @vo7(PackageListMetaDataDTO.KEY_BANNER_BG)
    private final String bannerBg;

    @vo7("bannerUrl")
    private final String bannerUrl;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public HugeBannerDto(ApplicationDTO applicationDTO, String str, String str2, String str3, String str4, String str5, String str6) {
        this.app = applicationDTO;
        this.appBg = str;
        this.bannerBg = str2;
        this.bannerUrl = str3;
        this.analyticsName = str4;
        this.action = str5;
        this._displaySize = str6;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final ApplicationDTO getApp() {
        return this.app;
    }

    public final String getAppBg() {
        return this.appBg;
    }

    public final String getBannerBg() {
        return this.bannerBg;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getDisplaySize() {
        String str = this._displaySize;
        if (str == null || f88.n0(str)) {
            this._displaySize = DISPLAY_SIZE_LARGE;
        }
        return this._displaySize;
    }

    public final String get_displaySize() {
        return this._displaySize;
    }

    public final void set_displaySize(String str) {
        this._displaySize = str;
    }
}
