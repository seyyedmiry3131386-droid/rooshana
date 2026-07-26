package ir.mservices.market.app.detail.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RateDto implements Serializable {

    @vo7("count")
    private final int count;

    @vo7("rateOnlyCount")
    private final int rateOnlyCount;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final int value;

    public RateDto(int i, int i2, int i3) {
        this.value = i;
        this.count = i2;
        this.rateOnlyCount = i3;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getRateOnlyCount() {
        return this.rateOnlyCount;
    }

    public final int getValue() {
        return this.value;
    }
}
