package ir.mservices.market.social.profile.list.movie.data;

import defpackage.bf5;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMoviesListDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7(CommonDataKt.HOME_MOVIE_TYPE_LIST)
    private final List<ProfileMovieListDto> list;

    public ProfileMoviesListDto(List<ProfileMovieListDto> list, boolean z) {
        this.list = list;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<ProfileMovieListDto> getList() {
        return this.list;
    }
}
