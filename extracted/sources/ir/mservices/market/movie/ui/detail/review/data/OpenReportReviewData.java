package ir.mservices.market.movie.ui.detail.review.data;

import defpackage.js3;
import defpackage.y80;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenReportReviewData implements Serializable, y80 {
    public final int a;
    public final String b;

    public OpenReportReviewData(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenReportReviewData)) {
            return false;
        }
        OpenReportReviewData openReportReviewData = (OpenReportReviewData) obj;
        return this.a == openReportReviewData.a && js3.i(this.b, openReportReviewData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "OpenReportReviewData(reviewId=" + this.a + ", movieId=" + this.b + ")";
    }
}
