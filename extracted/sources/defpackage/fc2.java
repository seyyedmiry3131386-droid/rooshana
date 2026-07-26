package defpackage;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class fc2 extends gx4 implements f14 {
    public Direction o;
    public float p;

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!h31.d(j) || this.o == Direction.a) {
            iJ = h31.j(j);
            iH = h31.h(j);
        } else {
            int iRound = Math.round(h31.h(j) * this.p);
            int iJ2 = h31.j(j);
            iJ = h31.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!h31.c(j) || this.o == Direction.b) {
            int i = h31.i(j);
            iG = h31.g(j);
            iG2 = i;
        } else {
            int iRound2 = Math.round(h31.g(j) * this.p);
            int i2 = h31.i(j);
            iG2 = h31.g(j);
            if (iRound2 < i2) {
                iRound2 = i2;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        b96 b96VarT = yk4Var.t(j31.a(iJ, iH, iG2, iG));
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new q(b96VarT, 4));
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }
}
