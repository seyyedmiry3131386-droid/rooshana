package io.sentry.clientreport;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g2 {
    public final Date a;
    public final ArrayList b;
    public HashMap c;

    public b(Date date, ArrayList arrayList) {
        this.a = date;
        this.b = arrayList;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("timestamp");
        cVar.z(io.sentry.config.a.H(this.a));
        cVar.q("discarded_events");
        cVar.w(u0Var, this.b);
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.c, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
