package ir.mservices.market.myMarket.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketAboutData implements MyketRecyclerData, g32 {
    public static final int a = js6.my_market_about;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(super.hashCode());
    }
}
