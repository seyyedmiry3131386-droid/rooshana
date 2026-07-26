package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class o15 implements ai5 {
    public final HomeMovieListDto a;

    public o15(HomeMovieListDto homeMovieListDto) {
        js3.p(homeMovieListDto, "recommendation");
        this.a = homeMovieListDto;
    }

    public static final o15 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", o15.class, "recommendation")) {
            throw new IllegalArgumentException("Required argument \"recommendation\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(HomeMovieListDto.class) && !Serializable.class.isAssignableFrom(HomeMovieListDto.class)) {
            throw new UnsupportedOperationException(HomeMovieListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        HomeMovieListDto homeMovieListDto = (HomeMovieListDto) bundle.get("recommendation");
        if (homeMovieListDto != null) {
            return new o15(homeMovieListDto);
        }
        throw new IllegalArgumentException("Argument \"recommendation\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o15) && js3.i(this.a, ((o15) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieDetailMoreListRecyclerListFragmentArgs(recommendation=" + this.a + ")";
    }
}
