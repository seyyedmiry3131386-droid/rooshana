package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g2 {
    public Long a;
    public Double b;
    public Long c;
    public Double d;
    public Long e;
    public Double f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public ConcurrentHashMap l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.config.a.t(this.a, cVar.a) && io.sentry.config.a.t(this.b, cVar.b) && io.sentry.config.a.t(this.c, cVar.c) && io.sentry.config.a.t(this.d, cVar.d) && io.sentry.config.a.t(this.e, cVar.e) && io.sentry.config.a.t(this.f, cVar.f) && io.sentry.config.a.t(this.g, cVar.g) && io.sentry.config.a.t(this.h, cVar.h) && io.sentry.config.a.t(this.i, cVar.i) && io.sentry.config.a.t(this.j, cVar.j) && io.sentry.config.a.t(this.k, cVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("gc.total_count");
            cVar.y(this.a);
        }
        if (this.b != null) {
            cVar.q("gc.total_time");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("gc.blocking_count");
            cVar.y(this.c);
        }
        if (this.d != null) {
            cVar.q("gc.blocking_time");
            cVar.y(this.d);
        }
        if (this.e != null) {
            cVar.q("gc.pre_oome_count");
            cVar.y(this.e);
        }
        if (this.f != null) {
            cVar.q("gc.waiting_time");
            cVar.y(this.f);
        }
        if (this.g != null) {
            cVar.q("memory.free");
            cVar.y(this.g);
        }
        if (this.h != null) {
            cVar.q("memory.free_until_gc");
            cVar.y(this.h);
        }
        if (this.i != null) {
            cVar.q("memory.free_until_oome");
            cVar.y(this.i);
        }
        if (this.j != null) {
            cVar.q("memory.total");
            cVar.y(this.j);
        }
        if (this.k != null) {
            cVar.q("memory.max");
            cVar.y(this.k);
        }
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.l, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
