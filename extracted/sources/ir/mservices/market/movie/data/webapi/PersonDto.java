package ir.mservices.market.movie.data.webapi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PersonDto implements Serializable {

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public PersonDto(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }
}
