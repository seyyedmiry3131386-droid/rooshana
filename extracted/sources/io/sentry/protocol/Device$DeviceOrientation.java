package io.sentry.protocol;

import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum Device$DeviceOrientation implements g2 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        ((io.sentry.internal.debugmeta.c) i3Var).z(toString().toLowerCase(Locale.ROOT));
    }
}
