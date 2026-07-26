package ir.mservices.market.myAccount.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountInfoDto implements RequestDTO {

    @vo7("bio")
    private final String bio;

    @vo7("birthDate")
    private final String birthDate;

    @vo7("city")
    private final String city;

    @vo7("gender")
    private final String gender;

    @vo7("highResAvatarUrl")
    private final String highResAvatarUrl;

    @vo7("isBirthday")
    private final boolean isBirthday;

    @vo7("miladiBirthDate")
    private final String miladiBirthDate;

    @vo7("nickname")
    private final String nickname;

    @vo7("privacySetting")
    private final PrivacySettingDto privacySetting;

    @vo7("shamsiBirthDate")
    private final String shamsiBirthDate;

    public MyAccountInfoDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, PrivacySettingDto privacySettingDto) {
        js3.p(str, "miladiBirthDate");
        js3.p(str2, "birthDate");
        js3.p(str4, "shamsiBirthDate");
        js3.p(str5, "gender");
        js3.p(str6, "city");
        js3.p(str7, "bio");
        js3.p(str8, "nickname");
        js3.p(privacySettingDto, "privacySetting");
        this.miladiBirthDate = str;
        this.birthDate = str2;
        this.highResAvatarUrl = str3;
        this.shamsiBirthDate = str4;
        this.gender = str5;
        this.city = str6;
        this.isBirthday = z;
        this.bio = str7;
        this.nickname = str8;
        this.privacySetting = privacySettingDto;
    }

    public static /* synthetic */ MyAccountInfoDto copy$default(MyAccountInfoDto myAccountInfoDto, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, PrivacySettingDto privacySettingDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = myAccountInfoDto.miladiBirthDate;
        }
        if ((i & 2) != 0) {
            str2 = myAccountInfoDto.birthDate;
        }
        if ((i & 4) != 0) {
            str3 = myAccountInfoDto.highResAvatarUrl;
        }
        if ((i & 8) != 0) {
            str4 = myAccountInfoDto.shamsiBirthDate;
        }
        if ((i & 16) != 0) {
            str5 = myAccountInfoDto.gender;
        }
        if ((i & 32) != 0) {
            str6 = myAccountInfoDto.city;
        }
        if ((i & 64) != 0) {
            z = myAccountInfoDto.isBirthday;
        }
        if ((i & 128) != 0) {
            str7 = myAccountInfoDto.bio;
        }
        if ((i & 256) != 0) {
            str8 = myAccountInfoDto.nickname;
        }
        if ((i & 512) != 0) {
            privacySettingDto = myAccountInfoDto.privacySetting;
        }
        String str9 = str8;
        PrivacySettingDto privacySettingDto2 = privacySettingDto;
        boolean z2 = z;
        String str10 = str7;
        String str11 = str5;
        String str12 = str6;
        return myAccountInfoDto.copy(str, str2, str3, str4, str11, str12, z2, str10, str9, privacySettingDto2);
    }

    public final String component1() {
        return this.miladiBirthDate;
    }

    public final PrivacySettingDto component10() {
        return this.privacySetting;
    }

    public final String component2() {
        return this.birthDate;
    }

    public final String component3() {
        return this.highResAvatarUrl;
    }

    public final String component4() {
        return this.shamsiBirthDate;
    }

    public final String component5() {
        return this.gender;
    }

    public final String component6() {
        return this.city;
    }

    public final boolean component7() {
        return this.isBirthday;
    }

    public final String component8() {
        return this.bio;
    }

    public final String component9() {
        return this.nickname;
    }

    public final MyAccountInfoDto copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, PrivacySettingDto privacySettingDto) {
        js3.p(str, "miladiBirthDate");
        js3.p(str2, "birthDate");
        js3.p(str4, "shamsiBirthDate");
        js3.p(str5, "gender");
        js3.p(str6, "city");
        js3.p(str7, "bio");
        js3.p(str8, "nickname");
        js3.p(privacySettingDto, "privacySetting");
        return new MyAccountInfoDto(str, str2, str3, str4, str5, str6, z, str7, str8, privacySettingDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyAccountInfoDto)) {
            return false;
        }
        MyAccountInfoDto myAccountInfoDto = (MyAccountInfoDto) obj;
        return js3.i(this.miladiBirthDate, myAccountInfoDto.miladiBirthDate) && js3.i(this.birthDate, myAccountInfoDto.birthDate) && js3.i(this.highResAvatarUrl, myAccountInfoDto.highResAvatarUrl) && js3.i(this.shamsiBirthDate, myAccountInfoDto.shamsiBirthDate) && js3.i(this.gender, myAccountInfoDto.gender) && js3.i(this.city, myAccountInfoDto.city) && this.isBirthday == myAccountInfoDto.isBirthday && js3.i(this.bio, myAccountInfoDto.bio) && js3.i(this.nickname, myAccountInfoDto.nickname) && js3.i(this.privacySetting, myAccountInfoDto.privacySetting);
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHighResAvatarUrl() {
        return this.highResAvatarUrl;
    }

    public final String getMiladiBirthDate() {
        return this.miladiBirthDate;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final PrivacySettingDto getPrivacySetting() {
        return this.privacySetting;
    }

    public final String getShamsiBirthDate() {
        return this.shamsiBirthDate;
    }

    public int hashCode() {
        int iK = rm7.k(this.birthDate, this.miladiBirthDate.hashCode() * 31, 31);
        String str = this.highResAvatarUrl;
        return this.privacySetting.hashCode() + rm7.k(this.nickname, rm7.k(this.bio, (rm7.k(this.city, rm7.k(this.gender, rm7.k(this.shamsiBirthDate, (iK + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31) + (this.isBirthday ? 1231 : 1237)) * 31, 31), 31);
    }

    public final boolean isBirthday() {
        return this.isBirthday;
    }

    public String toString() {
        String str = this.miladiBirthDate;
        String str2 = this.birthDate;
        String str3 = this.highResAvatarUrl;
        String str4 = this.shamsiBirthDate;
        String str5 = this.gender;
        String str6 = this.city;
        boolean z = this.isBirthday;
        String str7 = this.bio;
        String str8 = this.nickname;
        PrivacySettingDto privacySettingDto = this.privacySetting;
        StringBuilder sbT = rm7.t("MyAccountInfoDto(miladiBirthDate=", str, ", birthDate=", str2, ", highResAvatarUrl=");
        o40.I(str3, ", shamsiBirthDate=", str4, ", gender=", sbT);
        o40.I(str5, ", city=", str6, ", isBirthday=", sbT);
        t61.z(sbT, z, ", bio=", str7, ", nickname=");
        sbT.append(str8);
        sbT.append(", privacySetting=");
        sbT.append(privacySettingDto);
        sbT.append(")");
        return sbT.toString();
    }
}
