package defpackage;

import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.data.CommentScenario;

/* JADX INFO: loaded from: classes3.dex */
public final class mw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public mw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentFlowFragment.E0(this.a, ((CommentScenario.SubmitDeveloperReview) obj).getValue(), false);
        return tx8.a;
    }
}
