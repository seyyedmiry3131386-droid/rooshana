package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppPaymentRequestDto implements RequestDTO {

    @vo7("appVersionCode")
    private final Integer appVersionCode;

    @vo7("developerPayload")
    private final String developerPayload;

    @vo7("isRetry")
    private final boolean isRetry;

    @vo7("orientation")
    private final String orientation;

    @vo7("sdkVersion")
    private final int sdkVersion;

    @vo7("simState")
    private final String simState;

    @vo7("skuId")
    private final String skuId;

    @vo7("type")
    private final String type;

    @vo7("vpn")
    private final String vpn;

    public InAppPaymentRequestDto(String str, String str2, String str3, boolean z, String str4, String str5, String str6, int i, Integer num) {
        js3.p(str2, "skuId");
        js3.p(str3, "type");
        js3.p(str4, "vpn");
        js3.p(str6, "orientation");
        this.simState = str;
        this.skuId = str2;
        this.type = str3;
        this.isRetry = z;
        this.vpn = str4;
        this.developerPayload = str5;
        this.orientation = str6;
        this.sdkVersion = i;
        this.appVersionCode = num;
    }

    public final Integer getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSimState() {
        return this.simState;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVpn() {
        return this.vpn;
    }

    public final boolean isRetry() {
        return this.isRetry;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InAppPaymentRequestDto(String str, String str2, String str3, boolean z, String str4, String str5, String str6, int i, Integer num, int i2, yd1 yd1Var) {
        Integer num2;
        int i3;
        String str7;
        String str8;
        str = (i2 & 1) != 0 ? null : str;
        if ((i2 & 32) != 0) {
            num2 = num;
            i3 = i;
            str7 = str6;
            str8 = null;
        } else {
            num2 = num;
            i3 = i;
            str7 = str6;
            str8 = str5;
        }
        this(str, str2, str3, z, str4, str8, str7, i3, num2);
    }
}
