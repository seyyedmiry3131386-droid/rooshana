package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class qb4 {
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public qb4(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sbA = o40.A(128, "Receiver{");
        sbA.append(this.b);
        sbA.append(" filter=");
        sbA.append(this.a);
        if (this.d) {
            sbA.append(" DEAD");
        }
        sbA.append("}");
        return sbA.toString();
    }
}
