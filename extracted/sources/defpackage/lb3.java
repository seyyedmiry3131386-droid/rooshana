package defpackage;

import android.util.TypedValue;
import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeExtReviewModuleData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class lb3 extends a {
    public final og5 K;
    public final og5 L;
    public final og5 M;

    public lb3(View view, GraphicUtils$Dimension graphicUtils$Dimension, ob3 ob3Var, ob3 ob3Var2, ob3 ob3Var3, boolean z) {
        super(view, graphicUtils$Dimension, z);
        this.K = ob3Var;
        this.L = ob3Var2;
        this.M = ob3Var3;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new yb3(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        return this.a.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        HomeExtReviewModuleData homeExtReviewModuleData = (HomeExtReviewModuleData) nestedRecyclerData;
        js3.p(homeExtReviewModuleData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(homeExtReviewModuleData.h.isMulti() ? pq6.multi_app_card_count : pq6.app_card_count, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(HomeExtReviewModuleData homeExtReviewModuleData) {
        js3.p(homeExtReviewModuleData, "data");
        super.s(homeExtReviewModuleData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeReviewExtDataAdapter");
        ((yb3) l06Var).o = new kb3(this, 0);
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeReviewExtDataAdapter");
        ((yb3) l06Var2).m = new kb3(this, 1);
        l06 l06Var3 = this.C;
        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeReviewExtDataAdapter");
        ((yb3) l06Var3).n = new kb3(this, 2);
    }
}
