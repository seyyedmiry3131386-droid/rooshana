package ir.mservices.market.myAccount.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountPrivacyNestedData extends NestedRecyclerData implements g32 {
    public static final int h = js6.my_account_info_privacy;
    public final bz6 g;

    public MyAccountPrivacyNestedData(bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        this.g = bz6Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof MyAccountPrivacyNestedData;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "MyAccountPrivacyNested";
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
