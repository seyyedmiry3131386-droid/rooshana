package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import io.sentry.b6;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements io.sentry.transport.h {
    public static final j0 b = new j0();
    public Object a;

    public j0() {
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // io.sentry.transport.h
    public boolean E() {
        int i = v.a[((b6) this.a).getConnectionStatusProvider().A0().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public Activity a() {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean b() {
        /*
            r4 = this;
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            goto L18
        L15:
            r0 = move-exception
            goto L9d
        L18:
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L15
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = "unknown"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "goldfish"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "ranchu"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L15
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "Emulator"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "Genymotion"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "sdk_google"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "simulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L95
            goto L97
        L95:
            r0 = 0
            goto L98
        L97:
            r0 = 1
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L15
            return r0
        L9d:
            java.lang.Object r1 = r4.a
            io.sentry.u0 r1 = (io.sentry.u0) r1
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR
            java.lang.String r3 = "Error checking whether application is running in an emulator."
            r1.f(r2, r3, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.j0.b():java.lang.Boolean");
    }

    public void c(Activity activity2) {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference == null || weakReference.get() != activity2) {
            this.a = new WeakReference(activity2);
        }
    }

    public j0(io.sentry.u0 u0Var) {
        io.sentry.config.a.W(u0Var, "The ILogger object is required.");
        this.a = u0Var;
    }
}
