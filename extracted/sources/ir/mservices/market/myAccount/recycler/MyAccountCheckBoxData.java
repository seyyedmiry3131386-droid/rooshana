package ir.mservices.market.myAccount.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountCheckBoxData implements MyketRecyclerData, g32 {
    public static final int c = js6.account_private_mode_item;
    public final rv6 a;
    public final rv6 b;

    public MyAccountCheckBoxData(rv6 rv6Var, rv6 rv6Var2) {
        this.a = rv6Var;
        this.b = rv6Var2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !MyAccountCheckBoxData.class.equals(obj.getClass())) {
            return false;
        }
        MyAccountCheckBoxData myAccountCheckBoxData = (MyAccountCheckBoxData) obj;
        if (js3.i(this.a.a.getValue(), myAccountCheckBoxData.a.a.getValue()) && ((Boolean) this.b.a.getValue()).booleanValue() == ((Boolean) myAccountCheckBoxData.b.a.getValue()).booleanValue()) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return (((Pair) this.a.a.getValue()).hashCode() * 31) + (((Boolean) this.b.a.getValue()).booleanValue() ? 1231 : 1237);
    }
}
