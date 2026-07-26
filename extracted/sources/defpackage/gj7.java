package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.fragment.app.d;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.movie.ui.search.result.MovieSearchRecyclerListFragment;
import ir.mservices.market.search.common.SearchType;
import ir.mservices.market.search.result.SearchResultFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class gj7 extends xm2 {
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final List q;
    public final SparseArray r;
    public final SparseBooleanArray s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj7(SearchResultFragment searchResultFragment, String str, String str2, String str3, int i, List list) {
        super(searchResultFragment);
        js3.p(list, "tabList");
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = i;
        this.q = list;
        SparseArray sparseArray = new SparseArray();
        this.r = sparseArray;
        this.s = new SparseBooleanArray();
        sparseArray.clear();
        List<d> listS = searchResultFragment.G().c.S();
        js3.o(listS, "getFragments(...)");
        for (d dVar : listS) {
            if (dVar instanceof AppSearchRecyclerListFragment) {
                SparseArray sparseArray2 = this.r;
                SearchType searchType = SearchType.b;
                sparseArray2.put(0, dVar);
            } else if (dVar instanceof MovieSearchRecyclerListFragment) {
                SparseArray sparseArray3 = this.r;
                SearchType searchType2 = SearchType.b;
                sparseArray3.put(1, dVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return this.q.size();
    }

    @Override // defpackage.xm2
    public final d z(int i) {
        List list = this.q;
        int iOrdinal = ((SearchType) list.get(i)).ordinal();
        String str = this.o;
        String str2 = this.n;
        SparseArray sparseArray = this.r;
        SparseBooleanArray sparseBooleanArray = this.s;
        String str3 = this.m;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = MovieSearchRecyclerListFragment.b1;
            MovieSearchRecyclerListFragment movieSearchRecyclerListFragmentA = rl3.A(str2, str, str3 + "_movie");
            movieSearchRecyclerListFragmentA.l(sparseBooleanArray.get(((SearchType) list.get(i)).ordinal(), false));
            sparseArray.put(((SearchType) list.get(i)).ordinal(), movieSearchRecyclerListFragmentA);
            return movieSearchRecyclerListFragmentA;
        }
        int i3 = AppSearchRecyclerListFragment.e1;
        String str4 = str3 + "_app";
        js3.p(str2, "queryString");
        js3.p(str, "querySource");
        js3.p(str4, "tabName");
        AppSearchRecyclerListFragment appSearchRecyclerListFragment = new AppSearchRecyclerListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_KEY_QUERY", str2);
        bundle.putString("BUNDLE_KEY_QUERY_SOURCE", str);
        bundle.putInt("BUNDLE_KEY_INDEX", this.p);
        bundle.putString("BUNDLE_KEY_TAB", str4);
        appSearchRecyclerListFragment.u0(bundle);
        appSearchRecyclerListFragment.l(sparseBooleanArray.get(((SearchType) list.get(i)).ordinal(), false));
        sparseArray.put(((SearchType) list.get(i)).ordinal(), appSearchRecyclerListFragment);
        return appSearchRecyclerListFragment;
    }
}
