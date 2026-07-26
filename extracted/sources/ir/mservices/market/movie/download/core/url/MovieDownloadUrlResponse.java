package ir.mservices.market.movie.download.core.url;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.movie.uri.data.RestrictionInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadUrlResponse implements Serializable {

    @vo7("callback")
    private final String callback;

    @vo7("media")
    private final UrlData media;

    @vo7("restrictionInfo")
    private final RestrictionInfo restrictionInfo;

    @vo7("subtitle")
    private final UrlData subtitle;

    public MovieDownloadUrlResponse(UrlData urlData, UrlData urlData2, String str, RestrictionInfo restrictionInfo) {
        js3.p(urlData2, "media");
        this.subtitle = urlData;
        this.media = urlData2;
        this.callback = str;
        this.restrictionInfo = restrictionInfo;
    }

    public static /* synthetic */ MovieDownloadUrlResponse copy$default(MovieDownloadUrlResponse movieDownloadUrlResponse, UrlData urlData, UrlData urlData2, String str, RestrictionInfo restrictionInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            urlData = movieDownloadUrlResponse.subtitle;
        }
        if ((i & 2) != 0) {
            urlData2 = movieDownloadUrlResponse.media;
        }
        if ((i & 4) != 0) {
            str = movieDownloadUrlResponse.callback;
        }
        if ((i & 8) != 0) {
            restrictionInfo = movieDownloadUrlResponse.restrictionInfo;
        }
        return movieDownloadUrlResponse.copy(urlData, urlData2, str, restrictionInfo);
    }

    public final UrlData component1() {
        return this.subtitle;
    }

    public final UrlData component2() {
        return this.media;
    }

    public final String component3() {
        return this.callback;
    }

    public final RestrictionInfo component4() {
        return this.restrictionInfo;
    }

    public final MovieDownloadUrlResponse copy(UrlData urlData, UrlData urlData2, String str, RestrictionInfo restrictionInfo) {
        js3.p(urlData2, "media");
        return new MovieDownloadUrlResponse(urlData, urlData2, str, restrictionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieDownloadUrlResponse)) {
            return false;
        }
        MovieDownloadUrlResponse movieDownloadUrlResponse = (MovieDownloadUrlResponse) obj;
        return js3.i(this.subtitle, movieDownloadUrlResponse.subtitle) && js3.i(this.media, movieDownloadUrlResponse.media) && js3.i(this.callback, movieDownloadUrlResponse.callback) && js3.i(this.restrictionInfo, movieDownloadUrlResponse.restrictionInfo);
    }

    public final String getCallback() {
        return this.callback;
    }

    public final UrlData getMedia() {
        return this.media;
    }

    public final RestrictionInfo getRestrictionInfo() {
        return this.restrictionInfo;
    }

    public final UrlData getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        UrlData urlData = this.subtitle;
        int iHashCode = (this.media.hashCode() + ((urlData == null ? 0 : urlData.hashCode()) * 31)) * 31;
        String str = this.callback;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RestrictionInfo restrictionInfo = this.restrictionInfo;
        return iHashCode2 + (restrictionInfo != null ? restrictionInfo.hashCode() : 0);
    }

    public String toString() {
        return "MovieDownloadUrlResponse(subtitle=" + this.subtitle + ", media=" + this.media + ", callback=" + this.callback + ", restrictionInfo=" + this.restrictionInfo + ")";
    }
}
