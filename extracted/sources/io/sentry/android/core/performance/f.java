package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.SystemClock;
import defpackage.kb8;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ g b;

    public f(g gVar, Handler handler) {
        this.b = gVar;
        this.a = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c = SystemClock.uptimeMillis();
        this.a.post(new kb8(17, this));
    }
}
