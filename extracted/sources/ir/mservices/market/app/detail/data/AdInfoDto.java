package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdInfoDto implements Serializable {

    @vo7("bgColor")
    private final String bgColor;

    @vo7("strokeColor")
    private final String strokeColor;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("textColor")
    private final String textColor;

    public AdInfoDto(String str, String str2, String str3, String str4) {
        this.text = str;
        this.textColor = str2;
        this.bgColor = str3;
        this.strokeColor = str4;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }
}
