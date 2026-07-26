package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class bu2 {
    public static final Object a = new Object();
    public static gv9 b;
    public static HandlerThread c;

    public static gv9 a(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = new gv9(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static HandlerThread b() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                c = handlerThread2;
                handlerThread2.start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ConnectionResult c(us9 us9Var, ho9 ho9Var, String str, Executor executor);

    public final void d(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        us9 us9Var = new us9(str, str2, z);
        gv9 gv9Var = (gv9) this;
        rq4.o(serviceConnection, "ServiceConnection must not be null");
        HashMap map = gv9Var.d;
        synchronized (map) {
            try {
                jt9 jt9Var = (jt9) map.get(us9Var);
                if (jt9Var == null) {
                    String string = us9Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!jt9Var.a.containsKey(serviceConnection)) {
                    String string2 = us9Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                jt9Var.a.remove(serviceConnection);
                if (jt9Var.a.isEmpty()) {
                    gv9Var.f.sendMessageDelayed(gv9Var.f.obtainMessage(0, us9Var), gv9Var.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
