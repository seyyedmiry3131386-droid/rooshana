package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationSuggestDTO implements Serializable {
    private boolean hasIAP;
    private String iconPath;
    private String packageName;
    private String price;
    private String title;

    public String getIconPath() {
        return this.iconPath;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isHasIAP() {
        return this.hasIAP;
    }
}
