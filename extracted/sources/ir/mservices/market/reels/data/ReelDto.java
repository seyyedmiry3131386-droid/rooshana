package ir.mservices.market.reels.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("isLiked")
    private final boolean isLiked;

    @vo7("likeMsgAfter")
    private final String likeMsgAfter;

    @vo7("likeMsgBefore")
    private final String likeMsgBefore;

    @vo7("params")
    private final Map<String, String> params;

    @vo7("playUrls")
    private final List<String> playUrls;

    @vo7("profile")
    private final ProfileDto profile;

    @vo7("reelId")
    private final String reelId;

    @vo7("thumbnailUrl")
    private final String thumbnailUrl;

    public ReelDto(String str, String str2, String str3, boolean z, List<String> list, ProfileDto profileDto, String str4, String str5, Map<String, String> map) {
        js3.p(list, "playUrls");
        js3.p(str4, "reelId");
        js3.p(map, "params");
        this.description = str;
        this.likeMsgBefore = str2;
        this.likeMsgAfter = str3;
        this.isLiked = z;
        this.playUrls = list;
        this.profile = profileDto;
        this.reelId = str4;
        this.thumbnailUrl = str5;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReelDto copy$default(ReelDto reelDto, String str, String str2, String str3, boolean z, List list, ProfileDto profileDto, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelDto.description;
        }
        if ((i & 2) != 0) {
            str2 = reelDto.likeMsgBefore;
        }
        if ((i & 4) != 0) {
            str3 = reelDto.likeMsgAfter;
        }
        if ((i & 8) != 0) {
            z = reelDto.isLiked;
        }
        if ((i & 16) != 0) {
            list = reelDto.playUrls;
        }
        if ((i & 32) != 0) {
            profileDto = reelDto.profile;
        }
        if ((i & 64) != 0) {
            str4 = reelDto.reelId;
        }
        if ((i & 128) != 0) {
            str5 = reelDto.thumbnailUrl;
        }
        if ((i & 256) != 0) {
            map = reelDto.params;
        }
        String str6 = str5;
        Map map2 = map;
        ProfileDto profileDto2 = profileDto;
        String str7 = str4;
        List list2 = list;
        String str8 = str3;
        return reelDto.copy(str, str2, str8, z, list2, profileDto2, str7, str6, map2);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.likeMsgBefore;
    }

    public final String component3() {
        return this.likeMsgAfter;
    }

    public final boolean component4() {
        return this.isLiked;
    }

    public final List<String> component5() {
        return this.playUrls;
    }

    public final ProfileDto component6() {
        return this.profile;
    }

    public final String component7() {
        return this.reelId;
    }

    public final String component8() {
        return this.thumbnailUrl;
    }

    public final Map<String, String> component9() {
        return this.params;
    }

    public final ReelDto copy(String str, String str2, String str3, boolean z, List<String> list, ProfileDto profileDto, String str4, String str5, Map<String, String> map) {
        js3.p(list, "playUrls");
        js3.p(str4, "reelId");
        js3.p(map, "params");
        return new ReelDto(str, str2, str3, z, list, profileDto, str4, str5, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReelDto)) {
            return false;
        }
        ReelDto reelDto = (ReelDto) obj;
        return js3.i(this.description, reelDto.description) && js3.i(this.likeMsgBefore, reelDto.likeMsgBefore) && js3.i(this.likeMsgAfter, reelDto.likeMsgAfter) && this.isLiked == reelDto.isLiked && js3.i(this.playUrls, reelDto.playUrls) && js3.i(this.profile, reelDto.profile) && js3.i(this.reelId, reelDto.reelId) && js3.i(this.thumbnailUrl, reelDto.thumbnailUrl) && js3.i(this.params, reelDto.params);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLikeMsgAfter() {
        return this.likeMsgAfter;
    }

    public final String getLikeMsgBefore() {
        return this.likeMsgBefore;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final List<String> getPlayUrls() {
        return this.playUrls;
    }

    public final ProfileDto getProfile() {
        return this.profile;
    }

    public final String getReelId() {
        return this.reelId;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.likeMsgBefore;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.likeMsgAfter;
        int i = rm7.i((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.isLiked ? 1231 : 1237)) * 31, 31, this.playUrls);
        ProfileDto profileDto = this.profile;
        int iK = rm7.k(this.reelId, (i + (profileDto == null ? 0 : profileDto.hashCode())) * 31, 31);
        String str4 = this.thumbnailUrl;
        return this.params.hashCode() + ((iK + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public String toString() {
        String str = this.description;
        String str2 = this.likeMsgBefore;
        String str3 = this.likeMsgAfter;
        boolean z = this.isLiked;
        List<String> list = this.playUrls;
        ProfileDto profileDto = this.profile;
        String str4 = this.reelId;
        String str5 = this.thumbnailUrl;
        Map<String, String> map = this.params;
        StringBuilder sbT = rm7.t("ReelDto(description=", str, ", likeMsgBefore=", str2, ", likeMsgAfter=");
        sbT.append(str3);
        sbT.append(", isLiked=");
        sbT.append(z);
        sbT.append(", playUrls=");
        sbT.append(list);
        sbT.append(", profile=");
        sbT.append(profileDto);
        sbT.append(", reelId=");
        o40.I(str4, ", thumbnailUrl=", str5, ", params=", sbT);
        sbT.append(map);
        sbT.append(")");
        return sbT.toString();
    }
}
