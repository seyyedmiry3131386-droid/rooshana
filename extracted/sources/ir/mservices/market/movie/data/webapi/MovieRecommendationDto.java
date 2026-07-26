package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieRecommendationDto extends PlayerMovieDto implements Serializable {

    @vo7("imdbRate")
    private final String imdbRate;

    @vo7("refId")
    private final String refId;

    @vo7("seasons")
    private final List<SeasonDto> seasons;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieRecommendationDto(String str, String str2, String str3, String str4, List<SeasonDto> list, String str5, String str6, ShareModelDto shareModelDto, String str7, String str8) {
        super(str, str2, str3, str4, str5, shareModelDto);
        js3.p(str, "id");
        js3.p(str3, "title");
        js3.p(str4, "posterUrl");
        js3.p(str5, "type");
        js3.p(shareModelDto, "shareModel");
        this.seasons = list;
        this.secondaryTitle = str6;
        this.imdbRate = str7;
        this.refId = str8;
    }

    public final String getImdbRate() {
        return this.imdbRate;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final List<SeasonDto> getSeasons() {
        return this.seasons;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }
}
