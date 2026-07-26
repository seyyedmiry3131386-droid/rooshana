package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements g2 {
    public String a;
    public ConcurrentHashMap b;
    public Integer c;
    public Long d;
    public Object e;
    public ConcurrentHashMap f;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("cookies");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("headers");
            cVar.w(u0Var, this.b);
        }
        if (this.c != null) {
            cVar.q("status_code");
            cVar.w(u0Var, this.c);
        }
        if (this.d != null) {
            cVar.q("body_size");
            cVar.w(u0Var, this.d);
        }
        if (this.e != null) {
            cVar.q("data");
            cVar.w(u0Var, this.e);
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.f, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
