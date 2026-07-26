package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements g2 {
    public String a;
    public String b;
    public String c;
    public ConcurrentHashMap d;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("version");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("raw_description");
            cVar.z(this.c);
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.d, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
