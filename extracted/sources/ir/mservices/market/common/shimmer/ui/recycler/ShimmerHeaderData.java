package ir.mservices.market.common.shimmer.ui.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ShimmerHeaderData implements MyketRecyclerData, g32 {
    public static final int a = js6.holder_shimmer_header;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
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
        return String.valueOf(ShimmerHeaderData.class.hashCode());
    }

    public final int hashCode() {
        return ShimmerHeaderData.class.hashCode();
    }
}
