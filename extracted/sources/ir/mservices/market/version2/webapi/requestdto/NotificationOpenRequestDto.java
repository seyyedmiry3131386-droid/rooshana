package ir.mservices.market.version2.webapi.requestdto;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationOpenRequestDto implements RequestDTO {

    @vo7("opened")
    private final boolean opened;

    public NotificationOpenRequestDto(boolean z) {
        this.opened = z;
    }
}
