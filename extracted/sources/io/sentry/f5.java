package io.sentry;

import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 implements g2 {
    public int a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public ConcurrentHashMap f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f5.class != obj.getClass()) {
            return false;
        }
        return io.sentry.config.a.t(this.b, ((f5) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("type");
        cVar.v(this.a);
        if (this.b != null) {
            cVar.q("address");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("package_name");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("class_name");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("thread_id");
            cVar.y(this.e);
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
