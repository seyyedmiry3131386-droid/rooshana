package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhu;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlt;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yo9 {
    public static volatile yo9 h;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public final String f;
    public volatile en9 g;

    public yo9(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ex(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        try {
            if (zzlt.zza(context, "google_app_id", zzhu.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, yo9.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f = null;
                    this.e = true;
                    t0.m("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f = "fa";
        c(new co9(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            t0.m("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b92(this));
        }
    }

    public static yo9 e(Context context, Bundle bundle) {
        rq4.n(context);
        if (h == null) {
            synchronized (yo9.class) {
                try {
                    if (h == null) {
                        h = new yo9(context, bundle);
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final Map a(String str, String str2, boolean z) {
        bn9 bn9Var = new bn9();
        c(new un9(this, str, str2, z, bn9Var));
        Bundle bundleL = bn9Var.L(5000L);
        if (bundleL == null || bundleL.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleL.size());
        for (String str3 : bundleL.keySet()) {
            Object obj = bundleL.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        bn9 bn9Var = new bn9();
        c(new co9(this, str, bn9Var));
        Integer num = (Integer) bn9.m0(bn9Var.L(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(po9 po9Var) {
        this.a.execute(po9Var);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            t0.n("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new vn9(this, exc));
        }
        t0.n("FA", "Error with data collection. Data lost.", exc);
    }

    public final void f(zzjp zzjpVar) {
        qo9 qo9Var = new qo9(zzjpVar);
        if (this.g != null) {
            try {
                this.g.setEventInterceptor(qo9Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                t0.m("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        c(new vn9(this, qo9Var));
    }

    public final void g(zzjq zzjqVar) {
        rq4.n(zzjqVar);
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (zzjqVar.equals(((Pair) arrayList.get(i)).first)) {
                        t0.m("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ro9 ro9Var = new ro9(zzjqVar);
            arrayList.add(new Pair(zzjqVar, ro9Var));
            if (this.g != null) {
                try {
                    this.g.registerOnMeasurementEventListener(ro9Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    t0.m("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c(new no9(this, ro9Var, 0));
        }
    }

    public final void h(zzjq zzjqVar) {
        Pair pair;
        rq4.n(zzjqVar);
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            int i = 0;
            while (true) {
                try {
                    if (i >= arrayList.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzjqVar.equals(((Pair) arrayList.get(i)).first)) {
                            pair = (Pair) arrayList.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                t0.m("FA", "OnEventListener had not been registered.");
                return;
            }
            arrayList.remove(pair);
            ro9 ro9Var = (ro9) pair.second;
            if (this.g != null) {
                try {
                    this.g.unregisterOnMeasurementEventListener(ro9Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    t0.m("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c(new no9(this, ro9Var, 1));
        }
    }

    public final List i(String str, String str2) {
        bn9 bn9Var = new bn9();
        c(new wn9(this, str, str2, bn9Var));
        List list = (List) bn9.m0(bn9Var.L(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final long j() {
        bn9 bn9Var = new bn9();
        c(new fo9(this, bn9Var, 2));
        Long l = (Long) bn9.m0(bn9Var.L(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.d + 1;
        this.d = i;
        return jNextLong + ((long) i);
    }
}
