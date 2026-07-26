package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AppTagsDto implements Serializable {
    private String action;
    private String analyticsName;
    private String label;

    public String getAction() {
        return this.action;
    }

    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public String getLabel() {
        return this.label;
    }
}
