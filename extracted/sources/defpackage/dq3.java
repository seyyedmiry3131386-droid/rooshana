package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class dq3 implements px3 {
    public static final dq3 a = new dq3();
    public static final bk6 b = new bk6("kotlin.time.Instant", xj6.j);

    /* JADX WARN: Removed duplicated region for block: B:196:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x049d  */
    @Override // defpackage.px3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deserialize(defpackage.cc1 r25) {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq3.deserialize(cc1):java.lang.Object");
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        Instant instant = (Instant) obj;
        js3.p(instant, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q12Var.C(instant.toString());
    }
}
