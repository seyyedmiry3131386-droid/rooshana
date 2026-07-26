package ir.mservices.market.social.requests.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.requests.data.AccountDto;
import ir.mservices.market.views.MyketProgressState;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestAccountData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_requests_item;
    public final AccountDto a;
    public final v48 b;
    public final v48 c;

    public RequestAccountData(AccountDto accountDto, v48 v48Var, v48 v48Var2) {
        js3.p(v48Var, "dismissState");
        js3.p(v48Var2, "approveState");
        this.a = accountDto;
        this.b = v48Var;
        this.c = v48Var2;
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
        if (!RequestAccountData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.requests.recycler.RequestAccountData");
        RequestAccountData requestAccountData = (RequestAccountData) obj;
        if (requestAccountData.c.getValue() == this.c.getValue() && requestAccountData.b.getValue() == this.b.getValue()) {
            return js3.i(requestAccountData.a, this.a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getAccountKey();
    }

    public final int hashCode() {
        return (((MyketProgressState) this.b.getValue()).hashCode() * 31) + (((MyketProgressState) this.c.getValue()).hashCode() * 31) + this.a.hashCode();
    }
}
