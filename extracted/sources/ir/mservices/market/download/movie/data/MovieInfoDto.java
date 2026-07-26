package ir.mservices.market.download.movie.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieInfoDto implements Serializable {

    @vo7("id")
    private final String id;

    @vo7("isInMyket")
    private final boolean isInMyket;

    @vo7("posterUrl")
    private final String posterUrl;

    @vo7("title")
    private final String title;

    @vo7("titleEn")
    private final String titleEn;

    @vo7("type")
    private final String type;

    public MovieInfoDto(String str, String str2, String str3, String str4, String str5, boolean z) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(str3, "titleEn");
        js3.p(str4, "type");
        js3.p(str5, "posterUrl");
        this.id = str;
        this.title = str2;
        this.titleEn = str3;
        this.type = str4;
        this.posterUrl = str5;
        this.isInMyket = z;
    }

    public static /* synthetic */ MovieInfoDto copy$default(MovieInfoDto movieInfoDto, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = movieInfoDto.id;
        }
        if ((i & 2) != 0) {
            str2 = movieInfoDto.title;
        }
        if ((i & 4) != 0) {
            str3 = movieInfoDto.titleEn;
        }
        if ((i & 8) != 0) {
            str4 = movieInfoDto.type;
        }
        if ((i & 16) != 0) {
            str5 = movieInfoDto.posterUrl;
        }
        if ((i & 32) != 0) {
            z = movieInfoDto.isInMyket;
        }
        String str6 = str5;
        boolean z2 = z;
        return movieInfoDto.copy(str, str2, str3, str4, str6, z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.titleEn;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.posterUrl;
    }

    public final boolean component6() {
        return this.isInMyket;
    }

    public final MovieInfoDto copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(str3, "titleEn");
        js3.p(str4, "type");
        js3.p(str5, "posterUrl");
        return new MovieInfoDto(str, str2, str3, str4, str5, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieInfoDto)) {
            return false;
        }
        MovieInfoDto movieInfoDto = (MovieInfoDto) obj;
        return js3.i(this.id, movieInfoDto.id) && js3.i(this.title, movieInfoDto.title) && js3.i(this.titleEn, movieInfoDto.titleEn) && js3.i(this.type, movieInfoDto.type) && js3.i(this.posterUrl, movieInfoDto.posterUrl) && this.isInMyket == movieInfoDto.isInMyket;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleEn() {
        return this.titleEn;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return rm7.k(this.posterUrl, rm7.k(this.type, rm7.k(this.titleEn, rm7.k(this.title, this.id.hashCode() * 31, 31), 31), 31), 31) + (this.isInMyket ? 1231 : 1237);
    }

    public final boolean isInMyket() {
        return this.isInMyket;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.titleEn;
        String str4 = this.type;
        String str5 = this.posterUrl;
        boolean z = this.isInMyket;
        StringBuilder sbT = rm7.t("MovieInfoDto(id=", str, ", title=", str2, ", titleEn=");
        o40.I(str3, ", type=", str4, ", posterUrl=", sbT);
        sbT.append(str5);
        sbT.append(", isInMyket=");
        sbT.append(z);
        sbT.append(")");
        return sbT.toString();
    }
}
