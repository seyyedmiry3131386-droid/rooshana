package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShieldAppDTO implements Serializable {
    private final Integer apkCategory;
    private final boolean isReported;
    private final String packageName;
    private final String sha1;
    private final int versionCode;

    public ShieldAppDTO(String str, int i, Integer num, String str2, boolean z) {
        js3.p(str, "packageName");
        js3.p(str2, "sha1");
        this.packageName = str;
        this.versionCode = i;
        this.apkCategory = num;
        this.sha1 = str2;
        this.isReported = z;
    }

    public final Integer getApkCategory() {
        return this.apkCategory;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final boolean isReported() {
        return this.isReported;
    }
}
