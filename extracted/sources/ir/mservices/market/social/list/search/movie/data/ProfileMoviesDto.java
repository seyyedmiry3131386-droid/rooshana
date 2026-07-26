package ir.mservices.market.social.list.search.movie.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.MovieDto;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMoviesDto implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    private static final ProfileMoviesDto Empty = new ProfileMoviesDto(EmptyList.a, true);

    @vo7("eol")
    private final boolean eol;

    @vo7(CommonDataKt.HOME_MOVIE_TYPE_LIST)
    private final List<MovieDto> list;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ProfileMoviesDto getEmpty() {
            return ProfileMoviesDto.Empty;
        }

        private Companion() {
        }
    }

    public ProfileMoviesDto(List<MovieDto> list, boolean z) {
        js3.p(list, CommonDataKt.HOME_MOVIE_TYPE_LIST);
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

    public final List<MovieDto> getList() {
        return this.list;
    }
}
