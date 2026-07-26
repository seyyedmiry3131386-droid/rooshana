package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class k50 {
    public ee a;
    public ps1 b;

    public void onEvent(wq wqVar) {
        this.a.b("payment_barnameh_fail", "package_name", wqVar.b.a, "gateway_name", wqVar.a);
    }

    public void onEvent(ly5 ly5Var) {
        String action = ly5Var.b.getAction();
        boolean booleanExtra = ly5Var.b.getBooleanExtra("android.intent.extra.REPLACING", false);
        ps1 ps1Var = this.b;
        String str = ly5Var.a;
        boolean z = ps1Var.l(str) == 140 || this.b.l(str) == 150;
        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            ee eeVar = this.a;
            Bundle bundle = new Bundle();
            js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            bundle.putString("package_name", str);
            bundle.putBoolean(AppStatusDto.Type.UPDATE, booleanExtra);
            bundle.putBoolean(LinkDTO.LINK_TYPE_MYKET_INTENT, z);
            eeVar.a(bundle, "barnameh_install");
            Bundle bundle2 = new Bundle();
            bundle2.putString("package_name", str);
            if (booleanExtra) {
                this.a.a(bundle2, "barnameh_install_update");
            } else {
                this.a.a(bundle2, "barnameh_install_fresh");
            }
            if (z) {
                this.a.a(bundle2, "barnameh_install_myket");
                if (booleanExtra) {
                    this.a.a(bundle2, "barnameh_install_myket_update");
                    return;
                } else {
                    this.a.a(bundle2, "barnameh_install_myket_fresh");
                    return;
                }
            }
            return;
        }
        if (!"android.intent.action.PACKAGE_REMOVED".equals(action) || booleanExtra) {
            return;
        }
        ee eeVar2 = this.a;
        Bundle bundle3 = new Bundle();
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bundle3.putString("package_name", str);
        bundle3.putBoolean(LinkDTO.LINK_TYPE_MYKET_INTENT, z);
        eeVar2.a(bundle3, "barnameh_remove");
        if (z) {
            this.a.b("barnameh_remove_myket", "package_name", str);
        }
    }

    public void onEvent(xq xqVar) {
        if (xqVar.b) {
            return;
        }
        this.a.b("payment_barnameh_finish", "package_name", xqVar.d.a, "gateway_name", xqVar.c);
    }

    public void onEvent(qk3 qk3Var) {
        Intent intent = qk3Var.a;
        String str = qk3Var.c;
        String str2 = qk3Var.b;
        if (!intent.hasExtra("RESPONSE_CODE")) {
            lw.g(null, "Incorrect state in BarnamehAnalytics!", null);
            return;
        }
        int intExtra = qk3Var.a.getIntExtra("RESPONSE_CODE", -1);
        if (intExtra == 1) {
            lw.g(null, "Incorrect state in BarnamehAnalytics, Cancel event on PurchaseFinished!", null);
        } else if (intExtra == 0) {
            this.a.b("payment_inapp_finish", "package_name", str2, "gateway_name", str);
        } else {
            this.a.b("payment_inapp_fail", "package_name", str2, "gateway_name", str);
        }
    }
}
