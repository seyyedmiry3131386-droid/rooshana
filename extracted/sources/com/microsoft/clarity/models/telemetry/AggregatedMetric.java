package com.microsoft.clarity.models.telemetry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.yd1;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AggregatedMetric {
    private final int count;
    private final double max;
    private final double min;
    private final String name;
    private final int sourcePlatform;
    private final double stdev;
    private final double sum;
    private final String version;

    public AggregatedMetric(String str, String str2, int i, double d, double d2, double d3, double d4, int i2) {
        js3.p(str, "version");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.version = str;
        this.name = str2;
        this.count = i;
        this.sum = d;
        this.min = d2;
        this.max = d3;
        this.stdev = d4;
        this.sourcePlatform = i2;
    }

    public static /* synthetic */ AggregatedMetric copy$default(AggregatedMetric aggregatedMetric, String str, String str2, int i, double d, double d2, double d3, double d4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = aggregatedMetric.version;
        }
        if ((i3 & 2) != 0) {
            str2 = aggregatedMetric.name;
        }
        if ((i3 & 4) != 0) {
            i = aggregatedMetric.count;
        }
        if ((i3 & 8) != 0) {
            d = aggregatedMetric.sum;
        }
        if ((i3 & 16) != 0) {
            d2 = aggregatedMetric.min;
        }
        if ((i3 & 32) != 0) {
            d3 = aggregatedMetric.max;
        }
        if ((i3 & 64) != 0) {
            d4 = aggregatedMetric.stdev;
        }
        if ((i3 & 128) != 0) {
            i2 = aggregatedMetric.sourcePlatform;
        }
        int i4 = i2;
        double d5 = d4;
        double d6 = d3;
        double d7 = d2;
        int i5 = i;
        return aggregatedMetric.copy(str, str2, i5, d, d7, d6, d5, i4);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.count;
    }

    public final double component4() {
        return this.sum;
    }

    public final double component5() {
        return this.min;
    }

    public final double component6() {
        return this.max;
    }

    public final double component7() {
        return this.stdev;
    }

    public final int component8() {
        return this.sourcePlatform;
    }

    public final AggregatedMetric copy(String str, String str2, int i, double d, double d2, double d3, double d4, int i2) {
        js3.p(str, "version");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new AggregatedMetric(str, str2, i, d, d2, d3, d4, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatedMetric)) {
            return false;
        }
        AggregatedMetric aggregatedMetric = (AggregatedMetric) obj;
        return js3.i(this.version, aggregatedMetric.version) && js3.i(this.name, aggregatedMetric.name) && this.count == aggregatedMetric.count && Double.compare(this.sum, aggregatedMetric.sum) == 0 && Double.compare(this.min, aggregatedMetric.min) == 0 && Double.compare(this.max, aggregatedMetric.max) == 0 && Double.compare(this.stdev, aggregatedMetric.stdev) == 0 && this.sourcePlatform == aggregatedMetric.sourcePlatform;
    }

    public final int getCount() {
        return this.count;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public final double getStdev() {
        return this.stdev;
    }

    public final double getSum() {
        return this.sum;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iK = (this.count + rm7.k(this.name, this.version.hashCode() * 31, 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.sum);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.min);
        int i = (((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32))) + ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iK) * 31)) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.max);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.stdev);
        int i2 = (int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32));
        return this.sourcePlatform + ((i2 + ((((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32))) + i) * 31)) * 31);
    }

    public final String toJson() {
        String string = toJsonObject().toString();
        js3.o(string, "toJsonObject().toString()");
        return string;
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", this.version);
        jSONObject.put("n", this.name);
        jSONObject.put(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME, this.count);
        jSONObject.put("s", this.sum);
        jSONObject.put("min", this.min);
        jSONObject.put("max", this.max);
        jSONObject.put("stdev", this.stdev);
        jSONObject.put(ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME, this.sourcePlatform);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AggregatedMetric(version=");
        sb.append(this.version);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", sum=");
        sb.append(this.sum);
        sb.append(", min=");
        sb.append(this.min);
        sb.append(", max=");
        sb.append(this.max);
        sb.append(", stdev=");
        sb.append(this.stdev);
        sb.append(", sourcePlatform=");
        return dw1.q(sb, this.sourcePlatform, ')');
    }

    public /* synthetic */ AggregatedMetric(String str, String str2, int i, double d, double d2, double d3, double d4, int i2, int i3, yd1 yd1Var) {
        this(str, str2, i, d, d2, d3, d4, (i3 & 128) != 0 ? 1 : i2);
    }
}
