package defpackage;

import ir.mservices.market.common.Filter;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bz6 {
    public static final na4 e;
    public static final a06 f;
    public xe2 a;
    public Filter b;
    public qp2 c;
    public xe2 d;

    static {
        na4 na4Var = new na4(new ia4(false), new ia4(false), new ia4(false));
        e = na4Var;
        f = sl3.x(na4Var);
    }

    public bz6(xe2 xe2Var, Filter filter, qp2 qp2Var, xe2 xe2Var2) {
        js3.p(xe2Var, "pagingFlow");
        this.a = xe2Var;
        this.b = filter;
        this.c = qp2Var;
        this.d = xe2Var2;
    }

    public /* synthetic */ bz6(xe2 xe2Var, Filter filter, qp2 qp2Var, pv6 pv6Var, int i) {
        this(xe2Var, (i & 2) != 0 ? null : filter, (i & 4) != 0 ? null : qp2Var, (i & 8) != 0 ? null : pv6Var);
    }

    public /* synthetic */ bz6(List list, GeneralFilter generalFilter, qp2 qp2Var, int i) {
        this(list, (i & 2) != 0 ? null : generalFilter, (i & 4) != 0 ? null : qp2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bz6(List list, Filter filter, qp2 qp2Var) {
        this(new d9(5, sl3.y(list, e)), filter, qp2Var, null, 8);
        js3.p(list, CommonDataKt.HOME_MOVIE_TYPE_LIST);
    }

    public bz6() {
        this(new d9(5, f), null, null, null, 14);
    }
}
