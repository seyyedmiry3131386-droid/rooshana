package ir.mservices.market.movie.uri.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieUriDto implements Serializable {

    @vo7("adInfo")
    private final List<AdInfo> adInfo;

    @vo7("audioMode")
    private final Boolean audioMode;

    @vo7("callbackTimes")
    private final ArrayList<Integer> callbackTimes;

    @vo7("credits")
    private final CreditsDto credits;

    @vo7("downgradeQuality")
    private final Boolean downgradeQuality;

    @vo7("enableAnalytics")
    private final Boolean enableAnalytics;

    @vo7("hasSubtitle")
    private final Boolean hasSubtitle;

    @vo7("hintText")
    private final String hintText;

    @vo7("openingCreditsTime")
    private final Long openingCreditsTime;

    @vo7("orientation")
    private final String orientation;

    @vo7("playCallback")
    private final String playCallback;

    @vo7("playerConfig")
    private final PlayerConfigDto playerConfigDto;

    @vo7("playerRecommendation")
    private final PlayerRecommendationDto playerRecommendationDto;

    @vo7("preferredMimeType")
    private final List<String> preferredMimeType;

    @vo7("restrictionInfo")
    private final RestrictionInfo restrictionInfo;

    @vo7("sampleWatch")
    private final SampleWatchDto sampleWatch;

    @vo7("subscriptionPromotion")
    private final RestrictionInfo subscriptionPromotion;

    @vo7("subtitles")
    private final List<SubtitleDto> subtitles;

    @vo7("thumbnail")
    private final String thumbnail;

    @vo7("trackExoError")
    private Boolean trackExoError;

    @vo7("urls")
    private final List<String> urls;

    public MovieUriDto(List<String> list, String str, Boolean bool, List<SubtitleDto> list2, Long l, PlayerConfigDto playerConfigDto, Boolean bool2, RestrictionInfo restrictionInfo, RestrictionInfo restrictionInfo2, String str2, ArrayList<Integer> arrayList, List<AdInfo> list3, PlayerRecommendationDto playerRecommendationDto, CreditsDto creditsDto, Boolean bool3, Boolean bool4, SampleWatchDto sampleWatchDto, List<String> list4, String str3, String str4, Boolean bool5) {
        js3.p(list, "urls");
        this.urls = list;
        this.playCallback = str;
        this.hasSubtitle = bool;
        this.subtitles = list2;
        this.openingCreditsTime = l;
        this.playerConfigDto = playerConfigDto;
        this.downgradeQuality = bool2;
        this.restrictionInfo = restrictionInfo;
        this.subscriptionPromotion = restrictionInfo2;
        this.hintText = str2;
        this.callbackTimes = arrayList;
        this.adInfo = list3;
        this.playerRecommendationDto = playerRecommendationDto;
        this.credits = creditsDto;
        this.trackExoError = bool3;
        this.enableAnalytics = bool4;
        this.sampleWatch = sampleWatchDto;
        this.preferredMimeType = list4;
        this.thumbnail = str3;
        this.orientation = str4;
        this.audioMode = bool5;
    }

    public final List<AdInfo> getAdInfo() {
        return this.adInfo;
    }

    public final Boolean getAudioMode() {
        return this.audioMode;
    }

    public final ArrayList<Integer> getCallbackTimes() {
        return this.callbackTimes;
    }

    public final CreditsDto getCredits() {
        return this.credits;
    }

    public final Boolean getDowngradeQuality() {
        return this.downgradeQuality;
    }

    public final Boolean getEnableAnalytics() {
        return this.enableAnalytics;
    }

    public final Boolean getHasSubtitle() {
        return this.hasSubtitle;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final Long getOpeningCreditsTime() {
        return this.openingCreditsTime;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final String getPlayCallback() {
        return this.playCallback;
    }

    public final PlayerConfigDto getPlayerConfigDto() {
        return this.playerConfigDto;
    }

    public final PlayerRecommendationDto getPlayerRecommendationDto() {
        return this.playerRecommendationDto;
    }

    public final List<String> getPreferredMimeType() {
        return this.preferredMimeType;
    }

    public final RestrictionInfo getRestrictionInfo() {
        return this.restrictionInfo;
    }

    public final SampleWatchDto getSampleWatch() {
        return this.sampleWatch;
    }

    public final RestrictionInfo getSubscriptionPromotion() {
        return this.subscriptionPromotion;
    }

    public final List<SubtitleDto> getSubtitles() {
        return this.subtitles;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final Boolean getTrackExoError() {
        return this.trackExoError;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final void setTrackExoError(Boolean bool) {
        this.trackExoError = bool;
    }
}
