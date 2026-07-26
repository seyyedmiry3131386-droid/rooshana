package ir.mservices.market.app.suggest.detail.recycler;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.fa2;
import defpackage.ia6;
import defpackage.jq;
import defpackage.js3;
import defpackage.l73;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.qw7;
import defpackage.s7;
import defpackage.sj8;
import defpackage.ur4;
import defpackage.uz6;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public uz6 A;
    public l73 B;
    public final int w;
    public final og5 x;
    public final d04 y;
    public qw7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, View view, ia6 ia6Var) {
        super(view);
        js3.p(ia6Var, "onScreenshotItemClickListener");
        this.w = i;
        this.x = ia6Var;
        w91 w91Var = (w91) qg5.r();
        this.y = (d04) w91Var.p.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        PlayScreenshots playScreenshots = (PlayScreenshots) myketRecyclerData;
        js3.p(playScreenshots, "data");
        RecyclerView recyclerView = x().w;
        fa2 fa2Var = new fa2(this.w, 5);
        fa2Var.m = new ur4(this, playScreenshots, 10);
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new PlayScreenshotsViewHolder$onAttach$1$2(fa2Var, playScreenshots, null), 3);
        recyclerView.setAdapter(fa2Var);
        uz6 jqVar = this.A;
        if (jqVar == null) {
            jqVar = new jq(4);
            x().w.j(jqVar);
        }
        this.A = jqVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        js3.p((PlayScreenshots) myketRecyclerData, "appScreenshotModuleData");
        RecyclerView recyclerView = x().w;
        recyclerView.setNestedScrollingEnabled(false);
        View view = this.a;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        uz6 uz6Var = this.A;
        if (uz6Var != null) {
            x().w.g0(uz6Var);
        }
        uz6 jqVar = this.A;
        if (jqVar == null) {
            jqVar = new jq(4);
            x().w.j(jqVar);
        }
        this.A = jqVar;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_8);
        qw7 qw7Var = this.z;
        if (qw7Var != null) {
            x().w.f0(qw7Var);
        }
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.recycler_view_horizontal_padding);
        int i = dimensionPixelSize / 2;
        d04 d04Var = this.y;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        qw7 qw7Var2 = new qw7(d04Var.f(), dimensionPixelSize2, dimensionPixelSize2, i, i);
        x().w.i(qw7Var2);
        this.z = qw7Var2;
        x().v.setBackgroundColor(sj8.b().l);
        RecyclerView recyclerView2 = x().w;
        recyclerView2.setVerticalScrollBarEnabled(false);
        recyclerView2.setHorizontalScrollBarEnabled(false);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((PlayScreenshots) myketRecyclerData, "data");
        uz6 uz6Var = this.A;
        if (uz6Var != null) {
            x().w.g0(uz6Var);
            this.A = null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof l73) {
            this.B = (l73) a79Var;
        } else {
            s7.m("binding is incompatible");
            throw null;
        }
    }

    public final l73 x() {
        l73 l73Var = this.B;
        if (l73Var != null) {
            return l73Var;
        }
        js3.V("binding");
        throw null;
    }
}
