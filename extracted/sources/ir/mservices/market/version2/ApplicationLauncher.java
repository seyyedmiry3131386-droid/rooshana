package ir.mservices.market.version2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import coil3.size.Precision;
import defpackage.aw6;
import defpackage.br2;
import defpackage.bt2;
import defpackage.d04;
import defpackage.dc0;
import defpackage.dh5;
import defpackage.dw6;
import defpackage.ee;
import defpackage.ee5;
import defpackage.eh5;
import defpackage.eq;
import defpackage.fi1;
import defpackage.fu;
import defpackage.go7;
import defpackage.gp7;
import defpackage.hf5;
import defpackage.hs1;
import defpackage.hs9;
import defpackage.hw5;
import defpackage.hx8;
import defpackage.js3;
import defpackage.ju;
import defpackage.k7;
import defpackage.kh2;
import defpackage.ku;
import defpackage.lu7;
import defpackage.lw;
import defpackage.m22;
import defpackage.ni3;
import defpackage.nu0;
import defpackage.nz3;
import defpackage.on;
import defpackage.oy0;
import defpackage.pj9;
import defpackage.pr7;
import defpackage.qi3;
import defpackage.r39;
import defpackage.rk1;
import defpackage.rl3;
import defpackage.rq4;
import defpackage.s26;
import defpackage.sb7;
import defpackage.si3;
import defpackage.sj8;
import defpackage.t32;
import defpackage.tb2;
import defpackage.w91;
import defpackage.ww3;
import defpackage.xx7;
import defpackage.ym;
import defpackage.z71;
import defpackage.z72;
import defpackage.zk8;
import defpackage.zm;
import defpackage.zn5;
import defpackage.zv5;
import io.sentry.android.core.f1;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.t;
import io.sentry.android.core.t0;
import io.sentry.b6;
import io.sentry.h4;
import ir.mservices.market.activity.BaseActivity;
import ir.mservices.market.receivers.PackageInstallationChangeReceiver;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.persistent.datasource.a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.InitializedLazyImpl;
import kotlin.coroutines.EmptyCoroutineContext;
import org.koin.core.error.KoinApplicationAlreadyStartedException;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationLauncher extends Application implements xx7, br2 {
    public static ApplicationLauncher o = null;
    public static boolean p = false;
    public static WeakReference q;
    public d04 e;
    public lu7 f;
    public pr7 g;
    public ee h;
    public gp7 i;
    public hf5 j;
    public ee5 k;
    public zv5 l;
    public hs1 m;
    public boolean a = false;
    public final fu b = new fu(new pj9(this));
    public final boolean c = true;
    public String d = null;
    public final Object n = bt2.D(a.class);

    public static void f(BaseActivity baseActivity) {
        q = new WeakReference(baseActivity);
    }

    @Override // defpackage.xx7
    public final coil3.a a(Context context) {
        int largeMemoryClass;
        nu0 nu0Var = (nu0) bt2.y(nu0.class);
        on onVar = new on(context);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList.add(nu0Var);
        onVar.e = new oy0(hs9.T(arrayList), hs9.T(arrayList2), hs9.T(arrayList3), hs9.T(arrayList4), hs9.T(arrayList5));
        zn5 zn5Var = qi3.a;
        zn5 zn5Var2 = si3.a;
        z71 z71Var = new z71(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        z72 z72Var = (z72) onVar.f;
        z72Var.a.put(si3.a, z71Var);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        zn5 zn5Var3 = si3.b;
        LinkedHashMap linkedHashMap = z72Var.a;
        if (config != null) {
            linkedHashMap.put(zn5Var3, config);
        } else {
            linkedHashMap.remove(zn5Var3);
        }
        dc0 dc0Var = new dc0(11, (byte) 0);
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            js3.m(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        onVar.c = new InitializedLazyImpl(new dw6(new fi1((long) (0.125d * ((long) largeMemoryClass) * b6.MAX_EVENT_SIZE_BYTES), dc0Var), dc0Var));
        ww3 ww3Var = tb2.a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        String absolutePath = new File(context.getCacheDir(), "image_cache").getAbsolutePath();
        String str = s26.b;
        js3.p(absolutePath, "<this>");
        onVar.d = new InitializedLazyImpl(new aw6(20971520L, emptyCoroutineContext, ww3Var, rl3.x(absolutePath)));
        Precision precision = Precision.a;
        onVar.b = ni3.a((ni3) onVar.b, null, 12287);
        return onVar.g();
    }

    public final hw5 b() {
        return (hw5) rq4.x(hw5.class, this);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [c24, java.lang.Object] */
    public final String c() {
        if (TextUtils.isEmpty(this.d)) {
            this.d = UUID.randomUUID().toString();
            a aVar = (a) this.n.getValue();
            aVar.e.b(aVar, a.n[3], this.d);
        }
        return this.d;
    }

    public final void d() {
        g gVar = g.q;
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVarC = g.c();
        h hVar = gVarC.f;
        if (hVar.c == 0) {
            hVar.c(jUptimeMillis);
            gVarC.h(this);
        }
        if (!this.a) {
            this.a = true;
            w91 w91Var = (w91) ((ku) this.b.e());
            this.e = (d04) w91Var.p.get();
            this.f = (lu7) w91Var.h.get();
            this.g = (pr7) w91Var.s.get();
            this.h = (ee) w91Var.o.get();
            this.i = (gp7) w91Var.R0.get();
            this.j = (hf5) w91Var.S0.get();
            this.k = (ee5) w91Var.C0.get();
            this.l = (zv5) w91Var.T0.get();
            this.m = (hs1) w91Var.X0.get();
        }
        super.onCreate();
        g.d(this);
    }

    @Override // defpackage.br2
    public final Object e() {
        return this.b.e();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d04 d04Var = this.e;
        d04Var.getClass();
        js3.p(configuration, "newConfig");
        if (configuration.locale.getLanguage().equals(d04Var.b)) {
            return;
        }
        d04Var.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application
    public final void onCreate() {
        ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
        g gVar = g.q;
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVarC = g.c();
        h hVar = gVarC.f;
        if (hVar.c == 0) {
            hVar.c(jUptimeMillis);
            gVarC.h(this);
        }
        o = this;
        k7 k7Var = new k7(20);
        eq eqVar = eq.A;
        m22 m22Var = new m22(8, k7Var);
        synchronized (eqVar) {
            nz3 nz3Var = new nz3();
            if (eq.B != null) {
                throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
            }
            eq.B = nz3Var.a;
            m22Var.invoke(nz3Var);
            nz3Var.a.a();
        }
        d();
        lw.b = 1;
        hf5 hf5Var = this.j;
        zk8.m = this.k;
        zk8.l = hf5Var;
        zk8.k = true;
        try {
            rk1.b = 9;
            BufferedWriter bufferedWriter = rk1.c;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.flush();
                    rk1.c.close();
                } catch (IOException e) {
                    t0.e(rk1.a, "Exception when closing log file", e);
                }
                rk1.c = null;
            }
        } catch (IOException unused) {
            lw.g(null, "Cannot throw IOException when log file is null", null);
        }
        Context context = dh5.a;
        String str = eh5.a;
        eh5.b = 9;
        BufferedWriter bufferedWriter2 = eh5.c;
        if (bufferedWriter2 != null) {
            try {
                bufferedWriter2.flush();
                eh5.c.close();
            } catch (IOException e2) {
                t0.e(str, "Exception when closing log file", e2);
            }
            eh5.c = null;
        }
        if (!TextUtils.isEmpty(null)) {
            try {
                eh5.c = new BufferedWriter(new OutputStreamWriter(io.sentry.config.a.m(new FileOutputStream((String) null, true), null), Charset.forName("UTF-8")));
            } catch (FileNotFoundException e3) {
                t0.e(str, "Exception when open log file", e3);
            }
        }
        sb7.p("MyketAppLauncher", "Myket application started", null);
        int i = 0;
        p = false;
        if (this.c) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!defaultUncaughtExceptionHandler.getClass().equals(hx8.class)) {
                hx8 hx8Var = new hx8();
                w91 w91Var = (w91) ((ApplicationLauncher) o.getApplicationContext()).b();
                hx8Var.a = (ee5) w91Var.C0.get();
                hx8Var.b = defaultUncaughtExceptionHandler;
                hx8Var.c = this;
                Thread.setDefaultUncaughtExceptionHandler(hx8Var);
            }
            sj8.g(getResources(), this.g.b(), this.g.c());
            kh2.a(this.g.a());
            gp7 gp7Var = this.i;
            gp7Var.getClass();
            t32.b().l(gp7Var, false);
            hf5 hf5Var2 = this.j;
            hf5Var2.getClass();
            f1.c(this, new t(3), new go7(hf5Var2));
            h4.b().s(new go7(hf5Var2));
            Context context2 = this.l.a;
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInstallationChangeReceiver packageInstallationChangeReceiver = new PackageInstallationChangeReceiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addDataScheme("package");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                ContextCompat.registerReceiver(context2, packageInstallationChangeReceiver, intentFilter, 2);
            }
            lu7 lu7Var = this.f;
            String str2 = lu7.E;
            if (lu7Var.b(str2, true)) {
                this.f.j(str2, false);
                this.f.j(lu7.F, false);
                this.f.g(1028, lu7.I);
                if (this.f.b(lu7.N, true)) {
                    i = -1;
                }
            } else {
                lu7 lu7Var2 = this.f;
                String str3 = lu7.F;
                if (lu7Var2.b(str3, true)) {
                    this.f.j(str3, false);
                    lu7 lu7Var3 = this.f;
                    String str4 = lu7.I;
                    int iC = lu7Var3.c(-1, str4);
                    this.f.g(1028, str4);
                    lw.f(null, null, iC >= 0);
                    lw.f(null, null, 1028 != iC);
                    i = iC;
                }
                this.m.a();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("current_version", 1028);
            bundle.putInt("previous_version", i);
            if (i < 0) {
                applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode = ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.a;
                ee eeVar = this.h;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("version", 1028);
                eeVar.a(bundle2, "first_open_myket_fresh");
            } else if (1028 > i) {
                applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode = ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.b;
                this.h.a(bundle, "first_open_myket_update");
            } else if (1028 < i) {
                applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode = ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.c;
                this.h.a(bundle, "first_open_myket_downgrade");
            } else {
                ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode2 = ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.d;
                lw.g(null, "myketPreviousVersion is not correct", "myketPreviousVersion=" + i + ", Current Myket version=1028");
                applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode = applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode2;
            }
            this.f.g(i, lu7.J);
            ju juVar = new ju(i, applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode);
            sb7.p("MyketAppLauncher", "Myket first run", juVar.toString());
            t32.b().g(juVar);
            this.m.a();
        }
        p = true;
        ym ymVar = zm.a;
        int i2 = r39.a;
        zm.k();
        g.d(this);
    }
}
