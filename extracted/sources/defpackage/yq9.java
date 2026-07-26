package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ au9 b;

    public /* synthetic */ yq9(au9 au9Var, int i) {
        this.a = i;
        this.b = au9Var;
    }

    private final void a() {
        au9 au9Var = this.b;
        synchronized (au9Var) {
            if (au9Var.a == 1) {
                au9Var.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            au9 au9Var = this.b;
            synchronized (au9Var) {
                try {
                    if (au9Var.a != 2) {
                        return;
                    }
                    if (au9Var.d.isEmpty()) {
                        au9Var.c();
                        return;
                    }
                    kw9 kw9Var = (kw9) au9Var.d.poll();
                    au9Var.e.put(kw9Var.a, kw9Var);
                    ((ScheduledExecutorService) au9Var.f.c).schedule(new zh9(au9Var, kw9Var, 8), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(kw9Var));
                    }
                    jx9 jx9Var = au9Var.f;
                    Messenger messenger = au9Var.b;
                    int i = kw9Var.c;
                    Context context = (Context) jx9Var.b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = kw9Var.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kw9Var.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kw9Var.d);
                    messageObtain.setData(bundle);
                    try {
                        rn6 rn6Var = au9Var.c;
                        Messenger messenger2 = (Messenger) rn6Var.b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = (zzd) rn6Var.c;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        au9Var.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
