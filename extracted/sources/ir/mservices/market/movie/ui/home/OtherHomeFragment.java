package ir.mservices.market.movie.ui.home;

import defpackage.bi5;
import defpackage.g27;
import defpackage.js3;
import defpackage.n15;
import defpackage.nw5;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.search.SearchFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class OtherHomeFragment extends HomeFragment {
    public final bi5 A1 = new bi5(g27.a(nw5.class), new n15(10, this));

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_movie_home_other);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = ((nw5) this.A1.getValue()).b;
        return str == null ? "" : str;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final SearchFragment R1() {
        return null;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean T1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final String U1() {
        return "";
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean W1(int i) {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean X1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void Z1() {
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void a2() {
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void b2() {
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment
    public final String f2() {
        return ((nw5) this.A1.getValue()).a;
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment
    public final boolean h2() {
        return false;
    }

    @Override // ir.mservices.market.movie.ui.home.HomeFragment
    public final boolean i2() {
        return ((nw5) this.A1.getValue()).c;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int w1() {
        return sj8.b().j;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int x1() {
        return sj8.b().k;
    }
}
