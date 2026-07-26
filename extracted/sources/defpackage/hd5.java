package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalItemData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class hd5 extends qg5 {
    public final og5 w;
    public sg5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd5(View view, qs3 qs3Var) {
        super(view);
        js3.p(qs3Var, "onClickListener");
        this.w = qs3Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MyMarketHorizontalItemData myMarketHorizontalItemData = (MyMarketHorizontalItemData) myketRecyclerData;
        js3.p(myMarketHorizontalItemData, "data");
        sg5 sg5Var = this.x;
        if (sg5Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = sg5Var.w;
        myketTextView.setTextColor(sj8.b().m);
        View view = this.a;
        myketTextView.setText(view.getResources().getString(myMarketHorizontalItemData.a));
        sg5 sg5Var2 = this.x;
        if (sg5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = sg5Var2.v;
        imageView.setColorFilter(sj8.b().n);
        imageView.setImageResource(myMarketHorizontalItemData.b);
        qg5.v(view, this.w, this, myMarketHorizontalItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof sg5) {
            this.x = (sg5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
