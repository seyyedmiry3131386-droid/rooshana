package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PurchaseDTO implements Serializable {
    private String invoice;
    private String signature;

    public String getInvoice() {
        return this.invoice;
    }

    public String getSignature() {
        return this.signature;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseDTO{invoice='");
        sb.append(this.invoice);
        sb.append("', signature='");
        return dw1.s(sb, this.signature, "'}");
    }
}
