package io.sentry.android.core.internal.util;

import android.os.Process;
import io.sentry.android.ndk.SentryNdk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f.b = Process.myTid();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }
}
