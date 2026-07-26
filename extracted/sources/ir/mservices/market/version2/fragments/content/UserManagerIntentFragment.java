package ir.mservices.market.version2.fragments.content;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.c5;
import defpackage.dt2;
import defpackage.js3;
import defpackage.js8;
import defpackage.lw;
import defpackage.mm2;
import defpackage.nz2;
import defpackage.p40;
import defpackage.pk5;
import defpackage.rs6;
import defpackage.tn5;
import defpackage.wd4;
import defpackage.wl2;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public class UserManagerIntentFragment extends nz2 implements mm2 {
    public c5 O0;

    public UserManagerIntentFragment() {
        super(1);
    }

    public static UserManagerIntentFragment H0(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_KEY_OPEN_STATE", str);
        bundle.putBoolean("BUNDLE_KEY_NICKNAME", z);
        bundle.putString("BUNDLE_KEY_DEFAULT_VALUE", str2);
        bundle.putString("BUNDLE_KEY_MESSAGE", "");
        bundle.putString("BUNDLE_KEY_INTENT", str3);
        bundle.putString("BUNDLE_KEY_ICON_PATH", str4);
        bundle.putString("BUNDLE_KEY_TITLE", str5);
        bundle.putString("BUNDLE_KEY_DESCRIPTION", str6);
        UserManagerIntentFragment userManagerIntentFragment = new UserManagerIntentFragment();
        userManagerIntentFragment.u0(bundle);
        return userManagerIntentFragment;
    }

    public static UserManagerIntentFragment I0(String str, String str2, boolean z) {
        return H0(str, "", str2, null, null, null, z);
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        if (str.equalsIgnoreCase(F0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            if ("DIALOG_KEY_NICKNAME".equalsIgnoreCase(dialogDataModel.b)) {
                if (dialogDataModel.d == DialogResult.a) {
                    G0();
                }
                K0();
            } else if ("DIALOG_KEY_LOGIN".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                boolean z = p0().getBoolean("BUNDLE_KEY_NICKNAME");
                if (!this.O0.f() && z) {
                    J0();
                } else {
                    G0();
                    K0();
                }
            }
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment
    public final String B0() {
        return "USER_INTENT_MANAGER";
    }

    public final String F0() {
        return getClass().getSimpleName() + "_" + this.H0;
    }

    public final void G0() {
        lw.d(null, null, this.g);
        lw.d(null, null, F());
        String str = (String) this.g.get("BUNDLE_KEY_INTENT");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        js8.t(8, F(), str, NearbyRepository.SERVICE_ID);
    }

    public final void J0() {
        lw.d(null, null, this.g);
        pk5.h(this.J0, new NavIntentDirections.Nickname(new tn5(new DialogDataModel(F0(), "DIALOG_KEY_NICKNAME"), L(rs6.nickname_description_profile))));
    }

    public final void K0() {
        if (F() == null || F().L().S()) {
            return;
        }
        wl2 wl2VarL = F().L();
        wl2VarL.getClass();
        p40 p40Var = new p40(wl2VarL);
        p40Var.j(this);
        p40Var.e();
    }

    @Override // androidx.fragment.app.d
    public final void T(Bundle bundle) {
        this.H = true;
        lw.d(null, null, this.g);
        String str = (String) this.g.get("BUNDLE_KEY_DEFAULT_VALUE");
        if ("TYPE_NICKNAME_NOT_SET".equalsIgnoreCase((String) this.g.get("BUNDLE_KEY_OPEN_STATE"))) {
            J0();
            return;
        }
        lw.d(null, null, this.g);
        if (this.O0.d()) {
            return;
        }
        String string = this.g.getString("BUNDLE_KEY_MESSAGE");
        if (TextUtils.isEmpty(string)) {
            string = L(rs6.bind_message_intent);
        }
        String str2 = string;
        String string2 = this.g.getString("BUNDLE_KEY_ICON_PATH");
        String string3 = this.g.getString("BUNDLE_KEY_TITLE");
        String string4 = this.g.getString("BUNDLE_KEY_DESCRIPTION");
        DialogDataModel dialogDataModel = new DialogDataModel(F0(), "DIALOG_KEY_LOGIN");
        PhoneBindData phoneBindData = new PhoneBindData(str);
        String strL = L(rs6.login_label_intent_phone);
        js3.p(strL, "label");
        pk5.h(this.J0, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, str2, strL, string2, string3, string4, (String) null, 960))));
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
