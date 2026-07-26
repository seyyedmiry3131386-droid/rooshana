package androidx.compose.foundation.lazy.layout;

import defpackage.bt2;
import defpackage.c08;
import defpackage.c26;
import defpackage.dl;
import defpackage.dp2;
import defpackage.e71;
import defpackage.i34;
import defpackage.li1;
import defpackage.mt8;
import defpackage.qj1;
import defpackage.ql3;
import defpackage.s08;
import defpackage.wu8;
import defpackage.xk;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public li1 a;
    public xk b;

    public c() {
        mt8 mt8Var = c26.h;
        Float fValueOf = Float.valueOf(0.0f);
        this.b = new xk(mt8Var, fValueOf, (dl) mt8Var.b().invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(float f, qj1 qj1Var, e71 e71Var) {
        if (f <= qj1Var.S(i34.a)) {
            return;
        }
        c08 c08VarK = ql3.k();
        dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
        c08 c08VarM = ql3.m(c08VarK);
        try {
            float fFloatValue = ((Number) ((s08) this.b.b).getValue()).floatValue();
            li1 li1Var = this.a;
            if (li1Var != null) {
                li1Var.g(null);
            }
            xk xkVar = this.b;
            if (xkVar.f) {
                this.b = wu8.n(xkVar, fFloatValue - f, 0.0f, 30);
            } else {
                this.b = new xk(c26.h, Float.valueOf(-f), null, 60);
            }
            this.a = bt2.G(e71Var, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            ql3.u(c08VarK, c08VarM, dp2VarE);
        } catch (Throwable th) {
            ql3.u(c08VarK, c08VarM, dp2VarE);
            throw th;
        }
    }
}
