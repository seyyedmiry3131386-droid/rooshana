package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.search.history.ui.recycler.SearchAppData;
import ir.mservices.market.version2.webapi.responsedto.SearchSuggestionsAppDto;
import ir.mservices.market.views.AppIconView;

/* JADX INFO: loaded from: classes3.dex */
public final class nh7 extends qg5 {
    public hi7 w;
    public j83 x;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SearchAppData searchAppData = (SearchAppData) myketRecyclerData;
        js3.p(searchAppData, "data");
        SearchSuggestionsAppDto searchSuggestionsAppDto = searchAppData.a;
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, searchAppData);
        j83 j83Var = this.x;
        if (j83Var == null) {
            js3.V("binding");
            throw null;
        }
        j83Var.w.setText(searchSuggestionsAppDto.getTitle());
        j83 j83Var2 = this.x;
        if (j83Var2 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = j83Var2.v;
        js3.o(appIconView, "appIcon");
        AppIconView.setImageUrl$default(appIconView, searchSuggestionsAppDto.getIconPath(), null, false, 6, null);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j83) {
            this.x = (j83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
