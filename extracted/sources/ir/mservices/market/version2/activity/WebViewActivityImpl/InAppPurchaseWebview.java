package ir.mservices.market.version2.activity.WebViewActivityImpl;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonParseException;
import defpackage.bl4;
import defpackage.c5;
import defpackage.d04;
import defpackage.d56;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.eg5;
import defpackage.i10;
import defpackage.lw;
import defpackage.nc2;
import defpackage.pk3;
import defpackage.pr7;
import defpackage.q6;
import defpackage.q91;
import defpackage.qk3;
import defpackage.qm5;
import defpackage.rm7;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sm;
import defpackage.t32;
import defpackage.tj5;
import defpackage.uk3;
import defpackage.vv2;
import defpackage.w91;
import defpackage.wc9;
import defpackage.wn5;
import defpackage.x57;
import defpackage.xf5;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.version2.webapi.responsedto.PurchaseDTO;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class InAppPurchaseWebview extends WebViewActivity {
    public static final /* synthetic */ int R0 = 0;
    public boolean M0 = false;
    public c5 N0;
    public c O0;
    public dp3 P0;
    public q6 Q0;

    public InAppPurchaseWebview() {
        I(new sm(this, 10));
    }

    public static void x0(InAppPurchaseWebview inAppPurchaseWebview) {
        sb7.p("MyketIabWebView", "Run Javascript Fallback Scenario, webviewVersion=" + inAppPurchaseWebview.P0.o("com.google.android.webview") + ", webviewVersionCode=" + inAppPurchaseWebview.P0.p("com.google.android.webview").intValue(), null);
        Intent intent = inAppPurchaseWebview.getIntent();
        lw.d(null, null, intent);
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra("type");
        String strA = inAppPurchaseWebview.N0.a();
        String stringExtra3 = intent.getStringExtra("BUNDLE_KEY_SKU");
        sb7.p("MyketIabWebView", bl4.z(rm7.t("jsFallbackRunner, pn=", stringExtra, ", type=", stringExtra2, ", accountId="), strA, ", sku=", stringExtra3), null);
        inAppPurchaseWebview.O0.p(stringExtra, strA, stringExtra2, inAppPurchaseWebview, new nc2(8, inAppPurchaseWebview, stringExtra3, false), new qm5(24, inAppPurchaseWebview));
    }

    public static void y0(InAppPurchaseWebview inAppPurchaseWebview) {
        String analyticsName;
        Intent intent = new Intent();
        if (inAppPurchaseWebview.getIntent().getExtras() != null) {
            GatewayDTO gatewayDTO = (GatewayDTO) dt2.s(inAppPurchaseWebview.getIntent().getExtras(), "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class);
            lw.d(null, null, gatewayDTO);
            analyticsName = gatewayDTO.getAnalyticsName();
        } else {
            analyticsName = "";
        }
        intent.putExtra("RESPONSE_CODE", 6);
        t32.b().g(new qk3(intent, inAppPurchaseWebview.getIntent().getStringExtra("packageName"), analyticsName));
        inAppPurchaseWebview.finish();
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return getString(rs6.page_name_webview_iap);
    }

    @Override // defpackage.lz2, ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.Hilt_BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        w91 w91Var = ((q91) ((uk3) e())).a;
        this.G = (d04) w91Var.p.get();
        this.H = (pr7) w91Var.s.get();
        this.I = (d56) w91Var.U.get();
        this.K = (x57) w91Var.G.get();
        this.T = (tj5) w91Var.Y0.get();
        this.U = (eg5) w91Var.t0.get();
        this.V = (dp3) w91Var.v.get();
        this.A0 = (i10) w91Var.y.get();
        this.B0 = (c5) w91Var.L.get();
        this.C0 = (dp3) w91Var.v.get();
        this.D0 = (xf5) w91Var.F.get();
        this.N0 = (c5) w91Var.L.get();
        w91Var.Z();
        this.O0 = (c) w91Var.l0.get();
        this.P0 = (dp3) w91Var.v.get();
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_webview_iap);
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void k0() {
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final Runnable m0() {
        if (this.Q0 == null) {
            this.Q0 = new q6(17, this);
        }
        return this.Q0;
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final wc9 n0(Bundle bundle) {
        wc9 wc9Var = new wc9(bundle);
        wc9Var.c = "INAPP";
        return wc9Var;
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity, ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.K.a(this);
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void q0() {
        t32.b().g(new pk3());
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void r0(DialogResult dialogResult) {
        int iOrdinal = dialogResult.ordinal();
        if (iOrdinal == 0) {
            dw1.y("payment_exit_dialog_inapp_ok");
        } else {
            if (iOrdinal != 1) {
                return;
            }
            dw1.y("payment_exit_dialog_inapp_cancel");
        }
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void s0(String str) {
        PurchaseDTO purchaseDTO = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                purchaseDTO = (PurchaseDTO) new vv2().c(new String(wn5.y(str), "UTF-8"), PurchaseDTO.class);
            } catch (JsonParseException | IOException unused) {
            }
        }
        z0(purchaseDTO);
        finish();
    }

    public final void z0(PurchaseDTO purchaseDTO) {
        Intent intent = new Intent();
        GatewayDTO gatewayDTO = getIntent().getExtras() != null ? (GatewayDTO) dt2.s(getIntent().getExtras(), "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class) : null;
        if (purchaseDTO != null && !TextUtils.isEmpty(purchaseDTO.getInvoice()) && !TextUtils.isEmpty(purchaseDTO.getSignature()) && gatewayDTO != null) {
            getIntent().putExtra("BUNDLE_KEY_HAS_RETRY", false);
            intent.putExtra("RESPONSE_CODE", 0);
            intent.putExtra("INAPP_PURCHASE_DATA", purchaseDTO.getInvoice());
            intent.putExtra("INAPP_DATA_SIGNATURE", purchaseDTO.getSignature());
            t32.b().g(new qk3(intent, getIntent().getStringExtra("packageName"), gatewayDTO.getAnalyticsName()));
            return;
        }
        if (!getIntent().getBooleanExtra("BUNDLE_KEY_HAS_RETRY", false)) {
            t32.b().g(new pk3());
            return;
        }
        wc9 wc9Var = new wc9(getIntent().getExtras());
        wc9Var.c = "INAPP";
        t32.b().j(wc9Var);
    }
}
