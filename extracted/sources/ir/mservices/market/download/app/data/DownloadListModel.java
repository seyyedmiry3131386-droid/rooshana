package ir.mservices.market.download.app.data;

import defpackage.bl4;
import defpackage.bt;
import defpackage.js3;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadListModel implements Serializable {
    private final DownloadSummeryApplicationDto app;
    private final bt appState;
    private final long neneTimestamp;

    public DownloadListModel(DownloadSummeryApplicationDto downloadSummeryApplicationDto, bt btVar, long j) {
        js3.p(downloadSummeryApplicationDto, "app");
        js3.p(btVar, "appState");
        this.app = downloadSummeryApplicationDto;
        this.appState = btVar;
        this.neneTimestamp = j;
    }

    public static /* synthetic */ DownloadListModel copy$default(DownloadListModel downloadListModel, DownloadSummeryApplicationDto downloadSummeryApplicationDto, bt btVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadSummeryApplicationDto = downloadListModel.app;
        }
        if ((i & 2) != 0) {
            btVar = downloadListModel.appState;
        }
        if ((i & 4) != 0) {
            j = downloadListModel.neneTimestamp;
        }
        return downloadListModel.copy(downloadSummeryApplicationDto, btVar, j);
    }

    public final DownloadSummeryApplicationDto component1() {
        return this.app;
    }

    public final bt component2() {
        return this.appState;
    }

    public final long component3() {
        return this.neneTimestamp;
    }

    public final DownloadListModel copy(DownloadSummeryApplicationDto downloadSummeryApplicationDto, bt btVar, long j) {
        js3.p(downloadSummeryApplicationDto, "app");
        js3.p(btVar, "appState");
        return new DownloadListModel(downloadSummeryApplicationDto, btVar, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadListModel)) {
            return false;
        }
        DownloadListModel downloadListModel = (DownloadListModel) obj;
        return js3.i(this.app, downloadListModel.app) && js3.i(this.appState, downloadListModel.appState) && this.neneTimestamp == downloadListModel.neneTimestamp;
    }

    public final DownloadSummeryApplicationDto getApp() {
        return this.app;
    }

    public final bt getAppState() {
        return this.appState;
    }

    public final long getNeneTimestamp() {
        return this.neneTimestamp;
    }

    public int hashCode() {
        int iHashCode = (this.appState.hashCode() + (this.app.hashCode() * 31)) * 31;
        long j = this.neneTimestamp;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        DownloadSummeryApplicationDto downloadSummeryApplicationDto = this.app;
        bt btVar = this.appState;
        long j = this.neneTimestamp;
        StringBuilder sb = new StringBuilder("DownloadListModel(app=");
        sb.append(downloadSummeryApplicationDto);
        sb.append(", appState=");
        sb.append(btVar);
        sb.append(", neneTimestamp=");
        return bl4.s(j, ")", sb);
    }
}
