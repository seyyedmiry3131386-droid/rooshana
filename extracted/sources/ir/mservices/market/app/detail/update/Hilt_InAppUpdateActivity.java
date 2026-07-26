package ir.mservices.market.app.detail.update;

import defpackage.d04;
import defpackage.d56;
import defpackage.dp3;
import defpackage.pr7;
import defpackage.q91;
import defpackage.rf7;
import defpackage.sm;
import defpackage.w91;
import defpackage.xk3;
import ir.mservices.market.core.BaseDialogActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_InAppUpdateActivity extends BaseDialogActivity {
    public boolean N = false;

    public Hilt_InAppUpdateActivity() {
        I(new sm(this, 11));
    }

    @Override // ir.mservices.market.core.Hilt_BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.N) {
            return;
        }
        this.N = true;
        InAppUpdateActivity inAppUpdateActivity = (InAppUpdateActivity) this;
        w91 w91Var = ((q91) ((xk3) e())).a;
        inAppUpdateActivity.G = (d04) w91Var.p.get();
        inAppUpdateActivity.H = (pr7) w91Var.s.get();
        inAppUpdateActivity.I = (d56) w91Var.U.get();
        inAppUpdateActivity.O = (rf7) w91Var.r.get();
        inAppUpdateActivity.P = (dp3) w91Var.v.get();
    }
}
