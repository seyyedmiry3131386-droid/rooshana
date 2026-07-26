package ir.mservices.market.reels.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdLinkInfoDto implements Serializable {

    @vo7("callToAction")
    private final String callToAction;

    @vo7("chrome")
    private final Boolean chrome;

    @vo7("clickCb")
    private final String clickCallback;

    @vo7("collapseOffset")
    private final Integer collapseDelay;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("subTitle")
    private final String subtitle;

    @vo7("title")
    private final String title;

    @vo7("url")
    private final String url;

    public AdLinkInfoDto(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num) {
        js3.p(str, "url");
        js3.p(str2, "callToAction");
        this.url = str;
        this.callToAction = str2;
        this.clickCallback = str3;
        this.title = str4;
        this.subtitle = str5;
        this.iconUrl = str6;
        this.chrome = bool;
        this.collapseDelay = num;
    }

    public static /* synthetic */ AdLinkInfoDto copy$default(AdLinkInfoDto adLinkInfoDto, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adLinkInfoDto.url;
        }
        if ((i & 2) != 0) {
            str2 = adLinkInfoDto.callToAction;
        }
        if ((i & 4) != 0) {
            str3 = adLinkInfoDto.clickCallback;
        }
        if ((i & 8) != 0) {
            str4 = adLinkInfoDto.title;
        }
        if ((i & 16) != 0) {
            str5 = adLinkInfoDto.subtitle;
        }
        if ((i & 32) != 0) {
            str6 = adLinkInfoDto.iconUrl;
        }
        if ((i & 64) != 0) {
            bool = adLinkInfoDto.chrome;
        }
        if ((i & 128) != 0) {
            num = adLinkInfoDto.collapseDelay;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        String str7 = str5;
        String str8 = str6;
        return adLinkInfoDto.copy(str, str2, str3, str4, str7, str8, bool2, num2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.callToAction;
    }

    public final String component3() {
        return this.clickCallback;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final Boolean component7() {
        return this.chrome;
    }

    public final Integer component8() {
        return this.collapseDelay;
    }

    public final AdLinkInfoDto copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num) {
        js3.p(str, "url");
        js3.p(str2, "callToAction");
        return new AdLinkInfoDto(str, str2, str3, str4, str5, str6, bool, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdLinkInfoDto)) {
            return false;
        }
        AdLinkInfoDto adLinkInfoDto = (AdLinkInfoDto) obj;
        return js3.i(this.url, adLinkInfoDto.url) && js3.i(this.callToAction, adLinkInfoDto.callToAction) && js3.i(this.clickCallback, adLinkInfoDto.clickCallback) && js3.i(this.title, adLinkInfoDto.title) && js3.i(this.subtitle, adLinkInfoDto.subtitle) && js3.i(this.iconUrl, adLinkInfoDto.iconUrl) && js3.i(this.chrome, adLinkInfoDto.chrome) && js3.i(this.collapseDelay, adLinkInfoDto.collapseDelay);
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final Boolean getChrome() {
        return this.chrome;
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

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iK = rm7.k(this.callToAction, this.url.hashCode() * 31, 31);
        String str = this.clickCallback;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.chrome;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.collapseDelay;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.callToAction;
        String str3 = this.clickCallback;
        String str4 = this.title;
        String str5 = this.subtitle;
        String str6 = this.iconUrl;
        Boolean bool = this.chrome;
        Integer num = this.collapseDelay;
        StringBuilder sbT = rm7.t("AdLinkInfoDto(url=", str, ", callToAction=", str2, ", clickCallback=");
        o40.I(str3, ", title=", str4, ", subtitle=", sbT);
        o40.I(str5, ", iconUrl=", str6, ", chrome=", sbT);
        sbT.append(bool);
        sbT.append(", collapseDelay=");
        sbT.append(num);
        sbT.append(")");
        return sbT.toString();
    }
}
