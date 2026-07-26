package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements g2 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public a0 e;
    public n f;
    public HashMap g;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("type");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("module");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("thread_id");
            cVar.y(this.d);
        }
        if (this.e != null) {
            cVar.q("stacktrace");
            cVar.w(u0Var, this.e);
        }
        if (this.f != null) {
            cVar.q("mechanism");
            cVar.w(u0Var, this.f);
        }
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.g, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
