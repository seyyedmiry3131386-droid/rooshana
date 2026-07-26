package ir.mservices.market.app.search.result.ui;

import defpackage.bt2;
import defpackage.f70;
import defpackage.y97;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f70 {
    public final /* synthetic */ AppSearchRecyclerListFragment a;

    public a(AppSearchRecyclerListFragment appSearchRecyclerListFragment) {
        this.a = appSearchRecyclerListFragment;
    }

    @Override // defpackage.f70
    public final void g(String str) {
        int i = AppSearchRecyclerListFragment.e1;
        SearchResultViewModel searchResultViewModelU0 = this.a.U0();
        bt2.G(y97.G(searchResultViewModelU0), null, null, new SearchResultViewModel$stopVideo$1(searchResultViewModelU0, str, null), 3);
    }
}
