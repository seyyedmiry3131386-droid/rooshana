package ir.mservices.market.myAccount.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountHeaderData implements MyketRecyclerData, g32 {
    public static final int c = js6.my_account_header;
    public final xe2 a;
    public final String b;

    public MyAccountHeaderData(pv6 pv6Var, String str) {
        js3.p(pv6Var, "avatarStateChange");
        this.a = pv6Var;
        this.b = str;
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
        return obj != null && MyAccountHeaderData.class.equals(obj.getClass()) && js3.i(this.b, ((MyAccountHeaderData) obj).b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.b;
        return 38347 + (str != null ? str.hashCode() : 0);
    }
}
