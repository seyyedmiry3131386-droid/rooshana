package androidx.paging;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class SingleRunner$CancelIsolatedRunnerException extends CancellationException {
    public final m a;

    public SingleRunner$CancelIsolatedRunnerException(m mVar) {
        super("Cancelled isolated runner");
        this.a = mVar;
    }
}
