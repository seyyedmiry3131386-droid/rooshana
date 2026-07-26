package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.m88;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDto implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String EMPTY_ID = "EMPTY";
    private static final MovieDto Empty = new MovieDto(EMPTY_ID, "", "", "", "", "", "", null);

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("id")
    private final String id;

    @vo7("label")
    private final MovieLabelDto label;

    @vo7("posterUrl")
    private final String posterUrl;

    @vo7("refId")
    private String refId;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final MovieDto getEmpty() {
            return MovieDto.Empty;
        }

        private Companion() {
        }
    }

    public MovieDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, MovieLabelDto movieLabelDto) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(str3, "posterUrl");
        js3.p(str5, "type");
        this.id = str;
        this.title = str2;
        this.posterUrl = str3;
        this.secondaryTitle = str4;
        this.type = str5;
        this.refId = str6;
        this.action = str7;
        this.label = movieLabelDto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.MovieDto");
        MovieDto movieDto = (MovieDto) obj;
        return js3.i(this.id, movieDto.id) && js3.i(this.refId, movieDto.refId);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getId() {
        return this.id;
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

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.refId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return m88.Z(this.id, EMPTY_ID, false);
    }

    public final void setRefId(String str) {
        this.refId = str;
    }
}
