package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.android.core.t0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class xc2 {
    public static final Object j = new Object();
    public static final wv k = new wv(0);
    public final Context a;
    public final String b;
    public final dd2 c;
    public final ry0 d;
    public final d24 g;
    public final qn6 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    public xc2(Context context, String str, dd2 dd2Var) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        rq4.k(str);
        this.b = str;
        this.c = dd2Var;
        b30 b30Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                t0.m("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    t0.m("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            t0.m("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            t0.m("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ky0(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new ky0(1 == true ? 1 : 0, new FirebaseCommonRegistrar()));
        arrayList3.add(new ky0(1 == true ? 1 : 0, new ExecutorsRegistrar()));
        arrayList4.add(tx0.c(context, Context.class, new Class[0]));
        arrayList4.add(tx0.c(this, xc2.class, new Class[0]));
        arrayList4.add(tx0.c(dd2Var, dd2.class, new Class[0]));
        gv gvVar = new gv(7);
        if ((Build.VERSION.SDK_INT >= 24 ? jr9.v(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList4.add(tx0.c(b30Var, b30.class, new Class[0]));
        }
        ry0 ry0Var = new ry0(arrayList3, arrayList4, gvVar);
        this.d = ry0Var;
        Trace.endSection();
        this.g = new d24(new qy0(this, context, 2));
        this.h = ry0Var.c(we1.class);
        uc2 uc2Var = new uc2(this);
        a();
        if (this.e.get()) {
            w40.e.a.get();
        }
        this.i.add(uc2Var);
        Trace.endSection();
    }

    public static ArrayList b() {
        ArrayList arrayList;
        synchronized (j) {
            arrayList = new ArrayList(k.values());
        }
        return arrayList;
    }

    public static xc2 c() {
        xc2 xc2Var;
        synchronized (j) {
            try {
                xc2Var = (xc2) k.get("[DEFAULT]");
                if (xc2Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ul.n() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((we1) xc2Var.h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return xc2Var;
    }

    public static xc2 f(Context context, dd2 dd2Var) {
        xc2 xc2Var;
        AtomicReference atomicReference = vc2.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = vc2.a;
            if (atomicReference2.get() == null) {
                vc2 vc2Var = new vc2();
                while (true) {
                    if (atomicReference2.compareAndSet(null, vc2Var)) {
                        w40.b(application);
                        w40.e.a(vc2Var);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            wv wvVar = k;
            rq4.q("FirebaseApp name [DEFAULT] already exists!", !wvVar.containsKey("[DEFAULT]"));
            rq4.o(context, "Application context cannot be null.");
            xc2Var = new xc2(context, "[DEFAULT]", dd2Var);
            wvVar.put("[DEFAULT]", xc2Var);
        }
        xc2Var.e();
        return xc2Var;
    }

    public static void g(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    c();
                    return;
                }
                dd2 dd2VarA = dd2.a(context);
                if (dd2VarA == null) {
                    t0.m("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                } else {
                    f(context, dd2VarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        rq4.q("FirebaseApp was deleted", !this.f.get());
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append(Marker.ANY_NON_NULL_MARKER);
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? jr9.v(this.a) : true)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = wc2.b;
            if (atomicReference.get() == null) {
                wc2 wc2Var = new wc2(context);
                while (!atomicReference.compareAndSet(null, wc2Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(wc2Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        ry0 ry0Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) ry0Var.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (ry0Var) {
                    map = new HashMap((HashMap) ry0Var.a);
                }
                ry0Var.e(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((we1) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xc2)) {
            return false;
        }
        xc2 xc2Var = (xc2) obj;
        xc2Var.a();
        return this.b.equals(xc2Var.b);
    }

    public final boolean h() {
        boolean z;
        a();
        ia1 ia1Var = (ia1) this.g.get();
        synchronized (ia1Var) {
            z = ia1Var.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        hh2 hh2Var = new hh2(this);
        hh2Var.d(this.b, AppMeasurementSdk.ConditionalUserProperty.NAME);
        hh2Var.d(this.c, "options");
        return hh2Var.toString();
    }
}
