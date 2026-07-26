package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class ts2 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final boolean a(Message message) {
        if (message.what != 0) {
            return false;
        }
        o77 o77Var = (o77) this.b;
        yz7 yz7Var = (yz7) message.obj;
        synchronized (o77Var.a) {
            if (((yz7) o77Var.c) == yz7Var || ((yz7) o77Var.d) == yz7Var) {
                o77Var.l(yz7Var, 2);
            }
        }
        return true;
    }

    private final boolean b(Message message) {
        int i = message.arg1;
        au9 au9Var = (au9) this.b;
        synchronized (au9Var) {
            try {
                kw9 kw9Var = (kw9) au9Var.e.get(i);
                if (kw9Var == null) {
                    t0.m("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                au9Var.e.remove(i);
                au9Var.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    kw9Var.b(new zzt("Not supported by GmsCore", null));
                    return true;
                }
                switch (kw9Var.e) {
                    case 0:
                        if (!data.getBoolean("ack", false)) {
                            kw9Var.b(new zzt("Invalid response to one way request", null));
                            return true;
                        }
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            kw9Var.toString();
                        }
                        kw9Var.b.b(null);
                        return true;
                    default:
                        Bundle bundle = data.getBundle("data");
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            kw9Var.toString();
                            String.valueOf(bundle);
                        }
                        kw9Var.b.b(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                us2 us2Var = (us2) this.b;
                int i = message.what;
                if (i == 1) {
                    us2Var.b((rs2) message.obj);
                    return true;
                }
                if (i == 2) {
                    us2Var.d.o((rs2) message.obj);
                }
                return false;
            case 1:
                return a(message);
            case 2:
                return b(message);
            default:
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return false;
                    }
                    gv9 gv9Var = (gv9) this.b;
                    synchronized (gv9Var.d) {
                        try {
                            us9 us9Var = (us9) message.obj;
                            jt9 jt9Var = (jt9) gv9Var.d.get(us9Var);
                            if (jt9Var != null && jt9Var.b == 3) {
                                String strValueOf = String.valueOf(us9Var);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(strValueOf);
                                t0.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName = jt9Var.f;
                                if (componentName == null) {
                                    us9Var.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = us9Var.b;
                                    rq4.n(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                jt9Var.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                        break;
                    }
                } else {
                    gv9 gv9Var2 = (gv9) this.b;
                    synchronized (gv9Var2.d) {
                        try {
                            us9 us9Var2 = (us9) message.obj;
                            jt9 jt9Var2 = (jt9) gv9Var2.d.get(us9Var2);
                            if (jt9Var2 != null && jt9Var2.a.isEmpty()) {
                                if (jt9Var2.c) {
                                    us9 us9Var3 = jt9Var2.e;
                                    gv9 gv9Var3 = jt9Var2.g;
                                    gv9Var3.f.removeMessages(1, us9Var3);
                                    gv9Var3.g.c(gv9Var3.e, jt9Var2);
                                    jt9Var2.c = false;
                                    jt9Var2.b = 2;
                                }
                                gv9Var2.d.remove(us9Var2);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return true;
        }
    }
}
