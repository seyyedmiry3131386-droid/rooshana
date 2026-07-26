package ir.mservices.market.search.history.ui.recycler;

import defpackage.ay3;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHistoryHorizontalTagsData extends NestedRecyclerData implements wo2, ay3, g32 {
    public static final int i = js6.holder_search_tag;
    public int g;
    public final String h;

    public SearchHistoryHorizontalTagsData(bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        long j = is3.p + 1;
        is3.p = j;
        this.h = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
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
        return obj != null && SearchHistoryHorizontalTagsData.class.equals(obj.getClass());
    }

    @Override // defpackage.ay3
    public final String getKey() {
        return "TAGS";
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h;
    }

    public final int hashCode() {
        return Objects.hash(this.b.a.getValue());
    }
}
