package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EpisodeList implements Serializable {
    private List<EpisodeDto> episodeList;

    public EpisodeList(List<EpisodeDto> list) {
        js3.p(list, "episodeList");
        this.episodeList = list;
    }

    public final List<EpisodeDto> getEpisodeList() {
        return this.episodeList;
    }

    public final void setEpisodeList(List<EpisodeDto> list) {
        js3.p(list, "<set-?>");
        this.episodeList = list;
    }
}
