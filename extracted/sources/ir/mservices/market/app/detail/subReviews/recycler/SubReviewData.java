package ir.mservices.market.app.detail.subReviews.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SubReviewData implements MyketRecyclerData, g32, wo2 {
    public static final int d = js6.sub_review_item;
    public final ReviewDto a;
    public final String b;
    public final v48 c;

    public SubReviewData(ReviewDto reviewDto, String str, l lVar) {
        js3.p(reviewDto, "reviewDto");
        js3.p(str, "packageName");
        this.a = reviewDto;
        this.b = str;
        this.c = lVar;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !SubReviewData.class.equals(obj.getClass())) {
            return false;
        }
        SubReviewData subReviewData = (SubReviewData) obj;
        js3.i(this.b, subReviewData.b);
        return js3.i(this.a, subReviewData.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
