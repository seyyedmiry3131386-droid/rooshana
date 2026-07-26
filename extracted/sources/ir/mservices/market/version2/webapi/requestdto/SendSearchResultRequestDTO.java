package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class SendSearchResultRequestDTO implements RequestDTO {
    private String html;
    private String query;

    public SendSearchResultRequestDTO(String str, String str2) {
        this.query = str;
        this.html = str2;
    }
}
