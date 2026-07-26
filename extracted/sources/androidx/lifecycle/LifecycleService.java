package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.g64;
import defpackage.i64;
import defpackage.js3;
import defpackage.sk6;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleService extends Service implements g64 {
    public final sk6 a = new sk6(this);

    @Override // defpackage.g64
    public final i64 D() {
        return (i64) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        js3.p(intent, "intent");
        sk6 sk6Var = this.a;
        sk6Var.getClass();
        sk6Var.F(Lifecycle$Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        sk6 sk6Var = this.a;
        sk6Var.getClass();
        sk6Var.F(Lifecycle$Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        sk6 sk6Var = this.a;
        sk6Var.getClass();
        sk6Var.F(Lifecycle$Event.ON_STOP);
        sk6Var.F(Lifecycle$Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        sk6 sk6Var = this.a;
        sk6Var.getClass();
        sk6Var.F(Lifecycle$Event.ON_START);
        super.onStart(intent, i);
    }
}
