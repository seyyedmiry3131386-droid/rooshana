package ir.mservices.market.myAccount.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountItemData implements MyketRecyclerData, g32 {
    public static final int c = js6.my_account_item;
    public final int a;
    public final rv6 b;

    public MyAccountItemData(int i, rv6 rv6Var) {
        this.a = i;
        this.b = rv6Var;
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
        if (obj == null || !MyAccountItemData.class.equals(obj.getClass())) {
            return false;
        }
        MyAccountItemData myAccountItemData = (MyAccountItemData) obj;
        return js3.i(this.b.a.getValue(), myAccountItemData.b.a.getValue()) && this.a == myAccountItemData.a;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return ((Pair) this.b.a.getValue()).hashCode() + (this.a * 31);
    }
}
