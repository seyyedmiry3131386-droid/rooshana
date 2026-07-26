package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.ad2;
import defpackage.b92;
import defpackage.bd2;
import defpackage.bf8;
import defpackage.bn6;
import defpackage.da8;
import defpackage.do3;
import defpackage.eq;
import defpackage.fb7;
import defpackage.jx9;
import defpackage.ko9;
import defpackage.kw9;
import defpackage.l68;
import defpackage.md8;
import defpackage.oh5;
import defpackage.on;
import defpackage.oo8;
import defpackage.ox9;
import defpackage.py0;
import defpackage.qn6;
import defpackage.rq4;
import defpackage.ry;
import defpackage.t15;
import defpackage.te;
import defpackage.tg1;
import defpackage.ur4;
import defpackage.wn5;
import defpackage.wv;
import defpackage.xc2;
import defpackage.yd;
import defpackage.z21;
import defpackage.z67;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static t15 l;
    public static ScheduledThreadPoolExecutor n;
    public final xc2 a;
    public final FirebaseInstanceIdInternal b;
    public final Context c;
    public final on d;
    public final bn6 e;
    public final ry f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final z21 i;
    public boolean j;
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static qn6 m = new py0(5);

    public FirebaseMessaging(xc2 xc2Var, FirebaseInstanceIdInternal firebaseInstanceIdInternal, qn6 qn6Var, qn6 qn6Var2, ad2 ad2Var, qn6 qn6Var3, da8 da8Var) {
        xc2Var.a();
        Context context = xc2Var.a;
        final z21 z21Var = new z21();
        final int i = 0;
        z21Var.b = 0;
        z21Var.c = context;
        xc2Var.a();
        fb7 fb7Var = new fb7(xc2Var.a);
        final on onVar = new on();
        onVar.a = xc2Var;
        onVar.b = z21Var;
        onVar.c = fb7Var;
        onVar.d = qn6Var;
        onVar.e = qn6Var2;
        onVar.f = ad2Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new oh5("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new oh5("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new oh5("Firebase-Messaging-File-Io"));
        this.j = false;
        m = qn6Var3;
        this.a = xc2Var;
        this.b = firebaseInstanceIdInternal;
        this.f = new ry(this, da8Var);
        xc2Var.a();
        final Context context2 = xc2Var.a;
        this.c = context2;
        b92 b92Var = new b92();
        this.i = z21Var;
        this.d = onVar;
        this.e = new bn6(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        xc2Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(b92Var);
        } else {
            t0.m("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new bd2(this, i));
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: cd2
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.b;
                if (firebaseMessaging.f.m()) {
                    FirebaseInstanceIdInternal firebaseInstanceIdInternal2 = firebaseMessaging.b;
                    if (firebaseInstanceIdInternal2 != null) {
                        firebaseInstanceIdInternal2.getToken();
                    } else if (firebaseMessaging.j(firebaseMessaging.d())) {
                        synchronized (firebaseMessaging) {
                            if (!firebaseMessaging.j) {
                                firebaseMessaging.i(0L);
                            }
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                ox9 ox9VarA;
                int i3;
                switch (i) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.b;
                        Context context3 = firebaseMessaging.c;
                        te.C(context3);
                        on onVar2 = firebaseMessaging.d;
                        boolean zH = firebaseMessaging.h();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesD0 = at2.d0(context3);
                            if (!sharedPreferencesD0.contains("proxy_retention") || sharedPreferencesD0.getBoolean("proxy_retention", false) != zH) {
                                fb7 fb7Var2 = (fb7) onVar2.c;
                                if (fb7Var2.c.v() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zH);
                                    jx9 jx9VarZ = jx9.z(fb7Var2.b);
                                    synchronized (jx9VarZ) {
                                        i3 = jx9VarZ.a;
                                        jx9VarZ.a = i3 + 1;
                                    }
                                    ox9VarA = jx9VarZ.A(new kw9(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    ox9 ox9Var = new ox9();
                                    ox9Var.n(iOException);
                                    ox9VarA = ox9Var;
                                }
                                ox9VarA.b(new qa(0), new nk3(4, context3, zH));
                            }
                        }
                        if (firebaseMessaging.h()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new oh5("Firebase-Messaging-Topics-Io"));
        int i3 = oo8.j;
        z67.c(scheduledThreadPoolExecutor2, new Callable() { // from class: no8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                mo8 mo8Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                z21 z21Var2 = z21Var;
                on onVar2 = onVar;
                synchronized (mo8.class) {
                    try {
                        WeakReference weakReference = mo8.d;
                        mo8Var = weakReference != null ? (mo8) weakReference.get() : null;
                        if (mo8Var == null) {
                            mo8 mo8Var2 = new mo8(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            mo8Var2.b();
                            mo8.d = new WeakReference(mo8Var2);
                            mo8Var = mo8Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new oo8(firebaseMessaging, z21Var2, mo8Var, onVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).b(scheduledThreadPoolExecutor, new bd2(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: cd2
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.b;
                if (firebaseMessaging.f.m()) {
                    FirebaseInstanceIdInternal firebaseInstanceIdInternal2 = firebaseMessaging.b;
                    if (firebaseInstanceIdInternal2 != null) {
                        firebaseInstanceIdInternal2.getToken();
                    } else if (firebaseMessaging.j(firebaseMessaging.d())) {
                        synchronized (firebaseMessaging) {
                            if (!firebaseMessaging.j) {
                                firebaseMessaging.i(0L);
                            }
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                ox9 ox9VarA;
                int i32;
                switch (i2) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.b;
                        Context context3 = firebaseMessaging.c;
                        te.C(context3);
                        on onVar2 = firebaseMessaging.d;
                        boolean zH = firebaseMessaging.h();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesD0 = at2.d0(context3);
                            if (!sharedPreferencesD0.contains("proxy_retention") || sharedPreferencesD0.getBoolean("proxy_retention", false) != zH) {
                                fb7 fb7Var2 = (fb7) onVar2.c;
                                if (fb7Var2.c.v() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zH);
                                    jx9 jx9VarZ = jx9.z(fb7Var2.b);
                                    synchronized (jx9VarZ) {
                                        i32 = jx9VarZ.a;
                                        jx9VarZ.a = i32 + 1;
                                    }
                                    ox9VarA = jx9VarZ.A(new kw9(i32, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    ox9 ox9Var = new ox9();
                                    ox9Var.n(iOException);
                                    ox9VarA = ox9Var;
                                }
                                ox9VarA.b(new qa(0), new nk3(4, context3, zH));
                            }
                        }
                        if (firebaseMessaging.h()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (n == null) {
                    n = new ScheduledThreadPoolExecutor(1, new oh5("TAG"));
                }
                n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized t15 c(Context context) {
        try {
            if (l == null) {
                l = new t15(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return l;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(xc2 xc2Var) {
        FirebaseMessaging firebaseMessaging;
        xc2Var.a();
        firebaseMessaging = (FirebaseMessaging) xc2Var.d.get(FirebaseMessaging.class);
        rq4.o(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        bf8 bf8VarK;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) z67.a(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        l68 l68VarD = d();
        if (!j(l68VarD)) {
            return l68VarD.a;
        }
        String strD = z21.d(this.a);
        bn6 bn6Var = this.e;
        synchronized (bn6Var) {
            bf8VarK = (bf8) ((wv) bn6Var.c).get(strD);
            if (bf8VarK == null) {
                on onVar = this.d;
                bf8VarK = onVar.i(onVar.w(z21.d((xc2) onVar.a), Marker.ANY_MARKER, new Bundle())).l(this.h, new tg1(this, strD, l68VarD, 2)).k((Executor) bn6Var.b, new ur4(bn6Var, strD, 15));
                ((wv) bn6Var.c).put(strD, bf8VarK);
            }
        }
        try {
            return (String) z67.a(bf8VarK);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final l68 d() {
        l68 l68VarB;
        t15 t15VarC = c(this.c);
        xc2 xc2Var = this.a;
        xc2Var.a();
        String strD = "[DEFAULT]".equals(xc2Var.b) ? "" : xc2Var.d();
        String strD2 = z21.d(this.a);
        synchronized (t15VarC) {
            l68VarB = l68.b(((SharedPreferences) t15VarC.b).getString(strD + "|T|" + strD2 + "|*", null));
        }
        return l68VarB;
    }

    public final void e() {
        ox9 ox9VarJ;
        int i;
        fb7 fb7Var = (fb7) this.d.c;
        if (fb7Var.c.v() >= 241100000) {
            jx9 jx9VarZ = jx9.z(fb7Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (jx9VarZ) {
                i = jx9VarZ.a;
                jx9VarZ.a = i + 1;
            }
            ox9VarJ = jx9VarZ.A(new kw9(i, 5, bundle, 1)).j(ko9.c, eq.N);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            ox9 ox9Var = new ox9();
            ox9Var.n(iOException);
            ox9VarJ = ox9Var;
        }
        ox9VarJ.b(this.g, new bd2(this, 2));
    }

    public final void f(String str) {
        xc2 xc2Var = this.a;
        xc2Var.a();
        if ("[DEFAULT]".equals(xc2Var.b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                xc2Var.a();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new do3(this.c, 2).z(intent);
        }
    }

    public final synchronized void g(boolean z) {
        this.j = z;
    }

    public final boolean h() {
        Context context = this.c;
        te.C(context);
        if (!te.E(context)) {
            return false;
        }
        xc2 xc2Var = this.a;
        xc2Var.a();
        if (xc2Var.d.get(yd.class) != null) {
            return true;
        }
        return wn5.z() && m != null;
    }

    public final synchronized void i(long j) {
        b(new md8(this, Math.min(Math.max(30L, 2 * j), k)), j);
        this.j = true;
    }

    public final boolean j(l68 l68Var) {
        if (l68Var != null) {
            return System.currentTimeMillis() > l68Var.c + l68.d || !this.i.b().equals(l68Var.b);
        }
        return true;
    }
}
