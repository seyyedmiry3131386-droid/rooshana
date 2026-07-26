package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import ir.mservices.market.activity.ForceCloseReportingActivity;
import ir.mservices.market.version2.ApplicationLauncher;
import java.lang.Thread;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hx8 implements Thread.UncaughtExceptionHandler {
    public ee5 a;
    public Thread.UncaughtExceptionHandler b;
    public ApplicationLauncher c;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int iMyPid;
        try {
            try {
                thread.getName();
                WeakReference weakReference = ApplicationLauncher.q;
                Activity activity2 = weakReference == null ? null : (Activity) weakReference.get();
                if (activity2 != null) {
                    activity2.finish();
                }
                boolean z = ForceCloseReportingActivity.I;
                if (ApplicationLauncher.p && this.c != null && !ForceCloseReportingActivity.I && ForceCloseReportingActivity.J < 2) {
                    ApplicationLauncher applicationLauncher = this.c;
                    int i = ForceCloseReportingActivity.J + 1;
                    Intent intent = new Intent(applicationLauncher, (Class<?>) ForceCloseReportingActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra("EXTRA_CRASHED_BEFORE", i);
                    applicationLauncher.startActivity(intent);
                }
                try {
                    this.a.getClass();
                } catch (Throwable unused) {
                }
                uncaughtExceptionHandler = this.b;
            } catch (Throwable th2) {
                try {
                    th2.initCause(th);
                    th = th2;
                } catch (Throwable unused2) {
                }
                try {
                    this.a.getClass();
                } catch (Throwable unused3) {
                }
                uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler == null || th == null) {
                    iMyPid = Process.myPid();
                    Process.killProcess(iMyPid);
                    System.exit(10);
                    return;
                }
            }
            if (uncaughtExceptionHandler == null || th == null) {
                iMyPid = Process.myPid();
                Process.killProcess(iMyPid);
                System.exit(10);
                return;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Throwable unused4) {
        }
    }
}
