package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerMovieDto implements Serializable {

    @vo7("id")
    private final String id;

    @vo7("playId")
    private final String playId;

    @vo7("posterUrl")
    private final String posterUrl;

    @vo7("shareModel")
    private final ShareModelDto shareModel;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    public PlayerMovieDto(String str, String str2, String str3, String str4, String str5, ShareModelDto shareModelDto) {
        js3.p(str, "id");
        js3.p(str3, "title");
        js3.p(str4, "posterUrl");
        js3.p(str5, "type");
        this.id = str;
        this.playId = str2;
        this.title = str3;
        this.posterUrl = str4;
        this.type = str5;
        this.shareModel = shareModelDto;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlayId() {
        return this.playId;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final ShareModelDto getShareModel() {
        return this.shareModel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerMovieDto(MovieFullDto movieFullDto) {
        this(movieFullDto.getId(), movieFullDto.getPlayId(), movieFullDto.getTitle(), movieFullDto.getPosterUrl(), movieFullDto.getType(), movieFullDto.getShareModel());
        js3.p(movieFullDto, CommonDataKt.MOVIE_TYPE_MOVIE);
    }
}
