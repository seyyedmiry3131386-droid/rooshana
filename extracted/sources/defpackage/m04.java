package defpackage;

import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class m04 {
    public final /* synthetic */ LaunchContentActivity a;

    public m04(LaunchContentActivity launchContentActivity) {
        this.a = launchContentActivity;
    }

    public void onEvent(ms3 ms3Var) {
        int i = LaunchContentActivity.B1;
        LaunchContentActivity launchContentActivity = this.a;
        launchContentActivity.k0();
        launchContentActivity.r0();
        t32.b().m(ms3Var);
    }

    public void onEvent(mu muVar) {
        int i = LaunchContentActivity.B1;
        LaunchContentActivity launchContentActivity = this.a;
        pk5.h(launchContentActivity, new NavIntentDirections.PaymentTrackingApp(new lp8(new DialogDataModel(launchContentActivity.m0(), "DIALOG_KEY_NO_RESULT"), muVar.a)));
        t32.b().m(muVar);
    }
}
