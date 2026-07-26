package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements g2 {
    public String a;
    public Integer b;
    public Integer c;
    public Integer d;
    public HashMap e;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("sdk_name");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("version_major");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("version_minor");
            cVar.y(this.c);
        }
        if (this.d != null) {
            cVar.q("version_patchlevel");
            cVar.y(this.d);
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
