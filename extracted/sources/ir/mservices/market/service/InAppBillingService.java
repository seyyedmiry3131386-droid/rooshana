package ir.mservices.market.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.fk3;

/* JADX INFO: loaded from: classes3.dex */
public class InAppBillingService extends Service {
    public fk3 a = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new fk3();
        }
        return this.a;
    }
}
