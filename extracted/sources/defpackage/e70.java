package defpackage;

import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.o;
import ir.mservices.market.app.home.ui.recycler.HomeVideoListData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.mservices.market.views.HorizontalRecyclerView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e70 extends a {
    public final /* synthetic */ int K = 1;
    public og5 L;
    public og5 M;

    public /* synthetic */ e70(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        switch (this.K) {
            case 0:
                return new o59(1);
            default:
                return new yc3(1);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
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
                js3.p((HomeVideoListData) nestedRecyclerData, "data");
                TypedValue typedValue = new TypedValue();
                this.a.getResources().getValue(pq6.multi_app_card_count, typedValue, true);
                return typedValue.getFloat();
            default:
                UserCardRowData userCardRowData = (UserCardRowData) nestedRecyclerData;
                js3.p(userCardRowData, "data");
                TypedValue typedValue2 = new TypedValue();
                this.a.getResources().getValue(userCardRowData.g.isMulti() ? pq6.multi_user_card_count : pq6.user_card_count, typedValue2, true);
                return typedValue2.getFloat();
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public /* bridge */ /* synthetic */ void s(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                J((HomeVideoListData) nestedRecyclerData);
                break;
            default:
                K((UserCardRowData) nestedRecyclerData);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: H */
    public void u(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                HomeVideoListData homeVideoListData = (HomeVideoListData) nestedRecyclerData;
                js3.p(homeVideoListData, "data");
                int childCount = this.y.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    L(i, null);
                }
                super.u(homeVideoListData);
                break;
            default:
                super.u(nestedRecyclerData);
                break;
        }
    }

    public void J(HomeVideoListData homeVideoListData) {
        js3.p(homeVideoListData, "data");
        super.s(homeVideoListData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.home.VideoListDataAdapter");
        og5 og5Var = this.L;
        js3.p(og5Var, "<set-?>");
        ((o59) l06Var).n = og5Var;
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.home.VideoListDataAdapter");
        og5 og5Var2 = this.M;
        js3.p(og5Var2, "<set-?>");
        ((o59) l06Var2).o = og5Var2;
        l06 l06Var3 = this.C;
        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.app.home.VideoListDataAdapter");
        ((o59) l06Var3).p = new pt2(10, this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [z09] */
    /* JADX WARN: Type inference failed for: r1v0, types: [z09] */
    public void K(UserCardRowData userCardRowData) {
        js3.p(userCardRowData, "data");
        super.s(userCardRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.social.mynet.HorizontalUsersAdapter");
        final int i = 0;
        ((yc3) l06Var).m = new og5(this) { // from class: z09
            public final /* synthetic */ e70 b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                switch (i) {
                    case 0:
                        b29 b29Var = (b29) qg5Var;
                        UserCardData userCardData = (UserCardData) obj;
                        js3.p(view, "view");
                        js3.p(b29Var, "viewHolder");
                        js3.p(userCardData, "recyclerData");
                        og5 og5Var = this.b.L;
                        if (og5Var != null) {
                            og5Var.m(view, b29Var, userCardData);
                        }
                        break;
                    default:
                        d19 d19Var = (d19) qg5Var;
                        UserCardData userCardData2 = (UserCardData) obj;
                        js3.p(view, "view");
                        js3.p(d19Var, "viewHolder");
                        js3.p(userCardData2, "recyclerData");
                        og5 og5Var2 = this.b.M;
                        if (og5Var2 != null) {
                            og5Var2.m(view, d19Var, userCardData2);
                        }
                        break;
                }
            }
        };
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.social.mynet.HorizontalUsersAdapter");
        final int i2 = 1;
        ((yc3) l06Var2).n = new og5(this) { // from class: z09
            public final /* synthetic */ e70 b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                switch (i2) {
                    case 0:
                        b29 b29Var = (b29) qg5Var;
                        UserCardData userCardData = (UserCardData) obj;
                        js3.p(view, "view");
                        js3.p(b29Var, "viewHolder");
                        js3.p(userCardData, "recyclerData");
                        og5 og5Var = this.b.L;
                        if (og5Var != null) {
                            og5Var.m(view, b29Var, userCardData);
                        }
                        break;
                    default:
                        d19 d19Var = (d19) qg5Var;
                        UserCardData userCardData2 = (UserCardData) obj;
                        js3.p(view, "view");
                        js3.p(d19Var, "viewHolder");
                        js3.p(userCardData2, "recyclerData");
                        og5 og5Var2 = this.b.M;
                        if (og5Var2 != null) {
                            og5Var2.m(view, d19Var, userCardData2);
                        }
                        break;
                }
            }
        };
    }

    public void L(int i, String str) {
        HorizontalRecyclerView horizontalRecyclerView = this.y;
        View childAt = horizontalRecyclerView.getChildAt(i);
        if (childAt != null) {
            o oVarN = horizontalRecyclerView.N(childAt);
            g70 g70Var = oVarN instanceof g70 ? (g70) oVarN : null;
            if (str != null) {
                if (str.equalsIgnoreCase(g70Var != null ? g70Var.z : null)) {
                    return;
                }
            }
            if (g70Var != null) {
                g70Var.y();
            }
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public /* bridge */ /* synthetic */ void s(MyketRecyclerData myketRecyclerData) {
        switch (this.K) {
            case 0:
                J((HomeVideoListData) myketRecyclerData);
                break;
            default:
                K((UserCardRowData) myketRecyclerData);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public void u(MyketRecyclerData myketRecyclerData) {
        switch (this.K) {
            case 0:
                HomeVideoListData homeVideoListData = (HomeVideoListData) myketRecyclerData;
                js3.p(homeVideoListData, "data");
                int childCount = this.y.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    L(i, null);
                }
                super.u(homeVideoListData);
                break;
            default:
                super.u(myketRecyclerData);
                break;
        }
    }

    public e70(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2) {
        super(view, graphicUtils$Dimension, z);
        this.L = og5Var;
        this.M = og5Var2;
    }
}
