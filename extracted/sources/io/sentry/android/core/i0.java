package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import defpackage.x41;
import io.sentry.SentryLevel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {
    public static final x41 a = new x41(new io.sentry.u1(11));
    public static final x41 b = new x41(new io.sentry.u1(12));
    public static final x41 c = new x41(new io.sentry.u1(13));
    public static final x41 d = new x41(new io.sentry.u1(14));
    public static final x41 e = new x41(new io.sentry.u1(15));

    public static /* synthetic */ ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String d(io.sentry.u0 u0Var) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            u0Var.f(SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static ActivityManager.MemoryInfo e(Context context, io.sentry.u0 u0Var) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            u0Var.i(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            u0Var.f(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo f(Context context, io.sentry.u0 u0Var, j0 j0Var) {
        try {
            j0Var.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th) {
            u0Var.f(SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    public static PackageInfo g(Context context, j0 j0Var) {
        j0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) a.b(context) : (PackageInfo) b.b(context);
    }

    public static String h(PackageInfo packageInfo, j0 j0Var) {
        j0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean i() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent j(Context context, j0 j0Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        j0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }
}
