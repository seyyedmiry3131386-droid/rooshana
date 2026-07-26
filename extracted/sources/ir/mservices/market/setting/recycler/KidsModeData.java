package ir.mservices.market.setting.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class KidsModeData implements MyketRecyclerData, g32 {
    public static final int c = js6.setting_item_kids;
    public final boolean a;
    public final String b;

    public KidsModeData(boolean z) {
        this.a = z;
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
        if (obj != null && KidsModeData.class.equals(obj.getClass()) && this.a == ((KidsModeData) obj).a) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) * 31;
    }
}
