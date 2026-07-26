package ir.mservices.market.app.detail.subReviews.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bf5;
import defpackage.vo7;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SubCommentDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.ORIGIN)
    private final ReviewDto origin;

    @vo7("reviews")
    private final List<ReviewDto> reviews;

    /* JADX WARN: Multi-variable type inference failed */
    public SubCommentDto(List<? extends ReviewDto> list, ReviewDto reviewDto, boolean z) {
        this.reviews = list;
        this.origin = reviewDto;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final ReviewDto getOrigin() {
        return this.origin;
    }

    public final List<ReviewDto> getReviews() {
        return this.reviews;
    }
}
