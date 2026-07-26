package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class LikeAppRequestDto implements RequestDTO {

    @vo7("accountId")
    private final String accountId;

    @vo7("isPositive")
    private final boolean isPositive;

    @vo7("parentId")
    private final String parentId;

    public LikeAppRequestDto(boolean z, String str, String str2) {
        js3.p(str, "accountId");
        this.isPositive = z;
        this.accountId = str;
        this.parentId = str2;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final boolean isPositive() {
        return this.isPositive;
    }
}
