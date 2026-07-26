package defpackage;

import android.util.TypedValue;
import android.view.View;
import defpackage.bq;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.h95;
import defpackage.js3;
import defpackage.mr;
import defpackage.og5;
import defpackage.qg5;
import defpackage.ua3;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.common.recycler.HomeNestedAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ua3 extends a {
    public final /* synthetic */ int K = 0;
    public og5 L;
    public og5 M;
    public Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, hs hsVar, gs gsVar, gs gsVar2) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        this.N = hsVar;
        this.L = gsVar;
        this.M = gsVar2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        switch (this.K) {
        }
        return new qc3(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public int B() {
        switch (this.K) {
        }
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        switch (this.K) {
        }
        return this.a.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                HomeAppsRowData homeAppsRowData = (HomeAppsRowData) nestedRecyclerData;
                js3.p(homeAppsRowData, "data");
                TypedValue typedValue = new TypedValue();
                this.a.getResources().getValue(homeAppsRowData.h.isMulti() ? pq6.multi_app_card_count : pq6.app_card_count, typedValue, true);
                return typedValue.getFloat();
            default:
                HomeNestedAppsRowData homeNestedAppsRowData = (HomeNestedAppsRowData) nestedRecyclerData;
                js3.p(homeNestedAppsRowData, "data");
                TypedValue typedValue2 = new TypedValue();
                this.a.getResources().getValue(homeNestedAppsRowData.g.isMulti() ? pq6.multi_app_card_count : pq6.app_card_count, typedValue2, true);
                return typedValue2.getFloat();
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public /* bridge */ /* synthetic */ void s(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                L((HomeAppsRowData) nestedRecyclerData);
                break;
            default:
                K((HomeNestedAppsRowData) nestedRecyclerData);
                break;
        }
    }

    public qc3 J() {
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
        return (qc3) l06Var;
    }

    public void K(HomeNestedAppsRowData homeNestedAppsRowData) {
        js3.p(homeNestedAppsRowData, "data");
        super.s(homeNestedAppsRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.common.HorizontalAppsDataAdapter");
        qc3 qc3Var = (qc3) l06Var;
        qc3Var.p = (s82) this.N;
        final int i = 0;
        qc3Var.n = new og5(this) { // from class: xb3
            public final /* synthetic */ ua3 b;

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
                        og5 og5Var = this.b.L;
                        if (og5Var != null) {
                            og5Var.m(view, mrVar, appNestedData);
                        }
                        break;
                    default:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        og5 og5Var2 = this.b.M;
                        if (og5Var2 != null) {
                            og5Var2.m(view, bqVar, appNestedData2);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        qc3Var.o = new og5(this) { // from class: xb3
            public final /* synthetic */ ua3 b;

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
                        og5 og5Var = this.b.L;
                        if (og5Var != null) {
                            og5Var.m(view, mrVar, appNestedData);
                        }
                        break;
                    default:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        og5 og5Var2 = this.b.M;
                        if (og5Var2 != null) {
                            og5Var2.m(view, bqVar, appNestedData2);
                        }
                        break;
                }
            }
        };
        qc3Var.m = new vv1(27, this);
    }

    public void L(final HomeAppsRowData homeAppsRowData) {
        js3.p(homeAppsRowData, "data");
        super.s(homeAppsRowData);
        final int i = 0;
        J().n = new og5(this) { // from class: ir.mservices.market.app.home.ui.recycler.a
            public final /* synthetic */ ua3 b;

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
                        ua3 ua3Var = this.b;
                        View view2 = ua3Var.a;
                        js3.o(view2, "itemView");
                        bt2.G(cc7.q(view2), null, null, new HomeAppsViewHolder$onAttach$1$1(homeAppsRowData, appNestedData, ua3Var, null), 3);
                        og5 og5Var = ua3Var.M;
                        if (og5Var != null) {
                            og5Var.m(view, mrVar, appNestedData);
                        }
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ua3 ua3Var2 = this.b;
                        View view3 = ua3Var2.a;
                        js3.o(view3, "itemView");
                        bt2.G(cc7.q(view3), null, null, new HomeAppsViewHolder$onAttach$2$1(homeAppsRowData, appNestedData2, ua3Var2, null), 3);
                        og5 og5Var2 = ua3Var2.L;
                        if (og5Var2 != null) {
                            og5Var2.m(view, bqVar, appNestedData2);
                        }
                        break;
                    default:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ua3 ua3Var3 = this.b;
                        View view4 = ua3Var3.a;
                        js3.o(view4, "itemView");
                        bt2.G(cc7.q(view4), null, null, new HomeAppsViewHolder$onAttach$3$1(homeAppsRowData, appNestedData3, ua3Var3, null), 3);
                        og5 og5Var3 = (og5) ua3Var3.N;
                        if (og5Var3 != null) {
                            og5Var3.m(view, h95Var, appNestedData3);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        J().o = new og5(this) { // from class: ir.mservices.market.app.home.ui.recycler.a
            public final /* synthetic */ ua3 b;

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
                        ua3 ua3Var = this.b;
                        View view2 = ua3Var.a;
                        js3.o(view2, "itemView");
                        bt2.G(cc7.q(view2), null, null, new HomeAppsViewHolder$onAttach$1$1(homeAppsRowData, appNestedData, ua3Var, null), 3);
                        og5 og5Var = ua3Var.M;
                        if (og5Var != null) {
                            og5Var.m(view, mrVar, appNestedData);
                        }
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ua3 ua3Var2 = this.b;
                        View view3 = ua3Var2.a;
                        js3.o(view3, "itemView");
                        bt2.G(cc7.q(view3), null, null, new HomeAppsViewHolder$onAttach$2$1(homeAppsRowData, appNestedData2, ua3Var2, null), 3);
                        og5 og5Var2 = ua3Var2.L;
                        if (og5Var2 != null) {
                            og5Var2.m(view, bqVar, appNestedData2);
                        }
                        break;
                    default:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ua3 ua3Var3 = this.b;
                        View view4 = ua3Var3.a;
                        js3.o(view4, "itemView");
                        bt2.G(cc7.q(view4), null, null, new HomeAppsViewHolder$onAttach$3$1(homeAppsRowData, appNestedData3, ua3Var3, null), 3);
                        og5 og5Var3 = (og5) ua3Var3.N;
                        if (og5Var3 != null) {
                            og5Var3.m(view, h95Var, appNestedData3);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        J().m = new og5(this) { // from class: ir.mservices.market.app.home.ui.recycler.a
            public final /* synthetic */ ua3 b;

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
                        ua3 ua3Var = this.b;
                        View view2 = ua3Var.a;
                        js3.o(view2, "itemView");
                        bt2.G(cc7.q(view2), null, null, new HomeAppsViewHolder$onAttach$1$1(homeAppsRowData, appNestedData, ua3Var, null), 3);
                        og5 og5Var = ua3Var.M;
                        if (og5Var != null) {
                            og5Var.m(view, mrVar, appNestedData);
                        }
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ua3 ua3Var2 = this.b;
                        View view3 = ua3Var2.a;
                        js3.o(view3, "itemView");
                        bt2.G(cc7.q(view3), null, null, new HomeAppsViewHolder$onAttach$2$1(homeAppsRowData, appNestedData2, ua3Var2, null), 3);
                        og5 og5Var2 = ua3Var2.L;
                        if (og5Var2 != null) {
                            og5Var2.m(view, bqVar, appNestedData2);
                        }
                        break;
                    default:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        js3.p(view, "view");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ua3 ua3Var3 = this.b;
                        View view4 = ua3Var3.a;
                        js3.o(view4, "itemView");
                        bt2.G(cc7.q(view4), null, null, new HomeAppsViewHolder$onAttach$3$1(homeAppsRowData, appNestedData3, ua3Var3, null), 3);
                        og5 og5Var3 = (og5) ua3Var3.N;
                        if (og5Var3 != null) {
                            og5Var3.m(view, h95Var, appNestedData3);
                        }
                        break;
                }
            }
        };
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public /* bridge */ /* synthetic */ void s(MyketRecyclerData myketRecyclerData) {
        switch (this.K) {
            case 0:
                L((HomeAppsRowData) myketRecyclerData);
                break;
            default:
                K((HomeNestedAppsRowData) myketRecyclerData);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z);
        js3.p(view, "itemView");
        js3.p(graphicUtils$Dimension, "dimension");
    }
}
