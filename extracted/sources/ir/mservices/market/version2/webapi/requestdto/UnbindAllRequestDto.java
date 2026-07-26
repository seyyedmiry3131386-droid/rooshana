package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class UnbindAllRequestDto implements RequestDTO {
    private final String pushToken;

    public UnbindAllRequestDto(String str) {
        this.pushToken = str;
    }

    public final String getPushToken() {
        return this.pushToken;
    }
}
