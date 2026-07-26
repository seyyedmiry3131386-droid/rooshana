package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.session.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p94 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p94(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                t94 t94Var = (t94) this.b;
                for (s94 s94Var : t94Var.d) {
                    r94 r94Var = t94Var.c;
                    if (!s94Var.d && s94Var.c) {
                        vd2 vd2VarH = s94Var.b.h();
                        s94Var.b = new xe1(5);
                        s94Var.c = false;
                        r94Var.d(s94Var.a, vd2VarH);
                    }
                    if (t94Var.b.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            case 1:
                hh2 hh2Var = (hh2) this.b;
                if (message.what == 1) {
                    try {
                        go4 go4Var = (go4) hh2Var.c;
                        go4Var.D.b0(go4Var.c);
                    } catch (RemoteException unused) {
                        wn5.k0("MCImplBase", "Error in sending flushCommandQueue");
                    }
                }
                break;
            default:
                no4 no4Var = (no4) this.b;
                no4Var.getClass();
                if (message.what == 1) {
                    a aVar = no4Var.e;
                    aVar.r0(false, aVar.n);
                }
                break;
        }
        return true;
        return true;
    }
}
