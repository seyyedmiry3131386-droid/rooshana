package ir.mservices.market.version2.ui.recycler.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.n;
import androidx.recyclerview.widget.o;
import defpackage.a79;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.fa1;
import defpackage.g51;
import defpackage.js3;
import defpackage.m80;
import defpackage.qg5;
import defpackage.sg4;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.xt3;
import defpackage.z95;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends n {
    public final int h;
    public BaseNavigationFragment i;
    public BaseNavigationFragment j;
    public z95 k;

    public a(int i) {
        this.h = i;
        t(new m80(this, 0));
    }

    public static final void F(a aVar) {
        int i = 0;
        for (RecyclerItem recyclerItem : (ArrayList) aVar.D().d) {
            int iH = recyclerItem.c.d() == -1 ? aVar.H() : recyclerItem.c.d();
            recyclerItem.a = iH;
            recyclerItem.d = i;
            i += iH;
        }
    }

    public final int G(int i) {
        if (i >= c()) {
            return H();
        }
        if (i <= -1) {
            return H();
        }
        RecyclerItem recyclerItem = (RecyclerItem) z(i);
        if (recyclerItem == null) {
            return H();
        }
        int i2 = recyclerItem.a;
        return i2 == -1 ? H() : i2;
    }

    public int H() {
        return this.h;
    }

    public abstract qg5 I(int i, View view, ViewGroup viewGroup);

    public boolean J() {
        return false;
    }

    @Override // androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public void l(qg5 qg5Var, int i) {
        js3.p(qg5Var, "holder");
        RecyclerItem recyclerItem = (RecyclerItem) z(i);
        if (recyclerItem != null) {
            try {
                qg5Var.t(recyclerItem.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final Object L(bz6 bz6Var, g51 g51Var) {
        Object objF = d.f(bz6Var.a, new BasePagingAdapter$submitData$2(this, bz6Var, null), g51Var);
        return objF == CoroutineSingletons.a ? objF : tx8.a;
    }

    public final void M(xt3 xt3Var, bz6 bz6Var) {
        js3.p(xt3Var, "job");
        js3.p(bz6Var, "recyclerData");
        ug1 ug1Var = up1.a;
        kotlinx.coroutines.android.a aVar = sg4.a.f;
        aVar.getClass();
        bt2.G(js3.a(bt2.L(aVar, xt3Var)), null, null, new BasePagingAdapter$submitData$3(this, bz6Var, null), 3);
    }

    public final void N(xt3 xt3Var, bz6 bz6Var) {
        js3.p(xt3Var, "job");
        js3.p(bz6Var, "recyclerData");
        ug1 ug1Var = up1.a;
        kotlinx.coroutines.android.a aVar = sg4.a.f;
        aVar.getClass();
        bt2.G(js3.a(bt2.L(aVar, xt3Var)), null, null, new BasePagingAdapter$submitShimmerData$3(this, bz6Var, null), 3);
    }

    @Override // androidx.recyclerview.widget.g
    public final int e(int i) {
        RecyclerItem recyclerItem = (RecyclerItem) z(i);
        if (recyclerItem != null) {
            return recyclerItem.b;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        View viewInflate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        a79 a79VarC = fa1.c(layoutInflaterFrom, i, viewGroup, false);
        if (a79VarC == null || (viewInflate = a79VarC.l) == null) {
            viewInflate = layoutInflaterFrom.inflate(i, viewGroup, false);
        }
        js3.m(viewInflate);
        qg5 qg5VarI = I(i, viewInflate, viewGroup);
        if (qg5VarI != null) {
            qg5VarI.w(a79VarC);
            qg5VarI.u = this.i;
            qg5VarI.v = this.j;
        } else {
            qg5VarI = null;
        }
        js3.n(qg5VarI, "null cannot be cast to non-null type ir.mservices.market.common.ui.recycler.MyketViewHolder<ir.mservices.market.common.ui.recycler.MyketRecyclerData>");
        return qg5VarI;
    }

    @Override // androidx.recyclerview.widget.g
    public final void q(o oVar) {
        RecyclerItem recyclerItem;
        qg5 qg5Var = (qg5) oVar;
        int iB = qg5Var.b();
        if (iB <= -1 || (recyclerItem = (RecyclerItem) z(iB)) == null) {
            return;
        }
        qg5Var.s(recyclerItem.c);
    }

    @Override // androidx.recyclerview.widget.g
    public final void r(o oVar) {
        RecyclerItem recyclerItem;
        qg5 qg5Var = (qg5) oVar;
        int iB = qg5Var.b();
        if (iB <= -1 || (recyclerItem = (RecyclerItem) z(iB)) == null) {
            return;
        }
        qg5Var.u = null;
        qg5Var.v = null;
        qg5Var.u(recyclerItem.c);
    }
}
