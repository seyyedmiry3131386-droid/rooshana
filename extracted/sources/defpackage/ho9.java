package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class ho9 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ d70 b;

    public ho9(d70 d70Var, int i) {
        this.b = d70Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d70 d70Var = this.b;
        if (iBinder == null) {
            d70Var.zzf(16);
            return;
        }
        synchronized (d70Var.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                d70Var.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nf3)) ? new wj9(iBinder) : (nf3) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.zzb(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d70 d70Var = this.b;
        synchronized (d70Var.zzh()) {
            d70Var.zzi(null);
        }
        d70 d70Var2 = this.b;
        int i = this.a;
        Handler handler = d70Var2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
