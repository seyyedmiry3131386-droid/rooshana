package ir.mservices.market.appUsage.recycler;

import defpackage.bu;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class InstalledAppUsageData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.holder_installed_app_usage;
    public final bu a;

    public InstalledAppUsageData(bu buVar) {
        js3.p(buVar, "appUsage");
        this.a = buVar;
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
        if (!InstalledAppUsageData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
        return js3.i(this.a, ((InstalledAppUsageData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
