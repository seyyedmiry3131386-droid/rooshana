package ir.mservices.market.movie.ui.detail.seasons.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.PlayerMovieDto;
import ir.mservices.market.movie.data.webapi.SeasonDto;
import ir.mservices.market.movie.data.webapi.ShareModelDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SeasonsDto extends PlayerMovieDto implements Serializable {

    @vo7("seasons")
    private final List<SeasonDto> seasons;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeasonsDto(String str, String str2, String str3, ShareModelDto shareModelDto, String str4, List<SeasonDto> list) {
        super(str, null, str2, str3, str4, shareModelDto);
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(str3, "posterUrl");
        js3.p(str4, "type");
        js3.p(list, "seasons");
        this.seasons = list;
    }

    public final List<SeasonDto> getSeasons() {
        return this.seasons;
    }
}
