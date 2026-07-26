package ir.mservices.market.movie.uri.downloadInfo.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.movie.uri.data.RestrictionInfo;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadInfoResponse implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("qualities")
    private final List<QualityItem> qualities;

    @vo7("restrictionInfo")
    private final RestrictionInfo restrictionInfo;

    @vo7("secondaryTitle")
    private final String secondaryTitle;

    @vo7("title")
    private final String title;

    public DownloadInfoResponse(String str, String str2, String str3, List<QualityItem> list, RestrictionInfo restrictionInfo) {
        this.title = str;
        this.secondaryTitle = str2;
        this.description = str3;
        this.qualities = list;
        this.restrictionInfo = restrictionInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadInfoResponse copy$default(DownloadInfoResponse downloadInfoResponse, String str, String str2, String str3, List list, RestrictionInfo restrictionInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadInfoResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = downloadInfoResponse.secondaryTitle;
        }
        if ((i & 4) != 0) {
            str3 = downloadInfoResponse.description;
        }
        if ((i & 8) != 0) {
            list = downloadInfoResponse.qualities;
        }
        if ((i & 16) != 0) {
            restrictionInfo = downloadInfoResponse.restrictionInfo;
        }
        RestrictionInfo restrictionInfo2 = restrictionInfo;
        String str4 = str3;
        return downloadInfoResponse.copy(str, str2, str4, list, restrictionInfo2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.secondaryTitle;
    }

    public final String component3() {
        return this.description;
    }

    public final List<QualityItem> component4() {
        return this.qualities;
    }

    public final RestrictionInfo component5() {
        return this.restrictionInfo;
    }

    public final DownloadInfoResponse copy(String str, String str2, String str3, List<QualityItem> list, RestrictionInfo restrictionInfo) {
        return new DownloadInfoResponse(str, str2, str3, list, restrictionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadInfoResponse)) {
            return false;
        }
        DownloadInfoResponse downloadInfoResponse = (DownloadInfoResponse) obj;
        return js3.i(this.title, downloadInfoResponse.title) && js3.i(this.secondaryTitle, downloadInfoResponse.secondaryTitle) && js3.i(this.description, downloadInfoResponse.description) && js3.i(this.qualities, downloadInfoResponse.qualities) && js3.i(this.restrictionInfo, downloadInfoResponse.restrictionInfo);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<QualityItem> getQualities() {
        return this.qualities;
    }

    public final RestrictionInfo getRestrictionInfo() {
        return this.restrictionInfo;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondaryTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<QualityItem> list = this.qualities;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        RestrictionInfo restrictionInfo = this.restrictionInfo;
        return iHashCode4 + (restrictionInfo != null ? restrictionInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.secondaryTitle;
        String str3 = this.description;
        List<QualityItem> list = this.qualities;
        RestrictionInfo restrictionInfo = this.restrictionInfo;
        StringBuilder sbT = rm7.t("DownloadInfoResponse(title=", str, ", secondaryTitle=", str2, ", description=");
        sbT.append(str3);
        sbT.append(", qualities=");
        sbT.append(list);
        sbT.append(", restrictionInfo=");
        sbT.append(restrictionInfo);
        sbT.append(")");
        return sbT.toString();
    }
}
