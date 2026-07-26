package ir.mservices.market.movie.ui.search.result.recycler;

import defpackage.g32;
import defpackage.js3;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMovieSearchMovieData implements MyketRecyclerData, g32 {
    public final SearchMovieDto a;

    public BaseMovieSearchMovieData(SearchMovieDto searchMovieDto) {
        this.a = searchMovieDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.search.result.recycler.BaseMovieSearchMovieData");
        return js3.i(this.a, ((BaseMovieSearchMovieData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
