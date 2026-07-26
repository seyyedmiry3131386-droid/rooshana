package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDescriptionDto implements Serializable {

    @vo7("isRtl")
    private final Boolean isRtl;

    @vo7("shortText")
    private String shortText;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private String text;

    public AppDescriptionDto(String str, String str2, Boolean bool) {
        this.text = str;
        this.shortText = str2;
        this.isRtl = bool;
    }

    public final String getShortText() {
        return this.shortText;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean isRtl() {
        return this.isRtl;
    }

    public final void setShortText(String str) {
        this.shortText = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
