package ir.mservices.market.app.suggest.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestRequestDto implements RequestDTO {

    @vo7("packageName")
    private final String packageName;

    @vo7("title")
    private final String title;

    public SuggestRequestDto(String str, String str2) {
        js3.p(str, "packageName");
        js3.p(str2, "title");
        this.packageName = str;
        this.title = str2;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getTitle() {
        return this.title;
    }
}
