package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import defpackage.dt2;
import defpackage.jr9;
import defpackage.qa;
import defpackage.wu8;
import defpackage.xg5;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            dt2.I(context, new qa(0), new xg5(5, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                xg5 xg5Var = new xg5(5, this);
                try {
                    dt2.w(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    xg5Var.f(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    xg5Var.f(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            xg5 xg5Var2 = new xg5(5, this);
            int iMyPid = Process.myPid();
            if (Build.VERSION.SDK_INT < 24) {
                xg5Var2.f(13, null);
                return;
            } else {
                Process.sendSignal(iMyPid, 10);
                xg5Var2.f(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        xg5 xg5Var3 = new xg5(5, this);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            int i = Build.VERSION.SDK_INT;
            if (wu8.q(i >= 34 ? jr9.d(context).getCacheDir() : i >= 24 ? jr9.d(context).getCodeCacheDir() : i == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
                xg5Var3.f(14, null);
                return;
            } else {
                xg5Var3.f(15, null);
                return;
            }
        }
        if (!"SAVE_PROFILE".equals(string2)) {
            xg5Var3.f(16, null);
            return;
        }
        int i2 = extras.getInt("EXTRA_PID", Process.myPid());
        if (Build.VERSION.SDK_INT < 24) {
            xg5Var3.f(13, null);
        } else {
            Process.sendSignal(i2, 10);
            xg5Var3.f(12, null);
        }
    }
}
