package ir.mservices.market.core;

import defpackage.d04;
import defpackage.d56;
import defpackage.pr7;
import defpackage.q60;
import defpackage.q91;
import defpackage.sm;
import defpackage.w91;
import ir.mservices.market.activity.BaseActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_BaseDialogActivity extends BaseActivity {
    public boolean J = false;

    public Hilt_BaseDialogActivity() {
        I(new sm(this, 4));
    }

    @Override // ir.mservices.market.activity.Hilt_BaseActivity
    public void R() {
        if (this.J) {
            return;
        }
        this.J = true;
        BaseDialogActivity baseDialogActivity = (BaseDialogActivity) this;
        w91 w91Var = ((q91) ((q60) e())).a;
        baseDialogActivity.G = (d04) w91Var.p.get();
        baseDialogActivity.H = (pr7) w91Var.s.get();
        baseDialogActivity.I = (d56) w91Var.U.get();
    }
}
