package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements io.sentry.transport.f {
    public static final d a = new d();

    @Override // io.sentry.transport.f
    public long b() {
        return SystemClock.uptimeMillis();
    }
}
