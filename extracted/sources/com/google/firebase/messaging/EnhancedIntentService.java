package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.cf8;
import defpackage.hg9;
import defpackage.ii;
import defpackage.j2;
import defpackage.jc9;
import defpackage.oh5;
import defpackage.ox9;
import defpackage.pj9;
import defpackage.qa;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    public static final /* synthetic */ int f = 0;
    public final ExecutorService a;
    public hg9 b;
    public final Object c;
    public int d;
    public int e;

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new oh5("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            jc9.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.b == null) {
                this.b = new hg9(new pj9(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        cf8 cf8Var = new cf8();
        this.a.execute(new ii(this, intentB, cf8Var, 9));
        ox9 ox9Var = cf8Var.a;
        if (ox9Var.e()) {
            a(intent);
            return 2;
        }
        ox9Var.h(new qa(0), new j2(this, intent, 17));
        return 3;
    }
}
