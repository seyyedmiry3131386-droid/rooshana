package ir.mservices.market.app.common.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.SearchAppListDto;

/* JADX INFO: loaded from: classes3.dex */
public class NestedAppsRowData extends NestedRecyclerData implements g32 {
    public final SearchAppListDto g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedAppsRowData(SearchAppListDto searchAppListDto, bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        long j = is3.p + 1;
        is3.p = j;
        String strValueOf = String.valueOf(j);
        js3.p(strValueOf, "id");
        this.g = searchAppListDto;
        this.h = strValueOf;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public int U() {
        return 0;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return this.g.getHorizontalType();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.common.recycler.NestedAppsRowData");
        return js3.i(this.g, ((NestedAppsRowData) obj).g);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String packageKey = this.g.getPackageKey();
        return packageKey == null ? this.h : packageKey;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
