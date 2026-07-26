package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class m4 {
    public static final m4 c = new m4();
    public boolean a;
    public final AutoClosableReentrantLock b = new AutoClosableReentrantLock();

    public final void a() {
        r rVarA = this.b.a();
        try {
            if (!this.a) {
                this.a = true;
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
}
