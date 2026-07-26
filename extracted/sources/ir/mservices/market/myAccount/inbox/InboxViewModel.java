package ir.mservices.market.myAccount.inbox;

import defpackage.bt2;
import defpackage.js3;
import defpackage.lw8;
import defpackage.y97;
import ir.mservices.market.myAccount.inbox.model.a;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxViewModel extends c {
    public final a t;
    public final lw8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel(a aVar, lw8 lw8Var) {
        super(true);
        js3.p(lw8Var, "uiUtils");
        this.t = aVar;
        this.u = lw8Var;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new InboxViewModel$doRequest$1(this, null), 3);
    }
}
