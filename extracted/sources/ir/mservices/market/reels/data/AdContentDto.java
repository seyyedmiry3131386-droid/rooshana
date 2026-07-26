package ir.mservices.market.reels.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdContentDto implements Serializable {

    @vo7("completeCb")
    private final String completeCallback;

    @vo7("duration")
    private final int duration;

    @vo7("firstQuartileCb")
    private final String firstQuartileCallback;

    @vo7("heartCb")
    private final String heartCallback;

    @vo7("heartCount")
    private final String heartCount;

    @vo7("midPointCb")
    private final String midPointCallback;

    @vo7("skipCb")
    private final String skipCallback;

    @vo7("startCb")
    private final String startCallback;

    @vo7("thirdQuartileCb")
    private final String thirdQuartileCallback;

    @vo7("url")
    private final String url;

    @vo7("viewCb")
    private final String viewCallback;

    @vo7("viewOffset")
    private final int viewOffset;

    public AdContentDto(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10) {
        js3.p(str, "url");
        this.url = str;
        this.duration = i;
        this.startCallback = str2;
        this.firstQuartileCallback = str3;
        this.midPointCallback = str4;
        this.thirdQuartileCallback = str5;
        this.completeCallback = str6;
        this.skipCallback = str7;
        this.viewOffset = i2;
        this.viewCallback = str8;
        this.heartCallback = str9;
        this.heartCount = str10;
    }

    public static /* synthetic */ AdContentDto copy$default(AdContentDto adContentDto, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = adContentDto.url;
        }
        if ((i3 & 2) != 0) {
            i = adContentDto.duration;
        }
        if ((i3 & 4) != 0) {
            str2 = adContentDto.startCallback;
        }
        if ((i3 & 8) != 0) {
            str3 = adContentDto.firstQuartileCallback;
        }
        if ((i3 & 16) != 0) {
            str4 = adContentDto.midPointCallback;
        }
        if ((i3 & 32) != 0) {
            str5 = adContentDto.thirdQuartileCallback;
        }
        if ((i3 & 64) != 0) {
            str6 = adContentDto.completeCallback;
        }
        if ((i3 & 128) != 0) {
            str7 = adContentDto.skipCallback;
        }
        if ((i3 & 256) != 0) {
            i2 = adContentDto.viewOffset;
        }
        if ((i3 & 512) != 0) {
            str8 = adContentDto.viewCallback;
        }
        if ((i3 & 1024) != 0) {
            str9 = adContentDto.heartCallback;
        }
        if ((i3 & 2048) != 0) {
            str10 = adContentDto.heartCount;
        }
        String str11 = str9;
        String str12 = str10;
        int i4 = i2;
        String str13 = str8;
        String str14 = str6;
        String str15 = str7;
        String str16 = str4;
        String str17 = str5;
        return adContentDto.copy(str, i, str2, str3, str16, str17, str14, str15, i4, str13, str11, str12);
    }

    public final String component1() {
        return this.url;
    }

    public final String component10() {
        return this.viewCallback;
    }

    public final String component11() {
        return this.heartCallback;
    }

    public final String component12() {
        return this.heartCount;
    }

    public final int component2() {
        return this.duration;
    }

    public final String component3() {
        return this.startCallback;
    }

    public final String component4() {
        return this.firstQuartileCallback;
    }

    public final String component5() {
        return this.midPointCallback;
    }

    public final String component6() {
        return this.thirdQuartileCallback;
    }

    public final String component7() {
        return this.completeCallback;
    }

    public final String component8() {
        return this.skipCallback;
    }

    public final int component9() {
        return this.viewOffset;
    }

    public final AdContentDto copy(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10) {
        js3.p(str, "url");
        return new AdContentDto(str, i, str2, str3, str4, str5, str6, str7, i2, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdContentDto)) {
            return false;
        }
        AdContentDto adContentDto = (AdContentDto) obj;
        return js3.i(this.url, adContentDto.url) && this.duration == adContentDto.duration && js3.i(this.startCallback, adContentDto.startCallback) && js3.i(this.firstQuartileCallback, adContentDto.firstQuartileCallback) && js3.i(this.midPointCallback, adContentDto.midPointCallback) && js3.i(this.thirdQuartileCallback, adContentDto.thirdQuartileCallback) && js3.i(this.completeCallback, adContentDto.completeCallback) && js3.i(this.skipCallback, adContentDto.skipCallback) && this.viewOffset == adContentDto.viewOffset && js3.i(this.viewCallback, adContentDto.viewCallback) && js3.i(this.heartCallback, adContentDto.heartCallback) && js3.i(this.heartCount, adContentDto.heartCount);
    }

    public final String getCompleteCallback() {
        return this.completeCallback;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getFirstQuartileCallback() {
        return this.firstQuartileCallback;
    }

    public final String getHeartCallback() {
        return this.heartCallback;
    }

    public final String getHeartCount() {
        return this.heartCount;
    }

    public final String getMidPointCallback() {
        return this.midPointCallback;
    }

    public final String getSkipCallback() {
        return this.skipCallback;
    }

    public final String getStartCallback() {
        return this.startCallback;
    }

    public final String getThirdQuartileCallback() {
        return this.thirdQuartileCallback;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViewCallback() {
        return this.viewCallback;
    }

    public final int getViewOffset() {
        return this.viewOffset;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.duration) * 31;
        String str = this.startCallback;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstQuartileCallback;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.midPointCallback;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thirdQuartileCallback;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.completeCallback;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.skipCallback;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.viewOffset) * 31;
        String str7 = this.viewCallback;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.heartCallback;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.heartCount;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        int i = this.duration;
        String str2 = this.startCallback;
        String str3 = this.firstQuartileCallback;
        String str4 = this.midPointCallback;
        String str5 = this.thirdQuartileCallback;
        String str6 = this.completeCallback;
        String str7 = this.skipCallback;
        int i2 = this.viewOffset;
        String str8 = this.viewCallback;
        String str9 = this.heartCallback;
        String str10 = this.heartCount;
        StringBuilder sbB = o40.B(i, "AdContentDto(url=", str, ", duration=", ", startCallback=");
        o40.I(str2, ", firstQuartileCallback=", str3, ", midPointCallback=", sbB);
        o40.I(str4, ", thirdQuartileCallback=", str5, ", completeCallback=", sbB);
        o40.I(str6, ", skipCallback=", str7, ", viewOffset=", sbB);
        sbB.append(i2);
        sbB.append(", viewCallback=");
        sbB.append(str8);
        sbB.append(", heartCallback=");
        return dw1.p(str9, ", heartCount=", str10, ")", sbB);
    }
}
