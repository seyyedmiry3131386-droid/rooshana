package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CastDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieCastData implements MyketRecyclerData, wo2 {
    public static final int b = js6.movie_cast;
    public final CastDto a;

    public MovieCastData(CastDto castDto) {
        js3.p(castDto, "cast");
        this.a = castDto;
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
        if (!MovieCastData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.recycler.MovieCastData");
        return js3.i(this.a, ((MovieCastData) obj).a);
    }
}
