package defpackage;

import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.activity.PermissionDialogActivity;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.version2.activity.ObbMoveActivity;
import ir.mservices.market.version2.activity.WebViewActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lz2 extends BaseNavigationContentActivity {
    public final /* synthetic */ int x0;
    public boolean y0;

    public lz2(int i) {
        this.x0 = i;
        switch (i) {
            case 1:
                this.y0 = false;
                I(new sm((PermissionDialogActivity) this, 16));
                break;
            case 2:
                this.y0 = false;
                I(new sm((WebViewActivity) this, 18));
                break;
            default:
                this.y0 = false;
                I(new sm((ObbMoveActivity) this, 14));
                break;
        }
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.Hilt_BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public void R() {
        switch (this.x0) {
            case 0:
                if (!this.y0) {
                    this.y0 = true;
                    ObbMoveActivity obbMoveActivity = (ObbMoveActivity) this;
                    w91 w91Var = ((q91) ((hq5) e())).a;
                    obbMoveActivity.G = (d04) w91Var.p.get();
                    obbMoveActivity.H = (pr7) w91Var.s.get();
                    obbMoveActivity.I = (d56) w91Var.U.get();
                    obbMoveActivity.K = (x57) w91Var.G.get();
                    obbMoveActivity.T = (tj5) w91Var.Y0.get();
                    obbMoveActivity.U = (eg5) w91Var.t0.get();
                    obbMoveActivity.V = (dp3) w91Var.v.get();
                    obbMoveActivity.z0 = (dp3) w91Var.v.get();
                    obbMoveActivity.A0 = (ps1) w91Var.w.get();
                    obbMoveActivity.B0 = (d56) w91Var.U.get();
                    obbMoveActivity.C0 = (k68) w91Var.V.get();
                }
                break;
            case 1:
                if (!this.y0) {
                    this.y0 = true;
                    PermissionDialogActivity permissionDialogActivity = (PermissionDialogActivity) this;
                    w91 w91Var2 = ((q91) ((a56) e())).a;
                    permissionDialogActivity.G = (d04) w91Var2.p.get();
                    permissionDialogActivity.H = (pr7) w91Var2.s.get();
                    permissionDialogActivity.I = (d56) w91Var2.U.get();
                    permissionDialogActivity.K = (x57) w91Var2.G.get();
                    permissionDialogActivity.T = (tj5) w91Var2.Y0.get();
                    permissionDialogActivity.U = (eg5) w91Var2.t0.get();
                    permissionDialogActivity.V = (dp3) w91Var2.v.get();
                    permissionDialogActivity.z0 = (b56) w91Var2.A.get();
                    permissionDialogActivity.A0 = (lu7) w91Var2.h.get();
                    permissionDialogActivity.B0 = (a) w91Var2.T.get();
                    w91Var2.D0();
                    permissionDialogActivity.C0 = (k68) w91Var2.V.get();
                }
                break;
            default:
                if (!this.y0) {
                    this.y0 = true;
                    WebViewActivity webViewActivity = (WebViewActivity) this;
                    w91 w91Var3 = ((q91) ((xc9) e())).a;
                    webViewActivity.G = (d04) w91Var3.p.get();
                    webViewActivity.H = (pr7) w91Var3.s.get();
                    webViewActivity.I = (d56) w91Var3.U.get();
                    webViewActivity.K = (x57) w91Var3.G.get();
                    webViewActivity.T = (tj5) w91Var3.Y0.get();
                    webViewActivity.U = (eg5) w91Var3.t0.get();
                    webViewActivity.V = (dp3) w91Var3.v.get();
                    webViewActivity.A0 = (i10) w91Var3.y.get();
                    webViewActivity.B0 = (c5) w91Var3.L.get();
                    webViewActivity.C0 = (dp3) w91Var3.v.get();
                    webViewActivity.D0 = (xf5) w91Var3.F.get();
                }
                break;
        }
    }
}
