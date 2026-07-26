package defpackage;

import android.view.View;
import ir.mservices.market.app.search.result.ui.recycler.SearchSummaryAppData;
import ir.mservices.market.app.search.result.ui.recycler.a;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class qj7 extends a {
    public final MyketTextView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj7(View view, hs hsVar, og5 og5Var) {
        super(view, hsVar, og5Var);
        js3.p(hsVar, "fastDownloadClickListener");
        this.y = (xf5) ((w91) qg5.r()).F.get();
        View viewFindViewById = view.findViewById(rr6.description);
        js3.o(viewFindViewById, "findViewById(...)");
        this.G = (MyketTextView) viewFindViewById;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void t(SearchSummaryAppData searchSummaryAppData) {
        js3.p(searchSummaryAppData, "data");
        super.t(searchSummaryAppData);
        SearchSpecialAppDTO searchSpecialAppDTO = searchSummaryAppData.i;
        String text = searchSpecialAppDTO.getSummary().getText();
        if (text == null || f88.n0(text)) {
            return;
        }
        MyketTextView.setTextFromHtml$default(this.G, searchSpecialAppDTO.getSummary().getText(), 2, null, null, false, 28, null);
    }
}
