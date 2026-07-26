package ir.mservices.market.reels.data;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelLikeRequestDto implements RequestDTO {
    private final String reelId;

    public ReelLikeRequestDto(String str) {
        js3.p(str, "reelId");
        this.reelId = str;
    }

    public final String getReelId() {
        return this.reelId;
    }
}
