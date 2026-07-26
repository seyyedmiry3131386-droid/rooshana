package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.app.detail.data.AdInfoDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeBannerAppsDto extends HomeItemDTO implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String INNER_APP = "innerApp";
    public static final String INNER_APP_DIGESTED = "digestedInnerApp";
    public static final String OUTER_APP = "outerApp";
    public static final String OUTER_APP_DIGESTED = "digestedOuterApp";

    @vo7("adInfoDto")
    private final AdInfoDto adInfoDTO;

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("bannerApps")
    private final List<HomeBannerAppDto> apps;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("title")
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public HomeBannerAppsDto(String str, String str2, String str3, List<HomeBannerAppDto> list, List<String> list2, AdInfoDto adInfoDto) {
        this.analyticsName = str;
        this.displayMode = str2;
        this.title = str3;
        this.apps = list;
        this.ignoreConditions = list2;
        this.adInfoDTO = adInfoDto;
    }

    public final AdInfoDto getAdInfoDTO() {
        return this.adInfoDTO;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final List<HomeBannerAppDto> getApps() {
        return this.apps;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ HomeBannerAppsDto(String str, String str2, String str3, List list, List list2, AdInfoDto adInfoDto, int i, yd1 yd1Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : adInfoDto);
    }
}
