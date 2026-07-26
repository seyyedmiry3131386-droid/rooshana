package ir.mservices.market.myReview.complete.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.vb7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myReview.complete.data.CompleteReviewDto;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class CompleteReview implements MyketRecyclerData, g32, wo2 {
    public static final int e = js6.holder_complete_review_item;
    public final CompleteReviewDto a;
    public final transient vb7 b;
    public float c;
    public String d;

    public CompleteReview(CompleteReviewDto completeReviewDto, vb7 vb7Var) {
        this.a = completeReviewDto;
        this.b = vb7Var;
        this.c = completeReviewDto.getRate();
        this.d = completeReviewDto.getComment();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !CompleteReview.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.a, ((CompleteReview) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String reviewId = this.a.getReviewId();
        return reviewId == null ? "" : reviewId;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
