package ir.mservices.market.movie.download.quality.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadQualityHalfPriceData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_half_price_notice;
    public final String a;

    public DownloadQualityHalfPriceData(String str) {
        this.a = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadQualityHalfPriceData)) {
            return false;
        }
        return js3.i(this.a, ((DownloadQualityHalfPriceData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
