package ir.mservices.market.app.home.data;

import defpackage.vo7;
import defpackage.wp1;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeAppDto extends HomeItemDTO implements Serializable, DisplayMode {

    @vo7("adInfoDto")
    private final AdInfoDto adInfoDto;

    @vo7("application")
    private final ApplicationDTO application;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("screenshots")
    private final List<ScreenshotDto> screenshots;

    @vo7("title")
    private final String title;

    @vo7("videoshot")
    private final VideoShotDto videoshot;

    public HomeAppDto(ApplicationDTO applicationDTO, List<ScreenshotDto> list, VideoShotDto videoShotDto, String str, String str2, AdInfoDto adInfoDto, List<String> list2) {
        this.application = applicationDTO;
        this.screenshots = list;
        this.videoshot = videoShotDto;
        this.displayMode = str;
        this.title = str2;
        this.adInfoDto = adInfoDto;
        this.ignoreConditions = list2;
    }

    public final AdInfoDto getAdInfoDto() {
        return this.adInfoDto;
    }

    public final ApplicationDTO getApplication() {
        return this.application;
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

    public final List<ScreenshotDto> getScreenshots() {
        return this.screenshots;
    }

    public final String getTitle() {
        return this.title;
    }

    public final VideoShotDto getVideoshot() {
        return this.videoshot;
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
