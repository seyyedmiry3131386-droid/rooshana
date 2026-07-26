package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.View;
import io.sentry.android.replay.screenshot.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z52 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z52(wx7 wx7Var, iq4 iq4Var, boolean z, hq4 hq4Var) {
        this.a = 3;
        this.c = wx7Var;
        this.d = iq4Var;
        this.b = z;
        this.e = hq4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                e62 e62Var = (e62) this.d;
                ee6 ee6Var = (ee6) this.e;
                rp4 rp4VarB0 = rp4.b0(context);
                if (rp4VarB0 == null) {
                    wn5.k0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    e62Var.u0(rp4VarB0);
                }
                LogSessionId logSessionIdD0 = rp4VarB0.d0();
                synchronized (ee6Var) {
                    b41 b41Var = ee6Var.b;
                    b41Var.getClass();
                    b41Var.g(logSessionIdD0);
                }
                return;
            case 1:
                ((xp4) this.c).d((jq4) this.d, (dc0) this.e, this.b);
                return;
            case 2:
                xq4 xq4Var = (xq4) this.c;
                boolean z2 = this.b;
                hq4 hq4Var = (hq4) this.d;
                Runnable runnable = (Runnable) this.e;
                is4 is4Var = xq4Var.g;
                if (z2) {
                    wp7 wp7Var = new wp7(Bundle.EMPTY, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY");
                    try {
                        eo5 eo5VarX = is4Var.o.X(hq4Var);
                        if (eo5VarX != null) {
                            i = eo5VarX.b(xq4.E).h;
                        } else if (xq4Var.h(hq4Var)) {
                            ja1.y(new bq7(0));
                            i = 0;
                        } else {
                            ja1.y(new bq7(-100));
                        }
                        gq4 gq4Var = hq4Var.d;
                        if (gq4Var != null) {
                            gq4Var.a(i, wp7Var);
                        }
                    } catch (DeadObjectException unused) {
                        is4Var.o.v0(hq4Var);
                        ja1.y(new bq7(-100));
                    } catch (RemoteException e) {
                        wn5.l0("MediaSessionImpl", "Exception in " + hq4Var, e);
                        ja1.y(new bq7(-1));
                    }
                }
                runnable.run();
                is4Var.o.G(hq4Var);
                return;
            case 3:
                wx7 wx7Var = (wx7) this.c;
                iq4 iq4Var = (iq4) this.d;
                boolean z3 = this.b;
                hq4 hq4Var2 = (hq4) this.e;
                xq4 xq4Var2 = ((hr4) wx7Var.c).g;
                qg6 qg6Var = xq4Var2.t;
                y97.Y(qg6Var, iq4Var);
                int iE = qg6Var.e();
                if (iE == 1) {
                    if (qg6Var.f0(2)) {
                        qg6Var.c();
                    }
                } else if (iE == 4 && qg6Var.f0(4)) {
                    qg6Var.t();
                }
                if (z3 && qg6Var.f0(1)) {
                    qg6Var.K();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i2 : new int[]{31, 2}) {
                    vy2.s(!false);
                    sparseBooleanArray.append(i2, true);
                }
                if (z3) {
                    vy2.s(!false);
                    sparseBooleanArray.append(1, true);
                }
                vy2.s(!false);
                xq4Var2.q(hq4Var2, new cb6(new vd2(sparseBooleanArray)));
                return;
            default:
                ((f) this.c).e((View) this.d, (io.sentry.android.replay.viewhierarchy.f) this.e, !this.b);
                return;
        }
    }

    public /* synthetic */ z52(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ z52(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }
}
