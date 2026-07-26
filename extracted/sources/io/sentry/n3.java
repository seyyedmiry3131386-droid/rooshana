package io.sentry;

import defpackage.rm7;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n3 implements g2 {
    public io.sentry.protocol.v b;
    public io.sentry.protocol.v c;
    public io.sentry.protocol.t d;
    public final Map e;
    public String f;
    public String g;
    public String h;
    public String i;
    public double j;
    public final File k;
    public io.sentry.protocol.profiling.a m;
    public ConcurrentHashMap n;
    public String l = null;
    public io.sentry.protocol.f a = null;

    public n3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, File file, Map map, Double d, String str, b6 b6Var) {
        this.b = vVar;
        this.c = vVar2;
        this.k = file;
        this.e = map;
        this.d = b6Var.getSdkVersion();
        this.g = b6Var.getRelease() != null ? b6Var.getRelease() : "";
        this.h = b6Var.getEnvironment();
        this.f = str;
        this.i = "2";
        this.j = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return Objects.equals(this.a, n3Var.a) && Objects.equals(this.b, n3Var.b) && Objects.equals(this.c, n3Var.c) && Objects.equals(this.d, n3Var.d) && Objects.equals(this.e, n3Var.e) && Objects.equals(this.f, n3Var.f) && Objects.equals(this.g, n3Var.g) && Objects.equals(this.h, n3Var.h) && Objects.equals(this.i, n3Var.i) && Objects.equals(this.l, n3Var.l) && Objects.equals(this.n, n3Var.n) && Objects.equals(this.m, n3Var.m);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.m, this.n);
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("debug_meta");
            cVar.w(u0Var, this.a);
        }
        cVar.q("profiler_id");
        cVar.w(u0Var, this.b);
        cVar.q("chunk_id");
        cVar.w(u0Var, this.c);
        if (this.d != null) {
            cVar.q("client_sdk");
            cVar.w(u0Var, this.d);
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.b) cVar.b).d;
            cVar.t("");
            cVar.q("measurements");
            cVar.w(u0Var, map);
            cVar.t(str);
        }
        cVar.q("platform");
        cVar.w(u0Var, this.f);
        cVar.q("release");
        cVar.w(u0Var, this.g);
        if (this.h != null) {
            cVar.q("environment");
            cVar.w(u0Var, this.h);
        }
        cVar.q("version");
        cVar.w(u0Var, this.i);
        if (this.l != null) {
            cVar.q("sampled_profile");
            cVar.w(u0Var, this.l);
        }
        cVar.q("timestamp");
        cVar.w(u0Var, BigDecimal.valueOf(this.j).setScale(6, RoundingMode.DOWN));
        if (this.m != null) {
            cVar.q("profile");
            cVar.w(u0Var, this.m);
        }
        ConcurrentHashMap concurrentHashMap = this.n;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.n, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
