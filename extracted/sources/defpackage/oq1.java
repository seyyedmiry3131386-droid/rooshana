package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class oq1 extends qg5 {
    public hq1 w;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        DividerData dividerData = (DividerData) myketRecyclerData;
        js3.p(dividerData, "data");
        int i = dividerData.i;
        int i2 = dividerData.h;
        hq1 hq1Var = this.w;
        if (hq1Var == null) {
            js3.V("binding");
            throw null;
        }
        View view = hq1Var.l;
        view.setLayoutDirection(3);
        int i3 = dividerData.c;
        int dimensionPixelSize = 0;
        View view2 = this.a;
        int dimensionPixelSize2 = i3 != -1 ? view2.getResources().getDimensionPixelSize(dividerData.c) : 0;
        view.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        hq1 hq1Var2 = this.w;
        if (hq1Var2 == null) {
            js3.V("binding");
            throw null;
        }
        View view3 = hq1Var2.v;
        view3.setBackgroundColor(sj8.b().v);
        view3.setVisibility(!dividerData.b ? 4 : 0);
        if (dividerData.j != DividerData.l) {
            view3.getLayoutParams().height = view2.getResources().getDimensionPixelSize(dividerData.j);
        }
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = dividerData.d != -1 ? view2.getResources().getDimensionPixelSize(dividerData.d) : dividerData.f != -1 ? view2.getResources().getDimensionPixelSize(dividerData.f) : 0;
        marginLayoutParams.bottomMargin = dividerData.d != -1 ? view2.getResources().getDimensionPixelSize(dividerData.d) : dividerData.g != -1 ? view2.getResources().getDimensionPixelSize(dividerData.g) : 0;
        marginLayoutParams.setMarginStart(dividerData.e != -1 ? view2.getResources().getDimensionPixelSize(dividerData.e) : i2 != -1 ? view2.getResources().getDimensionPixelSize(i2) : 0);
        if (dividerData.e != -1) {
            dimensionPixelSize = view2.getResources().getDimensionPixelSize(dividerData.e);
        } else if (i != -1) {
            dimensionPixelSize = view2.getResources().getDimensionPixelSize(i);
        }
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof hq1) {
            this.w = (hq1) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
