package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class ActivationRequestDTO implements RequestDTO {
    private boolean isConfirmed;
    private String token;

    public void setIsConfirmed(boolean z) {
        this.isConfirmed = z;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
