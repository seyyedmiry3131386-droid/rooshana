package defpackage;

import android.util.TypedValue;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eb3 extends a {
    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new ab3(1);
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
        js3.p((HomeBannerAppsData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.multi_app_card_count, typedValue, true);
        return typedValue.getFloat();
    }

    public final ab3 J() {
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeBannerAppsDataAdapter");
        return (ab3) l06Var;
    }
}
