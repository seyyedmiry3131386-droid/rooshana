package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class af8 {
    public final String a;
    public final boolean b;
    public ff8 c;
    public long d;

    public af8(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = true;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
