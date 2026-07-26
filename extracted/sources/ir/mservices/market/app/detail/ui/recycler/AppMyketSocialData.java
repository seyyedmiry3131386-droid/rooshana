package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMyketSocialData implements MyketRecyclerData, wo2, g32 {
    public static final int a = js6.myket_social_module;

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
        return AppMyketSocialData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(AppMyketSocialData.class.hashCode());
    }

    public final int hashCode() {
        return AppMyketSocialData.class.hashCode();
    }
}
