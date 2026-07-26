package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieFullDto extends PlayerMovieDto implements Serializable {

    @vo7("audioMode")
    private final Boolean audioMode;

    @vo7("bookmarkInfo")
    private final BookmarkInfo bookmarkInfo;

    @vo7("buttonAction")
    private final String buttonAction;

    @vo7("buttonText")
    private final String buttonText;

    @vo7("casts")
    private final List<CastDto> casts;

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("elements")
    private final List<HomeMovieDto> elements;

    @vo7("messageBox")
    private final MessageBoxDto messageBox;

    @vo7("posterBlurUrl")
    private final String posterBlurUrl;

    @vo7("posterLandscapeBlurUrl")
    private final String posterLandscapeBlurUrl;

    @vo7("posterLandscapeUrl")
    private final String posterLandscapeUrl;

    @vo7("primaryAddax")
    private final AddaxBoxDto primaryAddax;

    @vo7("reviewInfo")
    private MovieReviewInfoDto reviewInfo;

    @vo7("sampleWatchMessage")
    private final String sampleWatchMessage;

    @vo7("screenshots")
    private final List<ScreenshotDto> screenshots;

    @vo7("seasons")
    private final List<SeasonDto> seasons;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    @vo7("selectedSeasonId")
    private final String selectedSeasonId;

    @vo7("showDownloadButton")
    private final boolean showDownloadButton;

    @vo7("showTrafficHint")
    private final boolean showTrafficHint;

    @vo7("streamer")
    private final DetailStreamerDto streamer;

    @vo7("subscriptionInfo")
    private final SubscriptionInfo subscriptionInfo;

    @vo7("summaries")
    private final List<SummariesDto> summaries;

    @vo7("tags")
    private final List<TagDto> tags;

    @vo7("trailer")
    private final TrailerDto trailer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieFullDto(String str, String str2, String str3, String str4, String str5, List<SeasonDto> list, String str6, String str7, List<SummariesDto> list2, List<TagDto> list3, TrailerDto trailerDto, List<ScreenshotDto> list4, List<CastDto> list5, String str8, String str9, boolean z, SubscriptionInfo subscriptionInfo, BookmarkInfo bookmarkInfo, boolean z2, MovieReviewInfoDto movieReviewInfoDto, String str10, String str11, String str12, ShareModelDto shareModelDto, String str13, MessageBoxDto messageBoxDto, String str14, AddaxBoxDto addaxBoxDto, List<HomeMovieDto> list6, DetailStreamerDto detailStreamerDto, Boolean bool) {
        super(str, str2, str3, str5, str8, shareModelDto);
        js3.p(str, "id");
        js3.p(str3, "title");
        js3.p(str5, "posterUrl");
        js3.p(str8, "type");
        js3.p(str10, "posterBlurUrl");
        js3.p(str12, "posterLandscapeBlurUrl");
        js3.p(shareModelDto, "shareModel");
        this.buttonText = str4;
        this.seasons = list;
        this.selectedSeasonId = str6;
        this.description = str7;
        this.summaries = list2;
        this.tags = list3;
        this.trailer = trailerDto;
        this.screenshots = list4;
        this.casts = list5;
        this.secondaryTitle = str9;
        this.showDownloadButton = z;
        this.subscriptionInfo = subscriptionInfo;
        this.bookmarkInfo = bookmarkInfo;
        this.showTrafficHint = z2;
        this.reviewInfo = movieReviewInfoDto;
        this.posterBlurUrl = str10;
        this.posterLandscapeUrl = str11;
        this.posterLandscapeBlurUrl = str12;
        this.buttonAction = str13;
        this.messageBox = messageBoxDto;
        this.sampleWatchMessage = str14;
        this.primaryAddax = addaxBoxDto;
        this.elements = list6;
        this.streamer = detailStreamerDto;
        this.audioMode = bool;
    }

    public final Boolean getAudioMode() {
        return this.audioMode;
    }

    public final BookmarkInfo getBookmarkInfo() {
        return this.bookmarkInfo;
    }

    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<CastDto> getCasts() {
        return this.casts;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<HomeMovieDto> getElements() {
        return this.elements;
    }

    public final MessageBoxDto getMessageBox() {
        return this.messageBox;
    }

    public final String getPosterBlurUrl() {
        return this.posterBlurUrl;
    }

    public final String getPosterLandscapeBlurUrl() {
        return this.posterLandscapeBlurUrl;
    }

    public final String getPosterLandscapeUrl() {
        return this.posterLandscapeUrl;
    }

    public final AddaxBoxDto getPrimaryAddax() {
        return this.primaryAddax;
    }

    public final MovieReviewInfoDto getReviewInfo() {
        return this.reviewInfo;
    }

    public final String getSampleWatchMessage() {
        return this.sampleWatchMessage;
    }

    public final List<ScreenshotDto> getScreenshots() {
        return this.screenshots;
    }

    public final List<SeasonDto> getSeasons() {
        return this.seasons;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final String getSelectedSeasonId() {
        return this.selectedSeasonId;
    }

    public final boolean getShowDownloadButton() {
        return this.showDownloadButton;
    }

    public final boolean getShowTrafficHint() {
        return this.showTrafficHint;
    }

    public final DetailStreamerDto getStreamer() {
        return this.streamer;
    }

    public final SubscriptionInfo getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public final List<SummariesDto> getSummaries() {
        return this.summaries;
    }

    public final List<TagDto> getTags() {
        return this.tags;
    }

    public final TrailerDto getTrailer() {
        return this.trailer;
    }

    public final void setReviewInfo(MovieReviewInfoDto movieReviewInfoDto) {
        this.reviewInfo = movieReviewInfoDto;
    }

    public /* synthetic */ MovieFullDto(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, List list3, TrailerDto trailerDto, List list4, List list5, String str8, String str9, boolean z, SubscriptionInfo subscriptionInfo, BookmarkInfo bookmarkInfo, boolean z2, MovieReviewInfoDto movieReviewInfoDto, String str10, String str11, String str12, ShareModelDto shareModelDto, String str13, MessageBoxDto messageBoxDto, String str14, AddaxBoxDto addaxBoxDto, List list6, DetailStreamerDto detailStreamerDto, Boolean bool, int i, yd1 yd1Var) {
        this(str, str2, str3, str4, str5, list, str6, str7, list2, list3, trailerDto, list4, list5, str8, str9, z, subscriptionInfo, bookmarkInfo, z2, movieReviewInfoDto, str10, str11, str12, shareModelDto, str13, messageBoxDto, str14, addaxBoxDto, list6, detailStreamerDto, (i & 1073741824) != 0 ? null : bool);
    }
}
