package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShamadDto implements Serializable {

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("url")
    private final String url;

    public ShamadDto(String str, String str2) {
        this.text = str;
        this.url = str2;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }
}
