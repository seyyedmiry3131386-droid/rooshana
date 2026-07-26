package io.sentry.android.replay.util;

import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {
    public final String a;
    public final /* synthetic */ Runnable b;

    public e(Runnable runnable, String str) {
        js3.p(str, "taskName");
        js3.p(runnable, "delegate");
        this.a = str;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
