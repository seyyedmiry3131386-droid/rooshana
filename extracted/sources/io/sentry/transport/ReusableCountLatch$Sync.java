package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class ReusableCountLatch$Sync extends AbstractQueuedSynchronizer {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = 5970133580157457018L;

    public ReusableCountLatch$Sync() {
        setState(0);
    }

    public static int a(ReusableCountLatch$Sync reusableCountLatch$Sync) {
        return reusableCountLatch$Sync.getState();
    }

    public static void b(ReusableCountLatch$Sync reusableCountLatch$Sync) {
        int state;
        do {
            state = reusableCountLatch$Sync.getState();
        } while (!reusableCountLatch$Sync.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i) {
        int state;
        int i2;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i2 = state - 1;
        } while (!compareAndSetState(state, i2));
        return i2 == 0;
    }
}
