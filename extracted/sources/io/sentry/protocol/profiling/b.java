package io.sentry.protocol.profiling;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g2 {
    public double a;
    public int b;
    public String c;
    public HashMap d;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("timestamp");
        cVar.w(u0Var, BigDecimal.valueOf(this.a).setScale(6, RoundingMode.DOWN));
        cVar.q("stack_id");
        cVar.w(u0Var, Integer.valueOf(this.b));
        if (this.c != null) {
            cVar.q("thread_id");
            cVar.w(u0Var, this.c);
        }
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.d, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
