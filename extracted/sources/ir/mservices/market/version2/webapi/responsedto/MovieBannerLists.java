package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieBannerLists extends HomeItemDTO {

    @vo7("item")
    private final HomeMovieListDto item;

    public MovieBannerLists(HomeMovieListDto homeMovieListDto) {
        this.item = homeMovieListDto;
    }

    public final HomeMovieListDto getItem() {
        return this.item;
    }
}
