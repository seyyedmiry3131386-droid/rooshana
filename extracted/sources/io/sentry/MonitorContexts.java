package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class MonitorContexts extends ConcurrentHashMap<String, Object> implements g2 {
    private static final long serialVersionUID = 3987329379811822556L;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                cVar.q(str);
                cVar.w(u0Var, obj);
            }
        }
        cVar.n();
    }
}
