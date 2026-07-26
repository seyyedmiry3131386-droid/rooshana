package kotlinx.coroutines.internal;

import defpackage.w61;

/* JADX INFO: loaded from: classes3.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    public final transient w61 a;

    public DiagnosticCoroutineContextException(w61 w61Var) {
        this.a = w61Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}
