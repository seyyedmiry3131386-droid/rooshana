package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExtensionDto implements Serializable {
    private String nextPageUrl;
    private String title;

    public ExtensionDto() {
    }

    public String getNextPageUrl() {
        return this.nextPageUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public ExtensionDto(String str, String str2) {
        this.title = str;
        this.nextPageUrl = str2;
    }
}
