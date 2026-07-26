package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.f;

/* JADX INFO: loaded from: classes.dex */
public final class th8 implements wg8 {
    public zi8 b;
    public final /* synthetic */ f d;
    public boolean a = true;
    public y45 c = eq.H;

    public th8(f fVar) {
        this.d = fVar;
    }

    @Override // defpackage.wg8
    public final void a(long j, y45 y45Var) {
        long j2;
        si8 si8VarD;
        si8 si8VarD2;
        f fVar = this.d;
        wb5 wb5Var = fVar.q;
        if (fVar.n() && ((Handle) ((s08) wb5Var).getValue()) == null) {
            ((s08) wb5Var).setValue(Handle.c);
            fVar.s = -1;
            this.a = true;
            this.c = y45Var;
            fVar.r();
            x44 x44Var = fVar.d;
            if (x44Var == null || (si8VarD2 = x44Var.d()) == null || !si8VarD2.c(j)) {
                j2 = j;
                x44 x44Var2 = fVar.d;
                if (x44Var2 != null && (si8VarD = x44Var2.d()) != null) {
                    int iH = fVar.b.h(si8VarD.b(j2, true));
                    zh8 zh8VarG = f.g(fVar.q().a, uy6.b(iH, iH));
                    fVar.j(false);
                    yw2 yw2Var = fVar.j;
                    if (yw2Var != null) {
                        yw2Var.a(9);
                    }
                    fVar.c.invoke(zh8VarG);
                    fVar.v = new zi8(zh8VarG.b);
                }
                this.a = false;
            } else {
                if (fVar.q().a.b.length() == 0) {
                    return;
                }
                fVar.j(false);
                long jE = f.e(fVar, zh8.a(fVar.q(), null, zi8.b, 5), j, true, false, this.c, true);
                j2 = j;
                fVar.o = new zi8(jE);
                this.b = new zi8(jE);
            }
            fVar.t(HandleState.a);
            fVar.n = j2;
            ((s08) fVar.r).setValue(new nr5(j2));
            fVar.p = 0L;
        }
    }

    @Override // defpackage.wg8
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    @Override // defpackage.wg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r9) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th8.e(long):void");
    }

    public final void f() {
        f fVar = this.d;
        ((s08) fVar.q).setValue(null);
        ((s08) fVar.r).setValue(null);
        this.c = eq.H;
        fVar.w(true);
        zi8 zi8Var = this.b;
        boolean zD = zi8.d(zi8Var != null ? zi8Var.a : fVar.q().b);
        fVar.t(zD ? HandleState.c : HandleState.b);
        x44 x44Var = fVar.d;
        if (x44Var != null) {
            ((s08) x44Var.m).setValue(Boolean.valueOf(!zD && za7.r(fVar, true)));
        }
        x44 x44Var2 = fVar.d;
        if (x44Var2 != null) {
            ((s08) x44Var2.n).setValue(Boolean.valueOf(!zD && za7.r(fVar, false)));
        }
        x44 x44Var3 = fVar.d;
        if (x44Var3 != null) {
            ((s08) x44Var3.o).setValue(Boolean.valueOf(zD && za7.r(fVar, true)));
        }
        if (this.a) {
            f.b(fVar, fVar.o);
        }
        fVar.o = null;
    }

    @Override // defpackage.wg8
    public final void onCancel() {
        f();
    }

    @Override // defpackage.wg8
    public final void c() {
    }

    @Override // defpackage.wg8
    public final void d() {
    }
}
