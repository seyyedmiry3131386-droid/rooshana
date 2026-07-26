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
public final class l implements g2 {
    public String a;
    public Integer b;
    public String c;
    public String d;
    public Integer e;
    public String f;
    public Boolean g;
    public String h;
    public String i;
    public ConcurrentHashMap j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (io.sentry.config.a.t(this.a, lVar.a) && io.sentry.config.a.t(this.b, lVar.b) && io.sentry.config.a.t(this.c, lVar.c) && io.sentry.config.a.t(this.d, lVar.d) && io.sentry.config.a.t(this.e, lVar.e) && io.sentry.config.a.t(this.f, lVar.f) && io.sentry.config.a.t(this.g, lVar.g) && io.sentry.config.a.t(this.h, lVar.h) && io.sentry.config.a.t(this.i, lVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
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
            cVar.q("id");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("vendor_id");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("vendor_name");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("memory_size");
            cVar.y(this.e);
        }
        if (this.f != null) {
            cVar.q("api_type");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("multi_threaded_rendering");
            cVar.x(this.g);
        }
        if (this.h != null) {
            cVar.q("version");
            cVar.z(this.h);
        }
        if (this.i != null) {
            cVar.q("npot_support");
            cVar.z(this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.j, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
