package defpackage;

import androidx.compose.material3.l;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes.dex */
public final class dx5 implements qp2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ab5 c;
    public final /* synthetic */ dh8 d;
    public final /* synthetic */ xr7 e;

    public dx5(boolean z, boolean z2, ab5 ab5Var, dh8 dh8Var, xr7 xr7Var) {
        this.a = z;
        this.b = z2;
        this.c = ab5Var;
        this.d = dh8Var;
        this.e = xr7Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            l.a.a(this.a, this.b, this.c, null, this.d, this.e, 0.0f, 0.0f, qz0Var, 100663296, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
