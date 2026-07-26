package ir.mservices.market.social.requests.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import defpackage.vo7;
import ir.mservices.market.social.profile.data.ProfileTagDto;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountDto {

    @vo7("accountKey")
    private final String accountKey;

    @vo7("avatarUrl")
    private final String avatarUrl;

    @vo7("index")
    private final String index;

    @vo7("isVerified")
    private final Boolean isVerified;

    @vo7("nickname")
    private final String nickname;

    @vo7("tag")
    private final ProfileTagDto tag;

    @vo7("xpLevel")
    private final String xpLevel;

    public AccountDto(String str, String str2, String str3, String str4, Boolean bool, String str5, ProfileTagDto profileTagDto) {
        js3.p(str, "accountKey");
        this.accountKey = str;
        this.xpLevel = str2;
        this.nickname = str3;
        this.avatarUrl = str4;
        this.isVerified = bool;
        this.index = str5;
        this.tag = profileTagDto;
    }

    public static /* synthetic */ AccountDto copy$default(AccountDto accountDto, String str, String str2, String str3, String str4, Boolean bool, String str5, ProfileTagDto profileTagDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountDto.accountKey;
        }
        if ((i & 2) != 0) {
            str2 = accountDto.xpLevel;
        }
        if ((i & 4) != 0) {
            str3 = accountDto.nickname;
        }
        if ((i & 8) != 0) {
            str4 = accountDto.avatarUrl;
        }
        if ((i & 16) != 0) {
            bool = accountDto.isVerified;
        }
        if ((i & 32) != 0) {
            str5 = accountDto.index;
        }
        if ((i & 64) != 0) {
            profileTagDto = accountDto.tag;
        }
        String str6 = str5;
        ProfileTagDto profileTagDto2 = profileTagDto;
        Boolean bool2 = bool;
        String str7 = str3;
        return accountDto.copy(str, str2, str7, str4, bool2, str6, profileTagDto2);
    }

    public final String component1() {
        return this.accountKey;
    }

    public final String component2() {
        return this.xpLevel;
    }

    public final String component3() {
        return this.nickname;
    }

    public final String component4() {
        return this.avatarUrl;
    }

    public final Boolean component5() {
        return this.isVerified;
    }

    public final String component6() {
        return this.index;
    }

    public final ProfileTagDto component7() {
        return this.tag;
    }

    public final AccountDto copy(String str, String str2, String str3, String str4, Boolean bool, String str5, ProfileTagDto profileTagDto) {
        js3.p(str, "accountKey");
        return new AccountDto(str, str2, str3, str4, bool, str5, profileTagDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDto)) {
            return false;
        }
        AccountDto accountDto = (AccountDto) obj;
        return js3.i(this.accountKey, accountDto.accountKey) && js3.i(this.xpLevel, accountDto.xpLevel) && js3.i(this.nickname, accountDto.nickname) && js3.i(this.avatarUrl, accountDto.avatarUrl) && js3.i(this.isVerified, accountDto.isVerified) && js3.i(this.index, accountDto.index) && js3.i(this.tag, accountDto.tag);
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getIndex() {
        return this.index;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final ProfileTagDto getTag() {
        return this.tag;
    }

    public final String getXpLevel() {
        return this.xpLevel;
    }

    public int hashCode() {
        int iHashCode = this.accountKey.hashCode() * 31;
        String str = this.xpLevel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isVerified;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.index;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ProfileTagDto profileTagDto = this.tag;
        return iHashCode6 + (profileTagDto != null ? profileTagDto.hashCode() : 0);
    }

    public final Boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        String str = this.accountKey;
        String str2 = this.xpLevel;
        String str3 = this.nickname;
        String str4 = this.avatarUrl;
        Boolean bool = this.isVerified;
        String str5 = this.index;
        ProfileTagDto profileTagDto = this.tag;
        StringBuilder sbT = rm7.t("AccountDto(accountKey=", str, ", xpLevel=", str2, ", nickname=");
        o40.I(str3, ", avatarUrl=", str4, ", isVerified=", sbT);
        t61.x(sbT, bool, ", index=", str5, ", tag=");
        sbT.append(profileTagDto);
        sbT.append(")");
        return sbT.toString();
    }
}
