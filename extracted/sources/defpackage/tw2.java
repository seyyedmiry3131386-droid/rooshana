package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import de.greenrobot.event.EventBusException;

/* JADX INFO: loaded from: classes3.dex */
public final class tw2 extends Handler {
    public final nc2 a;
    public final int b;
    public final t32 c;
    public boolean d;

    public tw2(t32 t32Var, Looper looper) {
        super(looper);
        this.c = t32Var;
        this.b = 10;
        this.a = new nc2(27);
    }

    public final void a(ha8 ha8Var, Object obj) {
        p46 p46VarA = p46.a(ha8Var, obj);
        synchronized (this) {
            try {
                this.a.n(p46VarA);
                if (!this.d) {
                    this.d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                p46 p46VarX = this.a.x();
                if (p46VarX == null) {
                    synchronized (this) {
                        p46VarX = this.a.x();
                        if (p46VarX == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.d(p46VarX);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.d = true;
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }
}
