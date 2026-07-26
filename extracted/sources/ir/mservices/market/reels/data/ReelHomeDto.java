package ir.mservices.market.reels.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelHomeDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("duration")
    private final String duration;

    @vo7("params")
    private final Map<String, String> params;

    @vo7("reelId")
    private final String reelId;

    @vo7("thumbnailUrl")
    private final String thumbnailUrl;

    public ReelHomeDto(String str, String str2, String str3, Map<String, String> map, String str4) {
        js3.p(str, "thumbnailUrl");
        js3.p(str3, "reelId");
        js3.p(map, "params");
        this.thumbnailUrl = str;
        this.description = str2;
        this.reelId = str3;
        this.params = map;
        this.duration = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReelHomeDto copy$default(ReelHomeDto reelHomeDto, String str, String str2, String str3, Map map, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelHomeDto.thumbnailUrl;
        }
        if ((i & 2) != 0) {
            str2 = reelHomeDto.description;
        }
        if ((i & 4) != 0) {
            str3 = reelHomeDto.reelId;
        }
        if ((i & 8) != 0) {
            map = reelHomeDto.params;
        }
        if ((i & 16) != 0) {
            str4 = reelHomeDto.duration;
        }
        String str5 = str4;
        String str6 = str3;
        return reelHomeDto.copy(str, str2, str6, map, str5);
    }

    public final String component1() {
        return this.thumbnailUrl;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.reelId;
    }

    public final Map<String, String> component4() {
        return this.params;
    }

    public final String component5() {
        return this.duration;
    }

    public final ReelHomeDto copy(String str, String str2, String str3, Map<String, String> map, String str4) {
        js3.p(str, "thumbnailUrl");
        js3.p(str3, "reelId");
        js3.p(map, "params");
        return new ReelHomeDto(str, str2, str3, map, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReelHomeDto)) {
            return false;
        }
        ReelHomeDto reelHomeDto = (ReelHomeDto) obj;
        return js3.i(this.thumbnailUrl, reelHomeDto.thumbnailUrl) && js3.i(this.description, reelHomeDto.description) && js3.i(this.reelId, reelHomeDto.reelId) && js3.i(this.params, reelHomeDto.params) && js3.i(this.duration, reelHomeDto.duration);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getReelId() {
        return this.reelId;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        int iHashCode = this.thumbnailUrl.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (this.params.hashCode() + rm7.k(this.reelId, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.duration;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.thumbnailUrl;
        String str2 = this.description;
        String str3 = this.reelId;
        Map<String, String> map = this.params;
        String str4 = this.duration;
        StringBuilder sbT = rm7.t("ReelHomeDto(thumbnailUrl=", str, ", description=", str2, ", reelId=");
        sbT.append(str3);
        sbT.append(", params=");
        sbT.append(map);
        sbT.append(", duration=");
        return dw1.s(sbT, str4, ")");
    }
}
