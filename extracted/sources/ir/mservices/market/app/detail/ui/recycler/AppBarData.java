package ir.mservices.market.app.detail.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppBarData extends NestedRecyclerData implements g32, wo2 {
    public static final int j = js6.holder_play_detail_info;
    public final v48 g;
    public final v48 h;
    public final v48 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarData(l lVar, l lVar2, l lVar3, bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(lVar, "appBarSampleDataFlow");
        js3.p(lVar2, "isInfoAnimationStartFlow");
        js3.p(lVar3, "isDownloading");
        js3.p(bz6Var, "recyclerData");
        this.g = lVar;
        this.h = lVar2;
        this.i = lVar3;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppBarData) && js3.i(this.g.getValue(), ((AppBarData) obj).g.getValue());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        Object value = this.g.getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AppBarData{appBarSampleData='" + this.g.getValue() + "}";
    }
}
