package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivateProfileInfoDto implements RequestDTO {

    @vo7("city")
    private final String city;

    @vo7("gender")
    private final String gender;

    @vo7("miladiBirthDate")
    private final String miladiBirthDate;

    @vo7("shamsiBirthDate")
    private final String shamsiBirthDate;

    public PrivateProfileInfoDto(String str, String str2, String str3, String str4) {
        js3.p(str, "miladiBirthDate");
        js3.p(str2, "shamsiBirthDate");
        js3.p(str3, "gender");
        js3.p(str4, "city");
        this.miladiBirthDate = str;
        this.shamsiBirthDate = str2;
        this.gender = str3;
        this.city = str4;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getMiladiBirthDate() {
        return this.miladiBirthDate;
    }

    public final String getShamsiBirthDate() {
        return this.shamsiBirthDate;
    }
}
