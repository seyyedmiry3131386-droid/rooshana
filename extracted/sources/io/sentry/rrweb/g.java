package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b implements g2 {
    public String c;
    public int d;
    public int e;
    public HashMap f;

    public g() {
        super(RRWebEventType.Meta);
        this.c = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.d == gVar.d && this.e == gVar.e && io.sentry.config.a.t(this.c, gVar.c);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e)});
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
        cVar.q("href");
        cVar.z(this.c);
        cVar.q("height");
        cVar.v(this.d);
        cVar.q("width");
        cVar.v(this.e);
        HashMap map = this.f;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.f, str, cVar, str, u0Var);
            }
        }
        cVar.n();
        cVar.n();
    }
}
