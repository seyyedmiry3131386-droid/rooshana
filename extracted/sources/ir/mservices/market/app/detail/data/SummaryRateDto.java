package ir.mservices.market.app.detail.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryRateDto implements Serializable {

    @vo7("analyticId")
    private final String analyticId;

    @vo7("subtitle")
    private final String subtitle;

    @vo7("title")
    private final String title;

    public SummaryRateDto(String str, String str2, String str3) {
        js3.p(str, "title");
        js3.p(str2, "subtitle");
        this.title = str;
        this.subtitle = str2;
        this.analyticId = str3;
    }

    public static /* synthetic */ SummaryRateDto copy$default(SummaryRateDto summaryRateDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryRateDto.title;
        }
        if ((i & 2) != 0) {
            str2 = summaryRateDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = summaryRateDto.analyticId;
        }
        return summaryRateDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.analyticId;
    }

    public final SummaryRateDto copy(String str, String str2, String str3) {
        js3.p(str, "title");
        js3.p(str2, "subtitle");
        return new SummaryRateDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryRateDto)) {
            return false;
        }
        SummaryRateDto summaryRateDto = (SummaryRateDto) obj;
        return js3.i(this.title, summaryRateDto.title) && js3.i(this.subtitle, summaryRateDto.subtitle) && js3.i(this.analyticId, summaryRateDto.analyticId);
    }

    public final String getAnalyticId() {
        return this.analyticId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iK = rm7.k(this.subtitle, this.title.hashCode() * 31, 31);
        String str = this.analyticId;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return dw1.s(rm7.t("SummaryRateDto(title=", str, ", subtitle=", str2, ", analyticId="), this.analyticId, ")");
    }
}
