package ir.mservices.market.app.suggest.detail.data;

import defpackage.vo7;
import ir.mservices.market.app.detail.data.CategorySummaryDto;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayApplicationDetailDto implements Serializable {

    @vo7("canRequest")
    private final boolean canRequest;

    @vo7("categorySummary")
    private final CategorySummaryDto categorySummary;

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("downloadSummary")
    private final DownloadSummaryDto downloadSummary;

    @vo7("iconPath")
    private final String iconPath;

    @vo7("isDescriptionRtl")
    private final boolean isDescriptionRtl;

    @vo7("isVersionDescriptionRtl")
    private final boolean isVersionDescriptionRtl;

    @vo7("packageName")
    private final String packageName;

    @vo7("ratesCount")
    private final String ratesCount;

    @vo7("rating")
    private final Float rating;

    @vo7("requestText")
    private final String requestText;

    @vo7("screenshots")
    private final List<ScreenshotDto> screenshots;

    @vo7("sizeSummary")
    private final DownloadSummaryDto sizeSummary;

    @vo7("title")
    private final String title;

    @vo7("versionDescription")
    private final String versionDescription;

    public PlayApplicationDetailDto(String str, String str2, String str3, Float f, List<ScreenshotDto> list, String str4, String str5, boolean z, boolean z2, DownloadSummaryDto downloadSummaryDto, CategorySummaryDto categorySummaryDto, DownloadSummaryDto downloadSummaryDto2, boolean z3, String str6, String str7) {
        this.description = str;
        this.iconPath = str2;
        this.packageName = str3;
        this.rating = f;
        this.screenshots = list;
        this.title = str4;
        this.versionDescription = str5;
        this.isDescriptionRtl = z;
        this.isVersionDescriptionRtl = z2;
        this.downloadSummary = downloadSummaryDto;
        this.categorySummary = categorySummaryDto;
        this.sizeSummary = downloadSummaryDto2;
        this.canRequest = z3;
        this.requestText = str6;
        this.ratesCount = str7;
    }

    public final boolean getCanRequest() {
        return this.canRequest;
    }

    public final CategorySummaryDto getCategorySummary() {
        return this.categorySummary;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DownloadSummaryDto getDownloadSummary() {
        return this.downloadSummary;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getRatesCount() {
        return this.ratesCount;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final String getRequestText() {
        return this.requestText;
    }

    public final List<ScreenshotDto> getScreenshots() {
        return this.screenshots;
    }

    public final DownloadSummaryDto getSizeSummary() {
        return this.sizeSummary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVersionDescription() {
        return this.versionDescription;
    }

    public final boolean isDescriptionRtl() {
        return this.isDescriptionRtl;
    }

    public final boolean isVersionDescriptionRtl() {
        return this.isVersionDescriptionRtl;
    }
}
