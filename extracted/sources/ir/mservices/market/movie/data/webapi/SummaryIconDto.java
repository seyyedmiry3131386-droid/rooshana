package ir.mservices.market.movie.data.webapi;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryIconDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_BG)
    private final String bg;

    @vo7("iconTint")
    private final String iconTint;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("title")
    private final String title;

    public SummaryIconDto(String str, String str2, String str3, String str4) {
        this.title = str;
        this.iconUrl = str2;
        this.iconTint = str3;
        this.bg = str4;
    }

    public static /* synthetic */ SummaryIconDto copy$default(SummaryIconDto summaryIconDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryIconDto.title;
        }
        if ((i & 2) != 0) {
            str2 = summaryIconDto.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = summaryIconDto.iconTint;
        }
        if ((i & 8) != 0) {
            str4 = summaryIconDto.bg;
        }
        return summaryIconDto.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.iconTint;
    }

    public final String component4() {
        return this.bg;
    }

    public final SummaryIconDto copy(String str, String str2, String str3, String str4) {
        return new SummaryIconDto(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryIconDto)) {
            return false;
        }
        SummaryIconDto summaryIconDto = (SummaryIconDto) obj;
        return js3.i(this.title, summaryIconDto.title) && js3.i(this.iconUrl, summaryIconDto.iconUrl) && js3.i(this.iconTint, summaryIconDto.iconTint) && js3.i(this.bg, summaryIconDto.bg);
    }

    public final String getBg() {
        return this.bg;
    }

    public final String getIconTint() {
        return this.iconTint;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconTint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bg;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return dw1.p(this.iconTint, ", bg=", this.bg, ")", rm7.t("SummaryIconDto(title=", this.title, ", iconUrl=", this.iconUrl, ", iconTint="));
    }
}
