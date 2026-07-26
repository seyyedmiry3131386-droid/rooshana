package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g2 {
    public int a;
    public float b;
    public float c;
    public long d;
    public HashMap e;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("id");
        cVar.v(this.a);
        cVar.q("x");
        cVar.u(this.b);
        cVar.q("y");
        cVar.u(this.c);
        cVar.q("timeOffset");
        cVar.v(this.d);
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.e, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
