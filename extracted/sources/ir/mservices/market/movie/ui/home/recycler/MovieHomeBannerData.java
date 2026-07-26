package ir.mservices.market.movie.ui.home.recycler;

import defpackage.a55;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import defpackage.pv1;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;

/* JADX INFO: loaded from: classes3.dex */
public class MovieHomeBannerData implements MyketRecyclerData, a55, g32 {
    public static final int e = js6.holder_movie_banner;
    public static final int f = js6.holder_movie_tablet_banner;
    public final HomeMovieBannerDto a;
    public final v48 b;
    public final boolean c;
    public final String d;

    public MovieHomeBannerData(HomeMovieBannerDto homeMovieBannerDto, v48 v48Var, boolean z) {
        this.a = homeMovieBannerDto;
        this.b = v48Var;
        this.c = z;
        long j = is3.p + 1;
        is3.p = j;
        this.d = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return m88.T(this.a.getType(), "detailed", true) ? f : e;
    }

    @Override // defpackage.a55
    public final pv1 a() {
        v48 v48Var = this.b;
        return new pv1(3, !(v48Var != null ? ((Boolean) v48Var.getValue()).booleanValue() : true) && this.c);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData");
        return js3.i(this.a, ((MovieHomeBannerData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
