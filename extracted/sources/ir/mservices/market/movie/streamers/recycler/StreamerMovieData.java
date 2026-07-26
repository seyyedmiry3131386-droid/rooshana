package ir.mservices.market.movie.streamers.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieDto;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerMovieData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.holder_streamer_movie;
    public final MovieDto a;

    public StreamerMovieData(MovieDto movieDto) {
        js3.p(movieDto, "movieDto");
        this.a = movieDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StreamerMovieData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.streamers.recycler.StreamerMovieData");
        return js3.i(this.a, ((StreamerMovieData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
