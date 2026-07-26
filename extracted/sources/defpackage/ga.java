package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardAction;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ga implements r7, vt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdGuardFragment b;

    public /* synthetic */ ga(AdGuardFragment adGuardFragment, int i) {
        this.a = i;
        this.b = adGuardFragment;
    }

    @Override // defpackage.vt5
    public void f() {
        int i = AdGuardFragment.a1;
        this.b.l1().e();
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        int i = this.a;
        AdGuardFragment adGuardFragment = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i2 = AdGuardFragment.a1;
                js3.p(bool, "it");
                FragmentActivity fragmentActivityF = adGuardFragment.F();
                if (fragmentActivityF != null) {
                    d56 d56Var = adGuardFragment.V0;
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
                int i3 = AdGuardFragment.a1;
                js3.p(activityResult, "it");
                if (activityResult.a == -1) {
                    adGuardFragment.l1().r(AdGuardAction.StartVpnAction.INSTANCE);
                    return;
                }
                return;
        }
    }
}
