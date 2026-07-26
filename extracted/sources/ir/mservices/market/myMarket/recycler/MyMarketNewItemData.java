package ir.mservices.market.myMarket.recycler;

import defpackage.js6;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketNewItemData extends MyMarketData {
    public static final int f = js6.holder_my_myket_new;

    @Override // ir.mservices.market.myMarket.recycler.MyMarketData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // ir.mservices.market.myMarket.recycler.MyMarketData
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyMarketNewItemData) && super.equals(obj);
    }

    @Override // ir.mservices.market.myMarket.recycler.MyMarketData
    public final int hashCode() {
        return (super.hashCode() * 31) + 1237;
    }
}
