package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadImageRequestDto implements RequestDTO {

    @vo7("body")
    private final byte[] body;

    public UploadImageRequestDto(byte[] bArr) {
        js3.p(bArr, "body");
        this.body = bArr;
    }

    public final byte[] getBody() {
        return this.body;
    }
}
