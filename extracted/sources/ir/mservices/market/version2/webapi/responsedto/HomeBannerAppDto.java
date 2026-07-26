package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeBannerAppDto implements Serializable {

    @vo7("application")
    private final ApplicationDTO app;

    @vo7("appBg")
    private final String appBg;

    @vo7(PackageListMetaDataDTO.KEY_BANNER_BG)
    private final String bannerBg;

    @vo7("bannerUrl")
    private final String bannerUrl;

    @vo7("blurUrl")
    private final String blurUrl;

    public HomeBannerAppDto(ApplicationDTO applicationDTO, String str, String str2, String str3, String str4) {
        js3.p(applicationDTO, "app");
        js3.p(str2, PackageListMetaDataDTO.KEY_BANNER_BG);
        js3.p(str3, "bannerUrl");
        this.app = applicationDTO;
        this.appBg = str;
        this.bannerBg = str2;
        this.bannerUrl = str3;
        this.blurUrl = str4;
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

    public final String getBlurUrl() {
        return this.blurUrl;
    }

    public /* synthetic */ HomeBannerAppDto(ApplicationDTO applicationDTO, String str, String str2, String str3, String str4, int i, yd1 yd1Var) {
        this(applicationDTO, (i & 2) != 0 ? null : str, str2, str3, str4);
    }
}
