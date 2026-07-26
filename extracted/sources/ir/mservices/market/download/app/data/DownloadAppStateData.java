package ir.mservices.market.download.app.data;

import defpackage.js3;
import defpackage.yd1;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadAppStateData {
    private final List<DownloadListModel> downloadAppModel;
    private final ExtensionPointDto extensionData;

    public DownloadAppStateData(List<DownloadListModel> list, ExtensionPointDto extensionPointDto) {
        js3.p(list, "downloadAppModel");
        this.downloadAppModel = list;
        this.extensionData = extensionPointDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadAppStateData copy$default(DownloadAppStateData downloadAppStateData, List list, ExtensionPointDto extensionPointDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = downloadAppStateData.downloadAppModel;
        }
        if ((i & 2) != 0) {
            extensionPointDto = downloadAppStateData.extensionData;
        }
        return downloadAppStateData.copy(list, extensionPointDto);
    }

    public final List<DownloadListModel> component1() {
        return this.downloadAppModel;
    }

    public final ExtensionPointDto component2() {
        return this.extensionData;
    }

    public final DownloadAppStateData copy(List<DownloadListModel> list, ExtensionPointDto extensionPointDto) {
        js3.p(list, "downloadAppModel");
        return new DownloadAppStateData(list, extensionPointDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadAppStateData)) {
            return false;
        }
        DownloadAppStateData downloadAppStateData = (DownloadAppStateData) obj;
        return js3.i(this.downloadAppModel, downloadAppStateData.downloadAppModel) && js3.i(this.extensionData, downloadAppStateData.extensionData);
    }

    public final List<DownloadListModel> getDownloadAppModel() {
        return this.downloadAppModel;
    }

    public final ExtensionPointDto getExtensionData() {
        return this.extensionData;
    }

    public int hashCode() {
        int iHashCode = this.downloadAppModel.hashCode() * 31;
        ExtensionPointDto extensionPointDto = this.extensionData;
        return iHashCode + (extensionPointDto == null ? 0 : extensionPointDto.hashCode());
    }

    public String toString() {
        return "DownloadAppStateData(downloadAppModel=" + this.downloadAppModel + ", extensionData=" + this.extensionData + ")";
    }

    public /* synthetic */ DownloadAppStateData(List list, ExtensionPointDto extensionPointDto, int i, yd1 yd1Var) {
        this(list, (i & 2) != 0 ? null : extensionPointDto);
    }
}
