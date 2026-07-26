package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageBoxDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("actionText")
    private final String actionText;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("lineColor")
    private final String lineColor;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    public MessageBoxDto(String str, String str2, String str3, String str4, String str5) {
        this.text = str;
        this.iconUrl = str2;
        this.action = str3;
        this.lineColor = str4;
        this.actionText = str5;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final String getText() {
        return this.text;
    }
}
