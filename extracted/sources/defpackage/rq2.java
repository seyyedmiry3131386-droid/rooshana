package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.gateway.GatewayItemData;
import ir.mservices.market.gateway.b;
import ir.mservices.market.gateway.c;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class rq2 extends a {
    public lq2 l;
    public lq2 m;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == GatewayItemData.d) {
            lq2 lq2Var = this.l;
            if (lq2Var != null) {
                return new b(view, lq2Var);
            }
            js3.V("onGatewayClickListener");
            throw null;
        }
        if (i != GatewayItemData.e) {
            return null;
        }
        lq2 lq2Var2 = this.m;
        if (lq2Var2 != null) {
            return new c(view, lq2Var2);
        }
        js3.V("onPaymentGatewayClickListener");
        throw null;
    }
}
