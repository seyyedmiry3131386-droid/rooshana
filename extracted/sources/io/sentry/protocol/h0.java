package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements g2 {
    public final String a;
    public final List b;
    public HashMap c;

    public h0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        String str = this.a;
        if (str != null) {
            cVar.q("rendering_system");
            cVar.z(str);
        }
        List list = this.b;
        if (list != null) {
            cVar.q("windows");
            cVar.w(u0Var, list);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str2 : map.keySet()) {
                rm7.y(this.c, str2, cVar, str2, u0Var);
            }
        }
        cVar.n();
    }
}
