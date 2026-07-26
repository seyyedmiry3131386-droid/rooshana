package ir.mservices.market.movie.ui.home.recycler;

import defpackage.a55;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import defpackage.pv1;
import defpackage.rm7;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.movie.data.webapi.HomeReelListDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeReelsRowData extends NestedRecyclerData implements g32, wo2, a55 {
    public static final int o = js6.holder_reel_horizontal_grid_list;
    public static final int p = js6.holder_reel_horizontal_large_list;
    public static final int q = js6.holder_reel_horizontal_medium_list;
    public static final int r = js6.holder_reel_horizontal_small_list;
    public final HomeReelListDto g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final v48 l;
    public final boolean m;
    public final Integer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeReelsRowData(HomeReelListDto homeReelListDto, String str, bz6 bz6Var, boolean z, boolean z2, String str2, v48 v48Var, boolean z3, Integer num, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(str, "displayMode");
        js3.p(str2, "id");
        this.g = homeReelListDto;
        this.h = str;
        this.i = z;
        this.j = z2;
        this.k = str2;
        this.l = v48Var;
        this.m = z3;
        this.n = num;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String str = this.h;
        return m88.T(str, "Small", true) ? r : m88.T(str, "Medium", true) ? q : m88.T(str, "Large", true) ? p : o;
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
        return (!m88.T(this.h, HomeReelListDto.GRID, true) || this.i) ? 1 : 2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieHomeReelsRowData)) {
            return false;
        }
        MovieHomeReelsRowData movieHomeReelsRowData = (MovieHomeReelsRowData) obj;
        return js3.i(this.g, movieHomeReelsRowData.g) && js3.i(this.h, movieHomeReelsRowData.h) && js3.i(this.k, movieHomeReelsRowData.k);
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        return m88.T(this.h, HomeReelListDto.GRID, true) && !this.i;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.k;
    }

    public final int hashCode() {
        HomeReelListDto homeReelListDto = this.g;
        return this.k.hashCode() + rm7.k(this.h, (homeReelListDto != null ? homeReelListDto.hashCode() : 0) * 31, 31);
    }
}
