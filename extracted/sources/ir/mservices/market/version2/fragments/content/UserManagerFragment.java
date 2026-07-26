package ir.mservices.market.version2.fragments.content;

import android.os.Bundle;
import defpackage.c5;
import defpackage.dt2;
import defpackage.lw;
import defpackage.mm2;
import defpackage.nz2;
import defpackage.o19;
import defpackage.p40;
import defpackage.pk5;
import defpackage.rs6;
import defpackage.tn5;
import defpackage.wd4;
import defpackage.wl2;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public class UserManagerFragment extends nz2 implements mm2 {
    public static final /* synthetic */ int P0 = 0;
    public c5 O0;

    public UserManagerFragment() {
        super(0);
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        if (str.equalsIgnoreCase(F0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            if ("DIALOG_KEY_NICKNAME".equalsIgnoreCase(dialogDataModel.b)) {
                if (dialogDataModel.d == DialogResult.a) {
                    H0(this.O0.h.e(), null, null);
                }
                if (F() == null || F().L().S()) {
                    return;
                }
                wl2 wl2VarL = F().L();
                wl2VarL.getClass();
                p40 p40Var = new p40(wl2VarL);
                p40Var.j(this);
                p40Var.e();
                return;
            }
            if ("DIALOG_KEY_LOGIN".equalsIgnoreCase(dialogDataModel.b)) {
                if (dialogDataModel.d == DialogResult.a) {
                    if (this.O0.f()) {
                        pk5.g(this.J0, new NavIntentDirections.Profile(), 0);
                    } else {
                        G0();
                    }
                }
                if (F() == null || F().L().S()) {
                    return;
                }
                wl2 wl2VarL2 = F().L();
                wl2VarL2.getClass();
                p40 p40Var2 = new p40(wl2VarL2);
                p40Var2.j(this);
                p40Var2.e();
            }
        }
    }

    public final String F0() {
        return getClass().getSimpleName() + "_" + this.H0;
    }

    public final void G0() {
        lw.d(null, null, this.g);
        lw.d(null, null, F());
        pk5.h(this.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(F0(), "DIALOG_KEY_NICKNAME"), L(rs6.nickname_description_profile))));
    }

    public final void H0(String str, String str2, UserProfileRefId userProfileRefId) {
        if (!this.O0.h.e().equalsIgnoreCase(str)) {
            pk5.h(this.J0, new NavIntentDirections.UserProfile(new o19(str, str2, userProfileRefId.a)));
        } else if (!this.O0.d()) {
            lw.g(null, "Error open profile", null);
            pk5.h(this.J0, new NavIntentDirections.Login(new wd4(new DialogDataModel(F0(), "DIALOG_KEY_LOGIN"), new LoginData(new PhoneBindData(""), L(rs6.bind_message_intent), "Error open profile"))));
        } else if (!this.O0.f()) {
            G0();
        } else {
            pk5.h(this.J0, new NavIntentDirections.Profile());
        }
    }

    @Override // androidx.fragment.app.d
    public final void i0() {
        this.H = true;
        this.J0.d(F0(), this);
    }

    @Override // androidx.fragment.app.d
    public final void j0() {
        this.H = true;
        this.J0.x(F0());
    }
}
