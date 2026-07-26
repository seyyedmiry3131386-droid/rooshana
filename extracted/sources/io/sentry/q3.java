package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 implements g2 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public ConcurrentHashMap h;

    public q3(m1 m1Var, Long l, Long l2) {
        this.a = m1Var.t().toString();
        this.b = m1Var.x().a.toString();
        this.c = m1Var.getName().isEmpty() ? "unknown" : m1Var.getName();
        this.d = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3.class != obj.getClass()) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return this.a.equals(q3Var.a) && this.b.equals(q3Var.b) && this.c.equals(q3Var.c) && this.d.equals(q3Var.d) && this.f.equals(q3Var.f) && io.sentry.config.a.t(this.g, q3Var.g) && io.sentry.config.a.t(this.e, q3Var.e) && io.sentry.config.a.t(this.h, q3Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("id");
        cVar.w(u0Var, this.a);
        cVar.q("trace_id");
        cVar.w(u0Var, this.b);
        cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
        cVar.w(u0Var, this.c);
        cVar.q("relative_start_ns");
        cVar.w(u0Var, this.d);
        cVar.q("relative_end_ns");
        cVar.w(u0Var, this.e);
        cVar.q("relative_cpu_start_ms");
        cVar.w(u0Var, this.f);
        cVar.q("relative_cpu_end_ms");
        cVar.w(u0Var, this.g);
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.h, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
