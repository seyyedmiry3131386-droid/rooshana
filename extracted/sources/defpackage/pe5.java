package defpackage;

import android.os.Bundle;
import ir.mservices.market.version2.webapi.responsedto.AppSkuDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.IapInvoiceDTO;
import ir.mservices.market.version2.webapi.responsedto.PurchaseDTO;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pe5 implements gb8, h32 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ sp2 c;

    public /* synthetic */ pe5(Bundle bundle, sp2 sp2Var, int i) {
        this.a = i;
        this.b = bundle;
        this.c = sp2Var;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        switch (this.a) {
            case 1:
                Objects.toString(errorDTO);
                Bundle bundle = this.b;
                bundle.putInt("RESPONSE_CODE", 6);
                String strN = (errorDTO.getCode() == 2 || errorDTO.getCode() == -1) ? "NO_REPORT" : rm7.n(errorDTO.getCode(), "-SERVER_ERROR-");
                String strQ = bl4.q(errorDTO.getHttpStatus(), "http(", ")");
                String host = errorDTO.getHost();
                js3.o(host, "getHost(...)");
                this.c.g(bundle, strN, strQ, host);
                break;
            default:
                Objects.toString(errorDTO);
                Bundle bundle2 = this.b;
                bundle2.putInt("RESPONSE_CODE", 6);
                String strN2 = (errorDTO.getCode() == 2 || errorDTO.getCode() == -1) ? "NO_REPORT" : rm7.n(errorDTO.getCode(), "-SERVER_ERROR-");
                String strQ2 = bl4.q(errorDTO.getHttpStatus(), "http(", ")");
                String host2 = errorDTO.getHost();
                js3.o(host2, "getHost(...)");
                this.c.g(bundle2, strN2, strQ2, host2);
                break;
        }
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        switch (this.a) {
            case 0:
                List<PurchaseDTO> list = (List) obj;
                Bundle bundle = this.b;
                if (list == null) {
                    bundle.putInt("RESPONSE_CODE", 6);
                    str = "server-null-response";
                    str2 = "-SERVER_RESPONSE";
                } else {
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    vv2 vv2Var = new vv2();
                    for (PurchaseDTO purchaseDTO : list) {
                        String invoice = purchaseDTO.getInvoice();
                        Object objC = vv2Var.c(invoice, IapInvoiceDTO.class);
                        js3.o(objC, "fromJson(...)");
                        arrayList2.add(invoice);
                        arrayList.add(((IapInvoiceDTO) objC).productId);
                        arrayList3.add(purchaseDTO.getSignature());
                    }
                    bundle.putInt("RESPONSE_CODE", 0);
                    bundle.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", arrayList);
                    bundle.putStringArrayList("INAPP_PURCHASE_DATA_LIST", arrayList2);
                    bundle.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", arrayList3);
                    bundle.putString("INAPP_CONTINUATION_TOKEN", null);
                    str = "ok";
                    str2 = "";
                }
                this.c.g(bundle, str2, str, ApplicationStateDto.STATE_NONE);
                break;
            default:
                AppSkuDTO appSkuDTO = (AppSkuDTO) obj;
                ArrayList<String> arrayList4 = new ArrayList<>();
                Bundle bundle2 = this.b;
                if (appSkuDTO == null || appSkuDTO.getSkus() == null) {
                    bundle2.putInt("RESPONSE_CODE", 6);
                    str3 = "server-sku-list-null";
                    str4 = "-SERVER_RESPONSE";
                } else {
                    arrayList4.addAll(appSkuDTO.getSkus());
                    bundle2.putInt("RESPONSE_CODE", 0);
                    bundle2.putStringArrayList("DETAILS_LIST", arrayList4);
                    str3 = "ok";
                    str4 = "";
                }
                this.c.g(bundle2, str4, str3, ApplicationStateDto.STATE_NONE);
                break;
        }
    }
}
