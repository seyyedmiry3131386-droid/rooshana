package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.TrailerDto;
import ir.mservices.market.version2.activity.IbexData;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieTrailerData implements MyketRecyclerData, wo2, g32 {
    public static final int e = js6.holder_movie_trailer;
    public final TrailerDto a;
    public final IbexData b;
    public final transient fu7 c;
    public final String d;

    public MovieTrailerData(TrailerDto trailerDto, IbexData ibexData, i iVar) {
        js3.p(trailerDto, "trailer");
        js3.p(iVar, "showTrailerReplayIcon");
        this.a = trailerDto;
        this.b = ibexData;
        this.c = iVar;
        long j = is3.p + 1;
        is3.p = j;
        this.d = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieTrailerData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieTrailerData");
        MovieTrailerData movieTrailerData = (MovieTrailerData) obj;
        return js3.i(this.a, movieTrailerData.a) && js3.i(this.d, movieTrailerData.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
