package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PollsDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("iconUrl")
    private final String iconUrl;

    public PollsDto(String str, String str2) {
        this.iconUrl = str;
        this.description = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }
}
