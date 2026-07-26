package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class o6 {
    public final b6 a;

    public o6(b6 b6Var) {
        this.a = b6Var;
    }

    public final p6 a(io.sentry.internal.debugmeta.c cVar) {
        Double d = (Double) cVar.c;
        q6 q6Var = (q6) cVar.b;
        p6 p6Var = q6Var.d;
        if (p6Var != null) {
            return io.sentry.config.a.b(p6Var);
        }
        b6 b6Var = this.a;
        b6Var.getProfilesSampler();
        Double profilesSampleRate = b6Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        b6Var.getTracesSampler();
        p6 p6Var2 = q6Var.r;
        if (p6Var2 != null) {
            return io.sentry.config.a.b(p6Var2);
        }
        Double tracesSampleRate = b6Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, b6Var.getBackpressureMonitor().a()));
        if (dValueOf == null) {
            Boolean bool = Boolean.FALSE;
            return new p6(bool, null, d, bool, null);
        }
        boolean z = false;
        if (dValueOf.doubleValue() >= d.doubleValue()) {
            z = true;
        }
        return new p6(Boolean.valueOf(z), dValueOf, d, boolValueOf, profilesSampleRate);
    }
}
