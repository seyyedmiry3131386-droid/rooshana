package ir.mservices.market.version2.webapi.responsedto;

import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchSpecialAppDTO implements Serializable {
    private ApplicationDTO application;
    private String bgColor;
    private DownloadSummaryDto downloadSummary;
    private List<ScreenshotDto> screenshots;
    private SearchDescriptionDto summary;
    private VideoShotDto videoshot;

    public ApplicationDTO getApplication() {
        return this.application;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public DownloadSummaryDto getDownloadSummary() {
        return this.downloadSummary;
    }

    public List<ScreenshotDto> getScreenshots() {
        return this.screenshots;
    }

    public SearchDescriptionDto getSummary() {
        return this.summary;
    }

    public VideoShotDto getVideoshot() {
        return this.videoshot;
    }
}
