package io.sentry.clientreport;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import ir.mservices.market.version2.webapi.responsedto.LayoutPageDTO;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g2 {
    public final String a;
    public final String b;
    public final Long c;
    public HashMap d;

    public d(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("reason");
        cVar.z(this.a);
        cVar.q(LayoutPageDTO.Type.CATEGORY);
        cVar.z(this.b);
        cVar.q("quantity");
        cVar.y(this.c);
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.d, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.a + "', category='" + this.b + "', quantity=" + this.c + '}';
    }
}
