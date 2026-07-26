package ir.mservices.market.togo.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MetadataDto implements Serializable {

    @vo7("accountId")
    private final String accountId;

    @vo7("adId")
    private final String adId;

    @vo7("androidApiLevel")
    private final String androidApiLevel;

    @vo7("androidId")
    private final String androidId;

    @vo7("brand")
    private final String brand;

    @vo7("connectivityType")
    private final String connectivityType;

    @vo7("deviceModel")
    private final String deviceModel;

    @vo7("manufacturer")
    private final String manufacturer;

    @vo7("miuiInfo")
    private final String miuiInfo;

    @vo7("packageName")
    private final String packageName;

    @vo7(PaymentRequiredBindingDto.BINDING_PHONE)
    private final String phone;

    @vo7("platform")
    private final String platform;

    @vo7("store")
    private final String store;

    @vo7("uuid")
    private final String uuid;

    public MetadataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        js3.p(str, "deviceModel");
        js3.p(str2, "androidApiLevel");
        js3.p(str6, "uuid");
        js3.p(str7, PaymentRequiredBindingDto.BINDING_PHONE);
        js3.p(str8, "accountId");
        js3.p(str9, "miuiInfo");
        js3.p(str11, "adId");
        js3.p(str13, "packageName");
        js3.p(str14, "platform");
        this.deviceModel = str;
        this.androidApiLevel = str2;
        this.manufacturer = str3;
        this.brand = str4;
        this.connectivityType = str5;
        this.uuid = str6;
        this.phone = str7;
        this.accountId = str8;
        this.miuiInfo = str9;
        this.androidId = str10;
        this.adId = str11;
        this.store = str12;
        this.packageName = str13;
        this.platform = str14;
    }

    public final String component1() {
        return this.deviceModel;
    }

    public final String component10() {
        return this.androidId;
    }

    public final String component11() {
        return this.adId;
    }

    public final String component12() {
        return this.store;
    }

    public final String component13() {
        return this.packageName;
    }

    public final String component14() {
        return this.platform;
    }

    public final String component2() {
        return this.androidApiLevel;
    }

    public final String component3() {
        return this.manufacturer;
    }

    public final String component4() {
        return this.brand;
    }

    public final String component5() {
        return this.connectivityType;
    }

    public final String component6() {
        return this.uuid;
    }

    public final String component7() {
        return this.phone;
    }

    public final String component8() {
        return this.accountId;
    }

    public final String component9() {
        return this.miuiInfo;
    }

    public final MetadataDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        js3.p(str, "deviceModel");
        js3.p(str2, "androidApiLevel");
        js3.p(str6, "uuid");
        js3.p(str7, PaymentRequiredBindingDto.BINDING_PHONE);
        js3.p(str8, "accountId");
        js3.p(str9, "miuiInfo");
        js3.p(str11, "adId");
        js3.p(str13, "packageName");
        js3.p(str14, "platform");
        return new MetadataDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataDto)) {
            return false;
        }
        MetadataDto metadataDto = (MetadataDto) obj;
        return js3.i(this.deviceModel, metadataDto.deviceModel) && js3.i(this.androidApiLevel, metadataDto.androidApiLevel) && js3.i(this.manufacturer, metadataDto.manufacturer) && js3.i(this.brand, metadataDto.brand) && js3.i(this.connectivityType, metadataDto.connectivityType) && js3.i(this.uuid, metadataDto.uuid) && js3.i(this.phone, metadataDto.phone) && js3.i(this.accountId, metadataDto.accountId) && js3.i(this.miuiInfo, metadataDto.miuiInfo) && js3.i(this.androidId, metadataDto.androidId) && js3.i(this.adId, metadataDto.adId) && js3.i(this.store, metadataDto.store) && js3.i(this.packageName, metadataDto.packageName) && js3.i(this.platform, metadataDto.platform);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getConnectivityType() {
        return this.connectivityType;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getMiuiInfo() {
        return this.miuiInfo;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getStore() {
        return this.store;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iK = rm7.k(this.androidApiLevel, this.deviceModel.hashCode() * 31, 31);
        String str = this.manufacturer;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brand;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.connectivityType;
        int iK2 = rm7.k(this.miuiInfo, rm7.k(this.accountId, rm7.k(this.phone, rm7.k(this.uuid, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31);
        String str4 = this.androidId;
        int iK3 = rm7.k(this.adId, (iK2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.store;
        return this.platform.hashCode() + rm7.k(this.packageName, (iK3 + (str5 != null ? str5.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.deviceModel;
        String str2 = this.androidApiLevel;
        String str3 = this.manufacturer;
        String str4 = this.brand;
        String str5 = this.connectivityType;
        String str6 = this.uuid;
        String str7 = this.phone;
        String str8 = this.accountId;
        String str9 = this.miuiInfo;
        String str10 = this.androidId;
        String str11 = this.adId;
        String str12 = this.store;
        String str13 = this.packageName;
        String str14 = this.platform;
        StringBuilder sbT = rm7.t("MetadataDto(deviceModel=", str, ", androidApiLevel=", str2, ", manufacturer=");
        o40.I(str3, ", brand=", str4, ", connectivityType=", sbT);
        o40.I(str5, ", uuid=", str6, ", phone=", sbT);
        o40.I(str7, ", accountId=", str8, ", miuiInfo=", sbT);
        o40.I(str9, ", androidId=", str10, ", adId=", sbT);
        o40.I(str11, ", store=", str12, ", packageName=", sbT);
        return dw1.p(str13, ", platform=", str14, ")", sbT);
    }
}
