package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MyketVersionDTO implements Serializable {
    private String intent;
    private boolean isForceUpdate;
    private int latestVersion;
    private String message;
    private String title;

    public String getIntent() {
        return this.intent;
    }

    public int getLatestVersion() {
        return this.latestVersion;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    public void setForceUpdate(boolean z) {
        this.isForceUpdate = z;
    }

    public void setLatestVersion(int i) {
        this.latestVersion = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MyketVersionDTO{latestVersion=");
        sb.append(this.latestVersion);
        sb.append(", isForceUpdate=");
        sb.append(this.isForceUpdate);
        sb.append(", message='");
        sb.append(this.message);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', intent='");
        return dw1.s(sb, this.intent, "'}");
    }
}
