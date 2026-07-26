package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceDto implements Serializable {
    private boolean isPrivate;
    private String viewDevices;
    private String viewDownloads;
    private String viewFriends;

    public String getViewDevices() {
        return this.viewDevices;
    }

    public String getViewDownloads() {
        return this.viewDownloads;
    }

    public String getViewFriends() {
        return this.viewFriends;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public void setPrivate(boolean z) {
        this.isPrivate = z;
    }

    public void setViewDevices(String str) {
        this.viewDevices = str;
    }

    public void setViewDownloads(String str) {
        this.viewDownloads = str;
    }

    public void setViewFriends(String str) {
        this.viewFriends = str;
    }
}
