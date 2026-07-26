package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictedAppDTO implements Serializable {

    @vo7("iconPath")
    private final String iconPath;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("title")
    private final String title;

    public RestrictedAppDTO(String str, String str2, String str3) {
        js3.p(str, "title");
        js3.p(str2, "iconPath");
        js3.p(str3, ConfirmDTO.INPUT_TYPE_TEXT);
        this.title = str;
        this.iconPath = str2;
        this.text = str3;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }
}
