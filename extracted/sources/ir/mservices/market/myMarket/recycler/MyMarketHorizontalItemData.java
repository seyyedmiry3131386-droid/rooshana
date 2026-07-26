package ir.mservices.market.myMarket.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myMarket.recycler.MyMarketData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketHorizontalItemData implements MyketRecyclerData, g32 {
    public static final int d = js6.mymarket_horizontal_item;
    public final int a;
    public final int b;
    public final MyMarketData.ItemType c;

    public MyMarketHorizontalItemData(int i, int i2, MyMarketData.ItemType itemType) {
        this.a = i;
        this.b = i2;
        this.c = itemType;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyMarketHorizontalItemData)) {
            return false;
        }
        MyMarketHorizontalItemData myMarketHorizontalItemData = (MyMarketHorizontalItemData) obj;
        return this.a == myMarketHorizontalItemData.a && this.b == myMarketHorizontalItemData.b && this.c == myMarketHorizontalItemData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }
}
