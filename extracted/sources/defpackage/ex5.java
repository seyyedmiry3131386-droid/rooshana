package defpackage;

import androidx.compose.material3.l;

/* JADX INFO: loaded from: classes.dex */
public final class ex5 implements rp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wa9 c;
    public final /* synthetic */ ab5 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qp2 f;
    public final /* synthetic */ dh8 g;
    public final /* synthetic */ xr7 h;

    public ex5(String str, boolean z, wa9 wa9Var, ab5 ab5Var, boolean z2, qp2 qp2Var, dh8 dh8Var, xr7 xr7Var) {
        this.a = str;
        this.b = z;
        this.c = wa9Var;
        this.d = ab5Var;
        this.e = z2;
        this.f = qp2Var;
        this.g = dh8Var;
        this.h = xr7Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qp2 qp2Var = (qp2) obj;
        qz0 qz0Var = (qz0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= qz0Var.h(qp2Var) ? 4 : 2;
        }
        if (qz0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            l lVar = l.a;
            xr7 xr7Var = this.h;
            boolean z = this.b;
            boolean z2 = this.e;
            ab5 ab5Var = this.d;
            dh8 dh8Var = this.g;
            lVar.b(this.a, qp2Var, z, this.c, ab5Var, z2, this.f, dh8Var, null, s7.X(-656940872, new dx5(z, z2, ab5Var, dh8Var, xr7Var), qz0Var), qz0Var, (iIntValue << 3) & 112);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
