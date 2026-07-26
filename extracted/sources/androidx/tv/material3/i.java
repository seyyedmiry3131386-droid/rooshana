package androidx.tv.material3;

import android.graphics.Paint;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.gx4;
import defpackage.js3;
import defpackage.jx9;
import defpackage.kc8;
import defpackage.mx4;
import defpackage.tw8;
import defpackage.xr7;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
final class i extends mx4 {
    public final xr7 b;
    public final float c;
    public final long d;
    public final dp2 e;

    public i(xr7 xr7Var, float f, long j, dp2 dp2Var) {
        this.b = xr7Var;
        this.c = f;
        this.d = j;
        this.e = dp2Var;
    }

    public final boolean equals(Object obj) {
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && js3.i(this.b, iVar.b) && this.c == iVar.c && zu0.c(this.d, iVar.d);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        kc8 kc8Var = new kc8();
        kc8Var.o = this.b;
        kc8Var.p = this.c;
        kc8Var.q = this.d;
        return kc8Var;
    }

    public final int hashCode() {
        int iG = dw1.g(this.c, this.b.hashCode() * 31, 31);
        int i = zu0.i;
        return tw8.a(this.d) + iG;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        kc8 kc8Var = (kc8) gx4Var;
        kc8Var.o = this.b;
        kc8Var.p = this.c;
        kc8Var.q = this.d;
        if (kc8Var.r == null) {
            jx9 jx9VarC = dt2.c();
            kc8Var.r = jx9VarC;
            kc8Var.s = (Paint) jx9VarC.b;
        }
        kc8Var.C0();
    }
}
