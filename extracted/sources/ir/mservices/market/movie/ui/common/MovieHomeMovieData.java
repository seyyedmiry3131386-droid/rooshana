package ir.mservices.market.movie.ui.common;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.o85;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeMovieData implements MyketRecyclerData, o85, g32 {
    public static final int g = js6.movie_card;
    public final MovieDto a;
    public final String b;
    public final Integer c;
    public final int d;
    public boolean e;
    public String f;

    public MovieHomeMovieData(MovieDto movieDto, String str, Integer num, int i) {
        js3.p(movieDto, "movieDto");
        this.a = movieDto;
        this.b = str;
        this.c = num;
        this.d = i;
        this.e = true;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieHomeMovieData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.common.MovieHomeMovieData");
        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
        if (js3.i(this.a, movieHomeMovieData.a) && js3.i(this.c, movieHomeMovieData.c)) {
            return js3.i(this.b, movieHomeMovieData.b);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.a.getId().hashCode();
    }

    public /* synthetic */ MovieHomeMovieData(MovieDto movieDto, String str, Integer num, int i, int i2) {
        this(movieDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 1 : num, (i & 8) == 0 ? 2 : 1);
    }
}
