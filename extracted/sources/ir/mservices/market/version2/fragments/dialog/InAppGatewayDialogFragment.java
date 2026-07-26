package ir.mservices.market.version2.fragments.dialog;

import android.view.View;
import defpackage.bi5;
import defpackage.de;
import defpackage.g27;
import defpackage.js3;
import defpackage.kk3;
import defpackage.mq2;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppGatewayDialogFragment extends GatewayBottomDialogFragment {
    public final bi5 l1 = new bi5(g27.a(kk3.class), new de(20, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        return ((kk3) this.l1.getValue()).c;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((kk3) this.l1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "InAppGatewayDialogFragment";
    }

    @Override // ir.mservices.market.gateway.GatewayBottomDialogFragment
    public final GatewayBottomDialogFragment.GatewayData V0() {
        return ((kk3) this.l1.getValue()).b;
    }

    @Override // ir.mservices.market.gateway.GatewayBottomDialogFragment
    public final void X0() {
        mq2 mq2Var = this.i1;
        js3.m(mq2Var);
        mq2Var.e.setVisibility(0);
        mq2 mq2Var2 = this.i1;
        js3.m(mq2Var2);
        mq2Var2.f.setVisibility(0);
        mq2 mq2Var3 = this.i1;
        js3.m(mq2Var3);
        View view = mq2Var3.m;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
