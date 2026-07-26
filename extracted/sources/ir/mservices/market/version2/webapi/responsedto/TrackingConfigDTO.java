package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TrackingConfigDTO implements Serializable {
    private int appSpeedControlSampleRate;
    private int appSpeedControlTimeLimit;
    private int claritySampleRate;
    private int downloadFailReasonSampleRateInMillion;
    private int movieSpeedControlSampleRate;
    private int movieSpeedControlTimeLimit;
    private boolean reportDownloadFailReason;
    private boolean showDownloadVpnHint;

    public int getAppSpeedControlSampleRate() {
        return this.appSpeedControlSampleRate;
    }

    public int getAppSpeedControlTimeLimit() {
        return this.appSpeedControlTimeLimit;
    }

    public int getClaritySampleRate() {
        return this.claritySampleRate;
    }

    public int getDownloadFailReasonSampleRateInMillion() {
        return this.downloadFailReasonSampleRateInMillion;
    }

    public int getMovieSpeedControlSampleRate() {
        return this.movieSpeedControlSampleRate;
    }

    public int getMovieSpeedControlTimeLimit() {
        return this.movieSpeedControlTimeLimit;
    }

    public boolean isShowDownloadVpnHint() {
        return this.showDownloadVpnHint;
    }

    public void setAppSpeedControlSampleRate(int i) {
        this.appSpeedControlSampleRate = i;
    }

    public void setAppSpeedControlTimeLimit(int i) {
        this.appSpeedControlTimeLimit = i;
    }

    public void setClaritySampleRate(int i) {
        this.claritySampleRate = i;
    }

    public void setDownloadFailReasonSampleRateInMillion(int i) {
        this.downloadFailReasonSampleRateInMillion = i;
    }

    public void setMovieSpeedControlSampleRate(int i) {
        this.movieSpeedControlSampleRate = i;
    }

    public void setMovieSpeedControlTimeLimit(int i) {
        this.movieSpeedControlTimeLimit = i;
    }

    public void setReportDownloadFailReason(boolean z) {
        this.reportDownloadFailReason = z;
    }

    public void setShowDownloadVpnHint(boolean z) {
        this.showDownloadVpnHint = z;
    }

    public boolean shouldReportDownloadFailReason() {
        return this.reportDownloadFailReason;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackingConfigDTO{, reportDownloadFailReason=");
        sb.append(this.reportDownloadFailReason);
        sb.append(", downloadFailReasonSampleRateInMillion=");
        sb.append(this.downloadFailReasonSampleRateInMillion);
        sb.append(", claritySampleRate=");
        return dw1.q(sb, this.claritySampleRate, '}');
    }
}
