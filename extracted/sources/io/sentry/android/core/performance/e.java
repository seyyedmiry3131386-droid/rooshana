package io.sentry.android.core.performance;

import android.os.MessageQueue;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements MessageQueue.IdleHandler {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.a.c = SystemClock.uptimeMillis();
        g.a(this.a);
        return false;
    }
}
