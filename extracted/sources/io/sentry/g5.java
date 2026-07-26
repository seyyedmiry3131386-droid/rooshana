package io.sentry;

import defpackage.rm7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g5 implements g2 {
    public final io.sentry.protocol.v a;
    public m6 b;
    public final Double c;
    public final String d;
    public final SentryLogLevel e;
    public Integer f;
    public Map g;
    public HashMap h;

    public g5(io.sentry.protocol.v vVar, Double d, String str, SentryLogLevel sentryLogLevel) {
        this.a = vVar;
        this.c = d;
        this.d = str;
        this.e = sentryLogLevel;
    }

    public final void a(String str, io.sentry.protocol.m mVar) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.put(str, mVar);
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("timestamp");
        cVar.w(u0Var, io.sentry.config.a.r(this.c));
        cVar.q("trace_id");
        cVar.w(u0Var, this.a);
        if (this.b != null) {
            cVar.q("span_id");
            cVar.w(u0Var, this.b);
        }
        cVar.q("body");
        cVar.z(this.d);
        cVar.q("level");
        cVar.w(u0Var, this.e);
        if (this.f != null) {
            cVar.q("severity_number");
            cVar.w(u0Var, this.f);
        }
        if (this.g != null) {
            cVar.q("attributes");
            cVar.w(u0Var, this.g);
        }
        HashMap map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.h, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
