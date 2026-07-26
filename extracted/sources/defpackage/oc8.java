package defpackage;

import androidx.compose.foundation.f;
import androidx.compose.material3.e;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.l;

/* JADX INFO: loaded from: classes.dex */
public final class oc8 implements qp2 {
    public final /* synthetic */ hx4 a;
    public final /* synthetic */ xr7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ne0 e;
    public final /* synthetic */ ab5 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bp2 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ a j;

    public oc8(hx4 hx4Var, xr7 xr7Var, long j, float f, ne0 ne0Var, ab5 ab5Var, boolean z, bp2 bp2Var, float f2, a aVar) {
        this.a = hx4Var;
        this.b = xr7Var;
        this.c = j;
        this.d = f;
        this.e = ne0Var;
        this.f = ab5Var;
        this.g = z;
        this.h = bp2Var;
        this.i = f2;
        this.j = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            pc3 pc3Var = e.a;
            hx4 hx4VarD = f.a(pc8.c(this.a.d(yv4.b), this.b, pc8.d(this.c, this.d, qz0Var), this.e, ((qj1) qz0Var.j(l.h)).S(this.i)), this.f, r97.a(0.0f, 7, 0L), this.g, null, this.h, 24).d(new qq0(new sm5(6)));
            cl4 cl4VarD = bg0.d(eq.c, true);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, hx4VarD);
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
            this.j.invoke(qz0Var, 0);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
