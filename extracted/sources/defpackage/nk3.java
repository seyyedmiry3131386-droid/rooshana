package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.login.data.BindData;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.InAppGatewayDialogFragment;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.version2.webapi.responsedto.InAppPaymentConfigDTO;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nk3 implements gb8, hs4, n31, tt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nk3(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        ((e62) ((qg6) obj).a).T0((ly) this.c, this.b);
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        switch (this.a) {
            case 1:
                ImmutableList immutableListS = ImmutableList.s((jp4) this.c);
                boolean z = this.b;
                return xq4Var.r(hq4Var, immutableListS, z ? -1 : xq4Var.t.M(), z ? -9223372036854775807L : xq4Var.t.d0());
            default:
                List list = (List) this.c;
                boolean z2 = this.b;
                return xq4Var.r(hq4Var, list, z2 ? -1 : xq4Var.t.M(), z2 ? -9223372036854775807L : xq4Var.t.d0());
        }
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        boolean z;
        GatewayDTO next;
        int i = this.a;
        boolean z2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                InAppPurchaseActivity inAppPurchaseActivity = (InAppPurchaseActivity) obj2;
                InAppPaymentConfigDTO inAppPaymentConfigDTO = (InAppPaymentConfigDTO) obj;
                ok3 ok3Var = InAppPurchaseActivity.A0;
                lw.d(null, null, inAppPaymentConfigDTO);
                if (inAppPurchaseActivity.z0.c() instanceof ProgressDialogFragment) {
                    inAppPurchaseActivity.q();
                }
                if (inAppPaymentConfigDTO.getCode() == 510) {
                    inAppPaymentConfigDTO.toString();
                    lw.c(inAppPaymentConfigDTO.getInvoice(), null);
                    lw.c(inAppPaymentConfigDTO.getSignature(), null);
                    Intent intent = new Intent();
                    intent.putExtra("RESPONSE_CODE", 0);
                    intent.putExtra("INAPP_PURCHASE_DATA", inAppPaymentConfigDTO.getInvoice());
                    intent.putExtra("INAPP_DATA_SIGNATURE", inAppPaymentConfigDTO.getSignature());
                    t32.b().g(new qk3(intent, inAppPurchaseActivity.Y, "Already Purchased"));
                    break;
                } else {
                    if (inAppPaymentConfigDTO.getBinding() == null) {
                        z = false;
                    } else {
                        boolean zD = inAppPurchaseActivity.O.d();
                        z = !zD;
                        if (!zD) {
                            if (inAppPurchaseActivity.z0.c() instanceof InAppGatewayDialogFragment) {
                                inAppPurchaseActivity.q();
                            }
                            inAppPurchaseActivity.R.a.b("payment_login_start", "type", "inapp");
                            pk5.h(inAppPurchaseActivity, new NavIntentDirections.Login(new wd4(new DialogDataModel(inAppPurchaseActivity.S(), "DIALOG_KEY_LOGIN_PAYMENT"), new LoginData((BindData) new PhoneBindData(""), inAppPurchaseActivity.getString(rs6.bind_message_login_inapp), inAppPurchaseActivity.getString(rs6.login_label_payment_inapp_phone), inAppPaymentConfigDTO.getIconUrl(), inAppPaymentConfigDTO.getTitle(), inAppPaymentConfigDTO.getPrice(), inAppPaymentConfigDTO.getRealPrice(), true))));
                        }
                    }
                    if (!z) {
                        k50 k50Var = inAppPurchaseActivity.R;
                        String str = inAppPurchaseActivity.Y;
                        k50Var.getClass();
                        if (str.equals(NearbyRepository.SERVICE_ID)) {
                            k50Var.a.b("payment_inapp_myket_start", "retry", String.valueOf(z2));
                        } else {
                            k50Var.a.b("payment_inapp_start", "package_name", str, "retry", String.valueOf(z2));
                        }
                        String iconUrl = inAppPaymentConfigDTO.getIconUrl();
                        String title = inAppPaymentConfigDTO.getTitle();
                        String price = inAppPaymentConfigDTO.getPrice();
                        String realPrice = inAppPaymentConfigDTO.getRealPrice();
                        String discountMessage = inAppPaymentConfigDTO.getDiscountMessage();
                        String discountIconUrl = inAppPaymentConfigDTO.getDiscountIconUrl();
                        String guarantee = inAppPaymentConfigDTO.getGuarantee();
                        List<GatewayDTO> gateways = inAppPaymentConfigDTO.getGateways();
                        String str2 = inAppPurchaseActivity.Y;
                        String str3 = inAppPurchaseActivity.V;
                        String str4 = inAppPurchaseActivity.W;
                        String str5 = inAppPurchaseActivity.X;
                        String layoutMode = inAppPaymentConfigDTO.getLayoutMode();
                        Iterator<GatewayDTO> it = gateways.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (next.isAutomatedSelect()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next == null) {
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("BUNDLE_KEY_PAYMENT_CONFIG", inAppPaymentConfigDTO);
                            pk5.h(inAppPurchaseActivity, new NavIntentDirections.InAppGateway(new kk3(new DialogDataModel(inAppPurchaseActivity.S(), "DIALOG_KEY_GATEWAY", bundle), new GatewayBottomDialogFragment.GatewayData(price, title, gateways, iconUrl, guarantee, realPrice, discountMessage, discountIconUrl, layoutMode, Integer.valueOf(inAppPurchaseActivity.Z)), str2)));
                        } else {
                            inAppPurchaseActivity.T(next, str2, str3, str5, str4, inAppPaymentConfigDTO, gateways.get(0).getAnalyticsName());
                        }
                        break;
                    }
                }
                break;
            default:
                SharedPreferences.Editor editorEdit = at2.d0((Context) obj2).edit();
                editorEdit.putBoolean("proxy_retention", z2);
                editorEdit.apply();
                break;
        }
    }
}
