package ir.mservices.market.common.search;

import defpackage.js3;
import defpackage.lw8;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.common.search.SearchState;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final /* synthetic */ BaseSearchFragment a;

    public b(BaseSearchFragment baseSearchFragment) {
        this.a = baseSearchFragment;
    }

    public final void a(String str, String str2) {
        js3.p(str, "title");
        int i = BaseSearchFragment.q1;
        BaseSearchFragment baseSearchFragment = this.a;
        SearchFragment searchFragmentV1 = baseSearchFragment.V1(true);
        if (searchFragmentV1 != null) {
            searchFragmentV1.F0();
        }
        baseSearchFragment.S1().r(new SearchAction.UpdateSearchStateAction(new SearchState.Result(str, str2)));
        if (baseSearchFragment.i1 == null) {
            js3.V("uiUtils");
            throw null;
        }
        lw8.b(baseSearchFragment.F());
        SearchView searchView = baseSearchFragment.l1;
        if (searchView != null) {
            searchView.k(str);
        }
    }
}
