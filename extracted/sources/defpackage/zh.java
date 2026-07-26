package defpackage;

import androidx.compose.ui.draw.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh implements rp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zh(bp2 bp2Var, boolean z) {
        this.c = bp2Var;
        this.b = z;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                final bp2 bp2Var = (bp2) this.c;
                hx4 hx4Var = (hx4) obj;
                qz0 qz0Var = (qz0) obj2;
                ((Integer) obj3).getClass();
                qz0Var.a0(-196777734);
                final long j = ((bj8) qz0Var.j(cj8.a)).a;
                boolean zE = qz0Var.e(j) | qz0Var.f(bp2Var);
                final boolean z = this.b;
                boolean zG = zE | qz0Var.g(z);
                Object objM = qz0Var.M();
                if (zG || objM == jz0.a) {
                    objM = new dp2() { // from class: ai
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj4) {
                            b bVar = (b) obj4;
                            return bVar.b(new sh(bp2Var, z, tt3.s(bVar, Float.intBitsToFloat((int) (bVar.a.d() >> 32)) / 2.0f), new tc0(5, j)));
                        }
                    };
                    qz0Var.l0(objM);
                }
                hx4 hx4VarD = wn5.D(hx4Var, (dp2) objM);
                qz0Var.q(false);
                return hx4VarD;
            default:
                String str = (String) this.c;
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (!qz0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qz0Var2.U();
                } else if (this.b) {
                    qz0Var2.a0(2135716165);
                    float fQ = ml9.q(hq6.size_20, qz0Var2);
                    Object objJ = qz0Var2.j(uj8.a);
                    js3.m(objJ);
                    km6.a(androidx.compose.foundation.layout.b.i(ex4.b, fQ), ((tj8) objJ).q, ml9.q(hq6.loading_indicator_thickness, qz0Var2), 0L, 0, 0, qz0Var2, 196608);
                    qz0Var2.q(false);
                } else {
                    qz0Var2.a0(2135979882);
                    mi8.b(str, null, 0L, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, ((wf5) qz0Var2.j(aw8.a)).f, qz0Var2, 0, 0, 130046);
                    qz0Var2.q(false);
                }
                return tx8.a;
        }
    }

    public /* synthetic */ zh(boolean z, String str) {
        this.b = z;
        this.c = str;
    }
}
