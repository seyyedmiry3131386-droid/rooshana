package io.sentry.exception;

import io.sentry.config.a;
import io.sentry.protocol.n;

/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionMechanismException extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;
    public final n a;
    public final Throwable b;
    public final Thread c;
    public final boolean d;

    public ExceptionMechanismException(n nVar, Throwable th, Thread thread, boolean z) {
        this.a = nVar;
        a.W(th, "Throwable is required.");
        this.b = th;
        this.c = thread;
        this.d = z;
    }
}
