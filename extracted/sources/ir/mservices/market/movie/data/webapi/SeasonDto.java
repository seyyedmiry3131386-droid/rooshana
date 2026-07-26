package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SeasonDto implements Serializable {

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("episodes")
    private final List<EpisodeDto> episodes;

    @vo7("id")
    private final String id;

    @vo7("showNewBadge")
    private final Boolean showNewBadge;

    @vo7("title")
    private final String title;

    public SeasonDto(String str, String str2, List<EpisodeDto> list, String str3, Boolean bool) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(list, "episodes");
        this.id = str;
        this.title = str2;
        this.episodes = list;
        this.analyticsName = str3;
        this.showNewBadge = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SeasonDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.SeasonDto");
        SeasonDto seasonDto = (SeasonDto) obj;
        return js3.i(this.id, seasonDto.id) && js3.i(this.title, seasonDto.title) && js3.i(this.episodes, seasonDto.episodes);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final List<EpisodeDto> getEpisodes() {
        return this.episodes;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.episodes.hashCode() + rm7.k(this.title, this.id.hashCode() * 31, 31);
    }
}
