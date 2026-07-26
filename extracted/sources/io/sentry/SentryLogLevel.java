package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum SentryLogLevel implements g2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    SentryLogLevel(int i) {
        this.severityNumber = i;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        ((io.sentry.internal.debugmeta.c) i3Var).z(name().toLowerCase(Locale.ROOT));
    }
}
