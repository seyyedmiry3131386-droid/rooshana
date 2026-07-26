package ir.mservices.market.common.shimmer.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ShimmerReviewData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_shimmer_review;
    public final String a;

    public ShimmerReviewData() {
        long j = is3.p + 1;
        is3.p = j;
        this.a = String.valueOf(j);
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
        return this == obj || (obj instanceof ShimmerReviewData);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return ShimmerReviewData.class.hashCode();
    }
}
