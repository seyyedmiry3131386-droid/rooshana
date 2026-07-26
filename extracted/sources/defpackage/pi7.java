package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryTagData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class pi7 extends qg5 {
    public final MyketTextView w;
    public og5 x;

    public pi7(View view) {
        super(view);
        View viewFindViewById = view.findViewById(rr6.tag_view);
        js3.o(viewFindViewById, "findViewById(...)");
        this.w = (MyketTextView) viewFindViewById;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SearchHistoryTagData searchHistoryTagData = (SearchHistoryTagData) myketRecyclerData;
        js3.p(searchHistoryTagData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.space_4);
        int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.space_12);
        String str = searchHistoryTagData.b;
        MyketTextView myketTextView = this.w;
        myketTextView.setText(str);
        myketTextView.setTextColor(sj8.b().n);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.k = sj8.b().l;
        ea7Var.n = sj8.b().l;
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.b().w;
        myketTextView.setBackground(ea7Var.a());
        myketTextView.setPadding(dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3);
        qg5.v(myketTextView, this.x, this, searchHistoryTagData);
    }
}
