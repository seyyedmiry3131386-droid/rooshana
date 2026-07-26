package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewInfoDto implements Serializable {

    @vo7("color")
    private String color;

    @vo7("raiting")
    private String rating;

    @vo7("reviews")
    private ArrayList<MovieReviewDto> reviews;

    @vo7("subtitle")
    private String subtitle;

    @vo7("title")
    private String title;

    @vo7("userReview")
    private MovieReviewDto userReview;

    public MovieReviewInfoDto(String str, String str2, String str3, String str4, ArrayList<MovieReviewDto> arrayList, MovieReviewDto movieReviewDto) {
        this.rating = str;
        this.color = str2;
        this.title = str3;
        this.subtitle = str4;
        this.reviews = arrayList;
        this.userReview = movieReviewDto;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getRating() {
        return this.rating;
    }

    public final ArrayList<MovieReviewDto> getReviews() {
        return this.reviews;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MovieReviewDto getUserReview() {
        return this.userReview;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setRating(String str) {
        this.rating = str;
    }

    public final void setReviews(ArrayList<MovieReviewDto> arrayList) {
        this.reviews = arrayList;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserReview(MovieReviewDto movieReviewDto) {
        this.userReview = movieReviewDto;
    }
}
