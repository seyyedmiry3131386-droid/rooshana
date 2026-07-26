package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements g2 {
    public String A;
    public String B;
    public String C;
    public Float D;
    public Integer E;
    public Double F;
    public String G;
    public String H;
    public ConcurrentHashMap I;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String[] g;
    public Float h;
    public Boolean i;
    public Boolean j;
    public Device$DeviceOrientation k;
    public Boolean l;
    public Long m;
    public Long n;
    public Long o;
    public Boolean p;
    public Long q;
    public Long r;
    public Long s;
    public Long t;
    public Integer u;
    public Integer v;
    public Float w;
    public Integer x;
    public Date y;
    public TimeZone z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (io.sentry.config.a.t(this.a, gVar.a) && io.sentry.config.a.t(this.b, gVar.b) && io.sentry.config.a.t(this.c, gVar.c) && io.sentry.config.a.t(this.d, gVar.d) && io.sentry.config.a.t(this.e, gVar.e) && io.sentry.config.a.t(this.f, gVar.f) && Arrays.equals(this.g, gVar.g) && io.sentry.config.a.t(this.h, gVar.h) && io.sentry.config.a.t(this.i, gVar.i) && io.sentry.config.a.t(this.j, gVar.j) && this.k == gVar.k && io.sentry.config.a.t(this.l, gVar.l) && io.sentry.config.a.t(this.m, gVar.m) && io.sentry.config.a.t(this.n, gVar.n) && io.sentry.config.a.t(this.o, gVar.o) && io.sentry.config.a.t(this.p, gVar.p) && io.sentry.config.a.t(this.q, gVar.q) && io.sentry.config.a.t(this.r, gVar.r) && io.sentry.config.a.t(this.s, gVar.s) && io.sentry.config.a.t(this.t, gVar.t) && io.sentry.config.a.t(this.u, gVar.u) && io.sentry.config.a.t(this.v, gVar.v) && io.sentry.config.a.t(this.w, gVar.w) && io.sentry.config.a.t(this.x, gVar.x) && io.sentry.config.a.t(this.y, gVar.y) && io.sentry.config.a.t(this.A, gVar.A) && io.sentry.config.a.t(this.B, gVar.B) && io.sentry.config.a.t(this.C, gVar.C) && io.sentry.config.a.t(this.D, gVar.D) && io.sentry.config.a.t(this.E, gVar.E) && io.sentry.config.a.t(this.F, gVar.F) && io.sentry.config.a.t(this.G, gVar.G) && io.sentry.config.a.t(this.H, gVar.H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H}) * 31) + Arrays.hashCode(this.g);
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
            cVar.q("manufacturer");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("brand");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("family");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("model");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("model_id");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("archs");
            cVar.w(u0Var, this.g);
        }
        if (this.h != null) {
            cVar.q("battery_level");
            cVar.y(this.h);
        }
        if (this.i != null) {
            cVar.q("charging");
            cVar.x(this.i);
        }
        if (this.j != null) {
            cVar.q("online");
            cVar.x(this.j);
        }
        if (this.k != null) {
            cVar.q("orientation");
            cVar.w(u0Var, this.k);
        }
        if (this.l != null) {
            cVar.q("simulator");
            cVar.x(this.l);
        }
        if (this.m != null) {
            cVar.q("memory_size");
            cVar.y(this.m);
        }
        if (this.n != null) {
            cVar.q("free_memory");
            cVar.y(this.n);
        }
        if (this.o != null) {
            cVar.q("usable_memory");
            cVar.y(this.o);
        }
        if (this.p != null) {
            cVar.q("low_memory");
            cVar.x(this.p);
        }
        if (this.q != null) {
            cVar.q("storage_size");
            cVar.y(this.q);
        }
        if (this.r != null) {
            cVar.q("free_storage");
            cVar.y(this.r);
        }
        if (this.s != null) {
            cVar.q("external_storage_size");
            cVar.y(this.s);
        }
        if (this.t != null) {
            cVar.q("external_free_storage");
            cVar.y(this.t);
        }
        if (this.u != null) {
            cVar.q("screen_width_pixels");
            cVar.y(this.u);
        }
        if (this.v != null) {
            cVar.q("screen_height_pixels");
            cVar.y(this.v);
        }
        if (this.w != null) {
            cVar.q("screen_density");
            cVar.y(this.w);
        }
        if (this.x != null) {
            cVar.q("screen_dpi");
            cVar.y(this.x);
        }
        if (this.y != null) {
            cVar.q("boot_time");
            cVar.w(u0Var, this.y);
        }
        if (this.z != null) {
            cVar.q("timezone");
            cVar.w(u0Var, this.z);
        }
        if (this.A != null) {
            cVar.q("id");
            cVar.z(this.A);
        }
        if (this.C != null) {
            cVar.q("connection_type");
            cVar.z(this.C);
        }
        if (this.D != null) {
            cVar.q("battery_temperature");
            cVar.y(this.D);
        }
        if (this.B != null) {
            cVar.q("locale");
            cVar.z(this.B);
        }
        if (this.E != null) {
            cVar.q("processor_count");
            cVar.y(this.E);
        }
        if (this.F != null) {
            cVar.q("processor_frequency");
            cVar.y(this.F);
        }
        if (this.G != null) {
            cVar.q("cpu_description");
            cVar.z(this.G);
        }
        if (this.H != null) {
            cVar.q("chipset");
            cVar.z(this.H);
        }
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.I, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
