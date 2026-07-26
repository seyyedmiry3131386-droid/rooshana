package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareDto implements Serializable {

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    public ShareDto(String str) {
        this.text = str;
    }

    public final String getText() {
        return this.text;
    }
}
