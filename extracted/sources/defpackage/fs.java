package defpackage;

import android.util.TypedValue;
import android.view.View;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.search.history.ui.recycler.AppSearchRecommendedData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fs extends a {
    public bn6 K;
    public hi7 L;
    public hi7 M;
    public hi7 N;
    public rn6 O;
    public lw8 P;
    public gp Q;

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new qc3(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        return this.a.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        AppSearchRecommendedData appSearchRecommendedData = (AppSearchRecommendedData) nestedRecyclerData;
        js3.p(appSearchRecommendedData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(appSearchRecommendedData.g.isMulti() ? pq6.multi_app_card_count : pq6.app_card_count, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: H */
    public final void u(NestedRecyclerData nestedRecyclerData) {
        AppSearchRecommendedData appSearchRecommendedData = (AppSearchRecommendedData) nestedRecyclerData;
        js3.p(appSearchRecommendedData, "data");
        super.u(appSearchRecommendedData);
        gp gpVar = this.Q;
        if (gpVar != null) {
            this.y.g0(gpVar);
        }
        this.Q = null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(final AppSearchRecommendedData appSearchRecommendedData) {
        js3.p(appSearchRecommendedData, "data");
        super.s(appSearchRecommendedData);
        gp gpVar = new gp(2, this);
        this.y.j(gpVar);
        this.Q = gpVar;
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
        qc3 qc3Var = (qc3) l06Var;
        qc3Var.p = this.K;
        final int i = 0;
        qc3Var.n = new og5(this) { // from class: es
            public final /* synthetic */ fs b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                switch (i) {
                    case 0:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        fs fsVar = this.b;
                        l06 l06Var2 = fsVar.C;
                        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it = ((ArrayList) ((qc3) l06Var2).D().d).iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                            } else if (!js3.i(((RecyclerItem) it.next()).c, appNestedData)) {
                                i2++;
                            }
                        }
                        rn6 rn6Var = fsVar.O;
                        if (rn6Var == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var.s(i2, appNestedData.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var = fsVar.L;
                        if (hi7Var != null) {
                            hi7Var.m(view, mrVar, appNestedData);
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        fs fsVar2 = this.b;
                        l06 l06Var3 = fsVar2.C;
                        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it2 = ((ArrayList) ((qc3) l06Var3).D().d).iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i3 = -1;
                            } else if (!js3.i(((RecyclerItem) it2.next()).c, appNestedData2)) {
                                i3++;
                            }
                        }
                        rn6 rn6Var2 = fsVar2.O;
                        if (rn6Var2 == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var2.s(i3, appNestedData2.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var2 = fsVar2.N;
                        if (hi7Var2 != null) {
                            hi7Var2.m(view, bqVar, appNestedData2);
                            return;
                        }
                        return;
                    default:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        fs fsVar3 = this.b;
                        l06 l06Var4 = fsVar3.C;
                        js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it3 = ((ArrayList) ((qc3) l06Var4).D().d).iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i4 = -1;
                            } else if (!js3.i(((RecyclerItem) it3.next()).c, appNestedData3)) {
                                i4++;
                            }
                        }
                        rn6 rn6Var3 = fsVar3.O;
                        if (rn6Var3 == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var3.s(i4, appNestedData3.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var3 = fsVar3.M;
                        if (hi7Var3 != null) {
                            hi7Var3.m(view, h95Var, appNestedData3);
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        qc3Var.o = new og5(this) { // from class: es
            public final /* synthetic */ fs b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                switch (i2) {
                    case 0:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        fs fsVar = this.b;
                        l06 l06Var2 = fsVar.C;
                        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it = ((ArrayList) ((qc3) l06Var2).D().d).iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i22 = -1;
                            } else if (!js3.i(((RecyclerItem) it.next()).c, appNestedData)) {
                                i22++;
                            }
                        }
                        rn6 rn6Var = fsVar.O;
                        if (rn6Var == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var.s(i22, appNestedData.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var = fsVar.L;
                        if (hi7Var != null) {
                            hi7Var.m(view, mrVar, appNestedData);
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        fs fsVar2 = this.b;
                        l06 l06Var3 = fsVar2.C;
                        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it2 = ((ArrayList) ((qc3) l06Var3).D().d).iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i3 = -1;
                            } else if (!js3.i(((RecyclerItem) it2.next()).c, appNestedData2)) {
                                i3++;
                            }
                        }
                        rn6 rn6Var2 = fsVar2.O;
                        if (rn6Var2 == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var2.s(i3, appNestedData2.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var2 = fsVar2.N;
                        if (hi7Var2 != null) {
                            hi7Var2.m(view, bqVar, appNestedData2);
                            return;
                        }
                        return;
                    default:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        fs fsVar3 = this.b;
                        l06 l06Var4 = fsVar3.C;
                        js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it3 = ((ArrayList) ((qc3) l06Var4).D().d).iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i4 = -1;
                            } else if (!js3.i(((RecyclerItem) it3.next()).c, appNestedData3)) {
                                i4++;
                            }
                        }
                        rn6 rn6Var3 = fsVar3.O;
                        if (rn6Var3 == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var3.s(i4, appNestedData3.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var3 = fsVar3.M;
                        if (hi7Var3 != null) {
                            hi7Var3.m(view, h95Var, appNestedData3);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 2;
        qc3Var.m = new og5(this) { // from class: es
            public final /* synthetic */ fs b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                switch (i3) {
                    case 0:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        fs fsVar = this.b;
                        l06 l06Var2 = fsVar.C;
                        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it = ((ArrayList) ((qc3) l06Var2).D().d).iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i22 = -1;
                            } else if (!js3.i(((RecyclerItem) it.next()).c, appNestedData)) {
                                i22++;
                            }
                        }
                        rn6 rn6Var = fsVar.O;
                        if (rn6Var == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var.s(i22, appNestedData.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var = fsVar.L;
                        if (hi7Var != null) {
                            hi7Var.m(view, mrVar, appNestedData);
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        fs fsVar2 = this.b;
                        l06 l06Var3 = fsVar2.C;
                        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it2 = ((ArrayList) ((qc3) l06Var3).D().d).iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i32 = -1;
                            } else if (!js3.i(((RecyclerItem) it2.next()).c, appNestedData2)) {
                                i32++;
                            }
                        }
                        rn6 rn6Var2 = fsVar2.O;
                        if (rn6Var2 == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var2.s(i32, appNestedData2.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var2 = fsVar2.N;
                        if (hi7Var2 != null) {
                            hi7Var2.m(view, bqVar, appNestedData2);
                            return;
                        }
                        return;
                    default:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        fs fsVar3 = this.b;
                        l06 l06Var4 = fsVar3.C;
                        js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
                        Iterator it3 = ((ArrayList) ((qc3) l06Var4).D().d).iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i4 = -1;
                            } else if (!js3.i(((RecyclerItem) it3.next()).c, appNestedData3)) {
                                i4++;
                            }
                        }
                        rn6 rn6Var3 = fsVar3.O;
                        if (rn6Var3 == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var3.s(i4, appNestedData3.b, appSearchRecommendedData.g.getMode());
                        hi7 hi7Var3 = fsVar3.M;
                        if (hi7Var3 != null) {
                            hi7Var3.m(view, h95Var, appNestedData3);
                            return;
                        }
                        return;
                }
            }
        };
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        AppSearchRecommendedData appSearchRecommendedData = (AppSearchRecommendedData) myketRecyclerData;
        js3.p(appSearchRecommendedData, "data");
        super.u(appSearchRecommendedData);
        gp gpVar = this.Q;
        if (gpVar != null) {
            this.y.g0(gpVar);
        }
        this.Q = null;
    }
}
