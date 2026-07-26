package ir.mservices.market.common.comment.data;

import defpackage.bl4;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportReviewData implements Serializable {
    private final String parentId;
    private final String reviewId;

    public ReportReviewData(String str, String str2) {
        js3.p(str, "reviewId");
        this.reviewId = str;
        this.parentId = str2;
    }

    public static /* synthetic */ ReportReviewData copy$default(ReportReviewData reportReviewData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportReviewData.reviewId;
        }
        if ((i & 2) != 0) {
            str2 = reportReviewData.parentId;
        }
        return reportReviewData.copy(str, str2);
    }

    public final String component1() {
        return this.reviewId;
    }

    public final String component2() {
        return this.parentId;
    }

    public final ReportReviewData copy(String str, String str2) {
        js3.p(str, "reviewId");
        return new ReportReviewData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportReviewData)) {
            return false;
        }
        ReportReviewData reportReviewData = (ReportReviewData) obj;
        return js3.i(this.reviewId, reportReviewData.reviewId) && js3.i(this.parentId, reportReviewData.parentId);
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getReviewId() {
        return this.reviewId;
    }

    public int hashCode() {
        int iHashCode = this.reviewId.hashCode() * 31;
        String str = this.parentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return bl4.w("ReportReviewData(reviewId=", this.reviewId, ", parentId=", this.parentId, ")");
    }
}
