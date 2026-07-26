package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreSimpleData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_app_product;
    public final int a;

    public MoreSimpleData(int i) {
        this.a = i;
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
        if (!MoreSimpleData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.more.ui.recycler.MoreSimpleData");
        return this.a == ((MoreSimpleData) obj).a;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a);
    }

    public final int hashCode() {
        return this.a;
    }
}
