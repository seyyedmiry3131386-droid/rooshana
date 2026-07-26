package ir.mservices.market.movie.download.quality.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadQualityRecentData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_recent_download;
    public final xe2 a;
    public final String b;

    public DownloadQualityRecentData(xe2 xe2Var) {
        this.a = xe2Var;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DownloadQualityRecentData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentData");
        return js3.i(this.b, ((DownloadQualityRecentData) obj).b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
