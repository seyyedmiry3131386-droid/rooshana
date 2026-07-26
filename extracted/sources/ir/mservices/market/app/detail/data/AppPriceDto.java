package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppPriceDto implements Serializable {

    @vo7("isFree")
    private final boolean isFree;

    @vo7("realPrice")
    private final String realPrice;

    public AppPriceDto(boolean z, String str) {
        this.isFree = z;
        this.realPrice = str;
    }

    public final String getRealPrice() {
        return this.realPrice;
    }

    public final boolean isFree() {
        return this.isFree;
    }
}
