package ir.mservices.market.movie.ui.search.result;

import defpackage.ck4;
import defpackage.jd7;
import defpackage.js3;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieSearchResultViewModel extends c {
    public final jd7 t;
    public final ck4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSearchResultViewModel(jd7 jd7Var, ck4 ck4Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        this.t = jd7Var;
        this.u = ck4Var;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        jd7 jd7Var = this.t;
        String str = (String) jd7Var.b("BUNDLE_KEY_QUERY");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = (String) jd7Var.b("BUNDLE_KEY_QUERY_SOURCE");
        if (str3 == null) {
            str3 = "Manual";
        }
        String str4 = str3;
        Integer num = (Integer) jd7Var.b("BUNDLE_KEY_INDEX");
        String str5 = (String) jd7Var.b("BUNDLE_KEY_TAB");
        if (str2.length() > 0) {
            p(new MovieSearchResultViewModel$doRequest$1(this, str2, str4, num, str5, null));
        }
    }
}
