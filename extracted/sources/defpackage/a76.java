package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class a76 {
    public final String a;

    public a76(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a76) && js3.i(this.a, ((a76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("Person(name=", this.a, ")");
    }
}
