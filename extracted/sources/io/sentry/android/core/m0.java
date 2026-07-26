package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {
    public static volatile m0 i;
    public static final AutoClosableReentrantLock j = new AutoClosableReentrantLock();
    public final Context a;
    public final SentryAndroidOptions b;
    public final j0 c;
    public final Boolean d;
    public final h0 e;
    public final h0 f;
    public final io.sentry.protocol.p g;
    public final Long h;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Serializable, java.lang.String[]] */
    public m0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        h0 h0Var;
        h0 h0Var2;
        Bundle bundle;
        PackageInfo packageInfoG;
        PackageManager packageManager;
        this.a = context;
        this.b = sentryAndroidOptions;
        this.c = new j0(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.g.c.a();
        io.sentry.protocol.p pVar = new io.sentry.protocol.p();
        pVar.a = "Android";
        pVar.b = Build.VERSION.RELEASE;
        pVar.d = Build.DISPLAY;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    property = line;
                } finally {
                }
            } catch (IOException e) {
                logger.f(SentryLevel.ERROR, "Exception while attempting to read kernel information", e);
            }
        }
        if (property != null) {
            pVar.e = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            pVar.f = Boolean.valueOf(new io.sentry.android.core.internal.util.k(this.a, sentryAndroidOptions.getLogger(), this.c).a());
        }
        this.g = pVar;
        this.d = this.c.b();
        io.sentry.u0 logger2 = sentryAndroidOptions.getLogger();
        boolean z = false;
        try {
            packageInfoG = i0.g(context, this.c);
            packageManager = context.getPackageManager();
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        if (packageInfoG == null || packageManager == null) {
            h0Var = null;
        } else {
            str = packageInfoG.packageName;
            try {
                String installerPackageName = packageManager.getInstallerPackageName(str);
                h0Var = new h0(installerPackageName == null, installerPackageName);
            } catch (IllegalArgumentException unused2) {
                logger2.i(SentryLevel.DEBUG, "%s package isn't installed.", str);
                h0Var = null;
            }
        }
        this.e = h0Var;
        j0 j0Var = this.c;
        j0Var.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) i0.d.b(context) : (ApplicationInfo) i0.e.b(context);
        PackageInfo packageInfoG2 = i0.g(context, j0Var);
        if (packageInfoG2 != null) {
            ?? r0 = packageInfoG2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z = bundle.getBoolean("com.android.vending.splits.required");
            }
            h0Var2 = new h0(z, r0);
        } else {
            h0Var2 = null;
        }
        this.f = h0Var2;
        ActivityManager.MemoryInfo memoryInfoE = i0.e(context, sentryAndroidOptions.getLogger());
        if (memoryInfoE != null) {
            this.h = Long.valueOf(memoryInfoE.totalMem);
        } else {
            this.h = null;
        }
    }

    public static Float b(Intent intent, b6 b6Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static m0 c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (i == null) {
            io.sentry.r rVarA = j.a();
            try {
                if (i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    i = new m0(context, sentryAndroidOptions);
                }
                rVarA.close();
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return i;
    }

    public static Boolean d(Intent intent, b6 b6Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:0|2|(1:4)|5|153|6|141|(1:(21:9|(3:147|15|16)|24|(1:26)|27|159|28|(1:33)|155|34|38|(2:40|(1:42)(1:43))(0)|44|(3:138|46|50)|51|(1:53)|54|(1:56)|57|(11:61|(5:63|157|64|(1:66)(1:70)|71)|72|(1:(1:75)(1:76))(1:77)|78|(1:81)|82|(7:84|143|85|89|136|90|94)|(7:96|151|97|(4:(1:100)(1:101)|102|(3:104|(1:(1:166)(2:161|163))(2:106|165)|113)|162)(1:114)|115|(1:117)(1:120)|(6:149|122|126|145|127|131))|132|(1:134))|135)(1:10))(1:13)|140|(0)|24|(0)|27|159|28|(0)|155|34|38|(0)(0)|44|(0)|51|(0)|54|(0)|57|(12:59|61|(0)|72|(0)(0)|78|(1:81)|82|(0)|(0)|132|(0))|135|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        r8.f(io.sentry.SentryLevel.ERROR, "Error getting DisplayMetrics.", r9);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r2.getLogger().e(io.sentry.SentryLevel.ERROR, r8, "Error getting the device's boot time.", new java.lang.Object[0]);
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.protocol.g a(boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.m0.a(boolean, boolean):io.sentry.protocol.g");
    }
}
