package ir.mservices.market.appUsage.recycler;

import defpackage.f68;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.appUsage.data.SortMode;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class StorageUsageFixedHeaderData implements MyketRecyclerData, wo2, g32 {
    public static final int d = js6.storage_usage_fixed_header;
    public final f68 a;
    public final SortMode b;
    public final String c;

    public StorageUsageFixedHeaderData(f68 f68Var, SortMode sortMode) {
        js3.p(f68Var, "storageInfo");
        js3.p(sortMode, "sortMode");
        this.a = f68Var;
        this.b = sortMode;
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StorageUsageFixedHeaderData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.StorageUsageFixedHeaderData");
        StorageUsageFixedHeaderData storageUsageFixedHeaderData = (StorageUsageFixedHeaderData) obj;
        if (this.b == storageUsageFixedHeaderData.b) {
            return false;
        }
        return js3.i(this.a, storageUsageFixedHeaderData.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
