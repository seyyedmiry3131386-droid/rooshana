package ir.mservices.market.activity;

import defpackage.d04;
import defpackage.d56;
import defpackage.j60;
import defpackage.pr7;
import defpackage.q91;
import defpackage.sm;
import defpackage.w91;
import defpackage.x57;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_BaseContentActivity extends BaseActivity {
    public boolean J = false;

    public Hilt_BaseContentActivity() {
        I(new sm(this, 3));
    }

    @Override // ir.mservices.market.activity.Hilt_BaseActivity
    public void R() {
        if (this.J) {
            return;
        }
        this.J = true;
        BaseContentActivity baseContentActivity = (BaseContentActivity) this;
        w91 w91Var = ((q91) ((j60) e())).a;
        baseContentActivity.G = (d04) w91Var.p.get();
        baseContentActivity.H = (pr7) w91Var.s.get();
        baseContentActivity.I = (d56) w91Var.U.get();
        baseContentActivity.K = (x57) w91Var.G.get();
    }
}
