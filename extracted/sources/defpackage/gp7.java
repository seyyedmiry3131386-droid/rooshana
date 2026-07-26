package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class gp7 {
    public eg5 a;
    public kp7 b;
    public pp8 c;
    public nu7 d;
    public d27 e;
    public yo3 f;
    public hx2 g;
    public du2 h;
    public boolean i;

    static {
        rk1.a("ServerSyncTasksManager");
    }

    public void onEvent(l04 l04Var) {
        Handler handler;
        l04Var.getClass();
        this.d.a(System.currentTimeMillis());
        if (this.i) {
            return;
        }
        this.i = true;
        fp7 fp7Var = new fp7(0, this);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.postDelayed(fp7Var, 10000L));
    }
}
