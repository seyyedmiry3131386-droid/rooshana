package io.sentry.protocol.profiling;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g2 {
    public String a;
    public int b;
    public HashMap c;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
            cVar.w(u0Var, this.a);
        }
        cVar.q("priority");
        cVar.w(u0Var, Integer.valueOf(this.b));
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.c, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
