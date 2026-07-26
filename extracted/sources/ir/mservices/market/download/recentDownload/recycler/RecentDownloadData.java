package ir.mservices.market.download.recentDownload.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class RecentDownloadData implements MyketRecyclerData, g32 {
    public static final int c = js6.recent_download_holder;
    public final AppDownloadInfo a;
    public final AppDownloadFlowStatus b;

    public RecentDownloadData(AppDownloadInfo appDownloadInfo, AppDownloadFlowStatus appDownloadFlowStatus) {
        this.a = appDownloadInfo;
        this.b = appDownloadFlowStatus;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RecentDownloadData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.download.recentDownload.recycler.RecentDownloadData");
        RecentDownloadData recentDownloadData = (RecentDownloadData) obj;
        return js3.i(this.a, recentDownloadData.a) && this.b == recentDownloadData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getPackageName();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
