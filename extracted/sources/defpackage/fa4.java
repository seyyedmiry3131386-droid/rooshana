package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fa4 {
    public static final ea4 c = new ea4(Object.class, Object.class, Object.class, Collections.singletonList(new yb1(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new th0(20), null)), null);
    public final wv a = new wv(0);
    public final AtomicReference b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, ea4 ea4Var) {
        synchronized (this.a) {
            wv wvVar = this.a;
            j95 j95Var = new j95(cls, cls2, cls3);
            if (ea4Var == null) {
                ea4Var = c;
            }
            wvVar.put(j95Var, ea4Var);
        }
    }
}
