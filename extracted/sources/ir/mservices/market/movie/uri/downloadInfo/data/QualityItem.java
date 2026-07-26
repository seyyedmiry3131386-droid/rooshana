package ir.mservices.market.movie.uri.downloadInfo.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class QualityItem implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("mediaFilename")
    private final String mediaFileName;

    @vo7("quality")
    private final Integer quality;

    @vo7("size")
    private final Long size;

    @vo7("subtitleFilename")
    private final String subtitleFileName;

    @vo7("title")
    private final String title;

    public QualityItem(String str, String str2, Integer num, Long l, String str3, String str4) {
        js3.p(str3, "mediaFileName");
        this.title = str;
        this.description = str2;
        this.quality = num;
        this.size = l;
        this.mediaFileName = str3;
        this.subtitleFileName = str4;
    }

    public static /* synthetic */ QualityItem copy$default(QualityItem qualityItem, String str, String str2, Integer num, Long l, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qualityItem.title;
        }
        if ((i & 2) != 0) {
            str2 = qualityItem.description;
        }
        if ((i & 4) != 0) {
            num = qualityItem.quality;
        }
        if ((i & 8) != 0) {
            l = qualityItem.size;
        }
        if ((i & 16) != 0) {
            str3 = qualityItem.mediaFileName;
        }
        if ((i & 32) != 0) {
            str4 = qualityItem.subtitleFileName;
        }
        String str5 = str3;
        String str6 = str4;
        return qualityItem.copy(str, str2, num, l, str5, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final Integer component3() {
        return this.quality;
    }

    public final Long component4() {
        return this.size;
    }

    public final String component5() {
        return this.mediaFileName;
    }

    public final String component6() {
        return this.subtitleFileName;
    }

    public final QualityItem copy(String str, String str2, Integer num, Long l, String str3, String str4) {
        js3.p(str3, "mediaFileName");
        return new QualityItem(str, str2, num, l, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityItem)) {
            return false;
        }
        QualityItem qualityItem = (QualityItem) obj;
        return js3.i(this.title, qualityItem.title) && js3.i(this.description, qualityItem.description) && js3.i(this.quality, qualityItem.quality) && js3.i(this.size, qualityItem.size) && js3.i(this.mediaFileName, qualityItem.mediaFileName) && js3.i(this.subtitleFileName, qualityItem.subtitleFileName);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMediaFileName() {
        return this.mediaFileName;
    }

    public final Integer getQuality() {
        return this.quality;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getSubtitleFileName() {
        return this.subtitleFileName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quality;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.size;
        int iK = rm7.k(this.mediaFileName, (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str3 = this.subtitleFileName;
        return iK + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Integer num = this.quality;
        Long l = this.size;
        String str3 = this.mediaFileName;
        String str4 = this.subtitleFileName;
        StringBuilder sbT = rm7.t("QualityItem(title=", str, ", description=", str2, ", quality=");
        sbT.append(num);
        sbT.append(", size=");
        sbT.append(l);
        sbT.append(", mediaFileName=");
        return dw1.p(str3, ", subtitleFileName=", str4, ")", sbT);
    }
}
