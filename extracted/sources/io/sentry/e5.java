package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 {
    public static volatile e5 c;
    public static final AutoClosableReentrantLock d = new AutoClosableReentrantLock();
    public static volatile Boolean e = null;
    public static final AutoClosableReentrantLock f = new AutoClosableReentrantLock();
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public static e5 d() {
        if (c == null) {
            r rVarA = d.a();
            try {
                if (c == null) {
                    c = new e5();
                }
                rVarA.close();
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return c;
    }

    public final void a(String str) {
        io.sentry.config.a.W(str, "integration is required.");
        this.a.add(str);
    }

    public final void b(String str, String str2) {
        this.b.add(new io.sentry.protocol.w(str, str2));
        r rVarA = f.a();
        try {
            e = null;
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(u0 u0Var) {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        r rVarA = f.a();
        try {
            boolean z = false;
            for (io.sentry.protocol.w wVar : this.b) {
                if (wVar.a.startsWith("maven:io.sentry:") && !"8.43.1".equalsIgnoreCase(wVar.b)) {
                    u0Var.i(SentryLevel.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", wVar.a, "8.43.1", wVar.b);
                    z = true;
                }
            }
            if (z) {
                SentryLevel sentryLevel = SentryLevel.ERROR;
                u0Var.i(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                u0Var.i(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                u0Var.i(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                u0Var.i(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            e = Boolean.valueOf(z);
            rVarA.close();
            return z;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
