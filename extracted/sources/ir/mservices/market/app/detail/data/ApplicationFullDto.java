package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.app.detail.developer.data.AppDeveloperDto;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.data.webapi.TagDto;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.vpnService.cheetah.data.ApplicationCheetahDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationFullDto implements Serializable {

    @vo7("appData")
    private final AppDataDto appData;

    @vo7("bannerList")
    private final HomeMovieBannerListDto bannerList;

    @vo7("buttonText")
    private final String buttonText;

    @vo7("callbackUrl")
    private final String callbackUrl;

    @vo7("categoryName")
    private final String categoryName;

    @vo7("cheetah")
    private final ApplicationCheetahDto cheetah;

    @vo7("contentRatingUrl")
    private final String contentRatingUrl;

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final AppDescriptionDto description;

    @vo7("developer")
    private final AppDeveloperDto developer;

    @vo7("downloadSummary")
    private final DownloadSummaryDto downloadSummary;

    @vo7("forceUpdate")
    private final ForceUpdateDto forceUpdate;

    @vo7("hasAd")
    private final Boolean hasAd;

    @vo7("hasIAP")
    private final boolean hasIAP;

    @vo7("icon")
    private final AppIconDto icon;

    @vo7("installCallbackUrl")
    private final String installCallbackUrl;

    @vo7("isBookmarked")
    private final boolean isBookmarked;

    @vo7("messageBox")
    private final MessageBoxDto messageBox;

    @vo7("moneyBackSummary")
    private final MoneyBackSummaryDto moneyBackSummary;

    @vo7("notification")
    private final AppDetailNotificationDto notification;

    @vo7("packageName")
    private final String packageName;

    @vo7("permissions")
    private final List<PermissionDto> permissions;

    @vo7("price")
    private final AppPriceDto price;

    @vo7("primaryAddax")
    private final AddaxBoxDto primaryAddax;

    @vo7("rate")
    private final AppRateDto rate;

    @vo7("recommendation")
    private final AppRecommendationDto recommendation;

    @vo7("refId")
    private final String refId;

    @vo7("screenshots")
    private final List<ScreenshotDto> screenshots;

    @vo7("secondaryAddax")
    private final AddaxBoxDto secondaryAddax;

    @vo7("secondaryBannerList")
    private final HomeMovieBannerListDto secondaryBannerList;

    @vo7("shamad")
    private final ShamadDto shamad;

    @vo7("size")
    private final AppSizeDto size;

    @vo7("summaryList")
    private final SummaryListDto summaryList;

    @vo7("tagline")
    private final String tagline;

    @vo7("tags")
    private final List<TagDto> tags;

    @vo7("title")
    private final String title;

    @vo7("trafficPrice")
    private final TrafficPriceDto trafficPrice;

    @vo7("version")
    private final AppVersionDto version;

    @vo7("videoshot")
    private final VideoShotDto videoshot;

    @vo7("whatsNew")
    private final AppDescriptionDto whatsNew;

    public ApplicationFullDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Boolean bool, List<ScreenshotDto> list, List<PermissionDto> list2, DownloadSummaryDto downloadSummaryDto, SummaryListDto summaryListDto, MoneyBackSummaryDto moneyBackSummaryDto, VideoShotDto videoShotDto, AppIconDto appIconDto, AppRateDto appRateDto, AppPriceDto appPriceDto, AppSizeDto appSizeDto, AppVersionDto appVersionDto, AppDescriptionDto appDescriptionDto, AppDescriptionDto appDescriptionDto2, AppDeveloperDto appDeveloperDto, AppRecommendationDto appRecommendationDto, AppDataDto appDataDto, ShamadDto shamadDto, MessageBoxDto messageBoxDto, List<TagDto> list3, ForceUpdateDto forceUpdateDto, HomeMovieBannerListDto homeMovieBannerListDto, HomeMovieBannerListDto homeMovieBannerListDto2, AddaxBoxDto addaxBoxDto, AddaxBoxDto addaxBoxDto2, AppDetailNotificationDto appDetailNotificationDto, ApplicationCheetahDto applicationCheetahDto, TrafficPriceDto trafficPriceDto) {
        js3.p(str, "packageName");
        js3.p(str2, "title");
        js3.p(appIconDto, "icon");
        js3.p(appPriceDto, "price");
        js3.p(appSizeDto, "size");
        js3.p(appVersionDto, "version");
        this.packageName = str;
        this.title = str2;
        this.categoryName = str3;
        this.contentRatingUrl = str4;
        this.refId = str5;
        this.callbackUrl = str6;
        this.buttonText = str7;
        this.installCallbackUrl = str8;
        this.tagline = str9;
        this.hasIAP = z;
        this.isBookmarked = z2;
        this.hasAd = bool;
        this.screenshots = list;
        this.permissions = list2;
        this.downloadSummary = downloadSummaryDto;
        this.summaryList = summaryListDto;
        this.moneyBackSummary = moneyBackSummaryDto;
        this.videoshot = videoShotDto;
        this.icon = appIconDto;
        this.rate = appRateDto;
        this.price = appPriceDto;
        this.size = appSizeDto;
        this.version = appVersionDto;
        this.description = appDescriptionDto;
        this.whatsNew = appDescriptionDto2;
        this.developer = appDeveloperDto;
        this.recommendation = appRecommendationDto;
        this.appData = appDataDto;
        this.shamad = shamadDto;
        this.messageBox = messageBoxDto;
        this.tags = list3;
        this.forceUpdate = forceUpdateDto;
        this.secondaryBannerList = homeMovieBannerListDto;
        this.bannerList = homeMovieBannerListDto2;
        this.secondaryAddax = addaxBoxDto;
        this.primaryAddax = addaxBoxDto2;
        this.notification = appDetailNotificationDto;
        this.cheetah = applicationCheetahDto;
        this.trafficPrice = trafficPriceDto;
    }

    public final AppDataDto getAppData() {
        return this.appData;
    }

    public final HomeMovieBannerListDto getBannerList() {
        return this.bannerList;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final ApplicationCheetahDto getCheetah() {
        return this.cheetah;
    }

    public final String getContentRatingUrl() {
        return this.contentRatingUrl;
    }

    public final AppDescriptionDto getDescription() {
        return this.description;
    }

    public final AppDeveloperDto getDeveloper() {
        return this.developer;
    }

    public final DownloadSummaryDto getDownloadSummary() {
        return this.downloadSummary;
    }

    public final ForceUpdateDto getForceUpdate() {
        return this.forceUpdate;
    }

    public final Boolean getHasAd() {
        return this.hasAd;
    }

    public final boolean getHasIAP() {
        return this.hasIAP;
    }

    public final AppIconDto getIcon() {
        return this.icon;
    }

    public final String getInstallCallbackUrl() {
        return this.installCallbackUrl;
    }

    public final MessageBoxDto getMessageBox() {
        return this.messageBox;
    }

    public final MoneyBackSummaryDto getMoneyBackSummary() {
        return this.moneyBackSummary;
    }

    public final AppDetailNotificationDto getNotification() {
        return this.notification;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final List<PermissionDto> getPermissions() {
        return this.permissions;
    }

    public final AppPriceDto getPrice() {
        return this.price;
    }

    public final AddaxBoxDto getPrimaryAddax() {
        return this.primaryAddax;
    }

    public final AppRateDto getRate() {
        return this.rate;
    }

    public final AppRecommendationDto getRecommendation() {
        return this.recommendation;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final List<ScreenshotDto> getScreenshots() {
        return this.screenshots;
    }

    public final AddaxBoxDto getSecondaryAddax() {
        return this.secondaryAddax;
    }

    public final HomeMovieBannerListDto getSecondaryBannerList() {
        return this.secondaryBannerList;
    }

    public final ShamadDto getShamad() {
        return this.shamad;
    }

    public final AppSizeDto getSize() {
        return this.size;
    }

    public final SummaryListDto getSummaryList() {
        return this.summaryList;
    }

    public final String getTagline() {
        return this.tagline;
    }

    public final List<TagDto> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TrafficPriceDto getTrafficPrice() {
        return this.trafficPrice;
    }

    public final AppVersionDto getVersion() {
        return this.version;
    }

    public final VideoShotDto getVideoshot() {
        return this.videoshot;
    }

    public final AppDescriptionDto getWhatsNew() {
        return this.whatsNew;
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    public /* synthetic */ ApplicationFullDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Boolean bool, List list, List list2, DownloadSummaryDto downloadSummaryDto, SummaryListDto summaryListDto, MoneyBackSummaryDto moneyBackSummaryDto, VideoShotDto videoShotDto, AppIconDto appIconDto, AppRateDto appRateDto, AppPriceDto appPriceDto, AppSizeDto appSizeDto, AppVersionDto appVersionDto, AppDescriptionDto appDescriptionDto, AppDescriptionDto appDescriptionDto2, AppDeveloperDto appDeveloperDto, AppRecommendationDto appRecommendationDto, AppDataDto appDataDto, ShamadDto shamadDto, MessageBoxDto messageBoxDto, List list3, ForceUpdateDto forceUpdateDto, HomeMovieBannerListDto homeMovieBannerListDto, HomeMovieBannerListDto homeMovieBannerListDto2, AddaxBoxDto addaxBoxDto, AddaxBoxDto addaxBoxDto2, AppDetailNotificationDto appDetailNotificationDto, ApplicationCheetahDto applicationCheetahDto, TrafficPriceDto trafficPriceDto, int i, int i2, yd1 yd1Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : downloadSummaryDto, (32768 & i) != 0 ? null : summaryListDto, (65536 & i) != 0 ? null : moneyBackSummaryDto, (131072 & i) != 0 ? null : videoShotDto, appIconDto, (524288 & i) != 0 ? null : appRateDto, appPriceDto, appSizeDto, appVersionDto, (8388608 & i) != 0 ? null : appDescriptionDto, (16777216 & i) != 0 ? null : appDescriptionDto2, (33554432 & i) != 0 ? null : appDeveloperDto, (67108864 & i) != 0 ? null : appRecommendationDto, (134217728 & i) != 0 ? null : appDataDto, (268435456 & i) != 0 ? null : shamadDto, (536870912 & i) != 0 ? null : messageBoxDto, (1073741824 & i) != 0 ? null : list3, (i & Integer.MIN_VALUE) != 0 ? null : forceUpdateDto, (i2 & 1) != 0 ? null : homeMovieBannerListDto, (i2 & 2) != 0 ? null : homeMovieBannerListDto2, (i2 & 4) != 0 ? null : addaxBoxDto, (i2 & 8) != 0 ? null : addaxBoxDto2, (i2 & 16) != 0 ? null : appDetailNotificationDto, (i2 & 32) != 0 ? null : applicationCheetahDto, (i2 & 64) != 0 ? null : trafficPriceDto);
    }
}
