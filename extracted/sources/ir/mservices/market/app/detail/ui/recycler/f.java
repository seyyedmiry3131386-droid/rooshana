package ir.mservices.market.app.detail.ui.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.st;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends qg5 {
    public final og5 w;
    public st x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onSummarySizeClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) myketRecyclerData;
        js3.p(appSummarySizeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppSummarySizeViewHolder$onAttach$1(appSummarySizeData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) myketRecyclerData;
        js3.p(appSummarySizeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, appSummarySizeData);
        st stVar = this.x;
        if (stVar != null) {
            stVar.x.setText(appSummarySizeData.a);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof st) {
            this.x = (st) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
