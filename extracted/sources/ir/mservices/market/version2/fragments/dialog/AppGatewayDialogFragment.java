package ir.mservices.market.version2.fragments.dialog;

import android.view.View;
import defpackage.bi5;
import defpackage.de;
import defpackage.g27;
import defpackage.iq;
import defpackage.js3;
import defpackage.m88;
import defpackage.mq2;
import defpackage.yq6;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.views.AppIconView;

/* JADX INFO: loaded from: classes3.dex */
public final class AppGatewayDialogFragment extends GatewayBottomDialogFragment {
    public final bi5 l1 = new bi5(g27.a(iq.class), new de(4, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((iq) this.l1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "AppGatewayDialogFragment";
    }

    @Override // ir.mservices.market.gateway.GatewayBottomDialogFragment
    public final GatewayBottomDialogFragment.GatewayData V0() {
        return ((iq) this.l1.getValue()).b;
    }

    @Override // ir.mservices.market.gateway.GatewayBottomDialogFragment
    public final void X0() {
        mq2 mq2Var = this.i1;
        js3.m(mq2Var);
        AppIconView appIconView = mq2Var.g;
        appIconView.setErrorImageResId(yq6.icon);
        bi5 bi5Var = this.l1;
        AppIconView.setImageUrl$default(appIconView, ((iq) bi5Var.getValue()).c, null, false, 6, null);
        boolean zT = m88.T(((iq) bi5Var.getValue()).b.i, "v2", true);
        mq2 mq2Var2 = this.i1;
        js3.m(mq2Var2);
        mq2Var2.e.setVisibility(zT ? 0 : 8);
        mq2 mq2Var3 = this.i1;
        js3.m(mq2Var3);
        mq2Var3.f.setVisibility(zT ? 0 : 8);
        mq2 mq2Var4 = this.i1;
        js3.m(mq2Var4);
        View view = mq2Var4.m;
        if (view != null) {
            view.setVisibility(zT ? 0 : 8);
        }
    }
}
