package ir.mservices.market.purchaseTransaction;

import defpackage.a5;
import defpackage.ck4;
import defpackage.js3;
import defpackage.t32;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaseTransactionViewModel extends c {
    public final ck4 t;
    public String u;
    public String v;

    public PurchaseTransactionViewModel(ck4 ck4Var) {
        super(true);
        this.t = ck4Var;
        this.u = "unsuccessful";
        this.v = "all";
        t32.b().l(this, false);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        String str = this.u;
        String str2 = this.v;
        if (str2 != null) {
            this.v = str2;
        }
        if (str != null) {
            this.u = str;
        }
        h().a(this);
        p(new PurchaseTransactionViewModel$refreshData$1(this, null));
    }

    public final void onEvent(a5 a5Var) {
        js3.p(a5Var, "profileEvent");
        this.v = "all";
        this.u = "unsuccessful";
        h().a(this);
        p(new PurchaseTransactionViewModel$refreshData$1(this, null));
    }
}
