package ir.mservices.market.app.detail.more.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppOriginVersionDescriptionDto implements Serializable {

    @vo7("versionDescription")
    private final String versionDescription;

    public AppOriginVersionDescriptionDto(String str) {
        this.versionDescription = str;
    }

    public final String getVersionDescription() {
        return this.versionDescription;
    }
}
