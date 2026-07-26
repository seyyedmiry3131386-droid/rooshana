package ir.mservices.market.app.detail.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppVersionDto implements Serializable {

    @vo7("code")
    private final int code;

    @vo7("isIncompatible")
    private final boolean isIncompatible;

    @vo7("lastUpdate")
    private final String lastUpdate;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @vo7("targetSdk")
    private final Integer targetSdk;

    public AppVersionDto(String str, int i, boolean z, String str2, Integer num) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.name = str;
        this.code = i;
        this.isIncompatible = z;
        this.lastUpdate = str2;
        this.targetSdk = num;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getLastUpdate() {
        return this.lastUpdate;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getTargetSdk() {
        return this.targetSdk;
    }

    public final boolean isIncompatible() {
        return this.isIncompatible;
    }

    public /* synthetic */ AppVersionDto(String str, int i, boolean z, String str2, Integer num, int i2, yd1 yd1Var) {
        this(str, i, z, str2, (i2 & 16) != 0 ? null : num);
    }
}
