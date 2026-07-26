package ir.mservices.market.version2.manager.serversync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.hh2;
import defpackage.lw;

/* JADX INFO: loaded from: classes3.dex */
public class JustKeepAppAliveService extends Service {
    public static int a;
    public static final hh2 b;

    static {
        hh2 hh2Var = new hh2((char) 0, 4);
        hh2Var.b = null;
        hh2Var.c = null;
        b = hh2Var;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        lw.b(null, null, i == 1);
        return 2;
    }
}
