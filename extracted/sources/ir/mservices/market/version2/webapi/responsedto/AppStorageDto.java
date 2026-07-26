package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppStorageDto implements Serializable {

    @vo7("payload")
    private final String payload;

    public AppStorageDto(String str) {
        js3.p(str, "payload");
        this.payload = str;
    }

    public final String getPayload() {
        return this.payload;
    }
}
