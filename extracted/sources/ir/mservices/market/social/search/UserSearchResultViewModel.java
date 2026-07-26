package ir.mservices.market.social.search;

import defpackage.jd7;
import defpackage.js3;
import defpackage.t15;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class UserSearchResultViewModel extends c {
    public final jd7 t;
    public final t15 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchResultViewModel(jd7 jd7Var, t15 t15Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        this.t = jd7Var;
        this.u = t15Var;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        jd7 jd7Var = this.t;
        String str = (String) jd7Var.b("BUNDLE_KEY_QUERY");
        if (str == null) {
            str = "";
        }
        String str2 = (String) jd7Var.b("BUNDLE_KEY_QUERY_SOURCE");
        if (str2 == null) {
            str2 = "Manual";
        }
        if (str.length() > 0) {
            p(new UserSearchResultViewModel$doRequest$1(this, str, str2, null));
        }
    }
}
