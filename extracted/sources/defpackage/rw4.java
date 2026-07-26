package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.k;
import androidx.compose.material3.n;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.o;

/* JADX INFO: loaded from: classes.dex */
public final class rw4 implements qp2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ bp2 b;
    public final /* synthetic */ n c;
    public final /* synthetic */ uw4 d;
    public final /* synthetic */ a e;
    public final /* synthetic */ e71 f;
    public final /* synthetic */ dp2 g;
    public final /* synthetic */ hx4 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ xr7 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ androidx.compose.runtime.internal.a o;
    public final /* synthetic */ qp2 p;
    public final /* synthetic */ androidx.compose.runtime.internal.a q;

    public rw4(long j, bp2 bp2Var, n nVar, uw4 uw4Var, a aVar, e71 e71Var, dp2 dp2Var, hx4 hx4Var, float f, boolean z, xr7 xr7Var, long j2, long j3, float f2, androidx.compose.runtime.internal.a aVar2, qp2 qp2Var, androidx.compose.runtime.internal.a aVar3) {
        this.a = j;
        this.b = bp2Var;
        this.c = nVar;
        this.d = uw4Var;
        this.e = aVar;
        this.f = e71Var;
        this.g = dp2Var;
        this.h = hx4Var;
        this.i = f;
        this.j = z;
        this.k = xr7Var;
        this.l = j2;
        this.m = j3;
        this.n = f2;
        this.o = aVar2;
        this.p = qp2Var;
        this.q = aVar3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            hx4 hx4VarD = ml9.D(b.c, o.a, new g39(9));
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = new us3(15);
                qz0Var.l0(objM);
            }
            hx4 hx4VarA = hn7.a(hx4VarD, false, (dp2) objM);
            cl4 cl4VarD = bg0.d(eq.c, false);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarA);
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
            n nVar = this.c;
            boolean z = ((SheetValue) nVar.d.h.getValue()) != SheetValue.a;
            boolean z2 = this.d.c;
            long j = this.a;
            bp2 bp2Var2 = this.b;
            k.c(j, bp2Var2, z, z2, qz0Var, 0);
            k.b(this.e, this.f, bp2Var2, this.g, this.h, nVar, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, qz0Var, 70);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
