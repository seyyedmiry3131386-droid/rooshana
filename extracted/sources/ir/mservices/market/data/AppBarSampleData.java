package ir.mservices.market.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.yd1;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppBarSampleData implements Serializable {
    private final String highResUrl;
    private final String iconPath;
    private final String packageName;
    private final String startTagLine;
    private final String tagLine;
    private final String title;
    private final TrafficPriceDto trafficPrice;
    private final String whatsnew;

    public AppBarSampleData(String str, String str2, String str3, String str4, String str5, TrafficPriceDto trafficPriceDto, String str6, String str7) {
        js3.p(str, "iconPath");
        js3.p(str2, "title");
        js3.p(str3, "packageName");
        this.iconPath = str;
        this.title = str2;
        this.packageName = str3;
        this.startTagLine = str4;
        this.tagLine = str5;
        this.trafficPrice = trafficPriceDto;
        this.highResUrl = str6;
        this.whatsnew = str7;
    }

    public static /* synthetic */ AppBarSampleData copy$default(AppBarSampleData appBarSampleData, String str, String str2, String str3, String str4, String str5, TrafficPriceDto trafficPriceDto, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appBarSampleData.iconPath;
        }
        if ((i & 2) != 0) {
            str2 = appBarSampleData.title;
        }
        if ((i & 4) != 0) {
            str3 = appBarSampleData.packageName;
        }
        if ((i & 8) != 0) {
            str4 = appBarSampleData.startTagLine;
        }
        if ((i & 16) != 0) {
            str5 = appBarSampleData.tagLine;
        }
        if ((i & 32) != 0) {
            trafficPriceDto = appBarSampleData.trafficPrice;
        }
        if ((i & 64) != 0) {
            str6 = appBarSampleData.highResUrl;
        }
        if ((i & 128) != 0) {
            str7 = appBarSampleData.whatsnew;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        TrafficPriceDto trafficPriceDto2 = trafficPriceDto;
        return appBarSampleData.copy(str, str2, str3, str4, str10, trafficPriceDto2, str8, str9);
    }

    public final String component1() {
        return this.iconPath;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.packageName;
    }

    public final String component4() {
        return this.startTagLine;
    }

    public final String component5() {
        return this.tagLine;
    }

    public final TrafficPriceDto component6() {
        return this.trafficPrice;
    }

    public final String component7() {
        return this.highResUrl;
    }

    public final String component8() {
        return this.whatsnew;
    }

    public final AppBarSampleData copy(String str, String str2, String str3, String str4, String str5, TrafficPriceDto trafficPriceDto, String str6, String str7) {
        js3.p(str, "iconPath");
        js3.p(str2, "title");
        js3.p(str3, "packageName");
        return new AppBarSampleData(str, str2, str3, str4, str5, trafficPriceDto, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBarSampleData)) {
            return false;
        }
        AppBarSampleData appBarSampleData = (AppBarSampleData) obj;
        return js3.i(this.iconPath, appBarSampleData.iconPath) && js3.i(this.title, appBarSampleData.title) && js3.i(this.packageName, appBarSampleData.packageName) && js3.i(this.startTagLine, appBarSampleData.startTagLine) && js3.i(this.tagLine, appBarSampleData.tagLine) && js3.i(this.trafficPrice, appBarSampleData.trafficPrice) && js3.i(this.highResUrl, appBarSampleData.highResUrl) && js3.i(this.whatsnew, appBarSampleData.whatsnew);
    }

    public final String getHighResUrl() {
        return this.highResUrl;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getStartTagLine() {
        return this.startTagLine;
    }

    public final String getTagLine() {
        return this.tagLine;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TrafficPriceDto getTrafficPrice() {
        return this.trafficPrice;
    }

    public final String getWhatsnew() {
        return this.whatsnew;
    }

    public int hashCode() {
        int iK = rm7.k(this.packageName, rm7.k(this.title, this.iconPath.hashCode() * 31, 31), 31);
        String str = this.startTagLine;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tagLine;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrafficPriceDto trafficPriceDto = this.trafficPrice;
        int iHashCode3 = (iHashCode2 + (trafficPriceDto == null ? 0 : trafficPriceDto.hashCode())) * 31;
        String str3 = this.highResUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.whatsnew;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconPath;
        String str2 = this.title;
        String str3 = this.packageName;
        String str4 = this.startTagLine;
        String str5 = this.tagLine;
        TrafficPriceDto trafficPriceDto = this.trafficPrice;
        String str6 = this.highResUrl;
        String str7 = this.whatsnew;
        StringBuilder sbT = rm7.t("AppBarSampleData(iconPath=", str, ", title=", str2, ", packageName=");
        o40.I(str3, ", startTagLine=", str4, ", tagLine=", sbT);
        sbT.append(str5);
        sbT.append(", trafficPrice=");
        sbT.append(trafficPriceDto);
        sbT.append(", highResUrl=");
        return dw1.p(str6, ", whatsnew=", str7, ")", sbT);
    }

    public /* synthetic */ AppBarSampleData(String str, String str2, String str3, String str4, String str5, TrafficPriceDto trafficPriceDto, String str6, String str7, int i, yd1 yd1Var) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : trafficPriceDto, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
