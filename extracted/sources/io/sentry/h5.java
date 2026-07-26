package io.sentry;

import defpackage.rm7;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h5 implements g2 {
    public final List a;
    public HashMap b;

    public h5(List list) {
        this.a = list;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("items");
        cVar.w(u0Var, this.a);
        HashMap map = this.b;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.b, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
