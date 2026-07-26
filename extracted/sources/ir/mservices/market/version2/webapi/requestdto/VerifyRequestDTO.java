package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.BindInfoDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class VerifyRequestDTO implements RequestDTO {
    private String bindValue;
    private boolean isConfirmed;
    private String pin;

    @BindInfoDTO.BindType
    private String type;

    public String getBindValue() {
        return this.bindValue;
    }

    @BindInfoDTO.BindType
    public String getType() {
        return this.type;
    }

    public void setBindValue(String str) {
        this.bindValue = str;
    }

    public void setIsConfirmed(boolean z) {
        this.isConfirmed = z;
    }

    public void setPin(String str) {
        this.pin = str;
    }

    public void setType(@BindInfoDTO.BindType String str) {
        this.type = str;
    }
}
