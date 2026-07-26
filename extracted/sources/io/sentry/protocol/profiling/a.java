package io.sentry.protocol.profiling;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g2 {
    public List a = new ArrayList();
    public List b = new ArrayList();
    public List c = new ArrayList();
    public Map d = new HashMap();
    public ConcurrentHashMap e;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("samples");
        cVar.w(u0Var, this.a);
        cVar.q("stacks");
        cVar.w(u0Var, this.b);
        cVar.q("frames");
        cVar.w(u0Var, this.c);
        cVar.q("thread_metadata");
        cVar.w(u0Var, this.d);
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.e, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
