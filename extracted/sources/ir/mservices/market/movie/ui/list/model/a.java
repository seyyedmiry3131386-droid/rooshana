package ir.mservices.market.movie.ui.list.model;

import defpackage.bp2;
import defpackage.dc0;
import defpackage.k45;
import defpackage.ut4;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.data.webapi.MovieListDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements bp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(HomeMovieBannerListDto homeMovieBannerListDto, String str, ut4 ut4Var, String str2, Object obj) {
        this.d = homeMovieBannerListDto;
        this.b = str;
        this.f = ut4Var;
        this.e = str2;
        this.c = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                HomeMovieBannerListDto homeMovieBannerListDto = (HomeMovieBannerListDto) this.d;
                return new ir.mservices.market.model.paging.a(new MovieBannerListRepositoryImpl$getBannerList$1$1(null, (ut4) this.f, this.c, this.b, (String) this.e), homeMovieBannerListDto != null ? new dc0(homeMovieBannerListDto.getBanners().size(), 9, homeMovieBannerListDto) : null);
            default:
                MovieListDto movieListDto = (MovieListDto) this.d;
                return new ir.mservices.market.model.paging.a(new MovieListRepositoryImpl$getMovies$1$1(this.b, (k45) this.e, this.c, null), movieListDto != null ? new dc0(movieListDto.getMovies().size(), 9, k45.a(movieListDto, !movieListDto.getEol(), (BackgroundImageDto) this.f)) : null);
        }
    }

    public /* synthetic */ a(MovieListDto movieListDto, String str, k45 k45Var, Object obj, BackgroundImageDto backgroundImageDto) {
        this.d = movieListDto;
        this.b = str;
        this.e = k45Var;
        this.c = obj;
        this.f = backgroundImageDto;
    }
}
