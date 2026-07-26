package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.android.core.t0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class lu2 {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!c) {
                try {
                    PackageInfo packageInfoC = sg9.a(context).c(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    nu2.a(context);
                    if (packageInfoC == null || nu2.c(packageInfoC, false) || !nu2.c(packageInfoC, true)) {
                        b = false;
                    } else {
                        b = true;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    t0.n("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    c = true;
                }
            }
            return b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            c = true;
            throw th;
        }
    }
}
