package ir.mservices.market.version2.ui.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.k;
import defpackage.ay3;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.cc7;
import defpackage.cx;
import defpackage.d16;
import defpackage.e51;
import defpackage.gm5;
import defpackage.jq;
import defpackage.js3;
import defpackage.l06;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.rf1;
import defpackage.rj7;
import defpackage.rr6;
import defpackage.rv6;
import defpackage.se5;
import defpackage.u01;
import defpackage.uz6;
import defpackage.v25;
import defpackage.xt3;
import defpackage.xv3;
import defpackage.yz5;
import defpackage.z45;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryData;
import ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$ViewHolderType;
import ir.mservices.market.views.HorizontalRecyclerView;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends qg5 {
    public static final /* synthetic */ int J = 0;
    public int A;
    public d16 B;
    public l06 C;
    public rj7 D;
    public uz6 E;
    public u01 F;
    public final rf1 G;
    public xv3 H;
    public MyketGridLayoutManager I;
    public final GraphicUtils$Dimension w;
    public final boolean x;
    public final HorizontalRecyclerView y;
    public xt3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view);
        js3.p(view, "view");
        js3.p(graphicUtils$Dimension, "dimension");
        this.w = graphicUtils$Dimension;
        this.x = z;
        View viewFindViewById = view.findViewById(rr6.recycler_view);
        js3.o(viewFindViewById, "findViewById(...)");
        this.y = (HorizontalRecyclerView) viewFindViewById;
        this.z = kotlinx.coroutines.a.a();
        this.G = new rf1();
    }

    public abstract l06 A();

    public abstract int B();

    public int C() {
        return 0;
    }

    public float D(NestedRecyclerData nestedRecyclerData) {
        js3.p(nestedRecyclerData, "data");
        return 1.0f;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ir.mservices.market.version2.fragments.base.BaseNavigationFragment, m06] */
    public final void E(NestedRecyclerData nestedRecyclerData, boolean z) {
        js3.p(nestedRecyclerData, "data");
        if (!(nestedRecyclerData instanceof ay3)) {
            View view = this.a;
            js3.o(view, "itemView");
            bt2.G(cc7.q(view), null, null, new NestedRecyclerViewHolder$handleAdapterEmpty$2(nestedRecyclerData, z, this, null), 3);
        } else {
            yz5 yz5Var = new yz5(new z45(8, nestedRecyclerData));
            ?? r4 = this.u;
            if (r4 != 0) {
                r4.u(yz5Var);
            }
        }
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(NestedRecyclerData nestedRecyclerData) {
        u01 u01Var;
        js3.p(nestedRecyclerData, "data");
        this.z = kotlinx.coroutines.a.a();
        l06 l06VarA = A();
        xv3 xv3Var = new xv3(this, nestedRecyclerData, 8);
        this.H = xv3Var;
        cx cxVar = l06VarA.e;
        cxVar.getClass();
        ((CopyOnWriteArrayList) cxVar.f.f.b).add(xv3Var);
        l06VarA.y(new v25(this, nestedRecyclerData, 6));
        l06VarA.v(RecyclerView$Adapter$StateRestorationPolicy.b);
        rv6 rv6Var = nestedRecyclerData.b;
        if (((bz6) rv6Var.a.getValue()).d != null) {
            this.D = new rj7(nestedRecyclerData.d(), this.w);
        }
        rj7 rj7Var = this.D;
        int i = 15;
        HorizontalRecyclerView horizontalRecyclerView = this.y;
        if (rj7Var != null) {
            horizontalRecyclerView.setRecycledViewPool(null);
            d16 d16Var = this.B;
            if (d16Var != null) {
                horizontalRecyclerView.f0(d16Var);
            }
            MultiSelectViewHolder$ViewHolderType multiSelectViewHolder$ViewHolderType = MultiSelectViewHolder$ViewHolderType.a;
            se5 se5Var = new se5(this.A);
            l06VarA.y(new z45(i, se5Var));
            u01Var = new u01(l06VarA, se5Var);
            rj7 rj7Var2 = this.D;
            if (rj7Var2 != null) {
                u01Var.d.a(0, rj7Var2);
            }
            this.F = u01Var;
        } else {
            d16 d16Var2 = this.B;
            if (d16Var2 != null) {
                horizontalRecyclerView.f0(d16Var2);
            }
            d16 d16VarX = x(nestedRecyclerData);
            horizontalRecyclerView.i(d16VarX);
            if (!(nestedRecyclerData instanceof HorizontalSummaryData)) {
                horizontalRecyclerView.setRecycledViewPool(nestedRecyclerData.c);
            }
            this.B = d16VarX;
            MultiSelectViewHolder$ViewHolderType multiSelectViewHolder$ViewHolderType2 = MultiSelectViewHolder$ViewHolderType.a;
            se5 se5Var2 = new se5(this.A);
            l06VarA.y(new z45(i, se5Var2));
            u01Var = new u01(l06VarA, se5Var2);
        }
        horizontalRecyclerView.setAdapter(u01Var);
        this.C = l06VarA;
        int i2 = this.A;
        l06VarA.l = i2;
        rj7 rj7Var3 = this.D;
        if (rj7Var3 != null) {
            rj7Var3.l = i2;
        }
        k layoutManager = horizontalRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.g0(nestedRecyclerData.f);
        }
        rj7 rj7Var4 = this.D;
        if (rj7Var4 != null) {
            rj7Var4.N(this.z, (bz6) rv6Var.a.getValue());
        }
        l06 l06Var = this.C;
        if (l06Var != null) {
            l06Var.M(this.z, (bz6) rv6Var.a.getValue());
        }
        View view = this.a;
        js3.o(view, "itemView");
        e51 e51VarQ = cc7.q(view);
        NestedRecyclerViewHolder$onAttach$3 nestedRecyclerViewHolder$onAttach$3 = new NestedRecyclerViewHolder$onAttach$3(nestedRecyclerData, this, null);
        int i3 = 3;
        bt2.G(e51VarQ, null, null, nestedRecyclerViewHolder$onAttach$3, 3);
        horizontalRecyclerView.setDisableInterceptTouchEventCallBack(new gm5(this));
        uz6 jqVar = this.E;
        if (jqVar == null) {
            jqVar = new jq(i3);
            horizontalRecyclerView.j(jqVar);
        }
        this.E = jqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    @Override // defpackage.qg5
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(ir.mservices.market.version2.ui.recycler.NestedRecyclerData r12) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.ui.recycler.a.t(ir.mservices.market.version2.ui.recycler.NestedRecyclerData):void");
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void u(NestedRecyclerData nestedRecyclerData) {
        js3.p(nestedRecyclerData, "data");
        HorizontalRecyclerView horizontalRecyclerView = this.y;
        k layoutManager = horizontalRecyclerView.getLayoutManager();
        nestedRecyclerData.f = layoutManager != null ? layoutManager.h0() : null;
        uz6 uz6Var = this.E;
        if (uz6Var != null) {
            horizontalRecyclerView.g0(uz6Var);
            this.E = null;
        }
        this.z.g(null);
        horizontalRecyclerView.setAdapter(null);
        this.C = null;
    }

    public final void I(NestedRecyclerData nestedRecyclerData) {
        rj7 rj7Var = this.D;
        if (rj7Var != null) {
            u01 u01Var = this.F;
            if (u01Var == null) {
                js3.V("recyclerAdapter");
                throw null;
            }
            u01Var.y(rj7Var);
            g adapter = this.y.getAdapter();
            u01 u01Var2 = adapter instanceof u01 ? (u01) adapter : null;
            if (u01Var2 != null) {
                u01Var2.y(rj7Var);
            }
            ((bz6) nestedRecyclerData.b.a.getValue()).d = null;
            this.D = null;
        }
    }

    public d16 x(NestedRecyclerData nestedRecyclerData) {
        js3.p(nestedRecyclerData, "data");
        return new d16(0, 0, 0, 0, nestedRecyclerData.c(), true, this.x);
    }

    public PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p(nestedRecyclerData, "data");
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(pq6.item_space);
        int iC = C();
        boolean z = this.x;
        int i = iC - (z ? dimensionPixelSize : 0);
        int iC2 = C();
        if (z) {
            dimensionPixelSize = 0;
        }
        return new PaddingLayoutManager$Padding(i, 0, iC2 - dimensionPixelSize, 0);
    }

    public int z() {
        return 0;
    }
}
