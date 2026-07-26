package defpackage;

import androidx.compose.ui.layout.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t14 extends j14 {
    public final /* synthetic */ g b;
    public final /* synthetic */ qp2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t14(g gVar, qp2 qp2Var, String str) {
        super(str);
        this.b = gVar;
        this.c = qp2Var;
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        g gVar = this.b;
        r14 r14Var = gVar.h;
        r14Var.a = el4Var.getLayoutDirection();
        r14Var.b = el4Var.getDensity();
        r14Var.c = el4Var.O();
        boolean zQ = el4Var.Q();
        qp2 qp2Var = this.c;
        if (zQ || gVar.a.j == null) {
            gVar.d = 0;
            dl4 dl4Var = (dl4) qp2Var.invoke(r14Var, new h31(j));
            return new s14(dl4Var, gVar, gVar.d, dl4Var, 1);
        }
        gVar.e = 0;
        dl4 dl4Var2 = (dl4) qp2Var.invoke(gVar.i, new h31(j));
        return new s14(dl4Var2, gVar, gVar.e, dl4Var2, 0);
    }
}
