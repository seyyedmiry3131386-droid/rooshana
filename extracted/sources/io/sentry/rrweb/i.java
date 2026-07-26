package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends b implements g2 {
    public String c;
    public String d;
    public String e;
    public double f;
    public double g;
    public ConcurrentHashMap h;
    public HashMap i;
    public ConcurrentHashMap j;
    public ConcurrentHashMap k;

    public i() {
        super(RRWebEventType.Custom);
        this.c = "performanceSpan";
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
        if (this.d != null) {
            cVar.q("op");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q(PackageListMetaDataDTO.KEY_DESCRIPTION);
            cVar.z(this.e);
        }
        cVar.q("startTimestamp");
        cVar.w(u0Var, BigDecimal.valueOf(this.f));
        cVar.q("endTimestamp");
        cVar.w(u0Var, BigDecimal.valueOf(this.g));
        if (this.h != null) {
            cVar.q("data");
            cVar.w(u0Var, this.h);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.j, k, cVar, k, u0Var);
            }
        }
        cVar.n();
        ConcurrentHashMap concurrentHashMap2 = this.k;
        if (concurrentHashMap2 != null) {
            for (K k2 : concurrentHashMap2.keySet()) {
                rm7.z(this.k, k2, cVar, k2, u0Var);
            }
        }
        cVar.n();
        HashMap map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.i, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
