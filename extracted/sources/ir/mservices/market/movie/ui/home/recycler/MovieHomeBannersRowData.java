package ir.mservices.market.movie.ui.home.recycler;

import defpackage.a55;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import defpackage.pv1;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class MovieHomeBannersRowData extends NestedRecyclerData implements g32, wo2, a55 {
    public static final int q = js6.holder_movie_horizontal_large_banner_list;
    public static final int r = js6.holder_movie_horizontal_banner_list;
    public static final int s = js6.holder_movie_horizontal_medium_banner_list;
    public final HomeMovieBannerListDto g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final v48 l;
    public final boolean m;
    public final Integer n;
    public final Integer o;
    public final String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeBannersRowData(HomeMovieBannerListDto homeMovieBannerListDto, bz6 bz6Var, boolean z, String str, boolean z2, boolean z3, v48 v48Var, boolean z4, Integer num, Integer num2, String str2, dp2 dp2Var, int i) {
        super(bz6Var, dp2Var);
        z = (i & 4) != 0 ? true : z;
        str = (i & 8) != 0 ? null : str;
        z2 = (i & 16) != 0 ? true : z2;
        z3 = (i & 32) != 0 ? false : z3;
        v48 v48Var2 = (i & 64) != 0 ? null : v48Var;
        boolean z5 = (i & 128) == 0 ? z4 : false;
        Integer num3 = (i & 256) == 0 ? num : null;
        this.g = homeMovieBannerListDto;
        this.h = z;
        this.i = str;
        this.j = z2;
        this.k = z3;
        this.l = v48Var2;
        this.m = z5;
        this.n = num3;
        this.o = num2;
        this.p = str2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String str = this.p;
        return m88.T(str, "Small", true) ? r : m88.T(str, "Medium", true) ? s : q;
    }

    @Override // defpackage.a55
    public final pv1 a() {
        v48 v48Var = this.l;
        return new pv1(3, !(v48Var != null ? ((Boolean) v48Var.getValue()).booleanValue() : true) && this.m);
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final Integer b() {
        return this.n;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        Integer num = this.o;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieHomeBannersRowData)) {
            return false;
        }
        MovieHomeBannersRowData movieHomeBannersRowData = (MovieHomeBannersRowData) obj;
        return js3.i(this.g, movieHomeBannersRowData.g) && js3.i(this.i, movieHomeBannersRowData.i) && js3.i(this.p, movieHomeBannersRowData.p);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String str = this.i;
        return str == null ? String.valueOf(hashCode()) : str;
    }

    public final int hashCode() {
        HomeMovieBannerListDto homeMovieBannerListDto = this.g;
        int iHashCode = (homeMovieBannerListDto != null ? homeMovieBannerListDto.hashCode() : 0) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.p;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
