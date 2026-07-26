package ir.mservices.market.myMarket.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketHeaderData implements MyketRecyclerData, g32 {
    public static final int d = js6.my_market_header;
    public final boolean a;
    public final String b;
    public final boolean c;

    public MyMarketHeaderData(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
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
        if (!MyMarketHeaderData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.myMarket.recycler.MyMarketHeaderData");
        MyMarketHeaderData myMarketHeaderData = (MyMarketHeaderData) obj;
        return this.a == myMarketHeaderData.a && js3.i(this.b, myMarketHeaderData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "MY_MARKET_HEADER";
    }

    public final int hashCode() {
        int i = (this.a ? 1231 : 1237) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
