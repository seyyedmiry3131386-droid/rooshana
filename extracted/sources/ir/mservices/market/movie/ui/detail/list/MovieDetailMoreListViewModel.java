package ir.mservices.market.movie.ui.detail.list;

import android.os.Parcelable;
import defpackage.jd7;
import defpackage.js3;
import defpackage.o15;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDetailMoreListViewModel extends c {
    public final o15 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailMoreListViewModel(jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        if (!jd7Var.a("recommendation")) {
            throw new IllegalArgumentException("Required argument \"recommendation\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(HomeMovieListDto.class) && !Serializable.class.isAssignableFrom(HomeMovieListDto.class)) {
            throw new UnsupportedOperationException(HomeMovieListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        HomeMovieListDto homeMovieListDto = (HomeMovieListDto) jd7Var.b("recommendation");
        if (homeMovieListDto == null) {
            throw new IllegalArgumentException("Argument \"recommendation\" is marked as non-null but was passed a null value");
        }
        this.t = new o15(homeMovieListDto);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieDetailMoreListViewModel$doRequest$1(this, null));
    }
}
