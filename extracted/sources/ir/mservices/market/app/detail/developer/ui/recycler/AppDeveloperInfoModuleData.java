package ir.mservices.market.app.detail.developer.ui.recycler;

import defpackage.g32;
import defpackage.hl1;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDeveloperInfoModuleData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.developer_info_view;
    public final hl1 a;

    public AppDeveloperInfoModuleData(hl1 hl1Var) {
        this.a = hl1Var;
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
        if (!(obj instanceof AppDeveloperInfoModuleData)) {
            return false;
        }
        hl1 hl1Var = ((AppDeveloperInfoModuleData) obj).a;
        hl1 hl1Var2 = this.a;
        return js3.i(hl1Var2, hl1Var) && js3.i(hl1Var2.d, hl1Var.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.d;
    }

    public final int hashCode() {
        return this.a.d.hashCode();
    }
}
