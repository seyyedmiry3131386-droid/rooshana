package ir.mservices.market.app.home.data;

import defpackage.bf5;
import defpackage.vo7;
import defpackage.wp1;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeVideoListDto extends HomeItemDTO implements Serializable, bf5, DisplayMode {

    @vo7("adInfoDto")
    private final AdInfoDto adInfoDTO;

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("eol")
    private final boolean eol;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("title")
    private final String title;

    @vo7("videoList")
    private final List<VideoRowDto> videos;

    public HomeVideoListDto(String str, boolean z, String str2, List<VideoRowDto> list, String str3, AdInfoDto adInfoDto, List<String> list2) {
        this.title = str;
        this.eol = z;
        this.displayMode = str2;
        this.videos = list;
        this.analyticsName = str3;
        this.adInfoDTO = adInfoDto;
        this.ignoreConditions = list2;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final AdInfoDto getAdInfoDTO() {
        return this.adInfoDTO;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final boolean getEol() {
        return this.eol;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ int getHorizontalType() {
        return wp1.a(this);
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public String getMode() {
        String str = this.displayMode;
        if (str == null) {
            return "Horizontal1";
        }
        if (!str.equals("DigestedHorizontal1")) {
            str = null;
        }
        return str == null ? "Horizontal1" : str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<VideoRowDto> getVideos() {
        return this.videos;
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
