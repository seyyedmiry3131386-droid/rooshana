package ir.mservices.market.myReview.complete.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class CompleteReviewDto implements Serializable {

    @vo7("canEdit")
    private final boolean canEdit;

    @vo7("categoryName")
    private final String categoryName;

    @vo7("comment")
    private final String comment;

    @vo7("downloadSummary")
    private final DownloadSummaryDto downloadSummary;

    @vo7("iconPath")
    private final String iconPath;

    @vo7("packageName")
    private final String packageName;

    @vo7("rate")
    private final float rate;

    @vo7("reviewId")
    private final String reviewId;

    @vo7("title")
    private final String title;

    @vo7("totalRating")
    private final float totalRating;

    public CompleteReviewDto(String str, String str2, String str3, float f, DownloadSummaryDto downloadSummaryDto, String str4, String str5, float f2, String str6, boolean z) {
        this.packageName = str;
        this.title = str2;
        this.categoryName = str3;
        this.totalRating = f;
        this.downloadSummary = downloadSummaryDto;
        this.iconPath = str4;
        this.reviewId = str5;
        this.rate = f2;
        this.comment = str6;
        this.canEdit = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CompleteReviewDto.class.equals(obj.getClass())) {
            CompleteReviewDto completeReviewDto = (CompleteReviewDto) obj;
            if (Float.compare(completeReviewDto.totalRating, this.totalRating) == 0 && Float.compare(completeReviewDto.rate, this.rate) == 0 && js3.i(this.packageName, completeReviewDto.packageName) && js3.i(this.reviewId, completeReviewDto.reviewId) && js3.i(this.comment, completeReviewDto.comment)) {
                return true;
            }
        }
        return false;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getComment() {
        return this.comment;
    }

    public final DownloadSummaryDto getDownloadSummary() {
        return this.downloadSummary;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final float getRate() {
        return this.rate;
    }

    public final String getReviewId() {
        return this.reviewId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final float getTotalRating() {
        return this.totalRating;
    }

    public int hashCode() {
        return Objects.hash(this.packageName, Float.valueOf(this.totalRating), this.reviewId, Float.valueOf(this.rate), this.comment);
    }
}
