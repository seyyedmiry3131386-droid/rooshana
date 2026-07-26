package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.h45;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieSeasonTitleData implements MyketRecyclerData, wo2, h45, g32 {
    public static final int e = js6.holder_movie_season_title;
    public final List a;
    public final boolean b;
    public final int c;
    public final String d;

    public MovieSeasonTitleData(List list, boolean z, int i) {
        js3.p(list, "seasons");
        this.a = list;
        this.b = z;
        this.c = i;
        long j = is3.p + 1;
        is3.p = j;
        this.d = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // defpackage.h45
    public final String a() {
        return "select_season";
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieSeasonTitleData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieSeasonTitleData");
        MovieSeasonTitleData movieSeasonTitleData = (MovieSeasonTitleData) obj;
        return js3.i(this.a, movieSeasonTitleData.a) && this.c == movieSeasonTitleData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        return rm7.i(this.c, 31, this.a);
    }
}
