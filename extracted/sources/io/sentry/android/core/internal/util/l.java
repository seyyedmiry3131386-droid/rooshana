package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                atomicBoolean.set(i == 0);
                countDownLatch.countDown();
                break;
            default:
                io.sentry.android.replay.screenshot.f.d((io.sentry.android.replay.screenshot.f) this.b, (View) this.c, i);
                break;
        }
    }
}
