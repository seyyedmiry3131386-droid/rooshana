package ir.mservices.market.myAccount.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountLinkItemData implements MyketRecyclerData, g32 {
    public static final int d = js6.account_link_item;
    public final int a;
    public final Integer b;
    public final rv6 c;

    public MyAccountLinkItemData(int i, rv6 rv6Var, Integer num) {
        this.a = i;
        this.b = num;
        this.c = rv6Var;
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
        if (obj == null || !MyAccountLinkItemData.class.equals(obj.getClass())) {
            return false;
        }
        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) obj;
        if (js3.i(this.c.a.getValue(), myAccountLinkItemData.c.a.getValue()) && this.a == myAccountLinkItemData.a && js3.i(this.b, myAccountLinkItemData.b)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        return i + (num != null ? num.hashCode() : 0);
    }
}
