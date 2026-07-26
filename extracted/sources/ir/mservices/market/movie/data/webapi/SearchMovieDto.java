package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchMovieDto implements Serializable {

    @vo7("exactMatch")
    private final Boolean exactMatch;

    @vo7("id")
    private final String id;

    @vo7("imdbIconUrl")
    private final String imdbIconUrl;

    @vo7("imdbRate")
    private final String imdbRate;

    @vo7("label")
    private final MovieLabelDto label;

    @vo7("posterUrl")
    private final String posterUrl;

    @vo7("refId")
    private final String refId;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    @vo7("summaries")
    private final List<SummariesDto> summaries;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    public SearchMovieDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, MovieLabelDto movieLabelDto, Boolean bool, List<SummariesDto> list) {
        js3.p(str, "id");
        js3.p(str2, "posterUrl");
        js3.p(str3, "title");
        js3.p(str7, "type");
        this.id = str;
        this.posterUrl = str2;
        this.title = str3;
        this.secondaryTitle = str4;
        this.imdbRate = str5;
        this.imdbIconUrl = str6;
        this.type = str7;
        this.refId = str8;
        this.label = movieLabelDto;
        this.exactMatch = bool;
        this.summaries = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchMovieDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.SearchMovieDto");
        return js3.i(this.id, ((SearchMovieDto) obj).id);
    }

    public final Boolean getExactMatch() {
        return this.exactMatch;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImdbIconUrl() {
        return this.imdbIconUrl;
    }

    public final String getImdbRate() {
        return this.imdbRate;
    }

    public final MovieLabelDto getLabel() {
        return this.label;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final List<SummariesDto> getSummaries() {
        return this.summaries;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
