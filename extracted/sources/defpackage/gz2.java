package defpackage;

import ir.mservices.market.core.BaseDialogActivity;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.services.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gz2 extends BaseDialogActivity {
    public boolean N;

    @Override // ir.mservices.market.core.Hilt_BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.N) {
            return;
        }
        this.N = true;
        InAppPurchaseActivity inAppPurchaseActivity = (InAppPurchaseActivity) this;
        w91 w91Var = ((q91) ((sk3) e())).a;
        inAppPurchaseActivity.G = (d04) w91Var.p.get();
        inAppPurchaseActivity.H = (pr7) w91Var.s.get();
        inAppPurchaseActivity.I = (d56) w91Var.U.get();
        inAppPurchaseActivity.O = (c5) w91Var.L.get();
        inAppPurchaseActivity.P = (c) w91Var.l0.get();
        inAppPurchaseActivity.Q = (x57) w91Var.G.get();
        inAppPurchaseActivity.R = w91Var.Z();
        inAppPurchaseActivity.S = (dv2) w91Var.q.get();
        inAppPurchaseActivity.T = (dp3) w91Var.v.get();
        inAppPurchaseActivity.U = (ec9) w91Var.C.get();
    }
}
