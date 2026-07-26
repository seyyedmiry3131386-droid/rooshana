package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.common.data.SummaryDialogDto;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryTextDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("analyticId")
    private final String analyticId;

    @vo7("subtitle")
    private final String subtitle;

    @vo7("summaryDialog")
    private final SummaryDialogDto summaryDialog;

    @vo7("title")
    private final String title;

    public SummaryTextDto(String str, String str2, String str3, String str4, SummaryDialogDto summaryDialogDto) {
        js3.p(str, "title");
        js3.p(str2, "subtitle");
        this.title = str;
        this.subtitle = str2;
        this.action = str3;
        this.analyticId = str4;
        this.summaryDialog = summaryDialogDto;
    }

    public static /* synthetic */ SummaryTextDto copy$default(SummaryTextDto summaryTextDto, String str, String str2, String str3, String str4, SummaryDialogDto summaryDialogDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryTextDto.title;
        }
        if ((i & 2) != 0) {
            str2 = summaryTextDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = summaryTextDto.action;
        }
        if ((i & 8) != 0) {
            str4 = summaryTextDto.analyticId;
        }
        if ((i & 16) != 0) {
            summaryDialogDto = summaryTextDto.summaryDialog;
        }
        SummaryDialogDto summaryDialogDto2 = summaryDialogDto;
        String str5 = str3;
        return summaryTextDto.copy(str, str2, str5, str4, summaryDialogDto2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.action;
    }

    public final String component4() {
        return this.analyticId;
    }

    public final SummaryDialogDto component5() {
        return this.summaryDialog;
    }

    public final SummaryTextDto copy(String str, String str2, String str3, String str4, SummaryDialogDto summaryDialogDto) {
        js3.p(str, "title");
        js3.p(str2, "subtitle");
        return new SummaryTextDto(str, str2, str3, str4, summaryDialogDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryTextDto)) {
            return false;
        }
        SummaryTextDto summaryTextDto = (SummaryTextDto) obj;
        return js3.i(this.title, summaryTextDto.title) && js3.i(this.subtitle, summaryTextDto.subtitle) && js3.i(this.action, summaryTextDto.action) && js3.i(this.analyticId, summaryTextDto.analyticId) && js3.i(this.summaryDialog, summaryTextDto.summaryDialog);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticId() {
        return this.analyticId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final SummaryDialogDto getSummaryDialog() {
        return this.summaryDialog;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iK = rm7.k(this.subtitle, this.title.hashCode() * 31, 31);
        String str = this.action;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SummaryDialogDto summaryDialogDto = this.summaryDialog;
        return iHashCode2 + (summaryDialogDto != null ? summaryDialogDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.action;
        String str4 = this.analyticId;
        SummaryDialogDto summaryDialogDto = this.summaryDialog;
        StringBuilder sbT = rm7.t("SummaryTextDto(title=", str, ", subtitle=", str2, ", action=");
        o40.I(str3, ", analyticId=", str4, ", summaryDialog=", sbT);
        sbT.append(summaryDialogDto);
        sbT.append(")");
        return sbT.toString();
    }
}
