package ir.mservices.market.version2.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.d;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.am2;
import defpackage.c5;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dv2;
import defpackage.ec9;
import defpackage.em6;
import defpackage.gz2;
import defpackage.js3;
import defpackage.js6;
import defpackage.k50;
import defpackage.lw;
import defpackage.mm2;
import defpackage.nk3;
import defpackage.ok3;
import defpackage.pk3;
import defpackage.pk5;
import defpackage.qk3;
import defpackage.rk3;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sm;
import defpackage.t32;
import defpackage.v4;
import defpackage.vp7;
import defpackage.x57;
import defpackage.yi5;
import defpackage.zk8;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.activity.WebViewActivityImpl.InAppPurchaseWebview;
import ir.mservices.market.version2.fragments.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentConfigDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;

/* JADX INFO: loaded from: classes3.dex */
public class InAppPurchaseActivity extends gz2 implements am2, mm2 {
    public static final ok3 A0;
    public c5 O;
    public c P;
    public x57 Q;
    public k50 R;
    public dv2 S;
    public dp3 T;
    public ec9 U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public int Z;
    public rk3 x0;
    public vp7 y0;
    public a z0;

    static {
        ok3 ok3Var = new ok3();
        ok3Var.a = false;
        A0 = ok3Var;
    }

    public InAppPurchaseActivity() {
        this.N = false;
        I(new sm(this, 9));
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        if (str.equalsIgnoreCase(S())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            String str2 = dialogDataModel.b;
            if (str2.equalsIgnoreCase("DIALOG_KEY_PROGRESS")) {
                this.Q.a(this);
                finish();
                return;
            }
            if (str2.equalsIgnoreCase("DIALOG_KEY_RETRY")) {
                if (dialogDataModel.d == DialogResult.a) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("payment_retry_inapp_ok");
                    clickEventBuilder.a();
                    U(true);
                    return;
                }
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("payment_retry_inapp_cancel");
                clickEventBuilder2.a();
                t32.b().g(new pk3());
                return;
            }
            if (str2.equalsIgnoreCase("DIALOG_KEY_GATEWAY")) {
                if (dialogDataModel.d != DialogResult.a) {
                    t32.b().g(new pk3());
                    return;
                }
                GatewayDTO gatewayDTO = (GatewayDTO) dt2.s(bundle, "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class);
                String string = bundle.getString("BUNDLE_KEY_ANALYTICS_NAME");
                T(gatewayDTO, this.Y, this.V, this.X, this.W, (PaymentConfigDTO) dt2.s(dialogDataModel.c, "BUNDLE_KEY_PAYMENT_CONFIG", PaymentConfigDTO.class), string);
                return;
            }
            if (str2.equalsIgnoreCase("DIALOG_KEY_LOGIN_PAYMENT")) {
                if (dialogDataModel.d == DialogResult.a) {
                    this.R.a.b("payment_login_ok", "type", "inapp");
                    U(false);
                } else {
                    this.R.a.b("payment_login_cancel", "type", "inapp");
                    t32.b().g(new pk3());
                }
            }
        }
    }

    @Override // defpackage.z80
    public final String C() {
        return getString(rs6.page_name_in_app_purchase);
    }

    @Override // defpackage.am2
    public final void E() {
    }

    public final String S() {
        return getClass().getSimpleName() + "_" + this.K;
    }

    public final void T(GatewayDTO gatewayDTO, String str, String str2, String str3, String str4, PaymentConfigDTO paymentConfigDTO, String str5) {
        if (gatewayDTO.getType().equalsIgnoreCase(GatewayDTO.GATEWAY_TYPE_BANK)) {
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_URL", gatewayDTO.getUrl());
            bundle.putString("BUNDLE_KEY_SKU", str2);
            bundle.putString("type", str4);
            bundle.putString("BUNDLE_KEY_DEVELOPER_PAYLOAD", str3);
            bundle.putString("packageName", str);
            bundle.putBoolean("BUNDLE_KEY_HAS_RETRY", gatewayDTO.hasRetry());
            bundle.putSerializable("BUNDLE_KEY_PAYMENT_CONFIG", paymentConfigDTO);
            bundle.putSerializable("BUNDLE_KEY_INFO_GATEWAY", gatewayDTO);
            bundle.putString("BUNDLE_KEY_INITIAL_GATEWAY_NAME", str5);
            String string = bundle.getString("packageName");
            GatewayDTO gatewayDTO2 = (GatewayDTO) dt2.s(bundle, "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class);
            String string2 = bundle.getString("BUNDLE_KEY_INITIAL_GATEWAY_NAME");
            k50 k50Var = this.R;
            String analyticsName = gatewayDTO2.getAnalyticsName();
            k50Var.getClass();
            if (string.equals(NearbyRepository.SERVICE_ID)) {
                k50Var.a.b("payment_inapp_myket_gateway", "gateway_name", analyticsName, "initial_gateway_name", string2);
            } else {
                k50Var.a.b("payment_inapp_gateway", "gateway_name", analyticsName, "package_name", string, "initial_gateway_name", string2);
            }
            d dVarC = this.z0.c();
            if (dVarC instanceof DialogFragment) {
                ((DialogFragment) dVarC).z0();
            }
            Intent intent = new Intent(this, (Class<?>) InAppPurchaseWebview.class);
            intent.replaceExtras(bundle);
            startActivity(intent);
        }
    }

    public final void U(boolean z) {
        pk5.h(this, new NavIntentDirections.Progress(new em6(new DialogDataModel(S(), "DIALOG_KEY_PROGRESS"), true)));
        nk3 nk3Var = new nk3(0, this, z);
        v4 v4Var = new v4(28, this);
        c cVar = this.P;
        String str = this.Y;
        Object systemService = getSystemService(PaymentRequiredBindingDto.BINDING_PHONE);
        js3.n(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String strValueOf = String.valueOf(((TelephonyManager) systemService).getSimState());
        if (strValueOf == null) {
            strValueOf = "0";
        }
        String str2 = this.V;
        String str3 = this.W;
        String str4 = this.X;
        boolean zA = this.U.a();
        int iC = this.S.c();
        cVar.o(str, strValueOf, str2, str3, str4, z, zA, iC != 1 ? iC != 2 ? "undefined" : CommonDataKt.MOVIE_IMAGE_TYPE_LANDSCAPE : CommonDataKt.MOVIE_IMAGE_TYPE_PORTRAIT, this.Z, this.T.p(this.Y), this, nk3Var, v4Var);
    }

    @Override // defpackage.am2
    public final void clearAll() {
        a aVar = this.z0;
        aVar.getClass();
        aVar.a(null);
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        L().h0(str, this, mm2Var);
    }

    @Override // defpackage.am2
    public final d g() {
        return this.z0.c();
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        boolean z = bundle.getBoolean("BUNDLE_KEY_DISMISS", false);
        d dVarC = this.z0.c();
        if (z && dVarC != null) {
            q();
        }
        L().g0(bundle, str);
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Handler handler;
        super.onCreate(bundle);
        setContentView(js6.activity_inapp);
        if (Build.VERSION.SDK_INT == 26) {
            findViewById(rr6.layout).setBackgroundColor(sj8.b().l);
        }
        this.z0 = new a(null);
        d dVarF = L().F(rr6.content);
        if (!(dVarF instanceof NavHostFragment)) {
            throw new IllegalStateException("content must be navHostFragment");
        }
        this.z0.h((NavHostFragment) dVarF);
        d(S(), this);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        handler.removeCallbacks(A0);
        this.x0 = new rk3(this);
        t32.b().l(this, false);
        setRequestedOrientation(this.S.c() == 2 ? 6 : 7);
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 1);
        setResult(0, intent);
        lw.d(null, null, getIntent());
        this.V = getIntent().getStringExtra("SKU");
        this.W = getIntent().getStringExtra("ITEM_TYPE");
        this.X = getIntent().getStringExtra("DEVELOPER_PAYLOAD");
        this.Y = getIntent().getStringExtra("PACKAGE_NAME");
        this.Z = getIntent().getIntExtra("SDK_VERSION", 1);
        lw.c(this.V, "sku is empty");
        lw.c(this.Y, "appId is empty");
        lw.c(this.W, "type is empty");
        if (TextUtils.isEmpty(this.V) || TextUtils.isEmpty(this.W) || TextUtils.isEmpty(this.Y)) {
            finish();
        }
        U(false);
        ir.mservices.market.core.ext.a.n(this, sj8.b().F);
        ir.mservices.market.core.ext.a.l(this, sj8.b().F, sj8.g);
        this.y0 = new vp7("MyketInAppPurchaseActivity", "IAB_ACTIVITY");
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        t32.b().o(this);
        this.Q.a(this);
        super.onDestroy();
    }

    public void onEvent(pk3 pk3Var) {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 1);
        setResult(0, intent);
        finish();
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        rk3 rk3Var = this.x0;
        rk3Var.getClass();
        t32.b().o(rk3Var);
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        rk3 rk3Var = this.x0;
        rk3Var.getClass();
        t32.b().l(rk3Var, true);
    }

    @Override // defpackage.am2
    public final void p() {
        this.z0.f();
    }

    @Override // defpackage.am2
    public final void q() {
        this.z0.d();
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
        this.z0.a(num);
    }

    @Override // defpackage.am2
    public final d s() {
        return this.z0.b();
    }

    @Override // defpackage.am2
    public final void x(String str) {
        L().e(str);
    }

    @Override // defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        this.z0.g(yi5Var);
    }

    public void onEvent(qk3 qk3Var) {
        lw.d(null, null, qk3Var);
        lw.d(null, null, qk3Var.a);
        setResult(-1, qk3Var.a);
        finish();
    }
}
