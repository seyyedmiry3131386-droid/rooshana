package defpackage;

import ir.mservices.market.common.comment.data.CommentResultState;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class zk1 implements ze2 {
    public final /* synthetic */ DeveloperCommentBottomDialogFragment a;

    public zk1(DeveloperCommentBottomDialogFragment developerCommentBottomDialogFragment) {
        this.a = developerCommentBottomDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        if (commentResultState instanceof CommentResultState.Success) {
            DeveloperCommentBottomDialogFragment developerCommentBottomDialogFragment = this.a;
            pk5.c(developerCommentBottomDialogFragment.F(), new CommentScenario.SubmitDeveloperReview(new SubmitReviewData(developerCommentBottomDialogFragment.V0().b, ((CommentResultState.Success) commentResultState).getData().getRate(), null, false, true, null, "_dialog", "DEVELOPER", 4, null)));
            developerCommentBottomDialogFragment.z0();
        }
        return tx8.a;
    }
}
