package defpackage;

import android.graphics.PorterDuff;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.city.recycler.SelectCityItemData;

/* JADX INFO: loaded from: classes3.dex */
public final class gm7 extends qg5 {
    public final og5 w;
    public q83 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm7(View view, ts5 ts5Var) {
        super(view);
        js3.p(ts5Var, "onItemClickListener");
        this.w = ts5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SelectCityItemData selectCityItemData = (SelectCityItemData) myketRecyclerData;
        js3.p(selectCityItemData, "data");
        q83 q83Var = this.x;
        if (q83Var == null) {
            js3.V("binding");
            throw null;
        }
        q83Var.v.setText(selectCityItemData.a);
        q83 q83Var2 = this.x;
        if (q83Var2 == null) {
            js3.V("binding");
            throw null;
        }
        q83Var2.x.setColorFilter(sj8.b().m, PorterDuff.Mode.MULTIPLY);
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, selectCityItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof q83) {
            this.x = (q83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
