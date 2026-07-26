package defpackage;

import android.view.View;
import androidx.compose.foundation.j;
import androidx.compose.ui.semantics.g;

/* JADX INFO: loaded from: classes.dex */
public final class og4 extends mx4 {
    public final tu1 b;
    public final tc7 c;
    public final s96 d;

    public og4(tu1 tu1Var, tc7 tc7Var, s96 s96Var) {
        this.b = tu1Var;
        this.c = tc7Var;
        this.d = s96Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new j(this.b, this.c, this.d);
    }

    public final int hashCode() {
        int i = (int) 9205357638345293824L;
        return this.d.hashCode() + ((this.c.hashCode() + ((((Float.floatToIntBits(Float.NaN) + dw1.g(Float.NaN, (i + ((((Float.floatToIntBits(Float.NaN) + (this.b.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        j jVar = (j) gx4Var;
        jVar.getClass();
        s96 s96Var = jVar.q;
        View view = jVar.r;
        qj1 qj1Var = jVar.s;
        jVar.o = this.b;
        jVar.p = this.c;
        s96 s96Var2 = this.d;
        jVar.q = s96Var2;
        View viewJ = rf0.J(jVar);
        qj1 qj1Var2 = y40.H(jVar).A;
        if (jVar.t != null) {
            g gVar = qg4.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !s96Var2.a()) || !au1.b(Float.NaN, Float.NaN) || !au1.b(Float.NaN, Float.NaN) || !s96Var2.equals(s96Var) || !viewJ.equals(view) || !js3.i(qj1Var2, qj1Var)) {
                jVar.D0();
            }
        }
        jVar.E0();
    }
}
