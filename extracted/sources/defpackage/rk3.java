package defpackage;

import android.os.Bundle;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentConfigDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class rk3 {
    public final /* synthetic */ InAppPurchaseActivity a;

    public rk3(InAppPurchaseActivity inAppPurchaseActivity) {
        this.a = inAppPurchaseActivity;
    }

    public void onEvent(wc9 wc9Var) {
        String str = wc9Var.c;
        Bundle bundle = wc9Var.a;
        if (str.equalsIgnoreCase("INAPP")) {
            t32.b().m(wc9Var);
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("BUNDLE_KEY_EXTRA", bundle);
            bundle2.putSerializable("BUNDLE_KEY_ERROR", wc9Var.b);
            GatewayDTO gatewayDTO = (GatewayDTO) dt2.s(bundle, "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class);
            InAppPurchaseActivity inAppPurchaseActivity = this.a;
            k50 k50Var = inAppPurchaseActivity.R;
            String str2 = inAppPurchaseActivity.Y;
            k50Var.a.b("payment_inapp_retry", "gateway_name", gatewayDTO.getAnalyticsName(), "package_name", str2);
            pk5.h(inAppPurchaseActivity, new NavIntentDirections.PaymentRetry(new m46(new DialogDataModel(inAppPurchaseActivity.S(), "DIALOG_KEY_RETRY"), inAppPurchaseActivity.Y, ((PaymentConfigDTO) dt2.s(bundle, "BUNDLE_KEY_PAYMENT_CONFIG", PaymentConfigDTO.class)).getTitle(), "IAP")));
        }
    }
}
