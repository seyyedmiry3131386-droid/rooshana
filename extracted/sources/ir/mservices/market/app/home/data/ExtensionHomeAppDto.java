package ir.mservices.market.app.home.data;

import defpackage.bf5;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtensionHomeAppDto implements bf5, Serializable {

    @vo7("adInfo")
    private final AdInfoDto adInfo;

    @vo7("app")
    private final ApplicationDTO app;

    @vo7("screenshots")
    private final List<ScreenshotDto> screenshots;

    @vo7("title")
    private final String title;

    @vo7("videoshot")
    private final VideoShotDto videoshot;

    public ExtensionHomeAppDto(ApplicationDTO applicationDTO, List<ScreenshotDto> list, VideoShotDto videoShotDto, String str, AdInfoDto adInfoDto) {
        this.app = applicationDTO;
        this.screenshots = list;
        this.videoshot = videoShotDto;
        this.title = str;
        this.adInfo = adInfoDto;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.app == null;
    }

    public final AdInfoDto getAdInfo() {
        return this.adInfo;
    }

    public final ApplicationDTO getApp() {
        return this.app;
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
}
