package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 implements g2 {
    public io.sentry.protocol.v a;
    public m6 b;
    public Double c;
    public String d;
    public String e;
    public String f;
    public Double g;
    public Map h;
    public HashMap i;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("timestamp");
        cVar.w(u0Var, io.sentry.config.a.r(this.c));
        cVar.q("type");
        cVar.z(this.f);
        cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
        cVar.z(this.d);
        cVar.q(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        cVar.y(this.g);
        cVar.q("trace_id");
        cVar.w(u0Var, this.a);
        if (this.b != null) {
            cVar.q("span_id");
            cVar.w(u0Var, this.b);
        }
        if (this.e != null) {
            cVar.q("unit");
            cVar.w(u0Var, this.e);
        }
        if (this.h != null) {
            cVar.q("attributes");
            cVar.w(u0Var, this.h);
        }
        HashMap map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.i, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
