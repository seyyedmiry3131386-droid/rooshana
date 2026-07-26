package ir.mservices.market.social.profile.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountDto implements Serializable {

    @vo7("accountKey")
    private final String accountKey;

    @vo7("avatarUrl")
    private final String avatarUrl;

    @vo7("bio")
    private final String bio;

    @vo7("birthDate")
    private final String birthDate;

    @vo7("highResAvatarUrl")
    private final String highResAvatarUrl;

    @vo7("isBirthDate")
    private final boolean isBirthDate;

    @vo7("isLocked")
    private final boolean isLocked;

    @vo7("isVerified")
    private final boolean isVerified;

    @vo7("nickname")
    private final String nickName;

    @vo7("tags")
    private final ProfileTagDto tags;

    @vo7("username")
    private final String userName;

    @vo7("xpLevel")
    private final String xpLevel;

    public AccountDto(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, boolean z2, boolean z3, ProfileTagDto profileTagDto, String str8) {
        js3.p(str, "accountKey");
        js3.p(str7, "xpLevel");
        this.accountKey = str;
        this.avatarUrl = str2;
        this.highResAvatarUrl = str3;
        this.bio = str4;
        this.isVerified = z;
        this.nickName = str5;
        this.userName = str6;
        this.xpLevel = str7;
        this.isBirthDate = z2;
        this.isLocked = z3;
        this.tags = profileTagDto;
        this.birthDate = str8;
    }

    public static /* synthetic */ AccountDto copy$default(AccountDto accountDto, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, boolean z2, boolean z3, ProfileTagDto profileTagDto, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountDto.accountKey;
        }
        if ((i & 2) != 0) {
            str2 = accountDto.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = accountDto.highResAvatarUrl;
        }
        if ((i & 8) != 0) {
            str4 = accountDto.bio;
        }
        if ((i & 16) != 0) {
            z = accountDto.isVerified;
        }
        if ((i & 32) != 0) {
            str5 = accountDto.nickName;
        }
        if ((i & 64) != 0) {
            str6 = accountDto.userName;
        }
        if ((i & 128) != 0) {
            str7 = accountDto.xpLevel;
        }
        if ((i & 256) != 0) {
            z2 = accountDto.isBirthDate;
        }
        if ((i & 512) != 0) {
            z3 = accountDto.isLocked;
        }
        if ((i & 1024) != 0) {
            profileTagDto = accountDto.tags;
        }
        if ((i & 2048) != 0) {
            str8 = accountDto.birthDate;
        }
        ProfileTagDto profileTagDto2 = profileTagDto;
        String str9 = str8;
        boolean z4 = z2;
        boolean z5 = z3;
        String str10 = str6;
        String str11 = str7;
        boolean z6 = z;
        String str12 = str5;
        return accountDto.copy(str, str2, str3, str4, z6, str12, str10, str11, z4, z5, profileTagDto2, str9);
    }

    public final String component1() {
        return this.accountKey;
    }

    public final boolean component10() {
        return this.isLocked;
    }

    public final ProfileTagDto component11() {
        return this.tags;
    }

    public final String component12() {
        return this.birthDate;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.highResAvatarUrl;
    }

    public final String component4() {
        return this.bio;
    }

    public final boolean component5() {
        return this.isVerified;
    }

    public final String component6() {
        return this.nickName;
    }

    public final String component7() {
        return this.userName;
    }

    public final String component8() {
        return this.xpLevel;
    }

    public final boolean component9() {
        return this.isBirthDate;
    }

    public final AccountDto copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, boolean z2, boolean z3, ProfileTagDto profileTagDto, String str8) {
        js3.p(str, "accountKey");
        js3.p(str7, "xpLevel");
        return new AccountDto(str, str2, str3, str4, z, str5, str6, str7, z2, z3, profileTagDto, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDto)) {
            return false;
        }
        AccountDto accountDto = (AccountDto) obj;
        return js3.i(this.accountKey, accountDto.accountKey) && js3.i(this.avatarUrl, accountDto.avatarUrl) && js3.i(this.highResAvatarUrl, accountDto.highResAvatarUrl) && js3.i(this.bio, accountDto.bio) && this.isVerified == accountDto.isVerified && js3.i(this.nickName, accountDto.nickName) && js3.i(this.userName, accountDto.userName) && js3.i(this.xpLevel, accountDto.xpLevel) && this.isBirthDate == accountDto.isBirthDate && this.isLocked == accountDto.isLocked && js3.i(this.tags, accountDto.tags) && js3.i(this.birthDate, accountDto.birthDate);
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getHighResAvatarUrl() {
        return this.highResAvatarUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final ProfileTagDto getTags() {
        return this.tags;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getXpLevel() {
        return this.xpLevel;
    }

    public int hashCode() {
        int iHashCode = this.accountKey.hashCode() * 31;
        String str = this.avatarUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.highResAvatarUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bio;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.isVerified ? 1231 : 1237)) * 31;
        String str4 = this.nickName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userName;
        int iK = (((rm7.k(this.xpLevel, (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31) + (this.isBirthDate ? 1231 : 1237)) * 31) + (this.isLocked ? 1231 : 1237)) * 31;
        ProfileTagDto profileTagDto = this.tags;
        int iHashCode6 = (iK + (profileTagDto == null ? 0 : profileTagDto.hashCode())) * 31;
        String str6 = this.birthDate;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isBirthDate() {
        return this.isBirthDate;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        String str = this.accountKey;
        String str2 = this.avatarUrl;
        String str3 = this.highResAvatarUrl;
        String str4 = this.bio;
        boolean z = this.isVerified;
        String str5 = this.nickName;
        String str6 = this.userName;
        String str7 = this.xpLevel;
        boolean z2 = this.isBirthDate;
        boolean z3 = this.isLocked;
        ProfileTagDto profileTagDto = this.tags;
        String str8 = this.birthDate;
        StringBuilder sbT = rm7.t("AccountDto(accountKey=", str, ", avatarUrl=", str2, ", highResAvatarUrl=");
        o40.I(str3, ", bio=", str4, ", isVerified=", sbT);
        t61.z(sbT, z, ", nickName=", str5, ", userName=");
        o40.I(str6, ", xpLevel=", str7, ", isBirthDate=", sbT);
        t61.A(sbT, z2, ", isLocked=", z3, ", tags=");
        sbT.append(profileTagDto);
        sbT.append(", birthDate=");
        sbT.append(str8);
        sbT.append(")");
        return sbT.toString();
    }
}
