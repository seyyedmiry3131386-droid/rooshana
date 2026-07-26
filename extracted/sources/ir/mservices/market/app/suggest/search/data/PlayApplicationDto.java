package ir.mservices.market.app.suggest.search.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayApplicationDto implements Serializable {

    @vo7("appInfo")
    private final ApplicationDTO appInfo;

    @vo7("icon")
    private final String icon;

    @vo7("isAvailable")
    private final boolean isAvailable;

    @vo7("packageName")
    private final String packageName;

    @vo7("refId")
    private final String refId;

    @vo7("title")
    private final String title;

    public PlayApplicationDto(String str, String str2, String str3, boolean z, String str4, ApplicationDTO applicationDTO) {
        this.icon = str;
        this.title = str2;
        this.packageName = str3;
        this.isAvailable = z;
        this.refId = str4;
        this.appInfo = applicationDTO;
    }

    public final ApplicationDTO getAppInfo() {
        return this.appInfo;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }
}
