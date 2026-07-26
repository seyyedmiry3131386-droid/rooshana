package ir.mservices.market.common.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.vo7;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewMetadataDto {

    @vo7("androidApiLevel")
    private final String androidApiLevel;

    @vo7("androidId")
    private final String androidId;

    @vo7("brand")
    private final String brand;

    @vo7("deviceModel")
    private final String deviceModel;

    @vo7("deviceName")
    private final String deviceName;

    @vo7("manufacturer")
    private final String manufacturer;

    @vo7("miuiInfo")
    private final String miuiInfo;

    @vo7("product")
    private final String product;

    @vo7("uuid")
    private final String uuid;

    public ReviewMetadataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        js3.p(str, "deviceModel");
        js3.p(str2, "androidApiLevel");
        js3.p(str5, "uuid");
        js3.p(str6, "miuiInfo");
        this.deviceModel = str;
        this.androidApiLevel = str2;
        this.manufacturer = str3;
        this.brand = str4;
        this.uuid = str5;
        this.miuiInfo = str6;
        this.androidId = str7;
        this.deviceName = str8;
        this.product = str9;
    }

    public static /* synthetic */ ReviewMetadataDto copy$default(ReviewMetadataDto reviewMetadataDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewMetadataDto.deviceModel;
        }
        if ((i & 2) != 0) {
            str2 = reviewMetadataDto.androidApiLevel;
        }
        if ((i & 4) != 0) {
            str3 = reviewMetadataDto.manufacturer;
        }
        if ((i & 8) != 0) {
            str4 = reviewMetadataDto.brand;
        }
        if ((i & 16) != 0) {
            str5 = reviewMetadataDto.uuid;
        }
        if ((i & 32) != 0) {
            str6 = reviewMetadataDto.miuiInfo;
        }
        if ((i & 64) != 0) {
            str7 = reviewMetadataDto.androidId;
        }
        if ((i & 128) != 0) {
            str8 = reviewMetadataDto.deviceName;
        }
        if ((i & 256) != 0) {
            str9 = reviewMetadataDto.product;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return reviewMetadataDto.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    public final String component1() {
        return this.deviceModel;
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
        return this.uuid;
    }

    public final String component6() {
        return this.miuiInfo;
    }

    public final String component7() {
        return this.androidId;
    }

    public final String component8() {
        return this.deviceName;
    }

    public final String component9() {
        return this.product;
    }

    public final ReviewMetadataDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        js3.p(str, "deviceModel");
        js3.p(str2, "androidApiLevel");
        js3.p(str5, "uuid");
        js3.p(str6, "miuiInfo");
        return new ReviewMetadataDto(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewMetadataDto)) {
            return false;
        }
        ReviewMetadataDto reviewMetadataDto = (ReviewMetadataDto) obj;
        return js3.i(this.deviceModel, reviewMetadataDto.deviceModel) && js3.i(this.androidApiLevel, reviewMetadataDto.androidApiLevel) && js3.i(this.manufacturer, reviewMetadataDto.manufacturer) && js3.i(this.brand, reviewMetadataDto.brand) && js3.i(this.uuid, reviewMetadataDto.uuid) && js3.i(this.miuiInfo, reviewMetadataDto.miuiInfo) && js3.i(this.androidId, reviewMetadataDto.androidId) && js3.i(this.deviceName, reviewMetadataDto.deviceName) && js3.i(this.product, reviewMetadataDto.product);
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

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getMiuiInfo() {
        return this.miuiInfo;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iK = rm7.k(this.androidApiLevel, this.deviceModel.hashCode() * 31, 31);
        String str = this.manufacturer;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brand;
        int iK2 = rm7.k(this.miuiInfo, rm7.k(this.uuid, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.androidId;
        int iHashCode2 = (iK2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceName;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.product;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.deviceModel;
        String str2 = this.androidApiLevel;
        String str3 = this.manufacturer;
        String str4 = this.brand;
        String str5 = this.uuid;
        String str6 = this.miuiInfo;
        String str7 = this.androidId;
        String str8 = this.deviceName;
        String str9 = this.product;
        StringBuilder sbT = rm7.t("ReviewMetadataDto(deviceModel=", str, ", androidApiLevel=", str2, ", manufacturer=");
        o40.I(str3, ", brand=", str4, ", uuid=", sbT);
        o40.I(str5, ", miuiInfo=", str6, ", androidId=", sbT);
        o40.I(str7, ", deviceName=", str8, ", product=", sbT);
        return dw1.s(sbT, str9, ")");
    }
}
