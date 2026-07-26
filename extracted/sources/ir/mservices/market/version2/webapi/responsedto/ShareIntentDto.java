package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareIntentDto implements Serializable {

    @vo7("explicitListResponse")
    private final AppPackageDTO explicitListResponse;

    @vo7("intent")
    private final String intent;

    public ShareIntentDto(String str, AppPackageDTO appPackageDTO) {
        this.intent = str;
        this.explicitListResponse = appPackageDTO;
    }

    public final AppPackageDTO getExplicitListResponse() {
        return this.explicitListResponse;
    }

    public final String getIntent() {
        return this.intent;
    }
}
