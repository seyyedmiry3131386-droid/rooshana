package ir.mservices.market.movie.ui.detail.review.data;

import defpackage.js3;
import defpackage.x55;
import defpackage.y80;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitMovieReviewData implements Serializable, y80 {
    public final String a;
    public final boolean b;
    public final String c;
    public final x55 d;
    public final Object e;

    public SubmitMovieReviewData(String str, boolean z, String str2, x55 x55Var, PagingRecyclerListContentFragment pagingRecyclerListContentFragment) {
        js3.p(str, "movieId");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = x55Var;
        this.e = pagingRecyclerListContentFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitMovieReviewData)) {
            return false;
        }
        SubmitMovieReviewData submitMovieReviewData = (SubmitMovieReviewData) obj;
        return js3.i(this.a, submitMovieReviewData.a) && this.b == submitMovieReviewData.b && js3.i(this.c, submitMovieReviewData.c) && js3.i(this.d, submitMovieReviewData.d) && js3.i(this.e, submitMovieReviewData.e);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Object obj = this.e;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "SubmitMovieReviewData(movieId=" + this.a + ", isLiked=" + this.b + ", userComment=" + this.c + ", newReviewUiState=" + this.d + ", tag=" + this.e + ")";
    }
}
