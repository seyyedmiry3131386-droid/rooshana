package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements g2 {
    public String a;
    public String b;
    public String c;
    public Object d;
    public String e;
    public ConcurrentHashMap f;
    public ConcurrentHashMap g;
    public Long h;
    public ConcurrentHashMap i;
    public String j;
    public String k;
    public ConcurrentHashMap l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return io.sentry.config.a.t(this.a, qVar.a) && io.sentry.config.a.t(this.b, qVar.b) && io.sentry.config.a.t(this.c, qVar.c) && io.sentry.config.a.t(this.e, qVar.e) && io.sentry.config.a.t(this.f, qVar.f) && io.sentry.config.a.t(this.g, qVar.g) && io.sentry.config.a.t(this.h, qVar.h) && io.sentry.config.a.t(this.j, qVar.j) && io.sentry.config.a.t(this.k, qVar.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.j, this.k});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("url");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("method");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("query_string");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("data");
            cVar.w(u0Var, this.d);
        }
        if (this.e != null) {
            cVar.q("cookies");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("headers");
            cVar.w(u0Var, this.f);
        }
        if (this.g != null) {
            cVar.q("env");
            cVar.w(u0Var, this.g);
        }
        if (this.i != null) {
            cVar.q("other");
            cVar.w(u0Var, this.i);
        }
        if (this.j != null) {
            cVar.q("fragment");
            cVar.w(u0Var, this.j);
        }
        if (this.h != null) {
            cVar.q("body_size");
            cVar.w(u0Var, this.h);
        }
        if (this.k != null) {
            cVar.q("api_target");
            cVar.w(u0Var, this.k);
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
