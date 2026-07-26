package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.material3.internal.m;
import androidx.compose.material3.l;

/* JADX INFO: loaded from: classes.dex */
public final class fx5 implements qp2 {
    public final /* synthetic */ hx4 a;
    public final /* synthetic */ qp2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dh8 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ dp2 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ gj8 h;
    public final /* synthetic */ ty3 i;
    public final /* synthetic */ sy3 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ wa9 m;
    public final /* synthetic */ ab5 n;
    public final /* synthetic */ xr7 o;

    public fx5(hx4 hx4Var, qp2 qp2Var, boolean z, dh8 dh8Var, String str, dp2 dp2Var, boolean z2, gj8 gj8Var, ty3 ty3Var, sy3 sy3Var, int i, int i2, wa9 wa9Var, ab5 ab5Var, xr7 xr7Var) {
        this.a = hx4Var;
        this.b = qp2Var;
        this.c = z;
        this.d = dh8Var;
        this.e = str;
        this.f = dp2Var;
        this.g = z2;
        this.h = gj8Var;
        this.i = ty3Var;
        this.j = sy3Var;
        this.k = i;
        this.l = i2;
        this.m = wa9Var;
        this.n = ab5Var;
        this.o = xr7Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        hx4 hx4VarD;
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            if (this.b != null) {
                qz0Var.a0(-903490605);
                Object objM = qz0Var.M();
                if (objM == jz0.a) {
                    objM = new sm5(6);
                    qz0Var.l0(objM);
                }
                hx4VarD = yh0.D(new eu((dp2) objM, true), 0.0f, m.d(qz0Var), 0.0f, 0.0f, 13);
                qz0Var.q(false);
            } else {
                qz0Var.a0(-903106918);
                qz0Var.q(false);
                hx4VarD = ex4.b;
            }
            hx4 hx4VarD2 = this.a.d(hx4VarD);
            String strG = uy6.g(zs6.default_error_message, qz0Var);
            float f = m.a;
            if (this.c) {
                hx4VarD2 = hn7.a(hx4VarD2, false, new kt(strG, 12));
            }
            hx4 hx4VarA = b.a(hx4VarD2, l.c, l.b);
            dh8 dh8Var = this.d;
            boolean z = this.c;
            k18 k18Var = new k18(z ? dh8Var.j : dh8Var.i);
            qp2 qp2Var = this.b;
            xr7 xr7Var = this.o;
            String str = this.e;
            boolean z2 = this.g;
            wa9 wa9Var = this.m;
            ab5 ab5Var = this.n;
            ka0.a(str, this.f, hx4VarA, z2, this.h, this.i, this.j, this.k, this.l, wa9Var, null, ab5Var, k18Var, s7.X(-1189274459, new ex5(str, z2, wa9Var, ab5Var, z, qp2Var, dh8Var, xr7Var), qz0Var), qz0Var, 0);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
