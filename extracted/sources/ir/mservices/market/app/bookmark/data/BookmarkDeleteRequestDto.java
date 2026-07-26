package ir.mservices.market.app.bookmark.data;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkDeleteRequestDto implements RequestDTO {
    private final String accountId;
    private final List<String> packageNames;

    public BookmarkDeleteRequestDto(String str, List<String> list) {
        js3.p(str, "accountId");
        js3.p(list, "packageNames");
        this.accountId = str;
        this.packageNames = list;
    }
}
