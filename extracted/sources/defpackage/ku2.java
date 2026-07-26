package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zab;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ku2 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static ku2 r;
    public long a;
    public boolean b;
    public TelemetryData c;
    public yi9 d;
    public final Context e;
    public final gu2 f;
    public final bn6 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final zv k;
    public final zv l;
    public final jx m;
    public volatile boolean n;

    public ku2(Context context, Looper looper) {
        gu2 gu2Var = gu2.e;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new zv(0);
        this.l = new zv(0);
        this.n = true;
        this.e = context;
        jx jxVar = new jx(looper, this, 3);
        Looper.getMainLooper();
        this.m = jxVar;
        this.f = gu2Var;
        this.g = new bn6(21);
        PackageManager packageManager = context.getPackageManager();
        if (xq2.m == null) {
            xq2.m = Boolean.valueOf(wn5.R() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (xq2.m.booleanValue()) {
            this.n = false;
        }
        jxVar.sendMessage(jxVar.obtainMessage(6));
    }

    public static Status c(cm cmVar, ConnectionResult connectionResult) {
        String str = (String) cmVar.b.b;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, dw1.p("API: ", str, " is not available on this device. Connection failed with: ", strValueOf, new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length())), connectionResult.c, connectionResult);
    }

    public static ku2 d(Context context) {
        ku2 ku2Var;
        synchronized (q) {
            try {
                if (r == null) {
                    Looper looper = bu2.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = gu2.d;
                    r = new ku2(applicationContext, looper);
                }
                ku2Var = r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ku2Var;
    }

    public final wh9 a(fu2 fu2Var) {
        cm cmVar = fu2Var.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        wh9 wh9Var = (wh9) concurrentHashMap.get(cmVar);
        if (wh9Var == null) {
            wh9Var = new wh9(this, fu2Var);
            concurrentHashMap.put(cmVar, wh9Var);
        }
        if (wh9Var.o.requiresSignIn()) {
            this.l.add(cmVar);
        }
        wh9Var.o();
        return wh9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.cf8 r9, int r10, defpackage.fu2 r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7a
            cm r3 = r11.f
            boolean r11 = r8.e()
            if (r11 != 0) goto Lb
            goto L4a
        Lb:
            ca7 r11 = defpackage.ca7.f()
            java.lang.Object r11 = r11.b
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r11
            r0 = 1
            if (r11 == 0) goto L4d
            boolean r1 = r11.b
            if (r1 == 0) goto L4a
            boolean r11 = r11.c
            j$.util.concurrent.ConcurrentHashMap r1 = r8.j
            java.lang.Object r1 = r1.get(r3)
            wh9 r1 = (defpackage.wh9) r1
            if (r1 == 0) goto L48
            sl r2 = r1.o
            boolean r4 = r2 instanceof defpackage.d70
            if (r4 == 0) goto L4a
            d70 r2 = (defpackage.d70) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L48
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L48
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = defpackage.ai9.a(r1, r2, r10)
            if (r11 == 0) goto L4a
            int r2 = r1.y
            int r2 = r2 + r0
            r1.y = r2
            boolean r0 = r11.c
            goto L4d
        L48:
            r0 = r11
            goto L4d
        L4a:
            r10 = 0
            r1 = r8
            goto L67
        L4d:
            ai9 r11 = new ai9
            r1 = 0
            if (r0 == 0) goto L58
            long r4 = java.lang.System.currentTimeMillis()
            goto L59
        L58:
            r4 = r1
        L59:
            if (r0 == 0) goto L5f
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5f:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L67:
            if (r10 == 0) goto L7b
            ox9 r9 = r9.a
            jx r11 = r1.m
            j$.util.Objects.requireNonNull(r11)
            vg r0 = new vg
            r2 = 4
            r0.<init>(r11, r2)
            r9.h(r0, r10)
            return
        L7a:
            r1 = r8
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku2.b(cf8, int, fu2):void");
    }

    public final boolean e() {
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) ca7.f().b;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int iX = this.g.x(203400000);
        return iX == -1 || iX == 0;
    }

    public final boolean f(ConnectionResult connectionResult, int i) {
        gu2 gu2Var = this.f;
        gu2Var.getClass();
        Context context = this.e;
        if (!aq3.n(context)) {
            int i2 = connectionResult.b;
            PendingIntent activity2 = connectionResult.c;
            if (!((i2 == 0 || activity2 == null) ? false : true)) {
                activity2 = null;
                Intent intentA = gu2Var.a(i2, context, null);
                if (intentA != null) {
                    activity2 = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity2 != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity2);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                gu2Var.f(context, i2, PendingIntent.getActivity(context, 0, intent, vi9.a | 134217728));
                gu2Var.getClass();
                Integer num = connectionResult.e;
                zab zabVar = new zab(num == null ? -1 : num.intValue(), connectionResult.b, System.currentTimeMillis(), context.getPackageName(), false);
                if (gu2Var.c == null) {
                    gu2Var.c = new yi9(context, yi9.l, ql.a0, eu2.c);
                }
                yi9 yi9Var = gu2Var.c;
                yi9Var.getClass();
                cf0 cf0VarB = cf0.b();
                cf0VarB.e = new Feature[]{gu9.e};
                cf0VarB.c = false;
                cf0VarB.d = new hl5(19, zabVar);
                yi9Var.f(2, cf0VarB.a());
                return true;
            }
        }
        return false;
    }

    public final void g(ConnectionResult connectionResult, int i) {
        if (f(connectionResult, i)) {
            return;
        }
        jx jxVar = this.m;
        jxVar.sendMessage(jxVar.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02e0  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku2.handleMessage(android.os.Message):boolean");
    }
}
