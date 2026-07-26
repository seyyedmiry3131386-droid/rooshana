package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements g2 {
    public final String a;
    public final boolean b;
    public ConcurrentHashMap c;

    public h(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.config.a.t(this.a, hVar.a) && io.sentry.config.a.t(Boolean.valueOf(this.b), Boolean.valueOf(hVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("flag");
        cVar.z(this.a);
        cVar.q("result");
        cVar.A(this.b);
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.c, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
