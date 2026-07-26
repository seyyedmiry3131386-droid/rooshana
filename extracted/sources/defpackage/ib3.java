package defpackage;

import android.view.View;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class ib3 extends qg5 {
    public fb3 A;
    public final GraphicUtils$Dimension w;
    public final og5 x;
    public int y;
    public final dv2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib3(View view, GraphicUtils$Dimension graphicUtils$Dimension, og5 og5Var) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(og5Var, "onBannerClickListener");
        this.w = graphicUtils$Dimension;
        this.x = og5Var;
        this.z = (dv2) ((w91) qg5.r()).q.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    @Override // defpackage.qg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(ir.mservices.market.common.ui.recycler.MyketRecyclerData r13) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib3.t(ir.mservices.market.common.ui.recycler.MyketRecyclerData):void");
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof fb3) {
            this.A = (fb3) a79Var;
        } else {
            lw.g(null, "Data binding is incompatible", null);
        }
    }
}
