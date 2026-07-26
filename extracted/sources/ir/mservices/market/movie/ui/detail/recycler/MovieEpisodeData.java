package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.h45;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.ui.common.MovieButtonStateData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieEpisodeData extends MovieButtonStateData implements wo2, h45, g32 {
    public static final int e = js6.holder_movie_episode;
    public final EpisodeDto a;
    public final v48 b;
    public final v48 c;
    public final boolean d;

    public MovieEpisodeData(EpisodeDto episodeDto, v48 v48Var, v48 v48Var2, boolean z) {
        js3.p(episodeDto, "episode");
        js3.p(v48Var2, "mediaPlaybackStateFlow");
        this.a = episodeDto;
        this.b = v48Var;
        this.c = v48Var2;
        this.d = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // defpackage.h45
    public final String a() {
        String id = this.a.getId();
        js3.p(id, "id");
        return "episode_".concat(id);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MovieEpisodeData) {
            return js3.i(this.a, ((MovieEpisodeData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
