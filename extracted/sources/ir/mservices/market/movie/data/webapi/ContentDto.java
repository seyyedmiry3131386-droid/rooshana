package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentDto implements Serializable {

    @vo7("completeCallback")
    private final String completeCallback;

    @vo7("duration")
    private final Integer duration;

    @vo7("exitCallback")
    private final String exitCallback;

    @vo7("firstQuartileCallback")
    private final String firstQuartileCallback;

    @vo7("midPointCallback")
    private final String midPointCallback;

    @vo7("progress")
    private final ProgressDto progress;

    @vo7("skipCallback")
    private final String skipCallback;

    @vo7("skipOffset")
    private final Integer skipOffset;

    @vo7("skippable")
    private final Boolean skippable;

    @vo7("startCallback")
    private final String startCallback;

    @vo7("thirdQuartileCallback")
    private final String thirdQuartileCallback;

    @vo7("url")
    private final String url;

    public ContentDto(String str, Integer num, Boolean bool, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProgressDto progressDto) {
        this.url = str;
        this.duration = num;
        this.skippable = bool;
        this.skipOffset = num2;
        this.startCallback = str2;
        this.firstQuartileCallback = str3;
        this.midPointCallback = str4;
        this.thirdQuartileCallback = str5;
        this.completeCallback = str6;
        this.skipCallback = str7;
        this.exitCallback = str8;
        this.progress = progressDto;
    }

    public final String getCompleteCallback() {
        return this.completeCallback;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getExitCallback() {
        return this.exitCallback;
    }

    public final String getFirstQuartileCallback() {
        return this.firstQuartileCallback;
    }

    public final String getMidPointCallback() {
        return this.midPointCallback;
    }

    public final ProgressDto getProgress() {
        return this.progress;
    }

    public final String getSkipCallback() {
        return this.skipCallback;
    }

    public final Integer getSkipOffset() {
        return this.skipOffset;
    }

    public final Boolean getSkippable() {
        return this.skippable;
    }

    public final String getStartCallback() {
        return this.startCallback;
    }

    public final String getThirdQuartileCallback() {
        return this.thirdQuartileCallback;
    }

    public final String getUrl() {
        return this.url;
    }
}
