package ir.mservices.market.movie.ui.list;

import android.os.Parcelable;
import defpackage.a05;
import defpackage.jd7;
import defpackage.js3;
import defpackage.ut4;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieBannerListViewModel extends c {
    public final ut4 t;
    public final a05 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieBannerListViewModel(jd7 jd7Var, ut4 ut4Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.t = ut4Var;
        if (!jd7Var.a("bannerList")) {
            throw new IllegalArgumentException("Required argument \"bannerList\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(HomeMovieBannerListDto.class) && !Serializable.class.isAssignableFrom(HomeMovieBannerListDto.class)) {
            throw new UnsupportedOperationException(HomeMovieBannerListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        HomeMovieBannerListDto homeMovieBannerListDto = (HomeMovieBannerListDto) jd7Var.b("bannerList");
        if (!jd7Var.a("search")) {
            throw new IllegalArgumentException("Required argument \"search\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) jd7Var.b("search");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"search\" of type boolean does not support null values");
        }
        if (!jd7Var.a("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("id");
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        this.u = new a05(homeMovieBannerListDto, bool.booleanValue(), str, (String) jd7Var.b("refId"));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieBannerListViewModel$doRequest$1(this, null));
    }
}
