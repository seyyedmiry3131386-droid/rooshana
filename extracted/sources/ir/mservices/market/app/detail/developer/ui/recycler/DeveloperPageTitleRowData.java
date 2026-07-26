package ir.mservices.market.app.detail.developer.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperPageTitleRowData implements MyketRecyclerData, g32 {
    public static final int b = js6.developer_page_title_view;
    public final String a;

    public DeveloperPageTitleRowData() {
        long j = is3.p + 1;
        is3.p = j;
        this.a = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeveloperPageTitleRowData) {
            return js3.i(this.a, ((DeveloperPageTitleRowData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) + 31;
    }
}
