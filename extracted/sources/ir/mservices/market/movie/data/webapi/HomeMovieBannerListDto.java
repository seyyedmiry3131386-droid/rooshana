package ir.mservices.market.movie.data.webapi;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeMovieBannerListDto extends HomeItemDTO implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    private static final HomeMovieBannerListDto empty = new HomeMovieBannerListDto("", "", EmptyList.a, "", 1, null, null, true, null);

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("bannerListKey")
    private final String bannerListKey;

    @vo7("banners")
    private final List<HomeMovieBannerDto> banners;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("eol")
    private final boolean eol;

    @vo7("headerTitle")
    private final String headerTitle;

    @vo7("movable")
    private final Boolean movable;

    @vo7("refId")
    private final String refId;

    @vo7("span")
    private final Integer span;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final HomeMovieBannerListDto getEmpty() {
            return HomeMovieBannerListDto.empty;
        }

        private Companion() {
        }
    }

    public HomeMovieBannerListDto(String str, String str2, List<HomeMovieBannerDto> list, String str3, Integer num, String str4, String str5, boolean z, Boolean bool) {
        js3.p(str2, "analyticsName");
        js3.p(list, "banners");
        js3.p(str3, "displayMode");
        this.headerTitle = str;
        this.analyticsName = str2;
        this.banners = list;
        this.displayMode = str3;
        this.span = num;
        this.bannerListKey = str4;
        this.refId = str5;
        this.eol = z;
        this.movable = bool;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HomeMovieBannerListDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto");
        return js3.i(this.headerTitle, ((HomeMovieBannerListDto) obj).headerTitle);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBannerListKey() {
        return this.bannerListKey;
    }

    public final List<HomeMovieBannerDto> getBanners() {
        return this.banners;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final Boolean getMovable() {
        return this.movable;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final Integer getSpan() {
        return this.span;
    }

    public int hashCode() {
        String str = this.headerTitle;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
