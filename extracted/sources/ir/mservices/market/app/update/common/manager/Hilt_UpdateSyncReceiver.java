package ir.mservices.market.app.update.common.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.at2;
import defpackage.w91;
import defpackage.wz8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_UpdateSyncReceiver extends BroadcastReceiver {
    public volatile boolean a = false;
    public final Object b = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    ((UpdateSyncReceiver) this).c = ((w91) ((wz8) at2.a0(context))).I0();
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
