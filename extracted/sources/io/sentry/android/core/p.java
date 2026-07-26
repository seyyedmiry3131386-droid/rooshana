package io.sentry.android.core;

import io.sentry.SentryLevel;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements io.sentry.util.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ SentryAndroidOptions b;

    public /* synthetic */ p(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.a = i;
        this.b = sentryAndroidOptions;
    }

    @Override // io.sentry.util.d
    public Object c() {
        int i = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (i) {
            case 0:
                return sentryAndroidOptions.getExecutorService();
            case 1:
                List list = io.sentry.android.core.cache.b.k;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                boolean z = false;
                if (outboxPath != null) {
                    File file = new File(outboxPath, "startup_crash");
                    try {
                        boolean zExists = file.exists();
                        if (zExists && !file.delete()) {
                            sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                        }
                        z = zExists;
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
                    }
                    break;
                } else {
                    sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                }
                return Boolean.valueOf(z);
            default:
                return sentryAndroidOptions.getExecutorService();
        }
    }
}
