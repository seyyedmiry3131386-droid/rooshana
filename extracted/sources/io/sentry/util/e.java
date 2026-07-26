package io.sentry.util;

import io.sentry.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final d b;
    public volatile Object a = null;
    public final AutoClosableReentrantLock c = new AutoClosableReentrantLock();

    public e(d dVar) {
        this.b = dVar;
    }

    public final Object a() {
        if (this.a == null) {
            r rVarA = this.c.a();
            try {
                if (this.a == null) {
                    this.a = this.b.c();
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
        return this.a;
    }

    public final void b() {
        r rVarA = this.c.a();
        try {
            this.a = null;
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

    public final void c(Object obj) {
        r rVarA = this.c.a();
        try {
            this.a = obj;
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
}
