package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import defpackage.fv1;
import io.sentry.SentryLevel;
import io.sentry.c6;
import io.sentry.g5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements io.sentry.b0 {
    public final SentryAndroidOptions a;
    public final j0 b;
    public final fv1 c;
    public final boolean d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, j0 j0Var, boolean z) {
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.a = sentryAndroidOptions;
        this.b = j0Var;
        this.c = new fv1(3, 2000L);
        this.d = z;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.config.a.a("Screenshot");
        }
    }

    public final io.sentry.android.replay.viewhierarchy.f a(Activity activity2) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            View rootView = (activity2.getWindow() == null || activity2.getWindow().peekDecorView() == null || activity2.getWindow().peekDecorView().getRootView() == null) ? null : activity2.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.f fVarW = io.sentry.config.a.w(rootView, null, 0, sentryAndroidOptions.getScreenshot());
            io.sentry.android.replay.util.h.d(rootView, fVarW, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
            return fVarW;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to build view hierarchy", th);
            return null;
        }
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, io.sentry.h0 h0Var) {
        return c6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014d A[PHI: r10
      0x014d: PHI (r10v1 android.graphics.Bitmap) = (r10v0 android.graphics.Bitmap), (r10v0 android.graphics.Bitmap), (r10v2 android.graphics.Bitmap) binds: [B:29:0x0085, B:30:0x0087, B:86:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // io.sentry.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.w4 d(io.sentry.w4 r15, io.sentry.h0 r16) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.d(io.sentry.w4, io.sentry.h0):io.sentry.w4");
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, io.sentry.h0 h0Var) {
        return d0Var;
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        return g5Var;
    }
}
