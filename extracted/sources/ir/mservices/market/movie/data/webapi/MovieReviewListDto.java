package ir.mservices.market.movie.data.webapi;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewListDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("moreInfoMessage")
    private final String rateWithoutComment;

    @vo7("reviews")
    private ArrayList<MovieReviewDto> reviews;

    public MovieReviewListDto(ArrayList<MovieReviewDto> arrayList, boolean z, String str) {
        js3.p(arrayList, "reviews");
        js3.p(str, "rateWithoutComment");
        this.reviews = arrayList;
        this.eol = z;
        this.rateWithoutComment = str;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final String getRateWithoutComment() {
        return this.rateWithoutComment;
    }

    public final ArrayList<MovieReviewDto> getReviews() {
        return this.reviews;
    }

    public final void setReviews(ArrayList<MovieReviewDto> arrayList) {
        js3.p(arrayList, "<set-?>");
        this.reviews = arrayList;
    }
}
