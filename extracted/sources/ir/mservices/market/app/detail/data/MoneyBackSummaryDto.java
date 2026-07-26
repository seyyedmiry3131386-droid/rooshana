package ir.mservices.market.app.detail.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MoneyBackSummaryDto implements Serializable {

    @vo7("backgroundColor")
    private final String backgroundColor;

    @vo7("foregroundColor")
    private final String foregroundColor;

    @vo7("unitText")
    private final String unitText;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final String value;

    public MoneyBackSummaryDto(String str, String str2, String str3, String str4) {
        this.foregroundColor = str;
        this.backgroundColor = str2;
        this.unitText = str3;
        this.value = str4;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getUnitText() {
        return this.unitText;
    }

    public final String getValue() {
        return this.value;
    }
}
