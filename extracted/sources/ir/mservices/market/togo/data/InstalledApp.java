package ir.mservices.market.togo.data;

import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class InstalledApp implements Serializable {
    private final String packageName;
    private final int versionCode;

    public InstalledApp(String str, int i) {
        js3.p(str, "packageName");
        this.packageName = str;
        this.versionCode = i;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }
}
