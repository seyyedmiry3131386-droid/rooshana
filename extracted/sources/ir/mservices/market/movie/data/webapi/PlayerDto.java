package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerDto implements Serializable {

    @vo7("hidePlayerOffset")
    private final Integer hidePlayerOffset;

    @vo7("progressBarTitle")
    private final String progressBarTitle;

    @vo7("showProgressBar")
    private final Boolean showProgressBar;

    @vo7("showProgressSeconds")
    private final Boolean showProgressSeconds;

    public PlayerDto(Boolean bool, Boolean bool2, String str, Integer num) {
        this.showProgressBar = bool;
        this.showProgressSeconds = bool2;
        this.progressBarTitle = str;
        this.hidePlayerOffset = num;
    }

    public final Integer getHidePlayerOffset() {
        return this.hidePlayerOffset;
    }

    public final String getProgressBarTitle() {
        return this.progressBarTitle;
    }

    public final Boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final Boolean getShowProgressSeconds() {
        return this.showProgressSeconds;
    }
}
