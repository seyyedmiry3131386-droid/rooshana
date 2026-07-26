package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareRequestDto implements RequestDTO, Serializable {
    private final String text;

    public ShareRequestDto(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.text = str;
    }

    public final String getText() {
        return this.text;
    }
}
