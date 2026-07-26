package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalItemData;

/* JADX INFO: loaded from: classes3.dex */
public final class id5 extends k06 {
    public qs3 o;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i != MyMarketHorizontalItemData.d) {
            if (i == DividerData.k) {
                return new oq1(view);
            }
            return null;
        }
        qs3 qs3Var = this.o;
        if (qs3Var != null) {
            return new hd5(view, qs3Var);
        }
        js3.V("onClickListener");
        throw null;
    }
}
