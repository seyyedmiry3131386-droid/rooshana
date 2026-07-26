package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SearchDescriptionDto implements Serializable {
    private boolean isRtl;
    private String text;

    public String getText() {
        return this.text;
    }

    public boolean isRtl() {
        return this.isRtl;
    }
}
