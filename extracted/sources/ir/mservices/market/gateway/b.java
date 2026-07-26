package ir.mservices.market.gateway;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import androidx.cardview.widget.CardView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.f57;
import defpackage.js3;
import defpackage.lq2;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.qq2;
import defpackage.sj8;
import defpackage.uq2;
import defpackage.uv1;
import defpackage.zk8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public final og5 w;
    public final StateListDrawable x;
    public final StateListDrawable y;
    public uq2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, lq2 lq2Var) {
        super(view);
        js3.p(lq2Var, "onGatewayClickListener");
        this.w = lq2Var;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.o = false;
        ea7Var.p = Ripple.a(sj8.b().O, sj8.b().c);
        ea7Var.i = sj8.b().c;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_16));
        this.x = ea7Var.a();
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.j = false;
        ea7Var2.o = false;
        ea7Var2.p = Ripple.a(sj8.b().O, sj8.b().c);
        ea7Var2.i = sj8.b().v;
        ea7Var2.c(view.getResources().getDimensionPixelSize(pq6.space_16));
        this.y = ea7Var2.a();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        GatewayItemData gatewayItemData = (GatewayItemData) myketRecyclerData;
        js3.p(gatewayItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new GatewayItemViewHolder$onAttach$1(gatewayItemData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        GatewayItemData gatewayItemData = (GatewayItemData) myketRecyclerData;
        js3.p(gatewayItemData, "data");
        uq2 uq2Var = this.z;
        if (uq2Var == null) {
            js3.V("binding");
            throw null;
        }
        CardView cardView = uq2Var.v;
        js3.o(cardView, "cardView");
        if (!cardView.isLaidOut() || cardView.isLayoutRequested()) {
            cardView.addOnLayoutChangeListener(new qq2());
        } else {
            cardView.getLayoutParams().height = cardView.getMeasuredWidth();
            cardView.requestLayout();
        }
        GatewayDTO gatewayDTO = gatewayItemData.a;
        View view = this.a;
        js3.o(view, "itemView");
        f57 f57VarW = zk8.P(view, gatewayDTO.getIconUrl()).W(uv1.b());
        uq2 uq2Var2 = this.z;
        if (uq2Var2 == null) {
            js3.V("binding");
            throw null;
        }
        f57VarW.P(uq2Var2.x);
        f57 f57VarW2 = zk8.P(view, gatewayDTO.getDeselectedIconUrl()).W(uv1.b());
        uq2 uq2Var3 = this.z;
        if (uq2Var3 == null) {
            js3.V("binding");
            throw null;
        }
        f57VarW2.P(uq2Var3.y);
        uq2 uq2Var4 = this.z;
        if (uq2Var4 == null) {
            js3.V("binding");
            throw null;
        }
        uq2Var4.z.setText(gatewayDTO.getTitle());
        uq2 uq2Var5 = this.z;
        if (uq2Var5 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = uq2Var5.w;
        js3.o(view2, "content");
        qg5.v(view2, this.w, this, gatewayItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof uq2) {
            this.z = (uq2) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
