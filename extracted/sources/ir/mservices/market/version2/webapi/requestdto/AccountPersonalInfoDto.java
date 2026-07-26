package ir.mservices.market.version2.webapi.requestdto;

import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountPersonalInfoDto implements RequestDTO {

    @vo7("birthdayDate")
    private final String birthdayDate;

    @vo7("city")
    private final String city;

    @vo7("gender")
    private final String gender;

    public AccountPersonalInfoDto() {
        this(null, null, null, 7, null);
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

    public AccountPersonalInfoDto(String str, String str2, String str3) {
        this.birthdayDate = str;
        this.gender = str2;
        this.city = str3;
    }

    public /* synthetic */ AccountPersonalInfoDto(String str, String str2, String str3, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
