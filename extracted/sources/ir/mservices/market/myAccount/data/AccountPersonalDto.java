package ir.mservices.market.myAccount.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountPersonalDto implements RequestDTO, Serializable {

    @vo7("bio")
    private final String bio;

    @vo7("birthdayDate")
    private final String birthdayDate;

    @vo7("city")
    private final String city;

    @vo7("gender")
    private final String gender;

    @vo7("isPrivate")
    private final Boolean isPrivate;

    @vo7("messagingAccessLevel")
    private final String messageAccessLevel;

    @vo7("nickname")
    private final String nickname;

    @vo7("privacyAccessLevel")
    private final String privacyAccessLevel;

    @vo7("username")
    private final String username;

    public AccountPersonalDto() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ AccountPersonalDto copy$default(AccountPersonalDto accountPersonalDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountPersonalDto.birthdayDate;
        }
        if ((i & 2) != 0) {
            str2 = accountPersonalDto.gender;
        }
        if ((i & 4) != 0) {
            str3 = accountPersonalDto.city;
        }
        if ((i & 8) != 0) {
            str4 = accountPersonalDto.nickname;
        }
        if ((i & 16) != 0) {
            str5 = accountPersonalDto.bio;
        }
        if ((i & 32) != 0) {
            str6 = accountPersonalDto.privacyAccessLevel;
        }
        if ((i & 64) != 0) {
            str7 = accountPersonalDto.messageAccessLevel;
        }
        if ((i & 128) != 0) {
            bool = accountPersonalDto.isPrivate;
        }
        if ((i & 256) != 0) {
            str8 = accountPersonalDto.username;
        }
        Boolean bool2 = bool;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return accountPersonalDto.copy(str, str2, str13, str4, str12, str10, str11, bool2, str9);
    }

    public final String component1() {
        return this.birthdayDate;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.nickname;
    }

    public final String component5() {
        return this.bio;
    }

    public final String component6() {
        return this.privacyAccessLevel;
    }

    public final String component7() {
        return this.messageAccessLevel;
    }

    public final Boolean component8() {
        return this.isPrivate;
    }

    public final String component9() {
        return this.username;
    }

    public final AccountPersonalDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8) {
        return new AccountPersonalDto(str, str2, str3, str4, str5, str6, str7, bool, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPersonalDto)) {
            return false;
        }
        AccountPersonalDto accountPersonalDto = (AccountPersonalDto) obj;
        return js3.i(this.birthdayDate, accountPersonalDto.birthdayDate) && js3.i(this.gender, accountPersonalDto.gender) && js3.i(this.city, accountPersonalDto.city) && js3.i(this.nickname, accountPersonalDto.nickname) && js3.i(this.bio, accountPersonalDto.bio) && js3.i(this.privacyAccessLevel, accountPersonalDto.privacyAccessLevel) && js3.i(this.messageAccessLevel, accountPersonalDto.messageAccessLevel) && js3.i(this.isPrivate, accountPersonalDto.isPrivate) && js3.i(this.username, accountPersonalDto.username);
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBirthdayDate() {
        return this.birthdayDate;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getMessageAccessLevel() {
        return this.messageAccessLevel;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getPrivacyAccessLevel() {
        return this.privacyAccessLevel;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.birthdayDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gender;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bio;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.privacyAccessLevel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageAccessLevel;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isPrivate;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.username;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final Boolean isPrivate() {
        return this.isPrivate;
    }

    public String toString() {
        String str = this.birthdayDate;
        String str2 = this.gender;
        String str3 = this.city;
        String str4 = this.nickname;
        String str5 = this.bio;
        String str6 = this.privacyAccessLevel;
        String str7 = this.messageAccessLevel;
        Boolean bool = this.isPrivate;
        String str8 = this.username;
        StringBuilder sbT = rm7.t("AccountPersonalDto(birthdayDate=", str, ", gender=", str2, ", city=");
        o40.I(str3, ", nickname=", str4, ", bio=", sbT);
        o40.I(str5, ", privacyAccessLevel=", str6, ", messageAccessLevel=", sbT);
        sbT.append(str7);
        sbT.append(", isPrivate=");
        sbT.append(bool);
        sbT.append(", username=");
        return dw1.s(sbT, str8, ")");
    }

    public AccountPersonalDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8) {
        this.birthdayDate = str;
        this.gender = str2;
        this.city = str3;
        this.nickname = str4;
        this.bio = str5;
        this.privacyAccessLevel = str6;
        this.messageAccessLevel = str7;
        this.isPrivate = bool;
        this.username = str8;
    }

    public /* synthetic */ AccountPersonalDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str8);
    }
}
