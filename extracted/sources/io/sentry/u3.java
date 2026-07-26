package io.sentry;

import defpackage.rm7;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements g2 {
    public Integer a;
    public List b;
    public HashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u3.class == obj.getClass()) {
            u3 u3Var = (u3) obj;
            if (io.sentry.config.a.t(this.a, u3Var.a) && io.sentry.config.a.t(this.b, u3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) cVar.b;
        if (this.a != null) {
            cVar.q("segment_id");
            cVar.y(this.a);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.c, str, cVar, str, u0Var);
            }
        }
        cVar.n();
        bVar.f = true;
        if (this.a != null) {
            bVar.D();
            bVar.b();
            bVar.a.append((CharSequence) "\n");
        }
        List list = this.b;
        if (list != null) {
            cVar.w(u0Var, list);
        }
        bVar.f = false;
    }
}
