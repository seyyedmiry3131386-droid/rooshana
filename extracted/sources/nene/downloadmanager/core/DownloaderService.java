package nene.downloadmanager.core;

import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.dh5;
import defpackage.eh5;
import defpackage.fx2;
import defpackage.ut1;

/* JADX INFO: loaded from: classes3.dex */
public class DownloaderService extends Service {
    public static final /* synthetic */ int d = 0;
    public final ut1 a = new ut1(this);
    public final fx2 b;
    public int c;

    static {
        eh5.a("DownloaderService");
    }

    public DownloaderService() {
        fx2 fx2Var = new fx2();
        fx2Var.a = null;
        fx2Var.b = null;
        this.b = fx2Var;
        this.c = 0;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        fx2 fx2Var = this.b;
        fx2Var.getClass();
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) dh5.a.getSystemService("power")).newWakeLock(1, "NeneWakeLock");
            fx2Var.b = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) dh5.a.getSystemService("wifi")).createWifiLock(1, "NeneWifiLock");
            fx2Var.a = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.a;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        fx2 fx2Var = this.b;
        fx2Var.getClass();
        try {
            if (fx2Var.b.isHeld()) {
                fx2Var.b.release();
            }
            fx2Var.b = null;
            if (fx2Var.a.isHeld()) {
                fx2Var.a.release();
            }
            fx2Var.a = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.onUnbind(intent);
    }
}
