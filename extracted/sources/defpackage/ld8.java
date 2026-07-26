package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes.dex */
public final class ld8 extends BroadcastReceiver {
    public md8 a;
    public Context b;

    public final void a() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        md8 md8Var = this.a;
        if (md8Var != null) {
            Context context = md8Var.c.c;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        md8 md8Var = this.a;
        if (md8Var != null && md8Var.a()) {
            md8 md8Var2 = this.a;
            md8Var2.c.getClass();
            FirebaseMessaging.b(md8Var2, 0L);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
