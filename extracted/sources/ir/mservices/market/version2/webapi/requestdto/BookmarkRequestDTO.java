package ir.mservices.market.version2.webapi.requestdto;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkRequestDTO implements RequestDTO {

    @vo7("accountId")
    private final String accountId;

    @vo7("packageName")
    private final String packageName;

    public BookmarkRequestDTO(String str, String str2) {
        this.accountId = str;
        this.packageName = str2;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
