package ir.mservices.market.gateway;

import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class GatewayItemData implements MyketRecyclerData {
    public static final int d = js6.gateway_view;
    public static final int e = js6.payment_gateway_view;
    public final GatewayDTO a;
    public final int b;
    public final v48 c;

    public GatewayItemData(GatewayDTO gatewayDTO, int i, v48 v48Var) {
        js3.p(gatewayDTO, "gateway");
        js3.p(v48Var, "selectedItem");
        this.a = gatewayDTO;
        this.b = i;
        this.c = v48Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return this.b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }
}
