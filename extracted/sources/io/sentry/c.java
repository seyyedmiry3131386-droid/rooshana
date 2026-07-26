package io.sentry;

import defpackage.mi;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final mi i = new mi(12);
    public final ConcurrentHashMap a;
    public final AutoClosableReentrantLock b;
    public Double c;
    public Double d;
    public final String e;
    public boolean f;
    public final boolean g;
    public final u0 h;

    public c(u0 u0Var) {
        this(new ConcurrentHashMap(), null, null, null, false, u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.c a(io.sentry.u0 r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.c.a(io.sentry.u0, java.lang.String):io.sentry.c");
    }

    public static String c(Double d) {
        if (io.sentry.config.a.O(d, false)) {
            return ((DecimalFormat) i.get()).format(d);
        }
        return null;
    }

    public final String b(String str) {
        return (String) this.a.get(str);
    }

    public final void d(String str, String str2) {
        if (this.f) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void e(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, b6 b6Var, p6 p6Var, String str, TransactionNameSource transactionNameSource) {
        d("sentry-trace_id", vVar.toString());
        d("sentry-public_key", b6Var.retrieveParsedDsn().b);
        d("sentry-release", b6Var.getRelease());
        d("sentry-environment", b6Var.getEnvironment());
        if (transactionNameSource == null || TransactionNameSource.URL.equals(transactionNameSource)) {
            str = null;
        }
        d("sentry-transaction", str);
        if (vVar2 != null && !io.sentry.protocol.v.b.equals(vVar2)) {
            d("sentry-replay_id", vVar2.toString());
        }
        d("sentry-org_id", b6Var.getEffectiveOrgId());
        Double d = p6Var == null ? null : p6Var.b;
        if (this.f) {
            this.c = d;
        }
        Boolean bool = p6Var == null ? null : p6Var.a;
        d("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = p6Var != null ? p6Var.c : null;
        if (this.f) {
            this.d = d2;
        }
    }

    public final n6 f() {
        String strB = b("sentry-trace_id");
        String strB2 = b("sentry-replay_id");
        String strB3 = b("sentry-public_key");
        if (strB == null || strB3 == null) {
            return null;
        }
        n6 n6Var = new n6(new io.sentry.protocol.v(strB), strB3, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-transaction"), c(this.c), b("sentry-sampled"), strB2 != null ? new io.sentry.protocol.v(strB2) : null, c(this.d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        r rVarA = this.b.a();
        try {
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            rVarA.close();
            n6Var.k = concurrentHashMap;
            return n6Var;
        } finally {
        }
    }

    public c(ConcurrentHashMap concurrentHashMap, Double d, Double d2, String str, boolean z, u0 u0Var) {
        this.b = new AutoClosableReentrantLock();
        this.a = concurrentHashMap;
        this.c = d;
        this.d = d2;
        this.h = u0Var;
        this.e = str;
        this.f = true;
        this.g = z;
    }
}
