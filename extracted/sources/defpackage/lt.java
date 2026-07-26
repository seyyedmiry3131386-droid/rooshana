package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.a;
import ir.mservices.market.app.detail.data.SummaryIconDto;
import ir.mservices.market.app.detail.ui.recycler.AppSummaryIconData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class lt extends qg5 {
    public final og5 w;
    public ot x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onSummaryIconClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        f57 f57VarH;
        AppSummaryIconData appSummaryIconData = (AppSummaryIconData) myketRecyclerData;
        js3.p(appSummaryIconData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, appSummaryIconData);
        ot otVar = this.x;
        if (otVar == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = otVar.y;
        SummaryIconDto summaryIconDto = appSummaryIconData.a;
        myketTextView.setText(summaryIconDto.getTitle());
        ot otVar2 = this.x;
        if (otVar2 == null) {
            js3.V("binding");
            throw null;
        }
        otVar2.x.setText(summaryIconDto.getSubtitle());
        String iconUrl = summaryIconDto.getIconUrl();
        if (iconUrl == null || f88.n0(iconUrl)) {
            lw.g(null, "url is empty", null);
            iconUrl = "empty_url";
        }
        try {
            f57VarH = a.f(view).q(new ne5(iconUrl, null));
            js3.m(f57VarH);
        } catch (Exception unused) {
            f57VarH = t61.h(iconUrl, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
        f57 f57Var = (f57) f57VarH.k(yq6.icon);
        ot otVar3 = this.x;
        if (otVar3 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = otVar3.w;
        js3.o(imageView, "icon");
        f57Var.Q(new av0(imageView, Integer.valueOf(sj8.b().n)), f57Var);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ot) {
            this.x = (ot) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
