package ir.mservices.market.movie.ui.search;

import defpackage.bt2;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pv6;
import defpackage.vy2;
import defpackage.wh7;
import defpackage.y97;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchIntentViewModel extends c {
    public final jd7 t;
    public final wh7 u;
    public final boolean v;
    public final i w;
    public final pv6 x;
    public final i y;
    public final pv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchIntentViewModel(jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.t = jd7Var;
        if (!jd7Var.a("queryString")) {
            throw new IllegalArgumentException("Required argument \"queryString\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("queryString");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"queryString\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("querySource")) {
            throw new IllegalArgumentException("Required argument \"querySource\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("querySource");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"querySource\" is marked as non-null but was passed a null value");
        }
        this.u = new wh7(str, str2);
        Boolean bool = (Boolean) jd7Var.b("first_call");
        this.v = bool != null ? bool.booleanValue() : true;
        i iVarE = vy2.e(0, 7, null);
        this.w = iVarE;
        this.x = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.y = iVarE2;
        this.z = new pv6(iVarE2);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new SearchIntentViewModel$doRequest$1(this, null), 3);
    }
}
