package ir.mservices.market.pika.send.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAppData implements MyketRecyclerData, wo2, g32 {
    public static final int a = js6.pika_search;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchAppData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.pika.send.recycler.SearchAppData");
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "SearchAppData";
    }

    public final int hashCode() {
        return SearchAppData.class.hashCode();
    }
}
