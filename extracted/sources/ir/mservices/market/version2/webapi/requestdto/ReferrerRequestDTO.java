package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class ReferrerRequestDTO implements RequestDTO {
    private String referrerId;
    private String uuid;

    public void setReferrerId(String str) {
        this.referrerId = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
