package ir.mservices.market.movie.ui.detail.seasons.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieSeasonFixedTitleData implements MyketRecyclerData, wo2, g32 {
    public static final int g = js6.movie_season_title;
    public final String a;
    public final String b;
    public final ArrayList c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public MovieSeasonFixedTitleData(String str, String str2, ArrayList arrayList, int i, boolean z, boolean z2) {
        js3.p(str, "title");
        js3.p(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieSeasonFixedTitleData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData");
        MovieSeasonFixedTitleData movieSeasonFixedTitleData = (MovieSeasonFixedTitleData) obj;
        return this.c.equals(movieSeasonFixedTitleData.c) && this.d == movieSeasonFixedTitleData.d && js3.i(this.a, movieSeasonFixedTitleData.a) && this.e == movieSeasonFixedTitleData.e && this.f == movieSeasonFixedTitleData.f && js3.i(this.b, movieSeasonFixedTitleData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + this.c.hashCode() + this.a.hashCode() + this.d + (this.f ? 1231 : 1237) + (this.e ? 1231 : 1237)) * 31;
    }
}
