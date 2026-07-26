package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ xq4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq4(xq4 xq4Var, Looper looper) {
        super(looper);
        this.c = xq4Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        hq4 hq4Var;
        int iC;
        he6 he6Var;
        xq4 xq4Var = this.c;
        is4 is4Var = xq4Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        he6 he6VarK = xq4Var.s.k(xq4Var.t.r0(), xq4Var.t.k0(), xq4Var.s.k);
        xq4Var.s = he6VarK;
        boolean z = this.a;
        boolean z2 = this.b;
        he6 he6VarN0 = is4Var.n0(he6VarK);
        vp7 vp7Var = is4Var.o;
        ImmutableList immutableListO = vp7Var.O();
        for (int i = 0; i < immutableListO.size(); i++) {
            hq4 hq4Var2 = (hq4) immutableListO.get(i);
            try {
                eo5 eo5VarX = vp7Var.X(hq4Var2);
                if (eo5VarX != null) {
                    iC = eo5VarX.c();
                } else if (!xq4Var.h(hq4Var2)) {
                    break;
                } else {
                    iC = 0;
                }
                he6 he6VarV = vp7Var.V(hq4Var2);
                if (he6VarV == null) {
                    vp7Var.U(hq4Var2);
                    cb6 cb6VarJ = y97.J(vp7Var.M(hq4Var2), xq4Var.t.o0());
                    try {
                        gq4 gq4Var = hq4Var2.d;
                        vy2.t(gq4Var);
                        if (he6VarV == null) {
                            hq4Var = hq4Var2;
                            he6Var = he6VarN0;
                        } else {
                            hq4Var = hq4Var2;
                            he6Var = he6VarV;
                        }
                        try {
                            gq4Var.i(iC, he6Var, cb6VarJ, z, z2);
                        } catch (DeadObjectException unused) {
                            is4Var.o.v0(hq4Var);
                        } catch (RemoteException e) {
                            e = e;
                            wn5.l0("MediaSessionImpl", "Exception in " + hq4Var, e);
                        }
                    } catch (DeadObjectException unused2) {
                        hq4Var = hq4Var2;
                    } catch (RemoteException e2) {
                        e = e2;
                        hq4Var = hq4Var2;
                    }
                }
            } catch (DeadObjectException unused3) {
                hq4Var = hq4Var2;
            } catch (RemoteException e3) {
                e = e3;
                hq4Var = hq4Var2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
