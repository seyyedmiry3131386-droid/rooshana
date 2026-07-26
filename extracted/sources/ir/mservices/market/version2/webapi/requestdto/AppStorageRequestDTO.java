package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class AppStorageRequestDTO implements RequestDTO {
    private final String payload;

    public AppStorageRequestDTO(String str) {
        js3.p(str, "payload");
        this.payload = str;
    }

    public final String getPayload() {
        return this.payload;
    }
}
