package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import defpackage.au3;
import defpackage.du3;
import defpackage.yt3;
import defpackage.zt3;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public static final HashMap f = new HashMap();
    public du3 a;
    public zt3 b;
    public yt3 c;
    public boolean d = false;
    public final ArrayList e;

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        } else {
            this.e = new ArrayList();
        }
    }

    public final void a(boolean z) {
        if (this.c == null) {
            this.c = new yt3(this);
            zt3 zt3Var = this.b;
            if (zt3Var != null && z) {
                synchronized (zt3Var) {
                    try {
                        if (!zt3Var.c) {
                            zt3Var.c = true;
                            zt3Var.b.acquire(600000L);
                            zt3Var.a.release();
                        }
                    } finally {
                    }
                }
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.c = null;
                    ArrayList arrayList2 = this.e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.d) {
                        this.b.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        du3 du3Var = this.a;
        if (du3Var != null) {
            return du3Var.a();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a = new du3(this);
            this.b = null;
            return;
        }
        this.a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap map = f;
        zt3 zt3Var = (zt3) map.get(componentName);
        if (zt3Var == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            zt3Var = new zt3(this, componentName);
            map.put(componentName, zt3Var);
        }
        this.b = zt3Var;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.d = true;
                this.b.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.e == null) {
            return 2;
        }
        this.b.b();
        synchronized (this.e) {
            ArrayList arrayList = this.e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new au3(this, intent, i2));
            a(true);
        }
        return 3;
    }
}
