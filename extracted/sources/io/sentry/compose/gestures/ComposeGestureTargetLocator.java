package io.sentry.compose.gestures;

import defpackage.js3;
import io.sentry.compose.b;
import io.sentry.e5;
import io.sentry.internal.gestures.a;
import io.sentry.u0;
import io.sentry.util.AutoClosableReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeGestureTargetLocator implements a {
    public final u0 a;
    public volatile b b;
    public final AutoClosableReentrantLock c;

    public ComposeGestureTargetLocator(u0 u0Var) {
        js3.p(u0Var, "logger");
        this.a = u0Var;
        this.c = new AutoClosableReentrantLock();
        e5.d().b("maven:io.sentry:sentry-compose", "8.43.1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // io.sentry.internal.gestures.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.internal.gestures.b a(android.view.View r25, float r26, float r27, io.sentry.internal.gestures.UiElement$Type r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.compose.gestures.ComposeGestureTargetLocator.a(android.view.View, float, float, io.sentry.internal.gestures.UiElement$Type):io.sentry.internal.gestures.b");
    }
}
