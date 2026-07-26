package io.sentry.android.core;

import android.os.Debug;
import io.sentry.k3;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements io.sentry.y0 {
    @Override // io.sentry.y0
    public final void a(k3 k3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        k3Var.b = Long.valueOf(jFreeMemory);
        k3Var.c = Long.valueOf(nativeHeapSize);
    }

    @Override // io.sentry.y0
    public final void c() {
    }
}
