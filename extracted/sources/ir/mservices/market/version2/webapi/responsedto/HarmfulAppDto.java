package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class HarmfulAppDto implements Serializable {

    @vo7("packageName")
    private final String packageName;

    public HarmfulAppDto(String str) {
        js3.p(str, "packageName");
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
