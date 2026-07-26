package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AppRateDto implements Serializable {

    @vo7("ai")
    private final AIReviewDto ai;

    @vo7("rates")
    private final List<RateDto> rates;

    @vo7("reviews")
    private final List<ReviewDto> reviews;

    @vo7("total")
    private final float total;

    @vo7("userReview")
    private final ReviewDto userReview;

    /* JADX WARN: Multi-variable type inference failed */
    public AppRateDto(float f, List<RateDto> list, List<? extends ReviewDto> list2, ReviewDto reviewDto, AIReviewDto aIReviewDto) {
        this.total = f;
        this.rates = list;
        this.reviews = list2;
        this.userReview = reviewDto;
        this.ai = aIReviewDto;
    }

    public final AIReviewDto getAi() {
        return this.ai;
    }

    public final List<RateDto> getRates() {
        return this.rates;
    }

    public final List<ReviewDto> getReviews() {
        return this.reviews;
    }

    public final float getTotal() {
        return this.total;
    }

    public final ReviewDto getUserReview() {
        return this.userReview;
    }
}
