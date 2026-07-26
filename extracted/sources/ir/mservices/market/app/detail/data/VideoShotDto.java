package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoShotDto implements Serializable {

    @vo7("aparatId")
    private final String aparatId;

    @vo7("height")
    private final int height;

    @vo7("mainUrl")
    private final String mainUrl;

    @vo7("startCallbackUrl")
    private final String startCallbackUrl;

    @vo7("thumbnailUrl")
    private final String thumbnailUrl;

    @vo7("videoUrl")
    private final String videoUrl;

    @vo7("width")
    private final int width;

    public VideoShotDto(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        this.width = i;
        this.height = i2;
        this.videoUrl = str;
        this.aparatId = str2;
        this.thumbnailUrl = str3;
        this.mainUrl = str4;
        this.startCallbackUrl = str5;
    }

    public final String getAparatId() {
        return this.aparatId;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMainUrl() {
        return this.mainUrl;
    }

    public final String getStartCallbackUrl() {
        return this.startCallbackUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getWidth() {
        return this.width;
    }
}
