package defpackage;

import android.view.View;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class x62 extends a {
    public final Integer K;
    public final og5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x62(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, Integer num, og5 og5Var) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(og5Var, "onClickListener");
        this.K = num;
        this.L = og5Var;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new w62(this.K);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        return this.a.getResources().getDimensionPixelSize(pq6.item_nested_end_margin) / 2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((ExtHeaderRowData) nestedRecyclerData, "data");
        return 1.0f;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        ExtHeaderRowData extHeaderRowData = (ExtHeaderRowData) nestedRecyclerData;
        js3.p(extHeaderRowData, "data");
        super.s(extHeaderRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowDataAdapter");
        og5 og5Var = this.L;
        js3.p(og5Var, "<set-?>");
        ((w62) l06Var).n = og5Var;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ExtHeaderRowData extHeaderRowData = (ExtHeaderRowData) myketRecyclerData;
        js3.p(extHeaderRowData, "data");
        super.s(extHeaderRowData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowDataAdapter");
        og5 og5Var = this.L;
        js3.p(og5Var, "<set-?>");
        ((w62) l06Var).n = og5Var;
    }
}
