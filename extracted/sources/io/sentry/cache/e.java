package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b6;
import io.sentry.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements v0 {
    public final b6 a;

    public e(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.a, ".options-cache", str);
    }

    public final void b(Object obj, String str) {
        a.d(this.a, obj, ".options-cache", str);
    }
}
