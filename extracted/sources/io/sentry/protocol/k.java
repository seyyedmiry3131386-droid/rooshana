package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements g2 {
    public String a;
    public String b;
    public String c;
    public ConcurrentHashMap d;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("city");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("country_code");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("region");
            cVar.z(this.c);
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.d, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
