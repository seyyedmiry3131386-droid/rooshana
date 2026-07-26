package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieCastTitleData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.holder_movie_cast_title;
    public final String a;

    public MovieCastTitleData() {
        long j = is3.p + 1;
        is3.p = j;
        this.a = String.valueOf(j);
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
        return MovieCastTitleData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }
}
