package ir.mservices.market.app.update.common.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import defpackage.f88;
import defpackage.fp7;
import defpackage.js3;
import defpackage.lw;
import defpackage.m88;
import defpackage.zk8;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateSyncReceiver extends Hilt_UpdateSyncReceiver {
    public ir.mservices.market.app.update.common.modal.a c;

    @Override // ir.mservices.market.app.update.common.manager.Hilt_UpdateSyncReceiver, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler;
        super.onReceive(context, intent);
        js3.p(context, "context");
        js3.p(intent, "intent");
        intent.toString();
        String action = intent.getAction();
        if (action == null || f88.n0(action) || !m88.T(intent.getAction(), "ir.mservices.market.UPDATE_SYNC_ACTION", true)) {
            return;
        }
        fp7 fp7Var = new fp7(7, this);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.post(fp7Var));
    }
}
