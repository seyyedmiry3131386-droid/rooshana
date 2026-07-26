package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.f;

/* JADX INFO: loaded from: classes.dex */
public final class sh8 implements wg8 {
    public final /* synthetic */ f a;
    public final /* synthetic */ boolean b;

    public sh8(f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    @Override // defpackage.wg8
    public final void b() {
        f fVar = this.a;
        f.d(fVar, null);
        f.c(fVar, null);
        fVar.w(true);
    }

    @Override // defpackage.wg8
    public final void c() {
        f fVar = this.a;
        f.d(fVar, null);
        f.c(fVar, null);
        fVar.w(true);
    }

    @Override // defpackage.wg8
    public final void d() {
        si8 si8VarD;
        boolean z = this.b;
        Handle handle = z ? Handle.b : Handle.c;
        f fVar = this.a;
        ((s08) fVar.q).setValue(handle);
        long jA = an7.a(fVar.o(z));
        x44 x44Var = fVar.d;
        if (x44Var == null || (si8VarD = x44Var.d()) == null) {
            return;
        }
        long jE = si8VarD.e(jA);
        fVar.n = jE;
        ((s08) fVar.r).setValue(new nr5(jE));
        fVar.p = 0L;
        fVar.s = -1;
        x44 x44Var2 = fVar.d;
        if (x44Var2 != null) {
            ((s08) x44Var2.q).setValue(Boolean.TRUE);
        }
        fVar.w(false);
    }

    @Override // defpackage.wg8
    public final void e(long j) {
        f fVar = this.a;
        long jG = nr5.g(fVar.p, j);
        fVar.p = jG;
        ((s08) fVar.r).setValue(new nr5(nr5.g(fVar.n, jG)));
        zh8 zh8VarQ = fVar.q();
        nr5 nr5VarL = fVar.l();
        js3.m(nr5VarL);
        f.e(fVar, zh8VarQ, nr5VarL.a, false, this.b, eq.K, true);
        fVar.w(false);
    }

    @Override // defpackage.wg8
    public final void onCancel() {
    }

    @Override // defpackage.wg8
    public final void a(long j, y45 y45Var) {
    }
}
