package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.lv3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class FcmTokenRegisterDto implements RequestDTO {

    @vo7("ad_id")
    private final String adId;

    @vo7("android_package")
    private final String androidPackage;

    @vo7("carrier")
    private final String carrier;

    @vo7("device_model")
    private final String deviceModel;

    @vo7("device_os")
    private final String deviceOs;

    @vo7("identifier")
    private final String identifier;

    @vo7("identifier_type")
    private final String identifierType;

    @vo7("tags")
    private final lv3 tags;

    public FcmTokenRegisterDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, lv3 lv3Var) {
        js3.p(str, "identifier");
        js3.p(str2, "identifierType");
        js3.p(str4, "deviceOs");
        js3.p(str5, "androidPackage");
        js3.p(str6, "deviceModel");
        js3.p(lv3Var, "tags");
        this.identifier = str;
        this.identifierType = str2;
        this.adId = str3;
        this.deviceOs = str4;
        this.androidPackage = str5;
        this.deviceModel = str6;
        this.carrier = str7;
        this.tags = lv3Var;
    }
}
