package ir.mservices.market.social.users.common.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.social.profile.data.ProfileTagDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class UserDto implements Serializable {

    @vo7("accountKey")
    private final String accountKey;

    @vo7("avatarUrl")
    private final String avatarUrl;

    @vo7("backwardRelation")
    private final String backwardRelation;

    @vo7("index")
    private final String index;

    @vo7("isVerified")
    private final boolean isVerified;

    @vo7("nickname")
    private final String nickname;

    @vo7("relation")
    private final String relation;

    @vo7("tags")
    private final ProfileTagDto tags;

    @vo7("xpColor")
    private final String xpColor;

    @vo7("xpLevel")
    private final String xpLevel;

    public UserDto(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ProfileTagDto profileTagDto, String str8) {
        js3.p(str, "accountKey");
        js3.p(str6, "relation");
        js3.p(str7, "backwardRelation");
        js3.p(str8, "index");
        this.accountKey = str;
        this.xpLevel = str2;
        this.xpColor = str3;
        this.nickname = str4;
        this.avatarUrl = str5;
        this.isVerified = z;
        this.relation = str6;
        this.backwardRelation = str7;
        this.tags = profileTagDto;
        this.index = str8;
    }

    public static /* synthetic */ UserDto copy$default(UserDto userDto, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ProfileTagDto profileTagDto, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userDto.accountKey;
        }
        if ((i & 2) != 0) {
            str2 = userDto.xpLevel;
        }
        if ((i & 4) != 0) {
            str3 = userDto.xpColor;
        }
        if ((i & 8) != 0) {
            str4 = userDto.nickname;
        }
        if ((i & 16) != 0) {
            str5 = userDto.avatarUrl;
        }
        if ((i & 32) != 0) {
            z = userDto.isVerified;
        }
        if ((i & 64) != 0) {
            str6 = userDto.relation;
        }
        if ((i & 128) != 0) {
            str7 = userDto.backwardRelation;
        }
        if ((i & 256) != 0) {
            profileTagDto = userDto.tags;
        }
        if ((i & 512) != 0) {
            str8 = userDto.index;
        }
        ProfileTagDto profileTagDto2 = profileTagDto;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        boolean z2 = z;
        return userDto.copy(str, str2, str3, str4, str12, z2, str10, str11, profileTagDto2, str9);
    }

    public final String component1() {
        return this.accountKey;
    }

    public final String component10() {
        return this.index;
    }

    public final String component2() {
        return this.xpLevel;
    }

    public final String component3() {
        return this.xpColor;
    }

    public final String component4() {
        return this.nickname;
    }

    public final String component5() {
        return this.avatarUrl;
    }

    public final boolean component6() {
        return this.isVerified;
    }

    public final String component7() {
        return this.relation;
    }

    public final String component8() {
        return this.backwardRelation;
    }

    public final ProfileTagDto component9() {
        return this.tags;
    }

    public final UserDto copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ProfileTagDto profileTagDto, String str8) {
        js3.p(str, "accountKey");
        js3.p(str6, "relation");
        js3.p(str7, "backwardRelation");
        js3.p(str8, "index");
        return new UserDto(str, str2, str3, str4, str5, z, str6, str7, profileTagDto, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDto)) {
            return false;
        }
        UserDto userDto = (UserDto) obj;
        return js3.i(this.accountKey, userDto.accountKey) && js3.i(this.xpLevel, userDto.xpLevel) && js3.i(this.xpColor, userDto.xpColor) && js3.i(this.nickname, userDto.nickname) && js3.i(this.avatarUrl, userDto.avatarUrl) && this.isVerified == userDto.isVerified && js3.i(this.relation, userDto.relation) && js3.i(this.backwardRelation, userDto.backwardRelation) && js3.i(this.tags, userDto.tags) && js3.i(this.index, userDto.index);
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBackwardRelation() {
        return this.backwardRelation;
    }

    public final String getIndex() {
        return this.index;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final ProfileTagDto getTags() {
        return this.tags;
    }

    public final String getXpColor() {
        return this.xpColor;
    }

    public final String getXpLevel() {
        return this.xpLevel;
    }

    public int hashCode() {
        int iHashCode = this.accountKey.hashCode() * 31;
        String str = this.xpLevel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.xpColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatarUrl;
        int iK = rm7.k(this.backwardRelation, rm7.k(this.relation, (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.isVerified ? 1231 : 1237)) * 31, 31), 31);
        ProfileTagDto profileTagDto = this.tags;
        return this.index.hashCode() + ((iK + (profileTagDto != null ? profileTagDto.hashCode() : 0)) * 31);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        String str = this.accountKey;
        String str2 = this.xpLevel;
        String str3 = this.xpColor;
        String str4 = this.nickname;
        String str5 = this.avatarUrl;
        boolean z = this.isVerified;
        String str6 = this.relation;
        String str7 = this.backwardRelation;
        ProfileTagDto profileTagDto = this.tags;
        String str8 = this.index;
        StringBuilder sbT = rm7.t("UserDto(accountKey=", str, ", xpLevel=", str2, ", xpColor=");
        o40.I(str3, ", nickname=", str4, ", avatarUrl=", sbT);
        sbT.append(str5);
        sbT.append(", isVerified=");
        sbT.append(z);
        sbT.append(", relation=");
        o40.I(str6, ", backwardRelation=", str7, ", tags=", sbT);
        sbT.append(profileTagDto);
        sbT.append(", index=");
        sbT.append(str8);
        sbT.append(")");
        return sbT.toString();
    }
}
