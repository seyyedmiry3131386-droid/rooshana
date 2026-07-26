package ir.mservices.market.common.search;

import defpackage.f88;
import defpackage.hk7;
import defpackage.js3;
import defpackage.lw8;
import defpackage.sb7;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.common.search.SearchState;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements hk7 {
    public final /* synthetic */ BaseSearchFragment a;

    public a(BaseSearchFragment baseSearchFragment) {
        this.a = baseSearchFragment;
    }

    public final void a() {
        BaseSearchFragment baseSearchFragment = this.a;
        if (baseSearchFragment.i1 != null) {
            lw8.b(baseSearchFragment.F());
        } else {
            js3.V("uiUtils");
            throw null;
        }
    }

    public final void b(String str, String str2) {
        js3.p(str, "query");
        sb7.p("SearchView", "show result for: query: ".concat(str), null);
        this.a.S1().r(new SearchAction.UpdateSearchStateAction(new SearchState.Result(str, str2)));
    }

    public final void c(String str) {
        js3.p(str, "query");
        boolean zN0 = f88.n0(str);
        int i = 0;
        BaseSearchFragment baseSearchFragment = this.a;
        if (zN0) {
            baseSearchFragment.S1().r(new SearchAction.UpdateSearchStateAction(new SearchState.Home(i)));
        } else {
            baseSearchFragment.S1().r(new SearchAction.UpdateSearchStateAction(new SearchState.Suggestion(str)));
        }
    }
}
