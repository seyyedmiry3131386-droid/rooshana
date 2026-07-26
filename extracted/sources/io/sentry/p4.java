package io.sentry;

import defpackage.rm7;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 implements g2 {
    public final io.sentry.protocol.v a;
    public final io.sentry.protocol.t b;
    public final n6 c;
    public Date d;
    public HashMap e;

    public p4(io.sentry.protocol.v vVar, io.sentry.protocol.t tVar, n6 n6Var) {
        this.a = vVar;
        this.b = tVar;
        this.c = n6Var;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        io.sentry.protocol.v vVar = this.a;
        if (vVar != null) {
            cVar.q("event_id");
            cVar.w(u0Var, vVar);
        }
        io.sentry.protocol.t tVar = this.b;
        if (tVar != null) {
            cVar.q("sdk");
            cVar.w(u0Var, tVar);
        }
        n6 n6Var = this.c;
        if (n6Var != null) {
            cVar.q("trace");
            cVar.w(u0Var, n6Var);
        }
        if (this.d != null) {
            cVar.q("sent_at");
            cVar.w(u0Var, io.sentry.config.a.H(this.d));
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
