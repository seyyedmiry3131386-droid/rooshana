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
public final class g0 implements g2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public k f;
    public ConcurrentHashMap g;
    public ConcurrentHashMap h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (io.sentry.config.a.t(this.a, g0Var.a) && io.sentry.config.a.t(this.b, g0Var.b) && io.sentry.config.a.t(this.c, g0Var.c) && io.sentry.config.a.t(this.d, g0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("email");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("id");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("username");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("ip_address");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("geo");
            this.f.serialize(cVar, u0Var);
        }
        if (this.g != null) {
            cVar.q("data");
            cVar.w(u0Var, this.g);
        }
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.h, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
