package ir.mservices.market.common.shimmer.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ShimmerReelData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_grid_shimmer_reels;
    public static final int c = js6.holder_small_shimmer_reels;
    public static final int d = js6.holder_medium_shimmer_reels;
    public static final int e = js6.holder_large_shimmer_reels;
    public final String a;

    public ShimmerReelData(String str) {
        js3.p(str, "displayMode");
        this.a = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String str = this.a;
        return m88.T(str, "Small", true) ? c : m88.T(str, "Medium", true) ? d : m88.T(str, "Large", true) ? e : b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShimmerHeaderData);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(ShimmerReelData.class.hashCode());
    }

    public final int hashCode() {
        return ShimmerReelData.class.hashCode();
    }
}
