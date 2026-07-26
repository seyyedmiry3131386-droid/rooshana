package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class VersionDescriptionDTO implements Serializable {
    private boolean isVersionDescriptionRtl;
    private int versionCode;
    private String versionDescription;

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionDescription() {
        return this.versionDescription;
    }

    public boolean isVersionDescriptionRtl() {
        return this.isVersionDescriptionRtl;
    }
}
