package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k6 implements g2 {
    public final io.sentry.protocol.v a;
    public final m6 b;
    public final m6 c;
    public transient p6 d;
    public final String e;
    public String f;
    public SpanStatus g;
    public ConcurrentHashMap h;
    public String i;
    public Map j;
    public ConcurrentHashMap k;
    public Instrumenter l;
    public c m;
    public final f2 n;
    public final io.sentry.protocol.v o;

    public k6(io.sentry.protocol.v vVar, m6 m6Var, String str, m6 m6Var2) {
        this(vVar, m6Var, m6Var2, str, null, null, null, "manual");
    }

    public final void a(p6 p6Var) {
        this.d = p6Var;
        c cVar = this.m;
        if (cVar == null || p6Var == null) {
            return;
        }
        Boolean bool = p6Var.a;
        Charset charset = io.sentry.util.k.a;
        cVar.d("sentry-sampled", bool == null ? null : bool.toString());
        Double d = p6Var.c;
        if (d != null && cVar.f) {
            cVar.d = d;
        }
        Double d2 = p6Var.b;
        if (d2 != null) {
            cVar.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return this.a.equals(k6Var.a) && this.b.equals(k6Var.b) && io.sentry.config.a.t(this.c, k6Var.c) && this.e.equals(k6Var.e) && io.sentry.config.a.t(this.f, k6Var.f) && this.g == k6Var.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("trace_id");
        this.a.serialize(cVar, u0Var);
        cVar.q("span_id");
        this.b.serialize(cVar, u0Var);
        m6 m6Var = this.c;
        if (m6Var != null) {
            cVar.q("parent_span_id");
            m6Var.serialize(cVar, u0Var);
        }
        cVar.q("op");
        cVar.z(this.e);
        if (this.f != null) {
            cVar.q(PackageListMetaDataDTO.KEY_DESCRIPTION);
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("status");
            cVar.w(u0Var, this.g);
        }
        if (this.i != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            cVar.w(u0Var, this.i);
        }
        if (!this.h.isEmpty()) {
            cVar.q("tags");
            cVar.w(u0Var, this.h);
        }
        if (!this.j.isEmpty()) {
            cVar.q("data");
            cVar.w(u0Var, this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.k, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }

    public k6(io.sentry.protocol.v vVar, m6 m6Var, m6 m6Var2, String str, String str2, p6 p6Var, SpanStatus spanStatus, String str3) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.j = new ConcurrentHashMap();
        this.l = Instrumenter.SENTRY;
        this.n = new f2(9, (byte) 0);
        this.o = io.sentry.protocol.v.b;
        io.sentry.config.a.W(vVar, "traceId is required");
        this.a = vVar;
        io.sentry.config.a.W(m6Var, "spanId is required");
        this.b = m6Var;
        io.sentry.config.a.W(str, "operation is required");
        this.e = str;
        this.c = m6Var2;
        this.f = str2;
        this.g = spanStatus;
        this.i = str3;
        a(p6Var);
        io.sentry.util.thread.a threadChecker = h4.b().m().getThreadChecker();
        this.j.put("thread.id", String.valueOf(threadChecker.b()));
        this.j.put("thread.name", threadChecker.a());
    }

    public k6(k6 k6Var) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.j = new ConcurrentHashMap();
        this.l = Instrumenter.SENTRY;
        this.n = new f2(9, (byte) 0);
        this.o = io.sentry.protocol.v.b;
        this.a = k6Var.a;
        this.b = k6Var.b;
        this.c = k6Var.c;
        a(k6Var.d);
        this.e = k6Var.e;
        this.f = k6Var.f;
        this.g = k6Var.g;
        ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q(k6Var.h);
        if (concurrentHashMapQ != null) {
            this.h = concurrentHashMapQ;
        }
        ConcurrentHashMap concurrentHashMapQ2 = io.sentry.config.a.Q(k6Var.k);
        if (concurrentHashMapQ2 != null) {
            this.k = concurrentHashMapQ2;
        }
        this.m = k6Var.m;
        ConcurrentHashMap concurrentHashMapQ3 = io.sentry.config.a.Q(k6Var.j);
        if (concurrentHashMapQ3 != null) {
            this.j = concurrentHashMapQ3;
        }
    }
}
