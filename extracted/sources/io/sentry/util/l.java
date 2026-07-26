package io.sentry.util;

import io.sentry.a1;
import io.sentry.b6;
import io.sentry.f2;
import io.sentry.protocol.v;
import io.sentry.v3;
import io.sentry.z3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements z3, v3 {
    public final /* synthetic */ b6 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, b6 b6Var) {
        this.b = obj;
        this.a = b6Var;
    }

    @Override // io.sentry.v3
    public void b(io.sentry.k kVar) {
        a1 a1Var = (a1) this.b;
        io.sentry.c cVar = (io.sentry.c) kVar.d;
        if (cVar.f) {
            io.sentry.k kVarW = a1Var.w();
            v vVarK = a1Var.k();
            cVar.d("sentry-trace_id", ((v) kVarW.b).toString());
            b6 b6Var = this.a;
            cVar.d("sentry-public_key", b6Var.retrieveParsedDsn().b);
            cVar.d("sentry-release", b6Var.getRelease());
            cVar.d("sentry-environment", b6Var.getEnvironment());
            if (!v.b.equals(vVarK)) {
                cVar.d("sentry-replay_id", vVarK.toString());
            }
            cVar.d("sentry-org_id", b6Var.getEffectiveOrgId());
            cVar.d("sentry-transaction", null);
            if (cVar.f) {
                cVar.c = null;
            }
            cVar.d("sentry-sampled", null);
            cVar.f = false;
        }
    }

    @Override // io.sentry.z3
    public void g(a1 a1Var) {
        ((f2) this.b).b = a1Var.F(new l(a1Var, this.a));
    }
}
