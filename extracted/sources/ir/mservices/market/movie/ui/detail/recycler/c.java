package ir.mservices.market.movie.ui.detail.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.dq4;
import defpackage.ec9;
import defpackage.j15;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.q15;
import defpackage.qg5;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketProgressState;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public j15 A;
    public final ec9 B;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, q15 q15Var, q15 q15Var2, q15 q15Var3, q15 q15Var4) {
        super(view);
        js3.p(q15Var, "onDownloadButtonClickListener");
        js3.p(q15Var2, "onButtonClickListener");
        js3.p(q15Var3, "onPosterClickListener");
        js3.p(q15Var4, "onStreamerClickListener");
        this.w = q15Var;
        this.x = q15Var2;
        this.y = q15Var3;
        this.z = q15Var4;
        w91 w91Var = (w91) qg5.r();
        this.B = (ec9) w91Var.C.get();
    }

    public static MyketProgressState y(MovieHeaderData movieHeaderData, Pair pair, dq4 dq4Var) {
        movieHeaderData.getClass();
        if ("movie_header".equalsIgnoreCase(pair != null ? (String) pair.b : null) && pair != null && ((Boolean) pair.a).booleanValue()) {
            return MyketProgressState.c;
        }
        return (js3.i(dq4Var != null ? dq4Var.a : null, movieHeaderData.e) && dq4Var != null && dq4Var.b) ? MyketProgressState.d : MyketProgressState.b;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieHeaderData movieHeaderData = (MovieHeaderData) myketRecyclerData;
        js3.p(movieHeaderData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieHeaderViewHolder$onAttach$1(movieHeaderData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MovieHeaderViewHolder$onAttach$2(movieHeaderData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MovieHeaderViewHolder$onAttach$3(movieHeaderData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MovieHeaderViewHolder$onAttach$4(movieHeaderData, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034f  */
    @Override // defpackage.qg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(ir.mservices.market.common.ui.recycler.MyketRecyclerData r22) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.recycler.c.t(ir.mservices.market.common.ui.recycler.MyketRecyclerData):void");
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j15) {
            this.A = (j15) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final j15 x() {
        j15 j15Var = this.A;
        if (j15Var != null) {
            return j15Var;
        }
        js3.V("binding");
        throw null;
    }
}
