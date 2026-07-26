package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class NoBonusCodeAvailableAlertDto implements Serializable {
    private String iconUrl;
    private String text;

    public NoBonusCodeAvailableAlertDto(String str, String str2) {
        this.iconUrl = str;
        this.text = str2;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getText() {
        return this.text;
    }
}
