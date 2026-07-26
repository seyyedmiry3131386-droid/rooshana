package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.common.data.SummaryDialogDto;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryIconDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("analyticId")
    private final String analyticId;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("subtitle")
    private final String subtitle;

    @vo7("summaryDialog")
    private final SummaryDialogDto summaryDialog;

    @vo7("title")
    private final String title;

    public SummaryIconDto(String str, String str2, String str3, String str4, String str5, SummaryDialogDto summaryDialogDto) {
        js3.p(str, "iconUrl");
        js3.p(str2, "title");
        js3.p(str3, "subtitle");
        this.iconUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.action = str4;
        this.analyticId = str5;
        this.summaryDialog = summaryDialogDto;
    }

    public static /* synthetic */ SummaryIconDto copy$default(SummaryIconDto summaryIconDto, String str, String str2, String str3, String str4, String str5, SummaryDialogDto summaryDialogDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryIconDto.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = summaryIconDto.title;
        }
        if ((i & 4) != 0) {
            str3 = summaryIconDto.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = summaryIconDto.action;
        }
        if ((i & 16) != 0) {
            str5 = summaryIconDto.analyticId;
        }
        if ((i & 32) != 0) {
            summaryDialogDto = summaryIconDto.summaryDialog;
        }
        String str6 = str5;
        SummaryDialogDto summaryDialogDto2 = summaryDialogDto;
        return summaryIconDto.copy(str, str2, str3, str4, str6, summaryDialogDto2);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.action;
    }

    public final String component5() {
        return this.analyticId;
    }

    public final SummaryDialogDto component6() {
        return this.summaryDialog;
    }

    public final SummaryIconDto copy(String str, String str2, String str3, String str4, String str5, SummaryDialogDto summaryDialogDto) {
        js3.p(str, "iconUrl");
        js3.p(str2, "title");
        js3.p(str3, "subtitle");
        return new SummaryIconDto(str, str2, str3, str4, str5, summaryDialogDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryIconDto)) {
            return false;
        }
        SummaryIconDto summaryIconDto = (SummaryIconDto) obj;
        return js3.i(this.iconUrl, summaryIconDto.iconUrl) && js3.i(this.title, summaryIconDto.title) && js3.i(this.subtitle, summaryIconDto.subtitle) && js3.i(this.action, summaryIconDto.action) && js3.i(this.analyticId, summaryIconDto.analyticId) && js3.i(this.summaryDialog, summaryIconDto.summaryDialog);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticId() {
        return this.analyticId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
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
        int iK = rm7.k(this.subtitle, rm7.k(this.title, this.iconUrl.hashCode() * 31, 31), 31);
        String str = this.action;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SummaryDialogDto summaryDialogDto = this.summaryDialog;
        return iHashCode2 + (summaryDialogDto != null ? summaryDialogDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.action;
        String str5 = this.analyticId;
        SummaryDialogDto summaryDialogDto = this.summaryDialog;
        StringBuilder sbT = rm7.t("SummaryIconDto(iconUrl=", str, ", title=", str2, ", subtitle=");
        o40.I(str3, ", action=", str4, ", analyticId=", sbT);
        sbT.append(str5);
        sbT.append(", summaryDialog=");
        sbT.append(summaryDialogDto);
        sbT.append(")");
        return sbT.toString();
    }
}
