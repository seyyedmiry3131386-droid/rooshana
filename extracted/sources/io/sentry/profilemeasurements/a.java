package io.sentry.profilemeasurements;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.internal.debugmeta.c;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g2 {
    public ConcurrentHashMap a;
    public String b;
    public Collection c;

    public a(String str, AbstractCollection abstractCollection) {
        this.b = str;
        this.c = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.config.a.t(this.a, aVar.a) && this.b.equals(aVar.b) && new ArrayList(this.c).equals(new ArrayList(aVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        c cVar = (c) i3Var;
        cVar.d();
        cVar.q("unit");
        cVar.w(u0Var, this.b);
        cVar.q("values");
        cVar.w(u0Var, this.c);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.a, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
