package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.SentryLevel;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import ir.mservices.market.version2.webapi.responsedto.LayoutPageDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements g2 {
    public String c;
    public double d;
    public String e;
    public String f;
    public String g;
    public SentryLevel h;
    public ConcurrentHashMap i;
    public HashMap j;
    public ConcurrentHashMap k;
    public ConcurrentHashMap l;

    public a() {
        super(RRWebEventType.Custom);
        this.c = "breadcrumb";
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
        if (this.e != null) {
            cVar.q("type");
            cVar.z(this.e);
        }
        cVar.q("timestamp");
        cVar.w(u0Var, BigDecimal.valueOf(this.d));
        if (this.f != null) {
            cVar.q(LayoutPageDTO.Type.CATEGORY);
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("message");
            cVar.z(this.g);
        }
        if (this.h != null) {
            cVar.q("level");
            cVar.w(u0Var, this.h);
        }
        if (this.i != null) {
            cVar.q("data");
            cVar.w(u0Var, this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.k, k, cVar, k, u0Var);
            }
        }
        cVar.n();
        ConcurrentHashMap concurrentHashMap2 = this.l;
        if (concurrentHashMap2 != null) {
            for (K k2 : concurrentHashMap2.keySet()) {
                rm7.z(this.l, k2, cVar, k2, u0Var);
            }
        }
        cVar.n();
        HashMap map = this.j;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.j, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
