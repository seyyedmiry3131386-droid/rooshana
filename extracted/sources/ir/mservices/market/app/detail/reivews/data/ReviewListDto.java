package ir.mservices.market.app.detail.reivews.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewListDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("reviews")
    private final List<ReviewDto> reviews;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewListDto(List<? extends ReviewDto> list, boolean z) {
        js3.p(list, "reviews");
        this.reviews = list;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<ReviewDto> getReviews() {
        return this.reviews;
    }
}
