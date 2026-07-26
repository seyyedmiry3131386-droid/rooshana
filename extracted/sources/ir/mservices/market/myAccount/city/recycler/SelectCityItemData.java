package ir.mservices.market.myAccount.city.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectCityItemData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_select_city_item;
    public final String a;
    public final String b;

    public SelectCityItemData(String str) {
        js3.p(str, "content");
        this.a = str;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectCityItemData)) {
            return false;
        }
        SelectCityItemData selectCityItemData = (SelectCityItemData) obj;
        return js3.i(this.a, selectCityItemData.a) && js3.i(this.b, selectCityItemData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
