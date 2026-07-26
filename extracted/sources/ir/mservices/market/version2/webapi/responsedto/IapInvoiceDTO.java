package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class IapInvoiceDTO implements Serializable {
    public boolean autoRenewing;
    public String developerPayload;
    public String orderId;
    public String packageName;
    public String productId;
    public int purchaseState;
    public long purchaseTime;
    public String purchaseToken;
}
