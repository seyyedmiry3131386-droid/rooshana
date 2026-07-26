package ir.mservices.market.search.history.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.detail.data.RecommendationDto;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSearchRecommendedData extends NestedRecyclerData implements wo2, g32 {
    public static final int i = js6.recommended_apps_view;
    public final RecommendationDto g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSearchRecommendedData(bz6 bz6Var, RecommendationDto recommendationDto, Tracker tracker, dp2 dp2Var, String str) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "recyclerData");
        js3.p(str, "id");
        this.g = recommendationDto;
        this.h = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return this.g.getHorizontalType();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AppSearchRecommendedData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.AppSearchRecommendedData");
        AppSearchRecommendedData appSearchRecommendedData = (AppSearchRecommendedData) obj;
        return js3.i(this.g, appSearchRecommendedData.g) && js3.i(this.h, appSearchRecommendedData.h);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }
}
