package ir.mservices.market.movie.data.webapi;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewRequestDto implements RequestDTO {
    private boolean isLike;
    private String text;

    public MovieReviewRequestDto(boolean z, String str) {
        this.isLike = z;
        this.text = str;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isLike() {
        return this.isLike;
    }

    public final void setLike(boolean z) {
        this.isLike = z;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
