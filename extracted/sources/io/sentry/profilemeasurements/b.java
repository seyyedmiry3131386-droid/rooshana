package io.sentry.profilemeasurements;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.internal.debugmeta.c;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g2 {
    public ConcurrentHashMap a;
    public double b;
    public String c;
    public double d;

    public b(Long l, Number number, long j) {
        this.c = l.toString();
        this.d = number.doubleValue();
        this.b = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.config.a.t(this.a, bVar.a) && this.c.equals(bVar.c) && this.d == bVar.d && this.b == bVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Double.valueOf(this.d)});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        c cVar = (c) i3Var;
        cVar.d();
        cVar.q(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        cVar.w(u0Var, Double.valueOf(this.d));
        cVar.q("elapsed_since_start_ns");
        cVar.w(u0Var, this.c);
        cVar.q("timestamp");
        cVar.w(u0Var, BigDecimal.valueOf(this.b).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.a, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
