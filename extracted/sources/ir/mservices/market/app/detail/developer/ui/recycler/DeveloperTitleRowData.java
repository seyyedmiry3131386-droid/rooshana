package ir.mservices.market.app.detail.developer.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperTitleRowData implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.developer_title_view;
    public final String a;
    public final int b;

    public DeveloperTitleRowData(String str, int i) {
        this.a = str;
        this.b = i;
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
        if (!(obj instanceof DeveloperTitleRowData)) {
            return false;
        }
        DeveloperTitleRowData developerTitleRowData = (DeveloperTitleRowData) obj;
        return js3.i(this.a, developerTitleRowData.a) && this.b == developerTitleRowData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }
}
