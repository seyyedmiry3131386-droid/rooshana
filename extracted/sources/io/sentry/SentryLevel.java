package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum SentryLevel implements g2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        ((io.sentry.internal.debugmeta.c) i3Var).z(name().toLowerCase(Locale.ROOT));
    }
}
