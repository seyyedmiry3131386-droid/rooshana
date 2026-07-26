package ir.mservices.market.movie.ui.home.recycler;

import defpackage.a55;
import defpackage.ay3;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import defpackage.pv1;
import defpackage.rv6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeMoviesRowData extends NestedRecyclerData implements g32, wo2, ay3, a55 {
    public static final int s = js6.holder_movie_horizontal_list;
    public static final int t = js6.holder_small_movie_horizontal_list;
    public static final int u = js6.holder_medium_movie_horizontal_list;
    public static final int v = js6.holder_movie_image_background_horizontal_list;
    public HomeMovieListDto g;
    public final boolean h;
    public final boolean i;
    public final v48 j;
    public final boolean k;
    public final Integer l;
    public final String m;
    public final boolean n;
    public final String o;
    public final v48 p;
    public float q;
    public float r;

    public /* synthetic */ MovieHomeMoviesRowData(HomeMovieListDto homeMovieListDto, bz6 bz6Var, boolean z, v48 v48Var, boolean z2, Integer num, String str, dp2 dp2Var, int i) {
        this(homeMovieListDto, bz6Var, (i & 4) != 0, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : v48Var, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : num, str, false, null, null, dp2Var);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        HomeMovieListDto homeMovieListDto = this.g;
        if ((homeMovieListDto != null ? homeMovieListDto.getBackgroundImage() : null) != null || this.n) {
            return v;
        }
        String str = this.m;
        return m88.T(str, "Small", true) ? t : m88.T(str, "Medium", true) ? u : s;
    }

    @Override // defpackage.a55
    public final pv1 a() {
        v48 v48Var = this.j;
        return new pv1(3, !(v48Var != null ? ((Boolean) v48Var.getValue()).booleanValue() : true) && this.k);
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final Integer b() {
        return this.l;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieHomeMoviesRowData)) {
            return false;
        }
        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
        return js3.i(this.g, movieHomeMoviesRowData.g) && js3.i(this.o, movieHomeMoviesRowData.o) && js3.i(this.m, movieHomeMoviesRowData.m) && js3.i(this.p, movieHomeMoviesRowData.p);
    }

    @Override // defpackage.ay3
    public final String getKey() {
        HomeMovieListDto homeMovieListDto = this.g;
        String listKey = homeMovieListDto != null ? homeMovieListDto.getListKey() : null;
        return listKey == null ? "" : listKey;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String str = this.o;
        return str == null ? String.valueOf(hashCode()) : str;
    }

    public final int hashCode() {
        HomeMovieListDto homeMovieListDto = this.g;
        int iHashCode = (homeMovieListDto != null ? homeMovieListDto.hashCode() : 0) * 31;
        String str = this.o;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.m;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        v48 v48Var = this.p;
        return iHashCode3 + (v48Var != null ? v48Var.hashCode() : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeMoviesRowData(HomeMovieListDto homeMovieListDto, bz6 bz6Var, boolean z, boolean z2, v48 v48Var, boolean z3, Integer num, String str, boolean z4, String str2, rv6 rv6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "movieHomeFlow");
        this.g = homeMovieListDto;
        this.h = z;
        this.i = z2;
        this.j = v48Var;
        this.k = z3;
        this.l = num;
        this.m = str;
        this.n = z4;
        this.o = str2;
        this.p = rv6Var;
    }
}
