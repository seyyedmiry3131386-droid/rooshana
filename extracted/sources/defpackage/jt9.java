package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jt9 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final us9 e;
    public ComponentName f;
    public final /* synthetic */ gv9 g;

    public jt9(gv9 gv9Var, us9 us9Var) {
        this.g = gv9Var;
        this.e = us9Var;
    }

    public final ConnectionResult a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = ok9.a(this.g.e, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(rm9.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                gv9 gv9Var = this.g;
                b21 b21Var = gv9Var.g;
                Context context = gv9Var.e;
                us9 us9Var = this.e;
                try {
                    boolean zD = b21Var.d(context, str, intentA, this, 4225, executor);
                    this.c = zD;
                    if (zD) {
                        gv9Var.f.sendMessageDelayed(gv9Var.f.obtainMessage(1, us9Var), gv9Var.i);
                        ConnectionResult connectionResult = ConnectionResult.f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return connectionResult;
                    }
                    this.b = 2;
                    try {
                        gv9Var.g.c(gv9Var.e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (zzaf e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gv9 gv9Var = this.g;
        synchronized (gv9Var.d) {
            try {
                gv9Var.f.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gv9 gv9Var = this.g;
        synchronized (gv9Var.d) {
            try {
                gv9Var.f.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
