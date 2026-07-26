package ir.mservices.market.app.detail.more.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppOriginDescriptionDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    public AppOriginDescriptionDto(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }
}
