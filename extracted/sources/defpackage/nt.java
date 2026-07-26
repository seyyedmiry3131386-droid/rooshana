package defpackage;

import android.view.View;
import ir.mservices.market.app.detail.data.SummaryTextDto;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryTextData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class nt extends qg5 {
    public final og5 w;
    public tt x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onSummaryTextClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppSummaryTextData appSummaryTextData = (AppSummaryTextData) myketRecyclerData;
        js3.p(appSummaryTextData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, appSummaryTextData);
        tt ttVar = this.x;
        if (ttVar == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = ttVar.x;
        SummaryTextDto summaryTextDto = appSummaryTextData.a;
        myketTextView.setText(summaryTextDto.getTitle());
        tt ttVar2 = this.x;
        if (ttVar2 != null) {
            ttVar2.w.setText(summaryTextDto.getSubtitle());
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof tt) {
            this.x = (tt) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
