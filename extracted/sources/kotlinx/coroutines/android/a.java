package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import defpackage.bq1;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.g6;
import defpackage.js3;
import defpackage.kf1;
import defpackage.lo5;
import defpackage.om0;
import defpackage.qi1;
import defpackage.sg4;
import defpackage.t61;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.w61;
import defpackage.y61;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends y61 implements qi1 {
    private volatile a _immediate;
    public final Handler c;
    public final String d;
    public final boolean e;
    public final a f;

    public a(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f = aVar;
    }

    @Override // defpackage.y61
    public final boolean D0(w61 w61Var) {
        return (this.e && js3.i(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // defpackage.y61
    public y61 F0(int i) {
        bt2.r(i);
        return this;
    }

    public final void H0(w61 w61Var, Runnable runnable) {
        kotlinx.coroutines.a.c(w61Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ug1 ug1Var = up1.a;
        kf1.c.U(w61Var, runnable);
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        H0(w61Var, runnable);
    }

    @Override // defpackage.qi1
    public final bq1 d(long j, final Runnable runnable, w61 w61Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new bq1() { // from class: qw2
                @Override // defpackage.bq1
                public final void a() {
                    this.a.c.removeCallbacks(runnable);
                }
            };
        }
        H0(w61Var, runnable);
        return lo5.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.y61
    public final String toString() {
        a aVar;
        String str;
        ug1 ug1Var = up1.a;
        a aVar2 = sg4.a;
        if (this == aVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                aVar = aVar2.f;
            } catch (UnsupportedOperationException unused) {
                aVar = null;
            }
            str = this == aVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? t61.i(string, ".immediate") : string;
    }

    @Override // defpackage.qi1
    public final void u(long j, om0 om0Var) {
        final g6 g6Var = new g6(16, om0Var, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(g6Var, j)) {
            om0Var.x(new dp2() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    this.g.c.removeCallbacks(g6Var);
                    return tx8.a;
                }
            });
        } else {
            H0(om0Var.e, g6Var);
        }
    }

    public a(Handler handler) {
        this(handler, null, false);
    }
}
