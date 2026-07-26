package ir.mservices.market.gateway;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.dv2;
import defpackage.ea7;
import defpackage.f57;
import defpackage.j46;
import defpackage.js3;
import defpackage.lq2;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.uv1;
import defpackage.w91;
import defpackage.zk8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public j46 A;
    public final og5 w;
    public final dv2 x;
    public final StateListDrawable y;
    public final StateListDrawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, lq2 lq2Var) {
        super(view);
        js3.p(lq2Var, "onGatewayClickListener");
        this.w = lq2Var;
        this.x = (dv2) ((w91) qg5.r()).q.get();
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.o = false;
        ea7Var.p = Ripple.a(sj8.b().O, sj8.b().c);
        ea7Var.i = sj8.b().v;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_16));
        this.z = ea7Var.a();
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.j = false;
        ea7Var2.o = false;
        ea7Var2.p = Ripple.a(sj8.b().O, sj8.b().c);
        ea7Var2.i = sj8.b().c;
        ea7Var2.c(view.getResources().getDimensionPixelSize(pq6.space_16));
        this.y = ea7Var2.a();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        GatewayItemData gatewayItemData = (GatewayItemData) myketRecyclerData;
        js3.p(gatewayItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new PaymentGatewayItemViewHolder$onAttach$1(gatewayItemData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        GatewayItemData gatewayItemData = (GatewayItemData) myketRecyclerData;
        js3.p(gatewayItemData, "data");
        GatewayDTO gatewayDTO = gatewayItemData.a;
        View view = this.a;
        js3.o(view, "itemView");
        f57 f57VarW = zk8.P(view, gatewayDTO.getIconUrl()).W(uv1.b());
        j46 j46Var = this.A;
        if (j46Var == null) {
            js3.V("binding");
            throw null;
        }
        f57VarW.P(j46Var.y);
        f57 f57VarW2 = zk8.P(view, gatewayDTO.getDeselectedIconUrl()).W(uv1.b());
        j46 j46Var2 = this.A;
        if (j46Var2 == null) {
            js3.V("binding");
            throw null;
        }
        f57VarW2.P(j46Var2.z);
        j46 j46Var3 = this.A;
        if (j46Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = j46Var3.A;
        myketTextView.setText(gatewayDTO.getTitle());
        myketTextView.setTextColor(sj8.b().m);
        j46 j46Var4 = this.A;
        if (j46Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = j46Var4.x;
        myketTextView2.setText(gatewayDTO.getDescription());
        myketTextView2.setTextColor(sj8.b().n);
        dv2 dv2Var = this.x;
        if (dv2Var == null) {
            js3.V("graphicUtils");
            throw null;
        }
        myketTextView2.setTextSize(0, view.getResources().getDimension(dv2Var.c() == 2 ? pq6.font_size_normal : pq6.font_size_medium));
        j46 j46Var5 = this.A;
        if (j46Var5 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = j46Var5.w;
        js3.o(view2, "content");
        qg5.v(view2, this.w, this, gatewayItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j46) {
            this.A = (j46) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
