package ir.mservices.market.version2.services;

import com.android.volley.Request$Priority;
import defpackage.kp8;
import defpackage.lw;
import defpackage.o2;
import defpackage.xv2;
import defpackage.z57;
import defpackage.zv2;
import ir.mservices.market.version2.webapi.requestdto.PurchaseReceiptDto;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends o2 {
    public final void g(PurchaseReceiptDto purchaseReceiptDto, String str, Object obj, kp8 kp8Var, kp8 kp8Var2) {
        lw.d(null, null, kp8Var);
        lw.d(null, null, kp8Var2);
        HashMap map = new HashMap();
        map.put("trackingNumber", str);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/purchases", "{trackingNumber}/receipt", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(kp8Var, kp8Var2);
        xv2 xv2Var = new xv2(2, z57VarCreateRequestUrl, purchaseReceiptDto, Request$Priority.b, false, obj, createVolleyErrorListener(kp8Var2), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new PurchasesService$1().getType();
        performRequest(xv2Var, kp8Var2);
    }
}
