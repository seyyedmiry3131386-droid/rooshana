package ir.mservices.market.myReview.complete.data;

import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CompleteReviewResultDto implements Serializable {

    @vo7("reviews")
    private final List<CompleteReviewDto> reviews;

    public CompleteReviewResultDto(List<CompleteReviewDto> list) {
        this.reviews = list;
    }

    public final List<CompleteReviewDto> getReviews() {
        return this.reviews;
    }
}
