package androidx.compose.foundation.layout;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class WindowInsetsAnimationCancelledException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
