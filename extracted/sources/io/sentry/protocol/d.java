package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g2 {
    public String a;
    public String b;
    public ConcurrentHashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (io.sentry.config.a.t(this.a, dVar.a) && io.sentry.config.a.t(this.b, dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

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
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.c, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
