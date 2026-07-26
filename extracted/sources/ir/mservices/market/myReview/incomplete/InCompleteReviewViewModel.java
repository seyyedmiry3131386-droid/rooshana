package ir.mservices.market.myReview.incomplete;

import defpackage.c5;
import defpackage.dx4;
import defpackage.ja1;
import defpackage.js3;
import defpackage.qm5;
import defpackage.rv6;
import defpackage.vr2;
import ir.mservices.market.myReview.incomplete.model.b;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class InCompleteReviewViewModel extends c {
    public final c5 t;
    public final dx4 u;
    public final vr2 v;
    public final qm5 w;
    public final b x;
    public final l y;
    public final rv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InCompleteReviewViewModel(c5 c5Var, dx4 dx4Var, vr2 vr2Var, qm5 qm5Var, b bVar) {
        super(true);
        js3.p(c5Var, "accountManager");
        js3.p(dx4Var, "modelUtils");
        this.t = c5Var;
        this.u = dx4Var;
        this.v = vr2Var;
        this.w = qm5Var;
        this.x = bVar;
        l lVarB = ja1.b(Boolean.FALSE);
        this.y = lVarB;
        this.z = new rv6(lVarB);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new InCompleteReviewViewModel$doRequest$1(this, null));
    }
}
