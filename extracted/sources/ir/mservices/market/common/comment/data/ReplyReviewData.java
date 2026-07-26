package ir.mservices.market.common.comment.data;

import defpackage.js3;
import defpackage.rm7;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplyReviewData implements Serializable {
    private final String launchSource;
    private final String packageName;
    private final ReviewDto reviewDTO;
    private final String reviewId;

    public ReplyReviewData(String str, String str2, String str3, ReviewDto reviewDto) {
        js3.p(str, "launchSource");
        js3.p(str2, "packageName");
        js3.p(str3, "reviewId");
        this.launchSource = str;
        this.packageName = str2;
        this.reviewId = str3;
        this.reviewDTO = reviewDto;
    }

    public static /* synthetic */ ReplyReviewData copy$default(ReplyReviewData replyReviewData, String str, String str2, String str3, ReviewDto reviewDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyReviewData.launchSource;
        }
        if ((i & 2) != 0) {
            str2 = replyReviewData.packageName;
        }
        if ((i & 4) != 0) {
            str3 = replyReviewData.reviewId;
        }
        if ((i & 8) != 0) {
            reviewDto = replyReviewData.reviewDTO;
        }
        return replyReviewData.copy(str, str2, str3, reviewDto);
    }

    public final String component1() {
        return this.launchSource;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.reviewId;
    }

    public final ReviewDto component4() {
        return this.reviewDTO;
    }

    public final ReplyReviewData copy(String str, String str2, String str3, ReviewDto reviewDto) {
        js3.p(str, "launchSource");
        js3.p(str2, "packageName");
        js3.p(str3, "reviewId");
        return new ReplyReviewData(str, str2, str3, reviewDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyReviewData)) {
            return false;
        }
        ReplyReviewData replyReviewData = (ReplyReviewData) obj;
        return js3.i(this.launchSource, replyReviewData.launchSource) && js3.i(this.packageName, replyReviewData.packageName) && js3.i(this.reviewId, replyReviewData.reviewId) && js3.i(this.reviewDTO, replyReviewData.reviewDTO);
    }

    public final String getLaunchSource() {
        return this.launchSource;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final ReviewDto getReviewDTO() {
        return this.reviewDTO;
    }

    public final String getReviewId() {
        return this.reviewId;
    }

    public int hashCode() {
        int iK = rm7.k(this.reviewId, rm7.k(this.packageName, this.launchSource.hashCode() * 31, 31), 31);
        ReviewDto reviewDto = this.reviewDTO;
        return iK + (reviewDto == null ? 0 : reviewDto.hashCode());
    }

    public String toString() {
        String str = this.launchSource;
        String str2 = this.packageName;
        String str3 = this.reviewId;
        ReviewDto reviewDto = this.reviewDTO;
        StringBuilder sbT = rm7.t("ReplyReviewData(launchSource=", str, ", packageName=", str2, ", reviewId=");
        sbT.append(str3);
        sbT.append(", reviewDTO=");
        sbT.append(reviewDto);
        sbT.append(")");
        return sbT.toString();
    }
}
