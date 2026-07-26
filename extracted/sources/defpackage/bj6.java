package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class bj6 {
    public final String a;

    public bj6(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bj6)) {
            return false;
        }
        return js3.i(this.a, ((bj6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
