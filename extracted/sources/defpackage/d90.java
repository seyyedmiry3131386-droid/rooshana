package defpackage;

import android.util.TypedValue;
import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeSingleAppData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d90 extends a {
    public final og5 K;
    public final og5 L;
    public final og5 M;
    public final int N;

    public d90(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2, og5 og5Var3) {
        super(view, graphicUtils$Dimension, z);
        this.K = og5Var;
        this.L = og5Var2;
        this.M = og5Var3;
        this.N = 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new ac3(this.w, yq2.n0(this.a.getContext()));
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int C() {
        return 0;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((HomeSingleAppData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.multi_app_card_count, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void s(HomeSingleAppData homeSingleAppData) {
        js3.p(homeSingleAppData, "data");
        super.s(homeSingleAppData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeSingleAppDataAdapter");
        og5 og5Var = this.K;
        js3.p(og5Var, "<set-?>");
        ((ac3) l06Var).o = og5Var;
        l06 l06Var2 = this.C;
        js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeSingleAppDataAdapter");
        og5 og5Var2 = this.L;
        js3.p(og5Var2, "<set-?>");
        ((ac3) l06Var2).p = og5Var2;
        l06 l06Var3 = this.C;
        js3.n(l06Var3, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeSingleAppDataAdapter");
        og5 og5Var3 = this.M;
        js3.p(og5Var3, "<set-?>");
        ((ac3) l06Var3).q = og5Var3;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int z() {
        return this.N;
    }
}
