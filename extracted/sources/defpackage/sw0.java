package defpackage;

import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.data.CommentScenario;

/* JADX INFO: loaded from: classes3.dex */
public final class sw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public sw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentFlowFragment.E0(this.a, ((CommentScenario.SubmitReview) obj).getValue(), true);
        return tx8.a;
    }
}
