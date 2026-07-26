package androidx.compose.material3.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bg0;
import defpackage.bp2;
import defpackage.cl4;
import defpackage.eq;
import defpackage.ex4;
import defpackage.gx5;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.is3;
import defpackage.j56;
import defpackage.js3;
import defpackage.lh8;
import defpackage.o40;
import defpackage.ok4;
import defpackage.pd;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.vt;
import defpackage.wb5;
import defpackage.wn5;
import defpackage.wy5;

/* JADX INFO: loaded from: classes.dex */
public final class k implements qp2 {
    public final /* synthetic */ wb5 a;
    public final /* synthetic */ lh8 b;
    public final /* synthetic */ wy5 c;
    public final /* synthetic */ androidx.compose.runtime.internal.a d;

    public k(wb5 wb5Var, lh8 lh8Var, wy5 wy5Var, androidx.compose.runtime.internal.a aVar) {
        this.a = wb5Var;
        this.b = lh8Var;
        this.c = wy5Var;
        this.d = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            hx4 hx4VarZ = is3.z(ex4.b, "Container");
            TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1 textFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1 = new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1(this.a, wb5.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0);
            pd pdVarC = m.c(this.b);
            float f = gx5.a;
            hx4 hx4VarE = wn5.E(hx4VarZ, new vt(textFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, this.c, pdVarC, 18));
            cl4 cl4VarD = bg0.d(eq.c, true);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarE);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, cl4VarD);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            qp2 qp2Var = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            this.d.invoke(qz0Var, 0);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
