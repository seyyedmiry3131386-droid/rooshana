package ir.mservices.market.common.shimmer.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ShimmerMoviesData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_small_shimmer_movies;
    public static final int d = js6.holder_medium_shimmer_movies;
    public static final int e = js6.holder_large_shimmer_movies;
    public static final int f = js6.holder_shimmer_movies_bg;
    public final String a;
    public final boolean b;

    public ShimmerMoviesData(String str, boolean z) {
        js3.p(str, "displayMode");
        this.a = str;
        this.b = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        if (this.b) {
            return f;
        }
        String str = this.a;
        return m88.T(str, "Small", true) ? c : m88.T(str, "Medium", true) ? d : e;
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
        return String.valueOf(ShimmerMoviesData.class.hashCode());
    }

    public final int hashCode() {
        return ShimmerMoviesData.class.hashCode();
    }
}
