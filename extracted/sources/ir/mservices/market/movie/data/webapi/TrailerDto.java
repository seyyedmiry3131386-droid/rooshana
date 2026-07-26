package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TrailerDto implements Serializable {

    @vo7("miniThumbnailUrl")
    private final String miniThumbnailUrl;

    @vo7("thumbnailUrl")
    private final String thumbnailUrl;

    @vo7("title")
    private final String title;

    @vo7("trailerUrl")
    private final String trailerUrl;

    public TrailerDto(String str, String str2, String str3, String str4) {
        js3.p(str, "trailerUrl");
        this.trailerUrl = str;
        this.thumbnailUrl = str2;
        this.miniThumbnailUrl = str3;
        this.title = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TrailerDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.TrailerDto");
        return js3.i(this.trailerUrl, ((TrailerDto) obj).trailerUrl);
    }

    public final String getMiniThumbnailUrl() {
        return this.miniThumbnailUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrailerUrl() {
        return this.trailerUrl;
    }

    public int hashCode() {
        int iHashCode = this.trailerUrl.hashCode() * 31;
        String str = this.miniThumbnailUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
