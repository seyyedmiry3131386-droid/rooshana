package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fr9 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public volatile Map g;
    public q81 d = null;
    public volatile boolean e = true;
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();

    public fr9(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v3 fr9) = (r1v2 fr9), (r1v4 fr9) binds: [B:6:0x001c, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fr9 a(final android.content.ContentResolver r2, final android.net.Uri r3, final java.lang.Runnable r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            j$.util.concurrent.ConcurrentHashMap r0 = defpackage.fr9.i
            er9 r1 = new er9
            r1.<init>()
            java.lang.Object r2 = j$.util.concurrent.ConcurrentMap.EL.computeIfAbsent(r0, r3, r1)
            fr9 r2 = (defpackage.fr9) r2
            goto L2c
        L14:
            j$.util.concurrent.ConcurrentHashMap r0 = defpackage.fr9.i
            java.lang.Object r1 = r0.get(r3)
            fr9 r1 = (defpackage.fr9) r1
            if (r1 != 0) goto L2b
            fr9 r1 = new fr9
            r1.<init>(r2, r3, r4)
            java.lang.Object r2 = r0.putIfAbsent(r3, r1)
            fr9 r2 = (defpackage.fr9) r2
            if (r2 != 0) goto L2c
        L2b:
            r2 = r1
        L2c:
            boolean r3 = r2.e     // Catch: java.lang.SecurityException -> L4f
            if (r3 == 0) goto L4e
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L4f
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4a
            q81 r3 = new q81     // Catch: java.lang.Throwable -> L48
            r4 = 3
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L48
            android.content.ContentResolver r4 = r2.a     // Catch: java.lang.Throwable -> L48
            android.net.Uri r0 = r2.b     // Catch: java.lang.Throwable -> L48
            r1 = 0
            r4.registerContentObserver(r0, r1, r3)     // Catch: java.lang.Throwable -> L48
            r2.d = r3     // Catch: java.lang.Throwable -> L48
            r2.e = r1     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            return r2
        L4c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.SecurityException -> L4f
        L4e:
            return r2
        L4f:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr9.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):fr9");
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            fr9 fr9Var = (fr9) it.next();
            synchronized (fr9Var) {
                try {
                    if (fr9Var.e) {
                        fr9Var.e = false;
                    } else {
                        q81 q81Var = fr9Var.d;
                        if (q81Var != null) {
                            fr9Var.a.unregisterContentObserver(q81Var);
                            fr9Var.d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.g
            if (r0 != 0) goto L51
            java.lang.Object r1 = r5.f
            monitor-enter(r1)
            java.util.Map r0 = r5.g     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L4d
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2c
            t15 r2 = new t15     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
            r3 = 21
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
            java.lang.Object r2 = r2.r()     // Catch: java.lang.SecurityException -> L1b java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32
            goto L26
        L1b:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
            java.lang.Object r2 = r2.r()     // Catch: java.lang.Throwable -> L36
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
        L26:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
        L28:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2c
            goto L45
        L2c:
            r0 = move-exception
            goto L4f
        L2e:
            r2 = move-exception
            goto L49
        L30:
            r2 = move-exception
            goto L3b
        L32:
            r2 = move-exception
            goto L3b
        L34:
            r2 = move-exception
            goto L3b
        L36:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
            throw r2     // Catch: java.lang.Throwable -> L2e java.lang.IllegalStateException -> L30 android.database.sqlite.SQLiteException -> L32 java.lang.SecurityException -> L34
        L3b:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            io.sentry.android.core.t0.n(r3, r4, r2)     // Catch: java.lang.Throwable -> L2e
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2e
            goto L28
        L45:
            r5.g = r2     // Catch: java.lang.Throwable -> L2c
            r0 = r2
            goto L4d
        L49:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            goto L51
        L4f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L51:
            if (r0 == 0) goto L54
            return r0
        L54:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr9.b():java.util.Map");
    }
}
