package ir.mservices.market.movie.ui.detail.review;

import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieEmptyReviewData implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.movie_review_empty_viewholder;
    public final boolean a;
    public final String b;

    public MovieEmptyReviewData(boolean z) {
        this.a = z;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return MovieEmptyReviewData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return MovieEmptyReviewData.class.hashCode();
    }
}
