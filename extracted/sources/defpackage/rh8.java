package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.f;

/* JADX INFO: loaded from: classes.dex */
public final class rh8 implements wg8 {
    public final /* synthetic */ f a;

    public rh8(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.wg8
    public final void a(long j, y45 y45Var) {
        si8 si8VarD;
        f fVar = this.a;
        long jA = an7.a(fVar.o(true));
        x44 x44Var = fVar.d;
        if (x44Var == null || (si8VarD = x44Var.d()) == null) {
            return;
        }
        long jE = si8VarD.e(jA);
        fVar.n = jE;
        ((s08) fVar.r).setValue(new nr5(jE));
        fVar.p = 0L;
        ((s08) fVar.q).setValue(Handle.a);
        fVar.w(false);
    }

    @Override // defpackage.wg8
    public final void b() {
        f fVar = this.a;
        f.d(fVar, null);
        f.c(fVar, null);
    }

    @Override // defpackage.wg8
    public final void c() {
        f fVar = this.a;
        f.d(fVar, null);
        f.c(fVar, null);
    }

    @Override // defpackage.wg8
    public final void e(long j) {
        si8 si8VarD;
        yw2 yw2Var;
        f fVar = this.a;
        fVar.p = nr5.g(fVar.p, j);
        x44 x44Var = fVar.d;
        if (x44Var == null || (si8VarD = x44Var.d()) == null) {
            return;
        }
        ((s08) fVar.r).setValue(new nr5(nr5.g(fVar.n, fVar.p)));
        rr5 rr5Var = fVar.b;
        nr5 nr5VarL = fVar.l();
        js3.m(nr5VarL);
        int iH = rr5Var.h(si8VarD.b(nr5VarL.a, true));
        long jB = uy6.b(iH, iH);
        if (zi8.c(jB, fVar.q().b)) {
            return;
        }
        x44 x44Var2 = fVar.d;
        if ((x44Var2 == null || ((Boolean) ((s08) x44Var2.q).getValue()).booleanValue()) && (yw2Var = fVar.j) != null) {
            yw2Var.a(9);
        }
        fVar.c.invoke(f.g(fVar.q().a, jB));
        fVar.v = new zi8(jB);
    }

    @Override // defpackage.wg8
    public final void d() {
    }

    @Override // defpackage.wg8
    public final void onCancel() {
    }
}
