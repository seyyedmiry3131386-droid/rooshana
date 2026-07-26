package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gv9 extends bu2 {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile jx f;
    public final b21 g;
    public final long h;
    public final long i;

    public gv9(Context context, Looper looper) {
        ts2 ts2Var = new ts2(3, this);
        this.e = context.getApplicationContext();
        jx jxVar = new jx(looper, ts2Var, 7);
        Looper.getMainLooper();
        this.f = jxVar;
        this.g = b21.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // defpackage.bu2
    public final ConnectionResult c(us9 us9Var, ho9 ho9Var, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.d;
        synchronized (map) {
            try {
                jt9 jt9Var = (jt9) map.get(us9Var);
                if (executor == null) {
                    executor = null;
                }
                if (jt9Var == null) {
                    jt9Var = new jt9(this, us9Var);
                    jt9Var.a.put(ho9Var, ho9Var);
                    connectionResultA = jt9Var.a(str, executor);
                    map.put(us9Var, jt9Var);
                } else {
                    this.f.removeMessages(0, us9Var);
                    if (jt9Var.a.containsKey(ho9Var)) {
                        String string = us9Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    jt9Var.a.put(ho9Var, ho9Var);
                    int i = jt9Var.b;
                    if (i == 1) {
                        ho9Var.onServiceConnected(jt9Var.f, jt9Var.d);
                    } else if (i == 2) {
                        connectionResultA = jt9Var.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (jt9Var.c) {
                    return ConnectionResult.f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
