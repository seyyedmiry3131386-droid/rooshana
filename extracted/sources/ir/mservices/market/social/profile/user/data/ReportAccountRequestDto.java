package ir.mservices.market.social.profile.user.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportAccountRequestDto implements RequestDTO {

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("type")
    private final String type;

    public ReportAccountRequestDto(String str, String str2) {
        this.type = str;
        this.text = str2;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }
}
