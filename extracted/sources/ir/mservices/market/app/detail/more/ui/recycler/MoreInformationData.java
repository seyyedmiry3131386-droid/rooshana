package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreInformationData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_more_information;
    public final String a;

    public MoreInformationData() {
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
        return MoreInformationData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return MoreInformationData.class.hashCode();
    }
}
