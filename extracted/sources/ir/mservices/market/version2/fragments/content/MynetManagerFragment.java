package ir.mservices.market.version2.fragments.content;

import android.os.Bundle;
import defpackage.dt2;
import defpackage.mm2;
import defpackage.p40;
import defpackage.pk5;
import defpackage.rs6;
import defpackage.wd4;
import defpackage.wl2;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public class MynetManagerFragment extends BaseNavigationFragment implements mm2 {
    public static final /* synthetic */ int K0 = 0;

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        if (str.equalsIgnoreCase(D0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            if ("DIALOG_KEY_LOGIN_MYNET".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                pk5.h(this.J0, new NavIntentDirections.MynetSocial());
            }
            wl2 wl2VarL = F().L();
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.j(this);
            p40Var.e();
        }
    }

    public final String D0() {
        return getClass().getSimpleName() + "_" + this.H0;
    }

    @Override // androidx.fragment.app.d
    public final void T(Bundle bundle) {
        this.H = true;
        this.J0.d(D0(), this);
        pk5.h(this.J0, new NavIntentDirections.Login(new wd4(new DialogDataModel(D0(), "DIALOG_KEY_LOGIN_MYNET", new Bundle()), new LoginData(new PhoneBindData(""), L(rs6.bind_message_mynet), L(rs6.login_label_intent_mynet)))));
    }

    @Override // androidx.fragment.app.d
    public final void a0() {
        this.J0.x(D0());
        this.H = true;
    }
}
