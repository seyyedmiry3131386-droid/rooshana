package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements g2 {
    public List a;
    public AbstractMap b;
    public Boolean c;
    public SentryStackTrace$InstructionAddressAdjustment d;
    public ConcurrentHashMap e;

    public a0(List list) {
        this.a = list;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("frames");
            cVar.w(u0Var, this.a);
        }
        if (this.b != null) {
            cVar.q("registers");
            cVar.w(u0Var, this.b);
        }
        if (this.c != null) {
            cVar.q("snapshot");
            cVar.x(this.c);
        }
        if (this.d != null) {
            cVar.q("instruction_addr_adjustment");
            cVar.w(u0Var, this.d);
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.e, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
