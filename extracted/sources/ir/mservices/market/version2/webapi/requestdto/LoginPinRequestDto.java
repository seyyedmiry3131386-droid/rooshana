package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class LoginPinRequestDto implements RequestDTO {
    private boolean isConfirmed;
    private String pin;
    private String rawText;

    public void setConfirmed(boolean z) {
        this.isConfirmed = z;
    }

    public void setPin(String str) {
        this.pin = str;
    }

    public void setRawText(String str) {
        this.rawText = str;
    }
}
