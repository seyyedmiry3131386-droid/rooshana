package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BackgroundImageDto implements Serializable {

    @vo7("bgBannerPath")
    private final String bgBannerPath;

    @vo7("bgColor")
    private final String bgColor;

    @vo7("spaceCount")
    private final Integer spaceCount;

    @vo7("textColor")
    private final String textColor;

    public BackgroundImageDto(String str, String str2, String str3, Integer num) {
        this.bgColor = str;
        this.bgBannerPath = str2;
        this.textColor = str3;
        this.spaceCount = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BackgroundImageDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.BackgroundImageDto");
        BackgroundImageDto backgroundImageDto = (BackgroundImageDto) obj;
        return js3.i(this.bgColor, backgroundImageDto.bgColor) && js3.i(this.bgBannerPath, backgroundImageDto.bgBannerPath) && js3.i(this.spaceCount, backgroundImageDto.spaceCount);
    }

    public final String getBgBannerPath() {
        return this.bgBannerPath;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final Integer getSpaceCount() {
        return this.spaceCount;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.bgBannerPath;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
