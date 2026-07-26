package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.t61;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TrafficPriceDto implements Serializable {

    @vo7("canHalfPrice")
    private final boolean canHalfPrice;

    @vo7("downloadingText")
    private final String downloadingText;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    public TrafficPriceDto(String str, String str2, boolean z) {
        this.text = str;
        this.downloadingText = str2;
        this.canHalfPrice = z;
    }

    public static /* synthetic */ TrafficPriceDto copy$default(TrafficPriceDto trafficPriceDto, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trafficPriceDto.text;
        }
        if ((i & 2) != 0) {
            str2 = trafficPriceDto.downloadingText;
        }
        if ((i & 4) != 0) {
            z = trafficPriceDto.canHalfPrice;
        }
        return trafficPriceDto.copy(str, str2, z);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.downloadingText;
    }

    public final boolean component3() {
        return this.canHalfPrice;
    }

    public final TrafficPriceDto copy(String str, String str2, boolean z) {
        return new TrafficPriceDto(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficPriceDto)) {
            return false;
        }
        TrafficPriceDto trafficPriceDto = (TrafficPriceDto) obj;
        return js3.i(this.text, trafficPriceDto.text) && js3.i(this.downloadingText, trafficPriceDto.downloadingText) && this.canHalfPrice == trafficPriceDto.canHalfPrice;
    }

    public final boolean getCanHalfPrice() {
        return this.canHalfPrice;
    }

    public final String getDownloadingText() {
        return this.downloadingText;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.downloadingText;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.canHalfPrice ? 1231 : 1237);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.downloadingText;
        return t61.l(rm7.t("TrafficPriceDto(text=", str, ", downloadingText=", str2, ", canHalfPrice="), this.canHalfPrice, ")");
    }
}
