package ir.mservices.market.myReview.complete;

import defpackage.c5;
import defpackage.js3;
import defpackage.qm5;
import defpackage.vr2;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class CompleteReviewViewModel extends c {
    public final c5 t;
    public final vr2 u;
    public final qm5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteReviewViewModel(c5 c5Var, vr2 vr2Var, qm5 qm5Var) {
        super(true);
        js3.p(c5Var, "accountManager");
        this.t = c5Var;
        this.u = vr2Var;
        this.v = qm5Var;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new CompleteReviewViewModel$doRequest$1(this, null));
    }
}
