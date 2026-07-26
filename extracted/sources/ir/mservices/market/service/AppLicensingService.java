package ir.mservices.market.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import defpackage.c5;
import defpackage.de5;
import defpackage.dp3;
import defpackage.lw;
import defpackage.w91;
import defpackage.zk8;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.services.c;

/* JADX INFO: loaded from: classes3.dex */
public class AppLicensingService extends Service {
    public de5 a = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            de5 de5Var = new de5();
            de5Var.attachInterface(de5Var, "com.android.vending.licensing.ILicensingService");
            if (zk8.b <= 0) {
                zk8.b = Looper.getMainLooper().getThread().getId();
            }
            lw.f(null, null, Thread.currentThread().getId() == zk8.b);
            w91 w91Var = (w91) ApplicationLauncher.o.b();
            de5Var.n = (c5) w91Var.L.get();
            de5Var.o = (dp3) w91Var.v.get();
            de5Var.p = (c) w91Var.l0.get();
            de5Var.q = w91Var.a.a;
            this.a = de5Var;
        }
        return this.a;
    }
}
