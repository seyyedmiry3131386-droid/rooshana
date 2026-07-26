package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class InAppPaymentConfigDTO extends PaymentConfigDTO implements Serializable {
    private int code;
    private String invoice;
    private String signature;

    public int getCode() {
        return this.code;
    }

    public String getInvoice() {
        return this.invoice;
    }

    public String getSignature() {
        return this.signature;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InAppPaymentConfigDTO{code=");
        sb.append(this.code);
        sb.append(", invoice='");
        sb.append(this.invoice);
        sb.append("', signature='");
        return dw1.s(sb, this.signature, "'}");
    }
}
