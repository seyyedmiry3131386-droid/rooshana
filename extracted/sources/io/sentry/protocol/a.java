package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g2 {
    public String a;
    public Date b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public AbstractMap h;
    public List i;
    public String j;
    public Boolean k;
    public Boolean l;
    public List m;
    public ConcurrentHashMap n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.config.a.t(this.a, aVar.a) && io.sentry.config.a.t(this.b, aVar.b) && io.sentry.config.a.t(this.c, aVar.c) && io.sentry.config.a.t(this.d, aVar.d) && io.sentry.config.a.t(this.e, aVar.e) && io.sentry.config.a.t(this.f, aVar.f) && io.sentry.config.a.t(this.g, aVar.g) && io.sentry.config.a.t(this.h, aVar.h) && io.sentry.config.a.t(this.k, aVar.k) && io.sentry.config.a.t(this.i, aVar.i) && io.sentry.config.a.t(this.j, aVar.j) && io.sentry.config.a.t(this.l, aVar.l) && io.sentry.config.a.t(this.m, aVar.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.i, this.j, this.l, this.m});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("app_identifier");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("app_start_time");
            cVar.w(u0Var, this.b);
        }
        if (this.c != null) {
            cVar.q("device_app_hash");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("build_type");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("app_name");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("app_version");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("app_build");
            cVar.z(this.g);
        }
        AbstractMap abstractMap = this.h;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.q("permissions");
            cVar.w(u0Var, this.h);
        }
        if (this.k != null) {
            cVar.q("in_foreground");
            cVar.x(this.k);
        }
        if (this.i != null) {
            cVar.q("view_names");
            cVar.w(u0Var, this.i);
        }
        if (this.j != null) {
            cVar.q("start_type");
            cVar.z(this.j);
        }
        if (this.l != null) {
            cVar.q("is_split_apks");
            cVar.x(this.l);
        }
        List list = this.m;
        if (list != null && !list.isEmpty()) {
            cVar.q("split_names");
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
