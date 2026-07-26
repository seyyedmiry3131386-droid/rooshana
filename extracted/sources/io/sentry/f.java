package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import ir.mservices.market.version2.webapi.responsedto.LayoutPageDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g2, Comparable {
    public final Long a;
    public Date b;
    public final Long c;
    public String d;
    public String e;
    public ConcurrentHashMap f;
    public String g;
    public String h;
    public SentryLevel i;
    public ConcurrentHashMap j;

    public f(Date date) {
        this.f = new ConcurrentHashMap();
        this.c = Long.valueOf(System.nanoTime());
        this.b = date;
        this.a = null;
    }

    public static boolean a(f fVar, f fVar2) {
        return fVar.b().getTime() == fVar2.b().getTime() && io.sentry.config.a.t(fVar.d, fVar2.d) && io.sentry.config.a.t(fVar.e, fVar2.e) && io.sentry.config.a.t(fVar.g, fVar2.g) && io.sentry.config.a.t(fVar.h, fVar2.h) && fVar.i == fVar2.i;
    }

    public final Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.a;
        if (l == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateA = io.sentry.config.a.A(l.longValue());
        this.b = dateA;
        return dateA;
    }

    public final void c(Object obj, String str) {
        if (obj == null) {
            this.f.remove(str);
        } else {
            this.f.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c.compareTo(((f) obj).c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return "http".equals(this.e) ? a(this, fVar) && io.sentry.config.a.t(this.f.get("status_code"), fVar.f.get("status_code")) && io.sentry.config.a.t(this.f.get("url"), fVar.f.get("url")) && io.sentry.config.a.t(this.f.get("method"), fVar.f.get("method")) && io.sentry.config.a.t(this.f.get("http.fragment"), fVar.f.get("http.fragment")) && io.sentry.config.a.t(this.f.get("http.query"), fVar.f.get("http.query")) : a(this, fVar);
    }

    public final int hashCode() {
        return "http".equals(this.e) ? Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.d, this.e, this.g, this.h, this.i, this.f.get("status_code"), this.f.get("url"), this.f.get("method"), this.f.get("http.fragment"), this.f.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.d, this.e, this.g, this.h, this.i});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("timestamp");
        cVar.w(u0Var, b());
        if (this.d != null) {
            cVar.q("message");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("type");
            cVar.z(this.e);
        }
        cVar.q("data");
        cVar.w(u0Var, this.f);
        if (this.g != null) {
            cVar.q(LayoutPageDTO.Type.CATEGORY);
            cVar.z(this.g);
        }
        if (this.h != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            cVar.z(this.h);
        }
        if (this.i != null) {
            cVar.q("level");
            cVar.w(u0Var, this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.j, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }

    public f(long j) {
        this.f = new ConcurrentHashMap();
        this.c = Long.valueOf(System.nanoTime());
        this.a = Long.valueOf(j);
        this.b = null;
    }

    public f(f fVar) {
        this.f = new ConcurrentHashMap();
        this.c = Long.valueOf(System.nanoTime());
        this.b = fVar.b;
        this.a = fVar.a;
        this.d = fVar.d;
        this.e = fVar.e;
        this.g = fVar.g;
        this.h = fVar.h;
        ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q(fVar.f);
        if (concurrentHashMapQ != null) {
            this.f = concurrentHashMapQ;
        }
        this.j = io.sentry.config.a.Q(fVar.j);
        this.i = fVar.i;
    }

    public f() {
        this(System.currentTimeMillis());
    }
}
