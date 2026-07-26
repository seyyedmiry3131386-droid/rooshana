package defpackage;

import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.detail.recycler.MovieDescriptionData;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a15 extends qg5 {
    public z05 w;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieDescriptionData movieDescriptionData = (MovieDescriptionData) myketRecyclerData;
        js3.p(movieDescriptionData, "data");
        z05 z05Var = this.w;
        if (z05Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = z05Var.w;
        js3.o(myketTextView, ConfirmDTO.INPUT_TYPE_TEXT);
        String str = movieDescriptionData.a;
        int i = sj8.b().j;
        MyketTextView.setExpandableHtmlText$default(myketTextView, str, 4, Integer.valueOf(i), movieDescriptionData.b, 2, new hk3(15, movieDescriptionData), null, false, true, 192, null);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof z05) {
            this.w = (z05) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
