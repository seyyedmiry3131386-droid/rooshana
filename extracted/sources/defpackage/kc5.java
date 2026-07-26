package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.myAccount.recycler.MyAccountInfoNestedData;
import ir.mservices.market.myAccount.recycler.MyAccountPrivacyNestedData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalNestedData;
import ir.mservices.market.myMarket.recycler.MyMarketNestedData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class kc5 extends a {
    public final /* synthetic */ int K = 2;
    public final og5 L;
    public final int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc5(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, sc5 sc5Var) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(sc5Var, "onClickListener");
        this.L = sc5Var;
        this.M = 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        switch (this.K) {
            case 0:
                return new jc5(1, true);
            case 1:
                return new oc5(1, true);
            case 2:
                return new id5(0, this.x);
            default:
                return new ld5(1, true);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        switch (this.K) {
        }
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final void s(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                MyAccountInfoNestedData myAccountInfoNestedData = (MyAccountInfoNestedData) nestedRecyclerData;
                js3.p(myAccountInfoNestedData, "data");
                super.s(myAccountInfoNestedData);
                l06 l06Var = this.C;
                js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.myAccount.MyAccountInfoNestedAdapter");
                ((jc5) l06Var).o = new qs3(19, this);
                break;
            case 1:
                MyAccountPrivacyNestedData myAccountPrivacyNestedData = (MyAccountPrivacyNestedData) nestedRecyclerData;
                js3.p(myAccountPrivacyNestedData, "data");
                super.s(myAccountPrivacyNestedData);
                l06 l06Var2 = this.C;
                js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.myAccount.MyAccountPrivacyNestedAdapter");
                ((oc5) l06Var2).o = new qs3(20, this);
                break;
            case 2:
                MyMarketHorizontalNestedData myMarketHorizontalNestedData = (MyMarketHorizontalNestedData) nestedRecyclerData;
                js3.p(myMarketHorizontalNestedData, "data");
                super.s(myMarketHorizontalNestedData);
                l06 l06Var3 = this.C;
                js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.myMarket.MyMarketHorizontalNestedAdapter");
                ((id5) l06Var3).o = new qs3(21, this);
                break;
            default:
                MyMarketNestedData myMarketNestedData = (MyMarketNestedData) nestedRecyclerData;
                js3.p(myMarketNestedData, "data");
                super.s(myMarketNestedData);
                l06 l06Var4 = this.C;
                js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.myMarket.MyMarketNestedAdapter");
                ((ld5) l06Var4).o = new qs3(22, this);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        switch (this.K) {
            case 0:
                MyAccountInfoNestedData myAccountInfoNestedData = (MyAccountInfoNestedData) myketRecyclerData;
                js3.p(myAccountInfoNestedData, "data");
                super.s(myAccountInfoNestedData);
                l06 l06Var = this.C;
                js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.myAccount.MyAccountInfoNestedAdapter");
                ((jc5) l06Var).o = new qs3(19, this);
                break;
            case 1:
                MyAccountPrivacyNestedData myAccountPrivacyNestedData = (MyAccountPrivacyNestedData) myketRecyclerData;
                js3.p(myAccountPrivacyNestedData, "data");
                super.s(myAccountPrivacyNestedData);
                l06 l06Var2 = this.C;
                js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.myAccount.MyAccountPrivacyNestedAdapter");
                ((oc5) l06Var2).o = new qs3(20, this);
                break;
            case 2:
                MyMarketHorizontalNestedData myMarketHorizontalNestedData = (MyMarketHorizontalNestedData) myketRecyclerData;
                js3.p(myMarketHorizontalNestedData, "data");
                super.s(myMarketHorizontalNestedData);
                l06 l06Var3 = this.C;
                js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.myMarket.MyMarketHorizontalNestedAdapter");
                ((id5) l06Var3).o = new qs3(21, this);
                break;
            default:
                MyMarketNestedData myMarketNestedData = (MyMarketNestedData) myketRecyclerData;
                js3.p(myMarketNestedData, "data");
                super.s(myMarketNestedData);
                l06 l06Var4 = this.C;
                js3.n(l06Var4, "null cannot be cast to non-null type ir.mservices.market.myMarket.MyMarketNestedAdapter");
                ((ld5) l06Var4).o = new qs3(22, this);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public d16 x(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 2:
                js3.p((MyMarketHorizontalNestedData) nestedRecyclerData, "data");
                return new d16(0, 0, 0, this.a.getResources().getDimensionPixelSize(pq6.space_2), 2, false, this.x);
            default:
                return super.x(nestedRecyclerData);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        switch (this.K) {
            case 0:
                js3.p((MyAccountInfoNestedData) nestedRecyclerData, "data");
                break;
            case 1:
                js3.p((MyAccountPrivacyNestedData) nestedRecyclerData, "data");
                break;
            case 2:
                js3.p((MyMarketHorizontalNestedData) nestedRecyclerData, "data");
                break;
            default:
                js3.p((MyMarketNestedData) nestedRecyclerData, "data");
                break;
        }
        return new PaddingLayoutManager$Padding(0, 0, 0, 0);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int z() {
        switch (this.K) {
        }
        return this.M;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc5(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, sc5 sc5Var, byte b) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(sc5Var, "onLinkItemClickListener");
        this.L = sc5Var;
        this.M = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc5(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, md5 md5Var) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(md5Var, "onClickListener");
        this.L = md5Var;
        this.M = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc5(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, md5 md5Var, byte b) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(md5Var, "onClickListener");
        this.L = md5Var;
        this.M = 1;
    }
}
