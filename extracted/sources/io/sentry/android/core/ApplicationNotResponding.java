package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;
    public final Thread a;

    public ApplicationNotResponding(String str) {
        super(str);
        this.a = null;
    }

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        io.sentry.config.a.W(thread, "Thread must be provided.");
        this.a = thread;
        setStackTrace(thread.getStackTrace());
    }
}
