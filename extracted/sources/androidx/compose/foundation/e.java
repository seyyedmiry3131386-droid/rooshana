package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.bp2;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.jz0;
import defpackage.o40;
import defpackage.qm3;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.um3;
import defpackage.v97;

/* JADX INFO: loaded from: classes.dex */
public final class e implements rp2 {
    public final /* synthetic */ um3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ v97 c;
    public final /* synthetic */ bp2 d;

    public e(um3 um3Var, boolean z, v97 v97Var, bp2 bp2Var) {
        this.a = um3Var;
        this.b = z;
        this.c = v97Var;
        this.d = bp2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        ((Number) obj3).intValue();
        qz0Var.a0(-1525724089);
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = o40.r(qz0Var);
        }
        ab5 ab5Var = (ab5) objM;
        hx4 hx4VarD = qm3.a(ex4.b, ab5Var, this.a).d(new ClickableElement(ab5Var, null, false, this.b, null, this.c, this.d));
        qz0Var.q(false);
        return hx4VarD;
    }
}
