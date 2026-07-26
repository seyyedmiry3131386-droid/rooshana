package ir.mservices.market.app.detail.ui.recycler;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.fa2;
import defpackage.jq;
import defpackage.js3;
import defpackage.k13;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.qw7;
import defpackage.uz6;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public uz6 A;
    public final og5 w;
    public final d04 x;
    public k13 y;
    public qw7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onTagClickListener");
        this.w = og5Var;
        this.x = (d04) ((w91) qg5.r()).p.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppHorizontalTagsData appHorizontalTagsData = (AppHorizontalTagsData) myketRecyclerData;
        js3.p(appHorizontalTagsData, "data");
        k13 k13Var = this.y;
        if (k13Var == null) {
            js3.V("binding");
            throw null;
        }
        RecyclerView recyclerView = k13Var.w;
        fa2 fa2Var = new fa2(1, 9);
        og5 og5Var = this.w;
        js3.p(og5Var, "<set-?>");
        fa2Var.m = og5Var;
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppHorizontalTagsViewHolder$onAttach$1$1(fa2Var, appHorizontalTagsData, null), 3);
        recyclerView.setAdapter(fa2Var);
        uz6 jqVar = this.A;
        if (jqVar == null) {
            jqVar = new jq(0);
            k13 k13Var2 = this.y;
            if (k13Var2 == null) {
                js3.V("binding");
                throw null;
            }
            k13Var2.w.j(jqVar);
        }
        this.A = jqVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppHorizontalTagsData appHorizontalTagsData = (AppHorizontalTagsData) myketRecyclerData;
        js3.p(appHorizontalTagsData, "data");
        d04 d04Var = this.x;
        if (d04Var == null) {
            js3.V("mLanguageHelper");
            throw null;
        }
        boolean zF = d04Var.f();
        View view = this.a;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        k13 k13Var = this.y;
        if (k13Var == null) {
            js3.V("binding");
            throw null;
        }
        RecyclerView recyclerView = k13Var.w;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        k13 k13Var2 = this.y;
        if (k13Var2 == null) {
            js3.V("binding");
            throw null;
        }
        k layoutManager = k13Var2.w.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.g0(appHorizontalTagsData.b);
        }
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.margin_default_v2);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        qw7 qw7Var = this.z;
        if (qw7Var != null) {
            k13 k13Var3 = this.y;
            if (k13Var3 == null) {
                js3.V("binding");
                throw null;
            }
            k13Var3.w.f0(qw7Var);
        }
        int i = dimensionPixelSize / 2;
        qw7 qw7Var2 = new qw7(zF, dimensionPixelSize2, dimensionPixelSize2, i, i);
        k13 k13Var4 = this.y;
        if (k13Var4 == null) {
            js3.V("binding");
            throw null;
        }
        k13Var4.w.i(qw7Var2);
        this.z = qw7Var2;
        uz6 uz6Var = this.A;
        if (uz6Var != null) {
            k13 k13Var5 = this.y;
            if (k13Var5 == null) {
                js3.V("binding");
                throw null;
            }
            k13Var5.w.g0(uz6Var);
        }
        uz6 jqVar = this.A;
        if (jqVar == null) {
            jqVar = new jq(0);
            k13 k13Var6 = this.y;
            if (k13Var6 == null) {
                js3.V("binding");
                throw null;
            }
            k13Var6.w.j(jqVar);
        }
        this.A = jqVar;
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        AppHorizontalTagsData appHorizontalTagsData = (AppHorizontalTagsData) myketRecyclerData;
        js3.p(appHorizontalTagsData, "data");
        k13 k13Var = this.y;
        if (k13Var == null) {
            js3.V("binding");
            throw null;
        }
        k layoutManager = k13Var.w.getLayoutManager();
        appHorizontalTagsData.b = layoutManager != null ? layoutManager.h0() : null;
        uz6 uz6Var = this.A;
        if (uz6Var != null) {
            k13 k13Var2 = this.y;
            if (k13Var2 == null) {
                js3.V("binding");
                throw null;
            }
            k13Var2.w.g0(uz6Var);
            this.A = null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof k13) {
            this.y = (k13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
