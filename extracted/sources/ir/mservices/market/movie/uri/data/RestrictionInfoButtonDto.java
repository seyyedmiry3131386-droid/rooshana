package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictionInfoButtonDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("actionText")
    private final String actionText;

    public RestrictionInfoButtonDto(String str, String str2) {
        this.actionText = str;
        this.action = str2;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActionText() {
        return this.actionText;
    }
}
