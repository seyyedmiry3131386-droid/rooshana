package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AILikeReviewDto implements RequestDTO, Serializable {

    @vo7("isPositive")
    private final boolean isPositive;

    public AILikeReviewDto(boolean z) {
        this.isPositive = z;
    }

    public final boolean isPositive() {
        return this.isPositive;
    }
}
