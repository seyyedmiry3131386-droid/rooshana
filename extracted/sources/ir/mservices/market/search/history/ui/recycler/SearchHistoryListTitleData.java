package ir.mservices.market.search.history.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHistoryListTitleData implements MyketRecyclerData, g32 {
    public static final int c = js6.search_history_list_title;
    public final int a;
    public final String b;

    public SearchHistoryListTitleData(int i) {
        this.a = i;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && SearchHistoryListTitleData.class.equals(obj.getClass()) && this.a == ((SearchHistoryListTitleData) obj).a;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }
}
