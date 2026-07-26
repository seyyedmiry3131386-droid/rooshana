package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends b implements g2 {
    public String c;
    public int d;
    public long e;
    public long f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public String l;
    public int m;
    public int n;
    public int o;
    public HashMap p;
    public ConcurrentHashMap q;
    public ConcurrentHashMap r;

    public j() {
        super(RRWebEventType.Custom);
        this.g = "h264";
        this.h = "mp4";
        this.l = "constant";
        this.c = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.d == jVar.d && this.e == jVar.e && this.f == jVar.f && this.i == jVar.i && this.j == jVar.j && this.k == jVar.k && this.m == jVar.m && this.n == jVar.n && this.o == jVar.o && io.sentry.config.a.t(this.c, jVar.c) && io.sentry.config.a.t(this.g, jVar.g) && io.sentry.config.a.t(this.h, jVar.h) && io.sentry.config.a.t(this.l, jVar.l);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o)});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("type");
        cVar.w(u0Var, this.a);
        cVar.q("timestamp");
        cVar.v(this.b);
        cVar.q("data");
        cVar.d();
        cVar.q("tag");
        cVar.z(this.c);
        cVar.q("payload");
        cVar.d();
        cVar.q("segmentId");
        cVar.v(this.d);
        cVar.q("size");
        cVar.v(this.e);
        cVar.q("duration");
        cVar.v(this.f);
        cVar.q("encoding");
        cVar.z(this.g);
        cVar.q("container");
        cVar.z(this.h);
        cVar.q("height");
        cVar.v(this.i);
        cVar.q("width");
        cVar.v(this.j);
        cVar.q("frameCount");
        cVar.v(this.k);
        cVar.q("frameRate");
        cVar.v(this.m);
        cVar.q("frameRateType");
        cVar.z(this.l);
        cVar.q("left");
        cVar.v(this.n);
        cVar.q("top");
        cVar.v(this.o);
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.q, k, cVar, k, u0Var);
            }
        }
        cVar.n();
        ConcurrentHashMap concurrentHashMap2 = this.r;
        if (concurrentHashMap2 != null) {
            for (K k2 : concurrentHashMap2.keySet()) {
                rm7.z(this.r, k2, cVar, k2, u0Var);
            }
        }
        cVar.n();
        HashMap map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.p, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
