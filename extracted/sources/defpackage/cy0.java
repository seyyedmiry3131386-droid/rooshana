package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cy0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, tw1] */
    @Override // java.lang.Runnable
    public final void run() {
        bq7 bq7Var;
        switch (this.a) {
            case 0:
                dy0 dy0Var = (dy0) this.b;
                Serializable serializable = (Serializable) ((nm5) this.d).b;
                String str = (String) dy0Var.a.get(Integer.valueOf(this.c));
                if (str != null) {
                    w7 w7Var = (w7) dy0Var.e.get(str);
                    if ((w7Var != null ? w7Var.a : null) == null) {
                        dy0Var.g.remove(str);
                        dy0Var.f.put(str, serializable);
                    } else {
                        r7 r7Var = w7Var.a;
                        if (dy0Var.d.remove(str)) {
                            r7Var.g(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((dy0) this.b).a(this.c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                break;
            case 2:
                ((xl1) this.b).b.f(this.c, this.d);
                break;
            case 3:
                sw1 sw1Var = (sw1) this.b;
                this.d.k(sw1Var.a, sw1Var.b, this.c);
                break;
            case 4:
                CopyOnWriteArraySet<s94> copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
                q94 q94Var = (q94) this.d;
                for (s94 s94Var : copyOnWriteArraySet) {
                    if (!s94Var.d) {
                        int i = this.c;
                        if (i != -1) {
                            s94Var.b.a(i);
                        }
                        s94Var.c = true;
                        q94Var.invoke(s94Var.a);
                    }
                }
                break;
            case 5:
                go4 go4Var = (go4) this.b;
                n94 n94Var = (n94) this.d;
                int i2 = this.c;
                try {
                    bq7Var = (bq7) n94Var.get();
                    vy2.o(bq7Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    wn5.l0("MCImplBase", "Session operation failed", e);
                    bq7Var = new bq7(-1);
                } catch (CancellationException e2) {
                    wn5.l0("MCImplBase", "Session operation cancelled", e2);
                    bq7Var = new bq7(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    wn5.l0("MCImplBase", "Session operation failed", e);
                    bq7Var = new bq7(-1);
                }
                xf3 xf3Var = go4Var.D;
                if (xf3Var != null) {
                    try {
                        xf3Var.j(go4Var.c, i2, bq7Var.b());
                    } catch (RemoteException unused) {
                        wn5.k0("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            default:
                ws4 ws4Var = (ws4) this.b;
                Pair pair = (Pair) this.d;
                ((hd1) ws4Var.b.i).k(((Integer) pair.first).intValue(), (ks4) pair.second, this.c);
                break;
        }
    }

    public /* synthetic */ cy0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
