package ir.mservices.market.activity;

import defpackage.d04;
import defpackage.d56;
import defpackage.dp3;
import defpackage.eg5;
import defpackage.g80;
import defpackage.pr7;
import defpackage.q91;
import defpackage.sm;
import defpackage.tj5;
import defpackage.w91;
import defpackage.x57;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_BaseNavigationContentActivity extends BaseContentActivity {
    public boolean S = false;

    public Hilt_BaseNavigationContentActivity() {
        I(new sm(this, 6));
    }

    @Override // ir.mservices.market.activity.Hilt_BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public void R() {
        if (this.S) {
            return;
        }
        this.S = true;
        BaseNavigationContentActivity baseNavigationContentActivity = (BaseNavigationContentActivity) this;
        w91 w91Var = ((q91) ((g80) e())).a;
        baseNavigationContentActivity.G = (d04) w91Var.p.get();
        baseNavigationContentActivity.H = (pr7) w91Var.s.get();
        baseNavigationContentActivity.I = (d56) w91Var.U.get();
        baseNavigationContentActivity.K = (x57) w91Var.G.get();
        baseNavigationContentActivity.T = (tj5) w91Var.Y0.get();
        baseNavigationContentActivity.U = (eg5) w91Var.t0.get();
        baseNavigationContentActivity.V = (dp3) w91Var.v.get();
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public String T() {
        return C();
    }
}
