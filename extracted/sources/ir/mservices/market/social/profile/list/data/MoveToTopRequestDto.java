package ir.mservices.market.social.profile.list.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class MoveToTopRequestDto implements RequestDTO {

    @vo7("listType")
    private final String listType;

    public MoveToTopRequestDto(String str) {
        js3.p(str, "listType");
        this.listType = str;
    }

    public final String getListType() {
        return this.listType;
    }
}
