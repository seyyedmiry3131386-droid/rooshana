package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements g2 {
    public final String a;
    public ConcurrentHashMap b;

    public f0(String str) {
        this.a = str;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        String str = this.a;
        if (str != null) {
            cVar.q("source");
            cVar.w(u0Var, str);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.b, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
