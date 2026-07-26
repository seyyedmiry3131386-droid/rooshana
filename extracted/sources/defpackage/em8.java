package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes3.dex */
public final class em8 extends mf7 implements Runnable {
    public final long e;

    public em8(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.e = j;
    }

    @Override // kotlinx.coroutines.c
    public final String X() {
        return super.X() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.g(this.c);
        t(new TimeoutCancellationException("Timed out waiting for " + this.e + " ms", this));
    }
}
