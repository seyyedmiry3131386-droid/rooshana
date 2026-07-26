package ir.mservices.market.version2.fragments.dialog;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import defpackage.c5;
import defpackage.dt2;
import defpackage.dv2;
import defpackage.dw1;
import defpackage.ec9;
import defpackage.js3;
import defpackage.k50;
import defpackage.m88;
import defpackage.mm2;
import defpackage.qr;
import defpackage.t32;
import defpackage.wq;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.version2.activity.WebViewActivityImpl.ApplicationPaymentActivity;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppPaymentDialogFragment extends Hilt_AppPaymentDialogFragment implements mm2 {
    public static final /* synthetic */ int U0 = 0;
    public c5 N0;
    public ir.mservices.market.version2.manager.a O0;
    public ir.mservices.market.version2.services.c P0;
    public k50 Q0;
    public dv2 R0;
    public ec9 S0;
    public qr T0;

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(F0())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if (m88.T(str2, "DIALOG_KEY_PROGRESS", true)) {
                this.G0.a("PURCHASE_APPLICATION_REQUEST_TAG");
                return;
            }
            if (m88.T(str2, "DIALOG_KEY_RETRY", true)) {
                Serializable serializableS = dt2.s(bundle2, "download_data_model", DownloadDataModel.class);
                js3.n(serializableS, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadDataModel");
                DownloadDataModel downloadDataModel = (DownloadDataModel) serializableS;
                if (dialogDataModel.d == DialogResult.a) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("payment_retry_ok");
                    clickEventBuilder.a();
                    G0(downloadDataModel, true);
                    return;
                }
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("payment_retry_cancel");
                clickEventBuilder2.a();
                t32.b().g(new wq(downloadDataModel, "Retry"));
                return;
            }
            if (m88.T(str2, "DIALOG_KEY_GATEWAY", true)) {
                Serializable serializableS2 = dt2.s(bundle2, "download_data_model", DownloadDataModel.class);
                js3.n(serializableS2, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadDataModel");
                DownloadDataModel downloadDataModel2 = (DownloadDataModel) serializableS2;
                if (dialogDataModel.d != DialogResult.a) {
                    t32.b().g(new wq(downloadDataModel2, "Gateway Dialog"));
                    return;
                } else {
                    Serializable serializableS3 = dt2.s(bundle, "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class);
                    js3.n(serializableS3, "null cannot be cast to non-null type ir.mservices.market.version2.webapi.responsedto.GatewayDTO");
                    H0((GatewayDTO) serializableS3, bundle.getString("BUNDLE_KEY_ANALYTICS_NAME"), downloadDataModel2);
                    return;
                }
            }
            if (m88.T(str2, "DIALOG_KEY_LOGIN", true)) {
                if (dialogDataModel.d != DialogResult.a) {
                    E0().a.b("payment_login_cancel", "type", "app");
                    return;
                }
                E0().a.b("payment_login_ok", "type", "app");
                Serializable serializableS4 = dt2.s(bundle2, "download_data_model", DownloadDataModel.class);
                js3.n(serializableS4, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadDataModel");
                DownloadDataModel downloadDataModel3 = (DownloadDataModel) serializableS4;
                ir.mservices.market.version2.manager.a aVar = this.O0;
                if (aVar != null) {
                    aVar.b(F(), downloadDataModel3, false);
                } else {
                    js3.V("appManager");
                    throw null;
                }
            }
        }
    }

    public final k50 E0() {
        k50 k50Var = this.Q0;
        if (k50Var != null) {
            return k50Var;
        }
        js3.V("barnamehAnalytics");
        throw null;
    }

    public final String F0() {
        return dw1.n("AppPaymentDialogFragment_", this.H0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G0(ir.mservices.market.version2.download.DownloadDataModel r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "downloadDataModel"
            defpackage.js3.p(r1, r2)
            ir.mservices.market.version2.fragments.dialog.DialogDataModel r2 = new ir.mservices.market.version2.fragments.dialog.DialogDataModel
            java.lang.String r3 = r0.F0()
            r4 = 12
            java.lang.String r5 = "DIALOG_KEY_PROGRESS"
            r6 = 0
            r2.<init>(r3, r5, r6, r4)
            ir.mservices.market.data.NavIntentDirections$Progress r3 = new ir.mservices.market.data.NavIntentDirections$Progress
            em6 r4 = new em6
            r5 = 1
            r4.<init>(r2, r5)
            r3.<init>(r4)
            am2 r2 = r0.J0
            r4 = -1
            defpackage.pk5.g(r2, r3, r4)
            pr r14 = new pr
            r11 = r18
            r14.<init>(r0, r1, r11)
            j2 r15 = new j2
            r2 = 3
            r15.<init>(r0, r1, r2)
            ir.mservices.market.version2.services.c r7 = r0.P0
            if (r7 == 0) goto L91
            java.lang.String r8 = r1.a
            android.content.Context r2 = r0.H()
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            if (r2 == 0) goto L5d
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            defpackage.js3.n(r2, r3)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            int r2 = r2.getSimState()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L5b
            goto L5d
        L5b:
            r9 = r2
            goto L60
        L5d:
            java.lang.String r2 = "0"
            goto L5b
        L60:
            java.lang.String r10 = r1.c
            ec9 r1 = r0.S0
            if (r1 == 0) goto L8b
            boolean r12 = r1.a()
            dv2 r1 = r0.R0
            if (r1 == 0) goto L85
            int r1 = r1.c()
            if (r1 == r5) goto L7e
            r2 = 2
            if (r1 == r2) goto L7b
            java.lang.String r1 = "undefined"
        L79:
            r13 = r1
            goto L81
        L7b:
            java.lang.String r1 = "landscape"
            goto L79
        L7e:
            java.lang.String r1 = "portrait"
            goto L79
        L81:
            r7.j(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L85:
            java.lang.String r1 = "graphicUtils"
            defpackage.js3.V(r1)
            throw r6
        L8b:
            java.lang.String r1 = "vpnUtils"
            defpackage.js3.V(r1)
            throw r6
        L91:
            java.lang.String r1 = "appService"
            defpackage.js3.V(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.fragments.dialog.AppPaymentDialogFragment.G0(ir.mservices.market.version2.download.DownloadDataModel, boolean):void");
    }

    public final void H0(GatewayDTO gatewayDTO, String str, DownloadDataModel downloadDataModel) {
        if (m88.T(gatewayDTO.getType(), GatewayDTO.GATEWAY_TYPE_BANK, true)) {
            k50 k50VarE0 = E0();
            String str2 = downloadDataModel.a;
            k50VarE0.a.b("payment_barnameh_gateway", "gateway_name", gatewayDTO.getAnalyticsName(), "package_name", str2, "initial_gateway_name", str);
            Intent intent = new Intent(F(), (Class<?>) ApplicationPaymentActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("download_data_model", downloadDataModel);
            bundle.putString("BUNDLE_KEY_URL", gatewayDTO.getUrl());
            bundle.putBoolean("BUNDLE_KEY_HAS_RETRY", gatewayDTO.hasRetry());
            bundle.putSerializable("BUNDLE_KEY_INFO_GATEWAY", gatewayDTO);
            bundle.putString("BUNDLE_KEY_INITIAL_GATEWAY_NAME", str);
            intent.replaceExtras(bundle);
            intent.addFlags(268435456);
            FragmentActivity fragmentActivityF = F();
            if (fragmentActivityF != null) {
                fragmentActivityF.startActivity(intent);
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final void T(Bundle bundle) {
        DownloadDataModel downloadDataModel;
        this.H = true;
        this.J0.d(F0(), this);
        Bundle bundle2 = this.g;
        if (bundle2 == null || (downloadDataModel = (DownloadDataModel) dt2.s(bundle2, "download_data_model", DownloadDataModel.class)) == null) {
            return;
        }
        G0(downloadDataModel, false);
        Bundle bundle3 = this.g;
        if (bundle3 != null) {
            bundle3.putSerializable("download_data_model", null);
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.T0 = new qr(this);
    }

    @Override // androidx.fragment.app.d
    public final void i0() {
        this.H = true;
        qr qrVar = this.T0;
        if (qrVar != null) {
            t32.b().l(qrVar, true);
        }
    }

    @Override // androidx.fragment.app.d
    public final void j0() {
        this.H = true;
        qr qrVar = this.T0;
        if (qrVar != null) {
            t32.b().o(qrVar);
        }
        this.G0.a("PURCHASE_APPLICATION_REQUEST_TAG");
        if (this.J0.g() instanceof ProgressDialogFragment) {
            this.J0.q();
        }
    }
}
