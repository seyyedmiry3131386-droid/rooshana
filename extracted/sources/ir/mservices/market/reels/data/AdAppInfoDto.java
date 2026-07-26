package ir.mservices.market.reels.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdAppInfoDto implements Serializable {

    @vo7("downloadCb")
    private final String callbackUrl;

    @vo7("clickCb")
    private final String clickCallback;

    @vo7("collapseOffset")
    private final Integer collapseDelay;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("installedCb")
    private final String installCallbackUrl;

    @vo7("packageName")
    private final String packageName;

    @vo7("subTitle")
    private final String subtitle;

    @vo7("title")
    private final String title;

    public AdAppInfoDto(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        js3.p(str3, "callbackUrl");
        js3.p(str4, "installCallbackUrl");
        this.collapseDelay = num;
        this.packageName = str;
        this.clickCallback = str2;
        this.callbackUrl = str3;
        this.installCallbackUrl = str4;
        this.title = str5;
        this.subtitle = str6;
        this.iconUrl = str7;
    }

    public static /* synthetic */ AdAppInfoDto copy$default(AdAppInfoDto adAppInfoDto, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adAppInfoDto.collapseDelay;
        }
        if ((i & 2) != 0) {
            str = adAppInfoDto.packageName;
        }
        if ((i & 4) != 0) {
            str2 = adAppInfoDto.clickCallback;
        }
        if ((i & 8) != 0) {
            str3 = adAppInfoDto.callbackUrl;
        }
        if ((i & 16) != 0) {
            str4 = adAppInfoDto.installCallbackUrl;
        }
        if ((i & 32) != 0) {
            str5 = adAppInfoDto.title;
        }
        if ((i & 64) != 0) {
            str6 = adAppInfoDto.subtitle;
        }
        if ((i & 128) != 0) {
            str7 = adAppInfoDto.iconUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return adAppInfoDto.copy(num, str, str2, str3, str10, str11, str8, str9);
    }

    public final Integer component1() {
        return this.collapseDelay;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.clickCallback;
    }

    public final String component4() {
        return this.callbackUrl;
    }

    public final String component5() {
        return this.installCallbackUrl;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final String component8() {
        return this.iconUrl;
    }

    public final AdAppInfoDto copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        js3.p(str3, "callbackUrl");
        js3.p(str4, "installCallbackUrl");
        return new AdAppInfoDto(num, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdAppInfoDto)) {
            return false;
        }
        AdAppInfoDto adAppInfoDto = (AdAppInfoDto) obj;
        return js3.i(this.collapseDelay, adAppInfoDto.collapseDelay) && js3.i(this.packageName, adAppInfoDto.packageName) && js3.i(this.clickCallback, adAppInfoDto.clickCallback) && js3.i(this.callbackUrl, adAppInfoDto.callbackUrl) && js3.i(this.installCallbackUrl, adAppInfoDto.installCallbackUrl) && js3.i(this.title, adAppInfoDto.title) && js3.i(this.subtitle, adAppInfoDto.subtitle) && js3.i(this.iconUrl, adAppInfoDto.iconUrl);
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final String getClickCallback() {
        return this.clickCallback;
    }

    public final Integer getCollapseDelay() {
        return this.collapseDelay;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInstallCallbackUrl() {
        return this.installCallbackUrl;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.collapseDelay;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.packageName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickCallback;
        int iK = rm7.k(this.installCallbackUrl, rm7.k(this.callbackUrl, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.title;
        int iHashCode3 = (iK + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.collapseDelay;
        String str = this.packageName;
        String str2 = this.clickCallback;
        String str3 = this.callbackUrl;
        String str4 = this.installCallbackUrl;
        String str5 = this.title;
        String str6 = this.subtitle;
        String str7 = this.iconUrl;
        StringBuilder sb = new StringBuilder("AdAppInfoDto(collapseDelay=");
        sb.append(num);
        sb.append(", packageName=");
        sb.append(str);
        sb.append(", clickCallback=");
        o40.I(str2, ", callbackUrl=", str3, ", installCallbackUrl=", sb);
        o40.I(str4, ", title=", str5, ", subtitle=", sb);
        return dw1.p(str6, ", iconUrl=", str7, ")", sb);
    }
}
