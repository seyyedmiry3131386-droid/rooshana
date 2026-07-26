package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class AppPaymentRequestDto implements RequestDTO {

    @vo7("isRetry")
    private final boolean isRetry;

    @vo7("orientation")
    private final String orientation;

    @vo7("refId")
    private final String refId;

    @vo7("simState")
    private final String simState;

    @vo7("vpn")
    private final String vpn;

    public AppPaymentRequestDto(String str, String str2, boolean z, String str3, String str4) {
        js3.p(str3, "vpn");
        js3.p(str4, "orientation");
        this.simState = str;
        this.refId = str2;
        this.isRetry = z;
        this.vpn = str3;
        this.orientation = str4;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getSimState() {
        return this.simState;
    }

    public final String getVpn() {
        return this.vpn;
    }

    public final boolean isRetry() {
        return this.isRetry;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppPaymentRequestDto(String str, String str2, boolean z, String str3, String str4, int i, yd1 yd1Var) {
        String str5;
        String str6;
        boolean z2;
        String str7;
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            str5 = str4;
            str6 = str3;
            z2 = z;
            str7 = null;
        } else {
            str5 = str4;
            str6 = str3;
            z2 = z;
            str7 = str2;
        }
        this(str, str7, z2, str6, str5);
    }
}
