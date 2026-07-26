package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.g32;
import defpackage.h45;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.ui.common.MovieButtonStateData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadEpisodeData extends MovieButtonStateData implements wo2, h45, g32 {
    public static final int e = js6.holder_movie_download_episode;
    public final EpisodeDto a;
    public final v48 b;
    public final rv6 c;
    public final rv6 d;

    public MovieDownloadEpisodeData(EpisodeDto episodeDto, l lVar, rv6 rv6Var, rv6 rv6Var2) {
        js3.p(lVar, "downloadButtonLoadingState");
        this.a = episodeDto;
        this.b = lVar;
        this.c = rv6Var;
        this.d = rv6Var2;
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
        if (!(obj instanceof MovieDownloadEpisodeData)) {
            return false;
        }
        MovieDownloadEpisodeData movieDownloadEpisodeData = (MovieDownloadEpisodeData) obj;
        return js3.i(this.a, movieDownloadEpisodeData.a) && js3.i(this.b.getValue(), movieDownloadEpisodeData.b.getValue()) && ((Boolean) this.c.a.getValue()).booleanValue() == ((Boolean) movieDownloadEpisodeData.c.a.getValue()).booleanValue();
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return a();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object value = this.b.getValue();
        return ((iHashCode + (value != null ? value.hashCode() : 0)) * 31) + (((Boolean) this.c.a.getValue()).booleanValue() ? 1231 : 1237);
    }
}
