package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class RefundSkuRequestDto implements RequestDTO {
    public String PackageName;
    public String SkuId;

    public RefundSkuRequestDto(String str, String str2) {
        this.PackageName = str;
        this.SkuId = str2;
    }

    public String getPackageName() {
        return this.PackageName;
    }

    public String getSkuId() {
        return this.SkuId;
    }
}
