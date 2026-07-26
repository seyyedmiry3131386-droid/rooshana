package ir.mservices.market.movie.ui.bookmark.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieBookmarkData extends MultiSelectRecyclerData implements g32 {
    public static final int i = js6.holder_movie_multi_select_bookmark;
    public final SearchMovieDto h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieBookmarkData(rv6 rv6Var, SearchMovieDto searchMovieDto) {
        super(rv6Var);
        js3.p(rv6Var, "multiselectVisibilityChangeState");
        js3.p(searchMovieDto, "movieDto");
        this.h = searchMovieDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieBookmarkData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData");
        MovieBookmarkData movieBookmarkData = (MovieBookmarkData) obj;
        return js3.i(this.h, movieBookmarkData.h) && this.f == movieBookmarkData.f && ((Boolean) this.e.a.getValue()).booleanValue() == ((Boolean) movieBookmarkData.e.a.getValue()).booleanValue() && ((Boolean) this.a.getValue()).booleanValue() == ((Boolean) movieBookmarkData.a.getValue()).booleanValue() && this.g == movieBookmarkData.g;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h.getId();
    }

    public final int hashCode() {
        return this.h.hashCode();
    }
}
