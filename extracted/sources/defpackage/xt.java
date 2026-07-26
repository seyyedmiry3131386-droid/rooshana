package defpackage;

import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myMarket.MyMarketViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xt implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xt(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                s30 s30Var = (s30) obj;
                js3.p(s30Var, "it");
                return Boolean.valueOf(this.b || s30Var.b);
            default:
                return Boolean.valueOf(MyMarketViewModel.editAnimatedIcon$lambda$0(this.b, (RecyclerItem) obj));
        }
    }
}
