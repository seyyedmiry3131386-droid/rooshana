package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class au9 implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public rn6 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ jx9 f;

    public au9(jx9 jx9Var) {
        this.f = jx9Var;
        jx jxVar = new jx(Looper.getMainLooper(), new ts2(2, this), 6);
        Looper.getMainLooper();
        this.b = new Messenger(jxVar);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            this.a = 4;
            b21.b().c((Context) this.f.b, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((kw9) it.next()).b(zztVar);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                ((kw9) this.e.valueAt(i2)).b(zztVar);
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            b21.b().c((Context) this.f.b, this);
        }
    }

    public final synchronized boolean d(kw9 kw9Var) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(kw9Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(kw9Var);
            ((ScheduledExecutorService) this.f.c).execute(new yq9(this, 0));
            return true;
        }
        this.d.add(kw9Var);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (b21.b().a((Context) this.f.b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f.c).schedule(new yq9(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.f.c).execute(new zh9(this, iBinder, 5));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.f.c).execute(new yq9(this, 2));
    }
}
