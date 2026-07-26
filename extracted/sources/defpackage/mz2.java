package defpackage;

import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.version2.activity.ObbMoveBackActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mz2 extends BaseContentActivity {
    public boolean S;

    @Override // ir.mservices.market.activity.Hilt_BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.S) {
            return;
        }
        this.S = true;
        ObbMoveBackActivity obbMoveBackActivity = (ObbMoveBackActivity) this;
        w91 w91Var = ((q91) ((iq5) e())).a;
        obbMoveBackActivity.G = (d04) w91Var.p.get();
        obbMoveBackActivity.H = (pr7) w91Var.s.get();
        obbMoveBackActivity.I = (d56) w91Var.U.get();
        obbMoveBackActivity.K = (x57) w91Var.G.get();
        obbMoveBackActivity.T = (ps1) w91Var.w.get();
        obbMoveBackActivity.U = (k68) w91Var.V.get();
    }
}
