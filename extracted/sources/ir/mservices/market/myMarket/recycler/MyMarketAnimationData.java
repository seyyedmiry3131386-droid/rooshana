package ir.mservices.market.myMarket.recycler;

import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.myMarket.recycler.MyMarketData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketAnimationData extends MyMarketData {
    public static final int g = js6.my_market_animation_row;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMarketAnimationData(int i, int i2, MyMarketData.ItemType itemType, boolean z) {
        super(i, i2, itemType, false);
        js3.p(itemType, "type");
        this.f = z;
    }

    @Override // ir.mservices.market.myMarket.recycler.MyMarketData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.myMarket.recycler.MyMarketData
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MyMarketAnimationData) && super.equals(obj)) {
            return this.f == ((MyMarketAnimationData) obj).f;
        }
        return false;
    }

    @Override // ir.mservices.market.myMarket.recycler.MyMarketData
    public final int hashCode() {
        return (super.hashCode() * 31) + (this.f ? 1231 : 1237);
    }
}
