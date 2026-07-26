package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.appDetail.MovieToolbarData;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a65 implements ai5 {
    public final String a;
    public final MovieReviewInfoDto b;
    public final MovieToolbarData c;

    public a65(String str, MovieReviewInfoDto movieReviewInfoDto, MovieToolbarData movieToolbarData) {
        js3.p(str, "movieId");
        this.a = str;
        this.b = movieReviewInfoDto;
        this.c = movieToolbarData;
    }

    public static final a65 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", a65.class, "movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("movieId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("reviewInfo")) {
            throw new IllegalArgumentException("Required argument \"reviewInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MovieReviewInfoDto.class) && !Serializable.class.isAssignableFrom(MovieReviewInfoDto.class)) {
            throw new UnsupportedOperationException(MovieReviewInfoDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MovieReviewInfoDto movieReviewInfoDto = (MovieReviewInfoDto) bundle.get("reviewInfo");
        if (!bundle.containsKey("toolbarData")) {
            throw new IllegalArgumentException("Required argument \"toolbarData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MovieToolbarData.class) && !Serializable.class.isAssignableFrom(MovieToolbarData.class)) {
            throw new UnsupportedOperationException(MovieToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MovieToolbarData movieToolbarData = (MovieToolbarData) bundle.get("toolbarData");
        if (movieToolbarData != null) {
            return new a65(string, movieReviewInfoDto, movieToolbarData);
        }
        throw new IllegalArgumentException("Argument \"toolbarData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a65)) {
            return false;
        }
        a65 a65Var = (a65) obj;
        return js3.i(this.a, a65Var.a) && js3.i(this.b, a65Var.b) && js3.i(this.c, a65Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MovieReviewInfoDto movieReviewInfoDto = this.b;
        return this.c.hashCode() + ((iHashCode + (movieReviewInfoDto == null ? 0 : movieReviewInfoDto.hashCode())) * 31);
    }

    public final String toString() {
        return "MovieReviewsRecyclerListFragmentArgs(movieId=" + this.a + ", reviewInfo=" + this.b + ", toolbarData=" + this.c + ")";
    }
}
