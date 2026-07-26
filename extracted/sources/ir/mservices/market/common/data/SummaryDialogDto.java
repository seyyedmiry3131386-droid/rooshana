package ir.mservices.market.common.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryDialogDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("iconUrl")
    private final String icon;

    @vo7("title")
    private final String title;

    public SummaryDialogDto(String str, String str2, String str3) {
        this.icon = str;
        this.title = str2;
        this.description = str3;
    }

    public static /* synthetic */ SummaryDialogDto copy$default(SummaryDialogDto summaryDialogDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryDialogDto.icon;
        }
        if ((i & 2) != 0) {
            str2 = summaryDialogDto.title;
        }
        if ((i & 4) != 0) {
            str3 = summaryDialogDto.description;
        }
        return summaryDialogDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final SummaryDialogDto copy(String str, String str2, String str3) {
        return new SummaryDialogDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryDialogDto)) {
            return false;
        }
        SummaryDialogDto summaryDialogDto = (SummaryDialogDto) obj;
        return js3.i(this.icon, summaryDialogDto.icon) && js3.i(this.title, summaryDialogDto.title) && js3.i(this.description, summaryDialogDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        return dw1.s(rm7.t("SummaryDialogDto(icon=", str, ", title=", str2, ", description="), this.description, ")");
    }
}
