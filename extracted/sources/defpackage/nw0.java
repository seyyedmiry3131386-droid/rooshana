package defpackage;

import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.ReplyReviewData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class nw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public nw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        ReplyReviewData value = ((CommentScenario.ReplyReview) obj).getValue();
        int i = CommentFlowFragment.P0;
        CommentFlowFragment commentFlowFragment = this.a;
        pk5.g(commentFlowFragment.C0(), new NavIntentDirections.ReplyComment(new ao7(value.getLaunchSource(), value.getPackageName(), value.getReviewId(), value.getReviewDTO(), new DialogDataModel(commentFlowFragment.I0(), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
        return tx8.a;
    }
}
