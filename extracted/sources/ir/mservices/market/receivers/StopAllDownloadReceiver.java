package ir.mservices.market.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a68;
import defpackage.at2;
import defpackage.dw1;
import defpackage.ps1;
import defpackage.w91;
import ir.mservices.market.movie.download.core.source.a;

/* JADX INFO: loaded from: classes3.dex */
public class StopAllDownloadReceiver extends BroadcastReceiver {
    public volatile boolean a = false;
    public final Object b = new Object();
    public ps1 c;
    public a d;

    public final void a(Context context, Intent intent) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    w91 w91Var = (w91) ((a68) at2.a0(context));
                    this.c = (ps1) w91Var.w.get();
                    this.d = (a) w91Var.Z.get();
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        if ("ir.mservices.market_STOP_ALL".equalsIgnoreCase(intent.getAction())) {
            dw1.y("pause_all_notif");
            this.c.r();
            this.d.c();
        }
    }
}
