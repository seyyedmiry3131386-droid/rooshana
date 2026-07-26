package defpackage;

import android.os.Bundle;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.dialog.AppPaymentDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class qr {
    public final /* synthetic */ AppPaymentDialogFragment a;

    public qr(AppPaymentDialogFragment appPaymentDialogFragment) {
        this.a = appPaymentDialogFragment;
    }

    public final void onEvent(wc9 wc9Var) {
        js3.p(wc9Var, "event");
        Bundle bundle = wc9Var.a;
        if (m88.T(wc9Var.c, "APP", true)) {
            t32.b().m(wc9Var);
            Serializable serializableS = dt2.s(bundle, "download_data_model", DownloadDataModel.class);
            js3.n(serializableS, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadDataModel");
            DownloadDataModel downloadDataModel = (DownloadDataModel) serializableS;
            String str = downloadDataModel.a;
            Serializable serializableS2 = dt2.s(bundle, "BUNDLE_KEY_INFO_GATEWAY", GatewayDTO.class);
            js3.n(serializableS2, "null cannot be cast to non-null type ir.mservices.market.version2.webapi.responsedto.GatewayDTO");
            AppPaymentDialogFragment appPaymentDialogFragment = this.a;
            appPaymentDialogFragment.E0().a.b("payment_barnameh_retry", "gateway_name", ((GatewayDTO) serializableS2).getAnalyticsName(), "package_name", str);
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("download_data_model", downloadDataModel);
            bundle2.putSerializable("BUNDLE_KEY_ERROR", wc9Var.b);
            DialogDataModel dialogDataModel = new DialogDataModel(appPaymentDialogFragment.F0(), "DIALOG_KEY_RETRY", bundle2, 8);
            String str2 = downloadDataModel.g;
            if (str2 == null) {
                str2 = "";
            }
            pk5.g(appPaymentDialogFragment.J0, new NavIntentDirections.PaymentRetry(new m46(dialogDataModel, str, str2, "Application")), -1);
        }
    }
}
