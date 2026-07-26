package defpackage;

import android.view.View;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class c45 extends qg5 {
    public final int A;
    public final int B;
    public final og5 w;
    public final lw8 x;
    public final d04 y;
    public v53 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c45(View view, GraphicUtils$Dimension graphicUtils$Dimension, nb3 nb3Var) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        this.w = nb3Var;
        w91 w91Var = (w91) qg5.r();
        this.x = (lw8) w91Var.E.get();
        this.y = (d04) w91Var.p.get();
        int dimensionPixelSize = graphicUtils$Dimension.a - ((view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer)) * 2);
        this.A = (int) (((double) dimensionPixelSize) * 0.41d);
        this.B = (int) (dimensionPixelSize * 0.62f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    @Override // defpackage.qg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(ir.mservices.market.common.ui.recycler.MyketRecyclerData r19) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c45.t(ir.mservices.market.common.ui.recycler.MyketRecyclerData):void");
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof v53) {
            this.z = (v53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
