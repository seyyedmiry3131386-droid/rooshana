package ir.mservices.market.version2.activity.WebViewActivityImpl;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonParseException;
import defpackage.c5;
import defpackage.d04;
import defpackage.d56;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.eg5;
import defpackage.i10;
import defpackage.lw;
import defpackage.mu;
import defpackage.nu;
import defpackage.pr7;
import defpackage.q91;
import defpackage.rs6;
import defpackage.sm;
import defpackage.t32;
import defpackage.tj5;
import defpackage.vv2;
import defpackage.w91;
import defpackage.wc9;
import defpackage.wn5;
import defpackage.wq;
import defpackage.x57;
import defpackage.xf5;
import defpackage.xq;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.AppPaymentDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationPaymentActivity extends WebViewActivity {
    public boolean M0 = false;
    public DownloadDataModel N0;

    public ApplicationPaymentActivity() {
        I(new sm(this, 1));
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return getString(rs6.page_name_webview_payment_app);
    }

    @Override // defpackage.lz2, ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.Hilt_BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        w91 w91Var = ((q91) ((nu) e())).a;
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
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_webview_payment_app);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final String U() {
        if (this.N0 == null) {
            return null;
        }
        return "Payment for PackageName: " + this.N0.a;
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void k0() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            lw.g(null, "ApplicationPaymentActivity.extractExtras(), bundle == null", null);
            finish();
            return;
        }
        DownloadDataModel downloadDataModel = (DownloadDataModel) dt2.s(extras, "download_data_model", DownloadDataModel.class);
        if (downloadDataModel != null) {
            this.N0 = downloadDataModel;
        } else {
            lw.g(null, "ApplicationPaymentActivity.extractExtras(), downloadDataModel == null", null);
            finish();
        }
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final Runnable m0() {
        return null;
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final wc9 n0(Bundle bundle) {
        wc9 wc9Var = new wc9(bundle);
        wc9Var.c = "APP";
        return wc9Var;
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void r0(DialogResult dialogResult) {
        int iOrdinal = dialogResult.ordinal();
        if (iOrdinal == 0) {
            dw1.y("payment_exit_dialog_ok");
        } else {
            if (iOrdinal != 1) {
                return;
            }
            dw1.y("payment_exit_dialog_cancel");
        }
    }

    @Override // ir.mservices.market.version2.activity.WebViewActivity
    public final void s0(String str) {
        String str2;
        AppPaymentDTO appPaymentDTO;
        if (TextUtils.isEmpty(str)) {
            str2 = str;
            appPaymentDTO = null;
        } else {
            try {
                str2 = new String(wn5.y(str), "UTF-8");
                try {
                    appPaymentDTO = (AppPaymentDTO) new vv2().c(str2, AppPaymentDTO.class);
                } catch (JsonParseException | IOException unused) {
                    str = str2;
                    str2 = str;
                    appPaymentDTO = null;
                }
            } catch (JsonParseException | IOException unused2) {
            }
        }
        GatewayDTO gatewayDTO = getIntent().getExtras() != null ? (GatewayDTO) dt2.s(getIntent().getExtras(), "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class) : null;
        if (appPaymentDTO == null || gatewayDTO == null) {
            ErrorDTO errorDTO = new ErrorDTO(-1, dw1.n("Payment finished with an error. could not parse json:\n", str2), getString(rs6.connection_problem));
            lw.g(null, null, null);
            if (getIntent().getBooleanExtra("BUNDLE_KEY_HAS_RETRY", false)) {
                wc9 wc9Var = new wc9(getIntent().getExtras());
                wc9Var.c = "APP";
                wc9Var.b = errorDTO;
                t32.b().j(wc9Var);
            } else {
                t32.b().g(new wq(this.N0, gatewayDTO.getAnalyticsName()));
            }
            finish();
            return;
        }
        appPaymentDTO.toString();
        if (appPaymentDTO.getCode() == 200) {
            lw.f(null, "Tracking number must be available.", this.B0.d() || !TextUtils.isEmpty(appPaymentDTO.getTrackingNumber()));
            getIntent().putExtra("BUNDLE_KEY_HAS_RETRY", false);
            xq xqVar = new xq(appPaymentDTO, false, gatewayDTO.getAnalyticsName(), this.N0);
            String trackingNumber = appPaymentDTO.getTrackingNumber();
            finish();
            if (!TextUtils.isEmpty(trackingNumber) && !this.B0.d()) {
                t32.b().j(new mu(trackingNumber));
            }
            t32.b().g(xqVar);
            return;
        }
        ErrorDTO errorDTO2 = new ErrorDTO(-1, "Payment finished with an error! result code=" + appPaymentDTO.getCode(), appPaymentDTO.getTranslatedMessage());
        if (getIntent().getBooleanExtra("BUNDLE_KEY_HAS_RETRY", false)) {
            wc9 wc9Var2 = new wc9(getIntent().getExtras());
            wc9Var2.c = "APP";
            wc9Var2.b = errorDTO2;
            t32.b().j(wc9Var2);
        } else {
            t32.b().g(new wq(this.N0, gatewayDTO.getAnalyticsName()));
        }
        finish();
    }
}
