package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.vpnService.cheetah.ui.CheetahAction;
import ir.mservices.market.vpnService.cheetah.ui.CheetahFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements r7, vt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheetahFragment b;

    public /* synthetic */ cq0(CheetahFragment cheetahFragment, int i) {
        this.a = i;
        this.b = cheetahFragment;
    }

    @Override // defpackage.vt5
    public void f() {
        int i = CheetahFragment.b1;
        this.b.l1().e();
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        int i = this.a;
        CheetahFragment cheetahFragment = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i2 = CheetahFragment.b1;
                js3.p(bool, "it");
                FragmentActivity fragmentActivityF = cheetahFragment.F();
                if (fragmentActivityF != null) {
                    d56 d56Var = cheetahFragment.V0;
                    if (d56Var != null) {
                        d56Var.a(fragmentActivityF, bool.booleanValue());
                        return;
                    } else {
                        js3.V("permissionHelper");
                        throw null;
                    }
                }
                return;
            default:
                ActivityResult activityResult = (ActivityResult) obj;
                int i3 = CheetahFragment.b1;
                js3.p(activityResult, "it");
                if (activityResult.a == -1) {
                    cheetahFragment.l1().r(CheetahAction.StartVpnAction.INSTANCE);
                    return;
                }
                return;
        }
    }
}
