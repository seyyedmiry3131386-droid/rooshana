package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.SparseArray;
import nene.downloadmanager.core.DownloaderService;
import nene.downloadmanager.exceptions.NeneRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class oa1 implements ServiceConnection {
    public ut1 a;
    public final /* synthetic */ pa1 b;

    public oa1(pa1 pa1Var) {
        this.b = pa1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Notification notificationB;
        Notification notificationB2;
        int i = pa1.n;
        pa1 pa1Var = this.b;
        pa1Var.l = 3;
        this.a = (ut1) iBinder;
        if (((SparseArray) pa1Var.d.b).size() == 0) {
            pa1Var.d();
            return;
        }
        ut1 ut1Var = this.a;
        qs1 qs1Var = pa1Var.k;
        pa1Var.c.f();
        DownloaderService downloaderService = ut1Var.n;
        int i2 = downloaderService.c;
        if (qs1Var == null) {
            int i3 = DownloaderService.d;
            return;
        }
        if (i2 == 0) {
            try {
                try {
                    notificationB2 = qs1Var.a().b();
                    js3.m(notificationB2);
                } catch (NullPointerException unused) {
                    try {
                        qs1Var.b = null;
                        notificationB = qs1Var.a().b();
                    } catch (NullPointerException unused2) {
                        lw.g(null, "Failed to rebuild notification", null);
                        notificationB = new fp5(qs1Var.a, "download").b();
                    }
                    notificationB2 = notificationB;
                    js3.m(notificationB2);
                }
                downloaderService.startForeground(1001, notificationB2);
                downloaderService.c++;
            } catch (Exception unused3) {
                DownloaderService downloaderService2 = ut1Var.n;
                int i4 = downloaderService2.c - 1;
                downloaderService2.c = i4;
                if (i4 <= 0) {
                    downloaderService2.stopForeground(false);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = pa1.n;
        pa1 pa1Var = this.b;
        pa1Var.l = 0;
        SparseArray sparseArray = (SparseArray) pa1Var.d.b;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            tt1 tt1Var = (tt1) sparseArray.valueAt(i2);
            tt1Var.k = 300;
            tt1Var.b();
        }
        sparseArray.clear();
        this.a = null;
        throw new NeneRuntimeException("Download service disconnected");
    }
}
