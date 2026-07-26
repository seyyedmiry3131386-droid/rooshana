package ir.mservices.market.movie.streamers.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerMovieTitleData implements MyketRecyclerData, g32 {
    public static final int a = js6.holder_streamer_movie_title;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StreamerMovieTitleData);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "StreamerMovieTitleData";
    }

    public final int hashCode() {
        return StreamerMovieTitleData.class.hashCode();
    }
}
