package io.sentry.rrweb;

import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b implements g2 {
    public String c;
    public HashMap d;

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
        cVar.q("tag");
        cVar.z(this.c);
        cVar.q("payload");
        cVar.d();
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                cVar.q(str);
                cVar.w(u0Var, obj);
            }
        }
        cVar.n();
        cVar.n();
        cVar.n();
    }
}
