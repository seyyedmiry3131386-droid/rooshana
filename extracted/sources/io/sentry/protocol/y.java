package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.SpanStatus;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.j6;
import io.sentry.k6;
import io.sentry.m6;
import io.sentry.u0;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements g2 {
    public final Double a;
    public final Double b;
    public final v c;
    public final m6 d;
    public final m6 e;
    public final String f;
    public final String g;
    public final SpanStatus h;
    public final String i;
    public final Map j;
    public Map k;
    public final Map l;
    public ConcurrentHashMap m;

    public y(Double d, Double d2, v vVar, m6 m6Var, m6 m6Var2, String str, String str2, SpanStatus spanStatus, String str3, Map map, Map map2, Map map3) {
        this.a = d;
        this.b = d2;
        this.c = vVar;
        this.d = m6Var;
        this.e = m6Var2;
        this.f = str;
        this.g = str2;
        this.h = spanStatus;
        this.i = str3;
        this.j = map;
        this.l = map2;
        this.k = map3;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        cVar.w(u0Var, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.b;
        if (d != null) {
            cVar.q("timestamp");
            cVar.w(u0Var, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        cVar.q("trace_id");
        cVar.w(u0Var, this.c);
        cVar.q("span_id");
        cVar.w(u0Var, this.d);
        m6 m6Var = this.e;
        if (m6Var != null) {
            cVar.q("parent_span_id");
            cVar.w(u0Var, m6Var);
        }
        cVar.q("op");
        cVar.z(this.f);
        String str = this.g;
        if (str != null) {
            cVar.q(PackageListMetaDataDTO.KEY_DESCRIPTION);
            cVar.z(str);
        }
        SpanStatus spanStatus = this.h;
        if (spanStatus != null) {
            cVar.q("status");
            cVar.w(u0Var, spanStatus);
        }
        String str2 = this.i;
        if (str2 != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            cVar.w(u0Var, str2);
        }
        Map map = this.j;
        if (!map.isEmpty()) {
            cVar.q("tags");
            cVar.w(u0Var, map);
        }
        if (this.k != null) {
            cVar.q("data");
            cVar.w(u0Var, this.k);
        }
        Map map2 = this.l;
        if (!map2.isEmpty()) {
            cVar.q("measurements");
            cVar.w(u0Var, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.m;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.m, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }

    public y(j6 j6Var) {
        ConcurrentHashMap concurrentHashMap = j6Var.k;
        k6 k6Var = j6Var.c;
        this.g = k6Var.f;
        this.f = k6Var.e;
        this.d = k6Var.b;
        this.e = k6Var.c;
        this.c = k6Var.a;
        this.h = k6Var.g;
        this.i = k6Var.i;
        ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q(k6Var.h);
        this.j = concurrentHashMapQ == null ? new ConcurrentHashMap() : concurrentHashMapQ;
        ConcurrentHashMap concurrentHashMapQ2 = io.sentry.config.a.Q(j6Var.l);
        this.l = concurrentHashMapQ2 == null ? new ConcurrentHashMap() : concurrentHashMapQ2;
        this.b = j6Var.b == null ? null : Double.valueOf(j6Var.a.c(r2) / 1.0E9d);
        this.a = Double.valueOf(j6Var.a.d() / 1.0E9d);
        this.k = concurrentHashMap;
        k6Var.n.i();
    }
}
