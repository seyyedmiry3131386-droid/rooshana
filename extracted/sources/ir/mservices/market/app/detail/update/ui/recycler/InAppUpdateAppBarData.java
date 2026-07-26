package ir.mservices.market.app.detail.update.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.data.AppBarSampleData;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppUpdateAppBarData implements MyketRecyclerData, g32 {
    public static final int b = js6.inapp_update_appbar;
    public final AppBarSampleData a;

    public InAppUpdateAppBarData(AppBarSampleData appBarSampleData) {
        this.a = appBarSampleData;
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
        if (obj instanceof InAppUpdateAppBarData) {
            return js3.i(this.a, ((InAppUpdateAppBarData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.hashCode());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
