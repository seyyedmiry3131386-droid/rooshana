package ir.mservices.market.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.vk1;

/* JADX INFO: loaded from: classes3.dex */
public class DeveloperApiService extends Service {
    public vk1 a = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new vk1();
        }
        return this.a;
    }
}
