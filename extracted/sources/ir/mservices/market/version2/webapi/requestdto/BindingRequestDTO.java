package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class BindingRequestDTO implements RequestDTO {
    private String signedValue;
    private String type;
    private String value;

    public void setSignedValue(String str) {
        this.signedValue = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
