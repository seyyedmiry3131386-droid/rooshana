package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import ir.mservices.market.app.detail.data.SummaryRateDto;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryRateData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class mt extends qg5 {
    public final og5 w;
    public qt x;
    public final lw8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onSummaryRateClickListener");
        this.w = og5Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppSummaryRateData appSummaryRateData = (AppSummaryRateData) myketRecyclerData;
        js3.p(appSummaryRateData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, appSummaryRateData);
        qt qtVar = this.x;
        if (qtVar == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = qtVar.y;
        SummaryRateDto summaryRateDto = appSummaryRateData.a;
        myketTextView.setText(summaryRateDto.getTitle());
        qt qtVar2 = this.x;
        if (qtVar2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = qtVar2.x;
        lw8 lw8Var = this.y;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView2.setText(lw8.e(lw8Var, summaryRateDto.getSubtitle()));
        qt qtVar3 = this.x;
        if (qtVar3 != null) {
            qtVar3.w.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof qt) {
            this.x = (qt) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
