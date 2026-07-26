package ir.mservices.market.social.profile.list.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportListRequestDto implements RequestDTO {

    @vo7("type")
    private final String type;

    public ReportListRequestDto(String str) {
        js3.p(str, "type");
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
