package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.pika.connect.recycler.EndPointData;
import ir.mservices.market.views.AvatarImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class a22 extends qg5 {
    public final og5 w;
    public t76 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a22(View view, ts5 ts5Var) {
        super(view);
        js3.p(ts5Var, "onEndPointClickListener");
        this.w = ts5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        EndPointData endPointData = (EndPointData) myketRecyclerData;
        js3.p(endPointData, "data");
        t76 t76Var = this.x;
        if (t76Var == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = t76Var.v;
        View view = this.a;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.payment_icon_size));
        AvatarImageView.setImage$default(avatarImageView, null, endPointData.b, null, null, 13, null);
        t76 t76Var2 = this.x;
        if (t76Var2 == null) {
            js3.V("binding");
            throw null;
        }
        t76Var2.w.setText(endPointData.b);
        qg5.v(view, this.w, this, endPointData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof t76) {
            this.x = (t76) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
