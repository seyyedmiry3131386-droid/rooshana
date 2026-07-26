package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum SentryReplayEvent$ReplayType implements g2 {
    SESSION,
    BUFFER;

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        ((io.sentry.internal.debugmeta.c) i3Var).z(name().toLowerCase(Locale.ROOT));
    }
}
