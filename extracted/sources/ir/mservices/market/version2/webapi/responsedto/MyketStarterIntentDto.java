package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MyketStarterIntentDto implements Serializable {
    private String intent;
    private String userSource;

    public String getIntent() {
        return this.intent;
    }

    public String getUserSource() {
        return this.userSource;
    }
}
