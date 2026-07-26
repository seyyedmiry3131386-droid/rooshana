package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements g2 {
    public final String a;
    public final String b;
    public HashMap c;

    public w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.a, wVar.a) && Objects.equals(this.b, wVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
        cVar.z(this.a);
        cVar.q("version");
        cVar.z(this.b);
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.c, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
