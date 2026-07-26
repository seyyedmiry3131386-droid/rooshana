package defpackage;

import android.util.SparseArray;
import com.google.android.material.tabs.b;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.search.common.SearchType;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.search.result.SearchResultFragment;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class hj7 implements ce8 {
    public final /* synthetic */ gj7 a;
    public final /* synthetic */ SearchResultFragment b;
    public final /* synthetic */ String c;

    public hj7(gj7 gj7Var, SearchResultFragment searchResultFragment, String str) {
        this.a = gj7Var;
        this.b = searchResultFragment;
        this.c = str;
    }

    @Override // defpackage.be8
    public final void b(b bVar) {
        gj7 gj7Var = this.a;
        List list = gj7Var.q;
        SparseArray sparseArray = gj7Var.r;
        js3.p(bVar, "tab");
        int i = bVar.d;
        SearchType searchType = SearchType.b;
        String str = i == 1 ? CommonDataKt.MOVIE_TYPE_MOVIE : "app";
        Object obj = sparseArray.get(((SearchType) list.get(i)).ordinal());
        SearchResultFragment searchResultFragment = this.b;
        if (obj != null) {
            int i2 = SearchResultFragment.R0;
            SearchViewModel searchViewModel = (SearchViewModel) searchResultFragment.P0.getValue();
            l lVar = searchViewModel.D;
            lVar.getClass();
            lVar.p(null, str);
            String str2 = ((ij7) searchResultFragment.O0.getValue()).a;
            if (str2 != null) {
                searchViewModel.E(str2);
            }
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b("search_tab_" + this.c + "_" + str);
            clickEventBuilder.a();
        }
        int i3 = bVar.d;
        d67 d67Var = (d67) sparseArray.get(((SearchType) list.get(i3)).ordinal());
        if (d67Var != null) {
            d67Var.l(true);
        }
        gj7Var.s.put(((SearchType) list.get(i3)).ordinal(), true);
        SearchType searchType2 = SearchType.b;
        AppSearchRecyclerListFragment appSearchRecyclerListFragment = (AppSearchRecyclerListFragment) sparseArray.get(0);
        if (appSearchRecyclerListFragment != null) {
            boolean z = list.get(i3) == searchType2;
            if (appSearchRecyclerListFragment.U0().F) {
                appSearchRecyclerListFragment.U0().E = Boolean.valueOf(z);
                if (z) {
                    appSearchRecyclerListFragment.Y0();
                } else {
                    appSearchRecyclerListFragment.V0();
                }
            }
        }
        if (searchResultFragment.M0 != null) {
            lw8.b(searchResultFragment.F());
        } else {
            js3.V("uiUtils");
            throw null;
        }
    }

    @Override // defpackage.be8
    public final void a() {
    }
}
