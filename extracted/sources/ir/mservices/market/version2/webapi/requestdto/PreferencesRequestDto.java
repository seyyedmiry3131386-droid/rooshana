package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public class PreferencesRequestDto implements RequestDTO {
    private boolean isPrivate;
    private String viewDevices;
    private String viewDownloads;
    private String viewFriends;

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
