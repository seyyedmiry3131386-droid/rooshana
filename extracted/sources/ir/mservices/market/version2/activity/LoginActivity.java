package ir.mservices.market.version2.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.am2;
import defpackage.c5;
import defpackage.dt2;
import defpackage.dv2;
import defpackage.dw1;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import defpackage.mm2;
import defpackage.pk5;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.wd4;
import defpackage.yi5;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.version2.fragments.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginActivity extends Hilt_LoginActivity implements am2, mm2 {
    public c5 O;
    public dv2 P;
    public a Q;

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        DialogDataModel dialogDataModel;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase("LoginActivity_" + this.K) && (dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class)) != null && m88.T(dialogDataModel.b, "DIALOG_KEY_LOGIN", true)) {
            if (dialogDataModel.d == DialogResult.a) {
                c5 c5Var = this.O;
                if (c5Var == null) {
                    js3.V("accountManager");
                    throw null;
                }
                String str2 = (String) c5Var.h.j;
                Intent intent = new Intent();
                intent.putExtra("RESPONSE_CODE", 0);
                intent.putExtra("RESPONSE_LOGIN", 4);
                intent.putExtra("RESPONSE_USER_ID", str2);
                setResult(-1, intent);
            } else {
                setResult(0, null);
            }
            finish();
        }
    }

    @Override // defpackage.z80
    public final String C() {
        String string = getString(rs6.page_name_login_activity);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // defpackage.am2
    public final void E() {
    }

    @Override // defpackage.am2
    public final void clearAll() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a(null);
        } else {
            js3.V("fragmentNavigationWrapper");
            throw null;
        }
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        js3.p(str, "requestKey");
        js3.p(mm2Var, "listener");
        L().h0(str, this, mm2Var);
    }

    @Override // defpackage.am2
    public final d g() {
        a aVar = this.Q;
        if (aVar != null) {
            return aVar.c();
        }
        js3.V("fragmentNavigationWrapper");
        throw null;
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "bundle");
        boolean z = bundle.getBoolean("BUNDLE_KEY_DISMISS", false);
        d dVarG = g();
        if (z && dVarG != null) {
            q();
        }
        L().g0(bundle, str);
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(js6.activity_login);
        if (Build.VERSION.SDK_INT == 26) {
            findViewById(rr6.layout).setBackgroundColor(sj8.b().l);
        }
        setResult(0, getIntent());
        this.Q = new a(null);
        d dVarF = L().F(rr6.content);
        if (!(dVarF instanceof NavHostFragment)) {
            throw new IllegalStateException("content must be navHostFragment");
        }
        a aVar = this.Q;
        if (aVar == null) {
            js3.V("fragmentNavigationWrapper");
            throw null;
        }
        aVar.h((NavHostFragment) dVarF);
        d("LoginActivity_" + this.K, this);
        dv2 dv2Var = this.P;
        if (dv2Var != null) {
            setRequestedOrientation(dv2Var.c() == 2 ? 6 : 7);
        } else {
            js3.V("graphicUtils");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        DialogDataModel dialogDataModel = new DialogDataModel(dw1.n("LoginActivity_", this.K), "DIALOG_KEY_LOGIN", null, 12);
        PhoneBindData phoneBindData = new PhoneBindData("");
        String string = getString(rs6.bind_message_login_activity);
        String string2 = getString(rs6.login_label_login_activity);
        js3.o(string2, "getString(...)");
        pk5.g(this, new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, string, string2, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
    }

    @Override // defpackage.am2
    public final void p() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.f();
        } else {
            js3.V("fragmentNavigationWrapper");
            throw null;
        }
    }

    @Override // defpackage.am2
    public final void q() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.d();
        } else {
            js3.V("fragmentNavigationWrapper");
            throw null;
        }
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a(num);
        } else {
            js3.V("fragmentNavigationWrapper");
            throw null;
        }
    }

    @Override // defpackage.am2
    public final d s() {
        a aVar = this.Q;
        if (aVar != null) {
            return aVar.b();
        }
        js3.V("fragmentNavigationWrapper");
        throw null;
    }

    @Override // defpackage.am2
    public final void x(String str) {
        js3.p(str, "requestKey");
        L().e(str);
    }

    @Override // defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        js3.p(yi5Var, "navDirections");
        a aVar = this.Q;
        if (aVar != null) {
            aVar.g(yi5Var);
        } else {
            js3.V("fragmentNavigationWrapper");
            throw null;
        }
    }
}
