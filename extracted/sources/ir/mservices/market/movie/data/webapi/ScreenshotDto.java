package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotDto implements Serializable {

    @vo7("height")
    private final int height;

    @vo7("mainUrl")
    private final String mainUrl;

    @vo7("miniThumbnailUrl")
    private final String miniThumbnailUrl;

    @vo7("thumbnailUrl")
    private final String thumbnailUrl;

    @vo7("width")
    private final int width;

    public ScreenshotDto(int i, int i2, String str, String str2, String str3) {
        js3.p(str2, "thumbnailUrl");
        this.width = i;
        this.height = i2;
        this.mainUrl = str;
        this.thumbnailUrl = str2;
        this.miniThumbnailUrl = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ScreenshotDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.ScreenshotDto");
        return js3.i(this.mainUrl, ((ScreenshotDto) obj).mainUrl);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMainUrl() {
        return this.mainUrl;
    }

    public final String getMiniThumbnailUrl() {
        return this.miniThumbnailUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.mainUrl;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.miniThumbnailUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
