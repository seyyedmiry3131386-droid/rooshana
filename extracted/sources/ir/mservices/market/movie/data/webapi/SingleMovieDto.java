package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleMovieDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("bannerBlurUrl")
    private final String bannerBlurUrl;

    @vo7("bgColor")
    private final String bgColor;

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("posterUrl")
    private final String posterUrl;

    @vo7("secondarySubtitle")
    private final String secondarySubtitle;

    @vo7("subtitle")
    private final String subtitle;

    @vo7("title")
    private final String title;

    public SingleMovieDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        js3.p(str2, "analyticsName");
        js3.p(str7, "posterUrl");
        js3.p(str9, PackageListMetaDataDTO.KEY_ACTION);
        this.title = str;
        this.analyticsName = str2;
        this.subtitle = str3;
        this.secondarySubtitle = str4;
        this.description = str5;
        this.bgColor = str6;
        this.posterUrl = str7;
        this.bannerBlurUrl = str8;
        this.action = str9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SingleMovieDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.SingleMovieDto");
        return js3.i(this.posterUrl, ((SingleMovieDto) obj).posterUrl);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBannerBlurUrl() {
        return this.bannerBlurUrl;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getSecondarySubtitle() {
        return this.secondarySubtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.posterUrl.hashCode();
    }
}
