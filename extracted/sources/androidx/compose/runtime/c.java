package androidx.compose.runtime;

import defpackage.bt2;
import defpackage.c26;
import defpackage.e51;
import defpackage.fz1;
import defpackage.h01;
import defpackage.js3;
import defpackage.li1;
import defpackage.m37;
import defpackage.qp2;
import defpackage.u61;
import defpackage.v61;
import defpackage.w61;
import defpackage.z61;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements m37, z61 {
    public final w61 a;
    public final qp2 b;
    public final e51 c;
    public li1 d;

    public c(w61 w61Var, qp2 qp2Var) {
        this.a = w61Var;
        this.b = qp2Var;
        this.c = js3.a(w61Var.l0(this));
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.m37
    public final void a() {
        li1 li1Var = this.d;
        if (li1Var != null) {
            li1Var.v(new LeftCompositionCancellationException());
        }
        this.d = null;
    }

    @Override // defpackage.m37
    public final void c() {
        li1 li1Var = this.d;
        if (li1Var != null) {
            li1Var.v(new LeftCompositionCancellationException());
        }
        this.d = null;
    }

    @Override // defpackage.m37
    public final void e() {
        li1 li1Var = this.d;
        if (li1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            li1Var.g(cancellationException);
        }
        this.d = bt2.G(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return fz1.f;
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }

    @Override // defpackage.z61
    public final void y(w61 w61Var, Throwable th) throws Throwable {
        h01 h01Var = (h01) w61Var.r0(h01.b);
        if (h01Var != null) {
            c26.P(th, new defpackage.d(h01Var, this, 17));
        }
        z61 z61Var = (z61) this.a.r0(fz1.f);
        if (z61Var == null) {
            throw th;
        }
        z61Var.y(w61Var, th);
    }
}
