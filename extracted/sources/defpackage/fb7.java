package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.cloudmessaging.zzd;
import io.sentry.android.core.t0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class fb7 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final fw7 a = new fw7(0);
    public final Context b;
    public final xr5 c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public zzd g;

    public fb7(Context context) {
        this.b = context;
        xr5 xr5Var = new xr5();
        xr5Var.b = 0;
        xr5Var.c = context;
        this.c = xr5Var;
        this.e = new Messenger(new ik9(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return Integer.toString(i2);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, tj9.a);
            }
            intent.putExtra("app", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ox9 a(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = b()
            cf8 r1 = new cf8
            r1.<init>()
            fw7 r2 = r6.a
            monitor-enter(r2)
            fw7 r3 = r6.a     // Catch: java.lang.Throwable -> Lc3
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            xr5 r3 = r6.c
            int r3 = r3.w()
            r4 = 2
            if (r3 != r4) goto L2b
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L30
        L2b:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L30:
            r2.putExtras(r7)
            android.content.Context r7 = r6.b
            c(r7, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "|ID|"
            r7.<init>(r3)
            r7.append(r0)
            java.lang.String r3 = "|"
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r7)
            java.lang.String r7 = "Rpc"
            r3 = 3
            boolean r7 = android.util.Log.isLoggable(r7, r3)
            if (r7 == 0) goto L66
            android.os.Bundle r7 = r2.getExtras()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "Sending "
            r3.concat(r7)
        L66:
            android.os.Messenger r7 = r6.e
            java.lang.String r3 = "google.messenger"
            r2.putExtra(r3, r7)
            android.os.Messenger r7 = r6.f
            if (r7 != 0) goto L75
            com.google.android.gms.cloudmessaging.zzd r7 = r6.g
            if (r7 == 0) goto L8e
        L75:
            android.os.Message r7 = android.os.Message.obtain()
            r7.obj = r2
            android.os.Messenger r3 = r6.f     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L83
            r3.send(r7)     // Catch: android.os.RemoteException -> L8e
            goto La1
        L83:
            com.google.android.gms.cloudmessaging.zzd r3 = r6.g     // Catch: android.os.RemoteException -> L8e
            android.os.Messenger r3 = r3.a     // Catch: android.os.RemoteException -> L8e
            r3.getClass()     // Catch: android.os.RemoteException -> L8e
            r3.send(r7)     // Catch: android.os.RemoteException -> L8e
            goto La1
        L8e:
            xr5 r7 = r6.c
            int r7 = r7.w()
            if (r7 != r4) goto L9c
            android.content.Context r7 = r6.b
            r7.sendBroadcast(r2)
            goto La1
        L9c:
            android.content.Context r7 = r6.b
            r7.startService(r2)
        La1:
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r6.d
            fp7 r2 = new fp7
            r3 = 16
            r2.<init>(r3, r1)
            r3 = 30
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r2, r3, r5)
            ox9 r2 = r1.a
            ko9 r3 = defpackage.ko9.c
            sk6 r4 = new sk6
            r5 = 23
            r4.<init>(r6, r0, r7, r5)
            r2.h(r3, r4)
            ox9 r7 = r1.a
            return r7
        Lc3:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.a(android.os.Bundle):ox9");
    }

    public final void d(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                cf8 cf8Var = (cf8) this.a.remove(str);
                if (cf8Var != null) {
                    cf8Var.b(bundle);
                    return;
                }
                t0.m("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
