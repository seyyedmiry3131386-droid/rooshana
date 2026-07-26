package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.e5;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements g2 {
    public String a;
    public String b;
    public CopyOnWriteArraySet c;
    public CopyOnWriteArraySet d;
    public HashMap e;

    public t(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.a.equals(tVar.a) && this.b.equals(tVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
        cVar.z(this.a);
        cVar.q("version");
        cVar.z(this.b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = e5.d().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = e5.d().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            cVar.q("packages");
            cVar.w(u0Var, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            cVar.q("integrations");
            cVar.w(u0Var, copyOnWriteArraySet2);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.e, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
