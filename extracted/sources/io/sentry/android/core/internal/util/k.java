package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.android.core.j0;
import io.sentry.u0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final Charset g = Charset.forName("UTF-8");
    public final Context a;
    public final j0 b;
    public final u0 c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public k(Context context, u0 u0Var, j0 j0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.config.a.W(j0Var, "The BuildInfoProvider is required.");
        this.b = j0Var;
        io.sentry.config.a.W(u0Var, "The Logger is required.");
        this.c = u0Var;
        this.d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.config.a.W(runtime, "The Runtime is required.");
        this.f = runtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.k.a():boolean");
    }
}
