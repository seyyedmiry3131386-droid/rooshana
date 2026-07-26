package ir.mservices.market.movie.ui.home.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeBannersItemData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_movie_banners_item;
    public final HomeMovieBannerDto a;
    public final String b;

    public MovieHomeBannersItemData(HomeMovieBannerDto homeMovieBannerDto) {
        js3.p(homeMovieBannerDto, "homeMovieBannerDto");
        this.a = homeMovieBannerDto;
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
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieHomeBannersItemData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData");
        return js3.i(this.a, ((MovieHomeBannersItemData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
