package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.common.data.SummaryDialogDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummarySizeDto implements Serializable {

    @vo7("actual")
    private final String actual;

    @vo7("analyticId")
    private final String analyticId;

    @vo7("diff")
    private final String diff;

    @vo7("diffChecksum")
    private final String diffChecksum;

    @vo7("summaryDialog")
    private final SummaryDialogDto summaryDialog;

    @vo7("title")
    private final String title;

    public SummarySizeDto(String str, String str2, String str3, String str4, String str5, SummaryDialogDto summaryDialogDto) {
        js3.p(str, "title");
        this.title = str;
        this.diff = str2;
        this.actual = str3;
        this.diffChecksum = str4;
        this.analyticId = str5;
        this.summaryDialog = summaryDialogDto;
    }

    public static /* synthetic */ SummarySizeDto copy$default(SummarySizeDto summarySizeDto, String str, String str2, String str3, String str4, String str5, SummaryDialogDto summaryDialogDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summarySizeDto.title;
        }
        if ((i & 2) != 0) {
            str2 = summarySizeDto.diff;
        }
        if ((i & 4) != 0) {
            str3 = summarySizeDto.actual;
        }
        if ((i & 8) != 0) {
            str4 = summarySizeDto.diffChecksum;
        }
        if ((i & 16) != 0) {
            str5 = summarySizeDto.analyticId;
        }
        if ((i & 32) != 0) {
            summaryDialogDto = summarySizeDto.summaryDialog;
        }
        String str6 = str5;
        SummaryDialogDto summaryDialogDto2 = summaryDialogDto;
        return summarySizeDto.copy(str, str2, str3, str4, str6, summaryDialogDto2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.diff;
    }

    public final String component3() {
        return this.actual;
    }

    public final String component4() {
        return this.diffChecksum;
    }

    public final String component5() {
        return this.analyticId;
    }

    public final SummaryDialogDto component6() {
        return this.summaryDialog;
    }

    public final SummarySizeDto copy(String str, String str2, String str3, String str4, String str5, SummaryDialogDto summaryDialogDto) {
        js3.p(str, "title");
        return new SummarySizeDto(str, str2, str3, str4, str5, summaryDialogDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummarySizeDto)) {
            return false;
        }
        SummarySizeDto summarySizeDto = (SummarySizeDto) obj;
        return js3.i(this.title, summarySizeDto.title) && js3.i(this.diff, summarySizeDto.diff) && js3.i(this.actual, summarySizeDto.actual) && js3.i(this.diffChecksum, summarySizeDto.diffChecksum) && js3.i(this.analyticId, summarySizeDto.analyticId) && js3.i(this.summaryDialog, summarySizeDto.summaryDialog);
    }

    public final String getActual() {
        return this.actual;
    }

    public final String getAnalyticId() {
        return this.analyticId;
    }

    public final String getDiff() {
        return this.diff;
    }

    public final String getDiffChecksum() {
        return this.diffChecksum;
    }

    public final SummaryDialogDto getSummaryDialog() {
        return this.summaryDialog;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.diff;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actual;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.diffChecksum;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.analyticId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SummaryDialogDto summaryDialogDto = this.summaryDialog;
        return iHashCode5 + (summaryDialogDto != null ? summaryDialogDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.diff;
        String str3 = this.actual;
        String str4 = this.diffChecksum;
        String str5 = this.analyticId;
        SummaryDialogDto summaryDialogDto = this.summaryDialog;
        StringBuilder sbT = rm7.t("SummarySizeDto(title=", str, ", diff=", str2, ", actual=");
        o40.I(str3, ", diffChecksum=", str4, ", analyticId=", sbT);
        sbT.append(str5);
        sbT.append(", summaryDialog=");
        sbT.append(summaryDialogDto);
        sbT.append(")");
        return sbT.toString();
    }
}
