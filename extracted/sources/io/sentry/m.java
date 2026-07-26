package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.hints.EventDropReason;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements b0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public m(b6 b6Var) {
        this.a = 1;
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.c = b6Var;
    }

    public void a(k4 k4Var) {
        io.sentry.protocol.e eVar = k4Var.b;
        if (eVar.h() == null) {
            eVar.t(new io.sentry.protocol.x());
        }
        io.sentry.protocol.x xVarH = eVar.h();
        if (xVarH != null && xVarH.a == null && xVarH.b == null) {
            xVarH.a = (String) this.c;
            xVarH.b = (String) this.b;
        }
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, h0 h0Var) {
        int i = this.a;
        return c6Var;
    }

    @Override // io.sentry.b0
    public final w4 d(w4 w4Var, h0 h0Var) {
        io.sentry.protocol.u uVarF;
        String str;
        Long l;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj2;
                if (s6.class.isInstance(h0Var.b("sentry:typeCheckHint")) && (uVarF = w4Var.f()) != null && (str = uVarF.a) != null && (l = uVarF.d) != null) {
                    Long l2 = (Long) map.get(str);
                    if (l2 == null || l2.equals(l)) {
                        map.put(str, l);
                    } else {
                        ((b6) obj).getLogger().i(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", w4Var.a);
                        h0Var.d(EventDropReason.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                    }
                }
                break;
            case 1:
                Map map2 = (Map) obj2;
                b6 b6Var = (b6) obj;
                if (b6Var.isEnableDeduplication()) {
                    Throwable thA = w4Var.a();
                    if (thA != null) {
                        if (!map2.containsKey(thA)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable cause = thA; cause.getCause() != null; cause = cause.getCause()) {
                                arrayList.add(cause.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                }
                            }
                            map2.put(thA, null);
                        }
                        b6Var.getLogger().i(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", w4Var.a);
                    }
                } else {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Event deduplication is disabled.", new Object[0]);
                }
                break;
            default:
                a(w4Var);
                break;
        }
        return w4Var;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, h0 h0Var) {
        switch (this.a) {
            default:
                a(d0Var);
            case 0:
            case 1:
                return d0Var;
        }
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        int i = this.a;
        return g5Var;
    }

    public m() {
        this.a = 2;
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.b = property;
        this.c = property2;
    }

    public m(SentryAndroidOptions sentryAndroidOptions) {
        this.a = 0;
        this.b = DesugarCollections.synchronizedMap(new HashMap());
        this.c = sentryAndroidOptions;
    }
}
