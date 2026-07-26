package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c implements g2 {
    public int d;
    public List e;
    public HashMap f;
    public HashMap g;

    public f() {
        super(RRWebIncrementalSnapshotEvent$IncrementalSource.TouchMove);
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("type");
        cVar.w(u0Var, this.a);
        cVar.q("timestamp");
        cVar.v(this.b);
        cVar.q("data");
        cVar.d();
        cVar.q("source");
        cVar.w(u0Var, this.c);
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            cVar.q("positions");
            cVar.w(u0Var, this.e);
        }
        cVar.q("pointerId");
        cVar.v(this.d);
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.g, str, cVar, str, u0Var);
            }
        }
        cVar.n();
        HashMap map2 = this.f;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                rm7.y(this.f, str2, cVar, str2, u0Var);
            }
        }
        cVar.n();
    }
}
