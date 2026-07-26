package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class do8 implements qp2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    public final /* synthetic */ a c;

    public do8(float f, long j, a aVar) {
        this.a = f;
        this.b = j;
        this.c = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        gj8 gj8Var;
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            hx4 hx4VarY = yh0.y(b.k(ex4.b, fo8.c, fo8.b, this.a, Float.NaN), fo8.d);
            cl4 cl4VarD = bg0.d(eq.c, false);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarY);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cl4VarD);
            ia7.o(qz0Var, d.e, j56VarL);
            qp2 qp2Var = d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, d.d, hx4VarC);
            TypographyKeyTokens typographyKeyTokens = j96.d;
            zv8 zv8Var = (zv8) qz0Var.j(bw8.a);
            switch (typographyKeyTokens.ordinal()) {
                case 0:
                    gj8Var = zv8Var.j;
                    break;
                case 1:
                    gj8Var = zv8Var.k;
                    break;
                case 2:
                    gj8Var = zv8Var.l;
                    break;
                case 3:
                    gj8Var = zv8Var.a;
                    break;
                case 4:
                    gj8Var = zv8Var.b;
                    break;
                case 5:
                    gj8Var = zv8Var.c;
                    break;
                case 6:
                    gj8Var = zv8Var.d;
                    break;
                case 7:
                    gj8Var = zv8Var.e;
                    break;
                case 8:
                    gj8Var = zv8Var.f;
                    break;
                case 9:
                    gj8Var = zv8Var.m;
                    break;
                case 10:
                    gj8Var = zv8Var.n;
                    break;
                case 11:
                    gj8Var = zv8Var.o;
                    break;
                case 12:
                    gj8Var = zv8Var.g;
                    break;
                case 13:
                    gj8Var = zv8Var.h;
                    break;
                case 14:
                    gj8Var = zv8Var.i;
                    break;
                case 15:
                    gj8Var = zv8Var.y;
                    break;
                case 16:
                    gj8Var = zv8Var.z;
                    break;
                case 17:
                    gj8Var = zv8Var.A;
                    break;
                case 18:
                    gj8Var = zv8Var.p;
                    break;
                case 19:
                    gj8Var = zv8Var.q;
                    break;
                case 20:
                    gj8Var = zv8Var.r;
                    break;
                case 21:
                    gj8Var = zv8Var.s;
                    break;
                case 22:
                    gj8Var = zv8Var.t;
                    break;
                case 23:
                    gj8Var = zv8Var.u;
                    break;
                case 24:
                    gj8Var = zv8Var.B;
                    break;
                case 25:
                    gj8Var = zv8Var.C;
                    break;
                case 26:
                    gj8Var = zv8Var.D;
                    break;
                case 27:
                    gj8Var = zv8Var.v;
                    break;
                case 28:
                    gj8Var = zv8Var.w;
                    break;
                case 29:
                    gj8Var = zv8Var.x;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            zk8.c(new um[]{u31.a.a(new zu0(this.b)), mi8.a.a(gj8Var)}, this.c, qz0Var, 8);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
