package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jg9 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public hg9 e;
    public boolean f;

    public jg9(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new oh5("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.d.isEmpty()) {
            try {
                hg9 hg9Var = this.e;
                if (hg9Var == null || !hg9Var.isBinderAlive()) {
                    if (!this.f) {
                        this.f = true;
                        try {
                            if (!b21.b().a(this.a, this.b, this, 65)) {
                                t0.d("FirebaseMessaging", "binding to the service failed");
                            }
                        } catch (SecurityException e) {
                            t0.e("FirebaseMessaging", "Exception while binding the service", e);
                        }
                        this.f = false;
                        ArrayDeque arrayDeque = this.d;
                        while (!arrayDeque.isEmpty()) {
                            ((ig9) arrayDeque.poll()).b.d(null);
                        }
                    }
                    return;
                }
                this.e.a((ig9) this.d.poll());
            } finally {
            }
        }
    }

    public final synchronized ox9 b(Intent intent) {
        ig9 ig9Var;
        ig9Var = new ig9(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        ig9Var.b.a.h(scheduledThreadPoolExecutor, new f09(8, scheduledThreadPoolExecutor.schedule(new kb8(4, ig9Var), 20L, TimeUnit.SECONDS)));
        this.d.add(ig9Var);
        a();
        return ig9Var.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof hg9) {
                this.e = (hg9) iBinder;
                a();
                return;
            }
            t0.d("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((ig9) arrayDeque.poll()).b.d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
