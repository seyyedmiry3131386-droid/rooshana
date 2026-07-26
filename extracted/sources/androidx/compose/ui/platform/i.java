package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.eq;
import defpackage.g51;
import defpackage.js3;
import defpackage.oi;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qp2;
import defpackage.qx4;
import defpackage.tx8;
import defpackage.u61;
import defpackage.v61;
import defpackage.w61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class i implements qx4 {
    public final Choreographer a;
    public final h b;

    public i(Choreographer choreographer, h hVar) {
        this.a = choreographer;
        this.b = hVar;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return eq.D;
    }

    @Override // defpackage.qx4
    public final Object k0(g51 g51Var, dp2 dp2Var) {
        final h hVar = this.b;
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        final oi oiVar = new oi(om0Var, this, dp2Var);
        if (js3.i(hVar.c, this.a)) {
            synchronized (hVar.e) {
                hVar.g.add(oiVar);
                if (!hVar.j) {
                    hVar.j = true;
                    hVar.c.postFrameCallback(hVar.k);
                }
            }
            om0Var.x(new dp2() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    h hVar2 = hVar;
                    oi oiVar2 = oiVar;
                    synchronized (hVar2.e) {
                        hVar2.g.remove(oiVar2);
                    }
                    return tx8.a;
                }
            });
        } else {
            this.a.postFrameCallback(oiVar);
            om0Var.x(new dp2() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    this.g.a.removeFrameCallback(oiVar);
                    return tx8.a;
                }
            });
        }
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }
}
