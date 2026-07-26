package ir.mservices.market.movie.ui.detail.review;

import defpackage.bp2;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.ob4;
import defpackage.pq6;
import defpackage.u19;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieUserSubmitReviewData implements MyketRecyclerData, g32, wo2, u19 {
    public static final int j = js6.movie_submit_review_item;
    public final v48 a;
    public final v48 b;
    public final v48 c;
    public final boolean d;
    public final boolean e;
    public final bp2 f;
    public final int g;
    public String h;
    public final String i;

    public MovieUserSubmitReviewData(v48 v48Var, v48 v48Var2, l lVar, boolean z, boolean z2, ir.mservices.market.movie.ui.detail.review.all.a aVar, int i) {
        lVar = (i & 4) != 0 ? null : lVar;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        bp2 ob4Var = (i & 32) != 0 ? new ob4(24) : aVar;
        js3.p(v48Var, "reviewState");
        js3.p(v48Var2, "userMovieReview");
        this.a = v48Var;
        this.b = v48Var2;
        this.c = lVar;
        this.d = z;
        this.e = z2;
        this.f = ob4Var;
        this.g = pq6.space_4;
        long j2 = is3.p + 1;
        is3.p = j2;
        this.i = String.valueOf(j2);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieUserSubmitReviewData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData");
        js3.i(this.b.getValue(), ((MovieUserSubmitReviewData) obj).b.getValue());
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.i;
    }

    public final int hashCode() {
        Object value = this.b.getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }
}
