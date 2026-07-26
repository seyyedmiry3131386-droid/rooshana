package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class JoinMonthlyRequestDto implements RequestDTO {
    private String invoice;
    private String signature;

    public JoinMonthlyRequestDto(String str, String str2) {
        this.invoice = str;
        this.signature = str2;
    }
}
