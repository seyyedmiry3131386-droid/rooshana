package ir.mservices.market.common.shimmer.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ShimmerApplicationData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_shimmer_application_horizontal;
    public static final int e = js6.holder_shimmer_application_vertical;
    public static final int f = js6.holder_shimmer_application_vertical_digested;
    public final boolean a;
    public final boolean b;
    public final String c;

    public ShimmerApplicationData(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        boolean z = this.b;
        boolean z2 = this.a;
        return (!z2 || z) ? (z2 && z) ? f : d : e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ShimmerApplicationData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.common.shimmer.ui.recycler.ShimmerApplicationData");
        ShimmerApplicationData shimmerApplicationData = (ShimmerApplicationData) obj;
        return this.a == shimmerApplicationData.a && this.b == shimmerApplicationData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return ((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }
}
