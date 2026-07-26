package ir.mservices.market.version2.activity;

import defpackage.c5;
import defpackage.d04;
import defpackage.d56;
import defpackage.dv2;
import defpackage.pr7;
import defpackage.q91;
import defpackage.sm;
import defpackage.td4;
import defpackage.w91;
import ir.mservices.market.core.BaseDialogActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_LoginActivity extends BaseDialogActivity {
    public boolean N = false;

    public Hilt_LoginActivity() {
        I(new sm(this, 13));
    }

    @Override // ir.mservices.market.core.Hilt_BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.N) {
            return;
        }
        this.N = true;
        LoginActivity loginActivity = (LoginActivity) this;
        w91 w91Var = ((q91) ((td4) e())).a;
        loginActivity.G = (d04) w91Var.p.get();
        loginActivity.H = (pr7) w91Var.s.get();
        loginActivity.I = (d56) w91Var.U.get();
        loginActivity.O = (c5) w91Var.L.get();
        loginActivity.P = (dv2) w91Var.q.get();
    }
}
