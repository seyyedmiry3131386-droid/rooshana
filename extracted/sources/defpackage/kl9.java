package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class kl9 extends jx {
    public final /* synthetic */ d70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl9(d70 d70Var, Looper looper) {
        super(looper, 7);
        this.b = d70Var;
    }

    @Override // defpackage.jx, android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        vj9 vj9Var;
        d70 d70Var = this.b;
        if (d70Var.zzd.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (vj9Var = (vj9) message.obj) != null) {
                vj9Var.c();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !d70Var.enableLocalFallback()) || message.what == 5)) && !d70Var.isConnecting()) {
            vj9 vj9Var2 = (vj9) message.obj;
            if (vj9Var2 != null) {
                vj9Var2.c();
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            d70Var.zzn(new ConnectionResult(message.arg2, null, null));
            if (d70Var.zzg() && !d70Var.zzo()) {
                d70Var.zzd(3, null);
                return;
            }
            ConnectionResult connectionResultZzm = d70Var.zzm() != null ? d70Var.zzm() : new ConnectionResult(8, null, null);
            d70Var.zzc.d(connectionResultZzm);
            d70Var.onConnectionFailed(connectionResultZzm);
            return;
        }
        if (i3 == 5) {
            ConnectionResult connectionResultZzm2 = d70Var.zzm() != null ? d70Var.zzm() : new ConnectionResult(8, null, null);
            d70Var.zzc.d(connectionResultZzm2);
            d70Var.onConnectionFailed(connectionResultZzm2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            d70Var.zzc.d(connectionResult);
            d70Var.onConnectionFailed(connectionResult);
            return;
        }
        if (i3 == 6) {
            d70Var.zzd(5, null);
            if (d70Var.zzk() != null) {
                d70Var.zzk().onConnectionSuspended(message.arg2);
            }
            d70Var.onConnectionSuspended(message.arg2);
            d70Var.zze(5, 1, null);
            return;
        }
        if (i3 == 2 && !d70Var.isConnected()) {
            vj9 vj9Var3 = (vj9) message.obj;
            if (vj9Var3 != null) {
                vj9Var3.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            t0.o("GmsClient", rm7.o(i4, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i4).length() + 34)), new Exception());
            return;
        }
        vj9 vj9Var4 = (vj9) message.obj;
        synchronized (vj9Var4) {
            try {
                bool = vj9Var4.a;
                if (vj9Var4.b) {
                    String string = vj9Var4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    t0.m("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            d70 d70Var2 = vj9Var4.f;
            int i5 = vj9Var4.d;
            if (i5 != 0) {
                d70Var2.zzd(1, null);
                Bundle bundle = vj9Var4.e;
                vj9Var4.b(new ConnectionResult(i5, bundle != null ? (PendingIntent) bundle.getParcelable(d70.KEY_PENDING_INTENT) : null, null));
            } else if (!vj9Var4.a()) {
                d70Var2.zzd(1, null);
                vj9Var4.b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (vj9Var4) {
            vj9Var4.b = true;
        }
        vj9Var4.c();
    }
}
