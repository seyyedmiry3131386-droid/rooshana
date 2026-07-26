package ir.mservices.market.app.detail.data;

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

    public ScreenshotDto(String str, String str2, String str3, int i, int i2) {
        this.miniThumbnailUrl = str;
        this.thumbnailUrl = str2;
        this.mainUrl = str3;
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ScreenshotDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.data.ScreenshotDto");
        ScreenshotDto screenshotDto = (ScreenshotDto) obj;
        return js3.i(this.mainUrl, screenshotDto.mainUrl) && js3.i(this.thumbnailUrl, screenshotDto.thumbnailUrl) && js3.i(this.miniThumbnailUrl, screenshotDto.mainUrl);
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
        String str = this.miniThumbnailUrl;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.thumbnailUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mainUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
