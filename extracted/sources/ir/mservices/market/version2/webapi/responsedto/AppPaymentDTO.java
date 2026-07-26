package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AppPaymentDTO extends ResultDTO implements Serializable {
    private String trackingNumber;

    public AppPaymentDTO(int i, String str, String str2) {
        super(i, str, str2);
    }

    public String getTrackingNumber() {
        return this.trackingNumber;
    }
}
