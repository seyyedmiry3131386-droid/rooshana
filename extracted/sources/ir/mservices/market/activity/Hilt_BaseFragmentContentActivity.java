package ir.mservices.market.activity;

import defpackage.d04;
import defpackage.d56;
import defpackage.dp3;
import defpackage.eg5;
import defpackage.pr7;
import defpackage.q91;
import defpackage.sm;
import defpackage.tj5;
import defpackage.w91;
import defpackage.x57;
import defpackage.x60;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_BaseFragmentContentActivity extends BaseNavigationContentActivity {
    public boolean x0 = false;

    public Hilt_BaseFragmentContentActivity() {
        I(new sm(this, 5));
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.Hilt_BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public void R() {
        if (this.x0) {
            return;
        }
        this.x0 = true;
        BaseFragmentContentActivity baseFragmentContentActivity = (BaseFragmentContentActivity) this;
        w91 w91Var = ((q91) ((x60) e())).a;
        baseFragmentContentActivity.G = (d04) w91Var.p.get();
        baseFragmentContentActivity.H = (pr7) w91Var.s.get();
        baseFragmentContentActivity.I = (d56) w91Var.U.get();
        baseFragmentContentActivity.K = (x57) w91Var.G.get();
        baseFragmentContentActivity.T = (tj5) w91Var.Y0.get();
        baseFragmentContentActivity.U = (eg5) w91Var.t0.get();
        baseFragmentContentActivity.V = (dp3) w91Var.v.get();
    }
}
