package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.mi;
import defpackage.ni;
import defpackage.ov;
import defpackage.rq4;
import defpackage.sg4;
import defpackage.ug1;
import defpackage.up1;
import defpackage.w61;
import defpackage.y61;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends y61 {
    public static final c24 m = kotlin.a.a(new bp2() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // defpackage.bp2
        public final Object invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                ug1 ug1Var = up1.a;
                choreographer = (Choreographer) bt2.Q(sg4.a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(2, null));
            }
            h hVar = new h(choreographer, rq4.s(Looper.getMainLooper()));
            return bt2.L(hVar, hVar.l);
        }
    });
    public static final mi n = new mi(0);
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final i l;
    public final Object e = new Object();
    public final ov f = new ov();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final ni k = new ni(this);

    public h(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new i(choreographer, this);
    }

    public static final void H0(h hVar) {
        boolean z;
        do {
            Runnable runnableL0 = hVar.L0();
            while (runnableL0 != null) {
                runnableL0.run();
                runnableL0 = hVar.L0();
            }
            synchronized (hVar.e) {
                if (hVar.f.isEmpty()) {
                    z = false;
                    hVar.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final Runnable L0() {
        Runnable runnable;
        synchronized (this.e) {
            ov ovVar = this.f;
            runnable = (Runnable) (ovVar.isEmpty() ? null : ovVar.removeFirst());
        }
        return runnable;
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.i) {
                this.i = true;
                this.d.post(this.k);
                if (!this.j) {
                    this.j = true;
                    this.c.postFrameCallback(this.k);
                }
            }
        }
    }
}
