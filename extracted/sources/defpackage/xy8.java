package defpackage;

import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class xy8 extends gx4 implements f14 {
    public float o;
    public float p;

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        int iL = yk4Var.l(i);
        int iA = !Float.isNaN(this.o) ? o40.a(jVar, this.o) : 0;
        return iL < iA ? iA : iL;
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        int iP = yk4Var.P(i);
        int iA = !Float.isNaN(this.p) ? o40.a(jVar, this.p) : 0;
        return iP < iA ? iA : iP;
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.o) || h31.j(j) != 0) {
            iJ = h31.j(j);
        } else {
            int iB0 = el4Var.b0(this.o);
            iJ = h31.h(j);
            if (iB0 < 0) {
                iB0 = 0;
            }
            if (iB0 <= iJ) {
                iJ = iB0;
            }
        }
        int iH = h31.h(j);
        if (Float.isNaN(this.p) || h31.i(j) != 0) {
            i = h31.i(j);
        } else {
            int iB02 = el4Var.b0(this.p);
            i = h31.g(j);
            int i2 = iB02 >= 0 ? iB02 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        b96 b96VarT = yk4Var.t(j31.a(iJ, iH, i, h31.g(j)));
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new q(b96VarT, 13));
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        int iN = yk4Var.n(i);
        int iA = !Float.isNaN(this.o) ? o40.a(jVar, this.o) : 0;
        return iN < iA ? iA : iN;
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        int iA = yk4Var.a(i);
        int iA2 = !Float.isNaN(this.p) ? o40.a(jVar, this.p) : 0;
        return iA < iA2 ? iA2 : iA;
    }
}
