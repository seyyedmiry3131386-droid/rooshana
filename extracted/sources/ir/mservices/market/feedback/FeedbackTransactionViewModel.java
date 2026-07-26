package ir.mservices.market.feedback;

import defpackage.ck4;
import defpackage.ja1;
import defpackage.rv6;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackTransactionViewModel extends c {
    public final ck4 t;
    public boolean u;
    public final l v;
    public final rv6 w;
    public final l x;
    public final rv6 y;

    public FeedbackTransactionViewModel(ck4 ck4Var) {
        super(true);
        this.t = ck4Var;
        this.u = true;
        l lVarB = ja1.b(null);
        this.v = lVarB;
        this.w = new rv6(lVarB);
        l lVarB2 = ja1.b(Boolean.FALSE);
        this.x = lVarB2;
        this.y = new rv6(lVarB2);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        this.u = true;
        h().a(this);
        p(new FeedbackTransactionViewModel$doRequest$1(this, null));
    }
}
