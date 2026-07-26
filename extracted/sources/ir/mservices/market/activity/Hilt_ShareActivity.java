package ir.mservices.market.activity;

import defpackage.d04;
import defpackage.d56;
import defpackage.fr3;
import defpackage.lt7;
import defpackage.pr7;
import defpackage.q91;
import defpackage.sm;
import defpackage.w91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_ShareActivity extends BaseActivity {
    public boolean J = false;

    public Hilt_ShareActivity() {
        I(new sm(this, 17));
    }

    @Override // ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.J) {
            return;
        }
        this.J = true;
        ShareActivity shareActivity = (ShareActivity) this;
        w91 w91Var = ((q91) ((lt7) e())).a;
        shareActivity.G = (d04) w91Var.p.get();
        shareActivity.H = (pr7) w91Var.s.get();
        shareActivity.I = (d56) w91Var.U.get();
        shareActivity.K = w91Var.G0();
        shareActivity.L = (fr3) w91Var.h1.get();
    }
}
