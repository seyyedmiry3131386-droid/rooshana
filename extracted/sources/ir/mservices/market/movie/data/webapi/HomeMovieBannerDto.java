package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeMovieBannerDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("actionText")
    private final String actionText;

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("bannerBlurUrl")
    private final String bannerBlurUrl;

    @vo7("bannerUrl")
    private final String bannerUrl;

    @vo7("headerTitle")
    private final String headerTitle;

    @vo7("id")
    private final String id;

    @vo7("isTransparent")
    private final Boolean isTransparent;

    @vo7("label")
    private final MovieLabelDto label;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    public HomeMovieBannerDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, MovieLabelDto movieLabelDto) {
        js3.p(str3, "analyticsName");
        js3.p(str6, "bannerUrl");
        js3.p(str7, PackageListMetaDataDTO.KEY_ACTION);
        this.id = str;
        this.headerTitle = str2;
        this.analyticsName = str3;
        this.title = str4;
        this.secondaryTitle = str5;
        this.bannerUrl = str6;
        this.action = str7;
        this.isTransparent = bool;
        this.bannerBlurUrl = str8;
        this.actionText = str9;
        this.type = str10;
        this.label = movieLabelDto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HomeMovieBannerDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.HomeMovieBannerDto");
        return js3.i(this.bannerUrl, ((HomeMovieBannerDto) obj).bannerUrl);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBannerBlurUrl() {
        return this.bannerBlurUrl;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final MovieLabelDto getLabel() {
        return this.label;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.bannerUrl.hashCode();
    }

    public final Boolean isTransparent() {
        return this.isTransparent;
    }
}
