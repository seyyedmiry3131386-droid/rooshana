package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class po8 extends BroadcastReceiver {
    public qo8 a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        qo8 qo8Var = this.a;
        if (qo8Var == null) {
            return;
        }
        if (qo8Var.c()) {
            qo8 qo8Var2 = this.a;
            ((oo8) qo8Var2.f).f.schedule(qo8Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
