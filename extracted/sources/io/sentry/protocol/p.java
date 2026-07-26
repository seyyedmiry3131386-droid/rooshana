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
public final class p implements g2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public ConcurrentHashMap g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (io.sentry.config.a.t(this.a, pVar.a) && io.sentry.config.a.t(this.b, pVar.b) && io.sentry.config.a.t(this.c, pVar.c) && io.sentry.config.a.t(this.d, pVar.d) && io.sentry.config.a.t(this.e, pVar.e) && io.sentry.config.a.t(this.f, pVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
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
        if (this.c != null) {
            cVar.q("raw_description");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("build");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("kernel_version");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("rooted");
            cVar.x(this.f);
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.g, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
