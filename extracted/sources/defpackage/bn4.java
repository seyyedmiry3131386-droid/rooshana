package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class bn4 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ cn4 b;

    public bn4(cn4 cn4Var, pm4 pm4Var) {
        this.b = cn4Var;
        Handler handlerP = j29.p(this);
        this.a = handlerP;
        pm4Var.j(this, handlerP);
    }

    public final void a(long j) {
        cn4 cn4Var = this.b;
        if (this != cn4Var.O1 || cn4Var.M == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            cn4Var.T0 = true;
            return;
        }
        try {
            cn4Var.G0(j);
        } catch (ExoPlaybackException e) {
            cn4Var.U0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = j29.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
