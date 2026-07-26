package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.myAccount.recycler.MyAccountCheckBoxData;
import ir.mservices.market.myAccount.recycler.MyAccountPrivateNestedData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class rc5 extends a {
    public final og5 K;
    public final og5 L;
    public final int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc5(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, ur4 ur4Var, sc5 sc5Var) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(ur4Var, "onCheckboxClickListener");
        js3.p(sc5Var, "onSpannableTextClickListener");
        this.K = ur4Var;
        this.L = sc5Var;
        this.M = 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new pc5(1, true);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [qc5] */
    /* JADX WARN: Type inference failed for: r1v0, types: [qc5] */
    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(MyAccountPrivateNestedData myAccountPrivateNestedData) {
        js3.p(myAccountPrivateNestedData, "data");
        super.s(myAccountPrivateNestedData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.myAccount.MyAccountPrivateNestedAdapter");
        final int i = 0;
        ((pc5) l06Var).o = new og5(this) { // from class: qc5
            public final /* synthetic */ rc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ir.mservices.market.myAccount.recycler.a aVar = (ir.mservices.market.myAccount.recycler.a) qg5Var;
                MyAccountCheckBoxData myAccountCheckBoxData = (MyAccountCheckBoxData) obj;
                switch (i) {
                    case 0:
                        js3.p(view, "view");
                        js3.p(aVar, "viewHolder");
                        js3.p(myAccountCheckBoxData, "recyclerData");
                        this.b.K.m(view, aVar, myAccountCheckBoxData);
                        break;
                    default:
                        js3.p(view, "view");
                        js3.p(aVar, "viewHolder");
                        js3.p(myAccountCheckBoxData, "recyclerData");
                        this.b.L.m(view, aVar, myAccountCheckBoxData);
                        break;
                }
            }
        };
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.myAccount.MyAccountPrivateNestedAdapter");
        final int i2 = 1;
        ((pc5) l06Var2).p = new og5(this) { // from class: qc5
            public final /* synthetic */ rc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ir.mservices.market.myAccount.recycler.a aVar = (ir.mservices.market.myAccount.recycler.a) qg5Var;
                MyAccountCheckBoxData myAccountCheckBoxData = (MyAccountCheckBoxData) obj;
                switch (i2) {
                    case 0:
                        js3.p(view, "view");
                        js3.p(aVar, "viewHolder");
                        js3.p(myAccountCheckBoxData, "recyclerData");
                        this.b.K.m(view, aVar, myAccountCheckBoxData);
                        break;
                    default:
                        js3.p(view, "view");
                        js3.p(aVar, "viewHolder");
                        js3.p(myAccountCheckBoxData, "recyclerData");
                        this.b.L.m(view, aVar, myAccountCheckBoxData);
                        break;
                }
            }
        };
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((MyAccountPrivateNestedData) nestedRecyclerData, "data");
        return new PaddingLayoutManager$Padding(0, 0, 0, 0);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int z() {
        return this.M;
    }
}
